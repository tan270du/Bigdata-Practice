package pub.makers.shop.base.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dev.base.utils.HttpClientUtils;
import com.dev.base.utils.ValidateUtils;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.lantu.base.util.FreeMarkerUtil;

import pub.makers.jedis.JedisCallback;
import pub.makers.jedis.JedisTemplate;
import pub.makers.shop.base.util.FreeMarkerHelper;
import redis.clients.jedis.Jedis;

@Service(version="1.0.0")
public class SmsServiceImpl implements SmsService{
	
	private static final Log logs = LogFactory.getLog(SmsServiceImpl.class);
	@Autowired
	private JedisTemplate jedisTemplate;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10); 
	
	private static Set<String> excludePhotos = Sets.newHashSet();
	static{
		excludePhotos.add("13930197237");
		excludePhotos.add("18406502941");
		excludePhotos.add("15034629995");
		excludePhotos.add("18624297983");
		excludePhotos.add("13898798610");
		excludePhotos.add("15566640567");
		excludePhotos.add("18469153802");
		excludePhotos.add("18061230335");
		excludePhotos.add("18553433956");
		excludePhotos.add("18203081750");
		excludePhotos.add("18381740287");
		excludePhotos.add("15136413093");
		excludePhotos.add("13579026554");
		excludePhotos.add("15984551637");
		excludePhotos.add("13779347200");
		excludePhotos.add("13932199341");
		excludePhotos.add("18362197294");
		excludePhotos.add("15703429152");
		excludePhotos.add("18327508668");
		excludePhotos.add("15257057971");
		excludePhotos.add("13158560910");
		excludePhotos.add("15176001773");
		excludePhotos.add("13980212739");
		excludePhotos.add("15202668383");
		excludePhotos.add("18236784328");
	}

	public void sendMsgByTpl(String phoneNumber, String tplName,
			List<String> data) {
		ValidateUtils.isTrue(!excludePhotos.contains(phoneNumber), "非法号码");
		// String code = RandomStringUtils.randomNumeric(4);
		// String sessionKey = String.format("sms_%s_%s", tplName, phoneNumber);

		// Date lastSendDate = cacheProvicer.get(sessionKey);
		// ValidateUtils.isTrue(lastSendDate == null, "请不要频繁发送短信");

		Map<String, Object> dataModel = Maps.newHashMap();
		for (int i = 0; i < data.size(); i++) {
			String key = "code_" + i;
			dataModel.put(key,data.get(i));
		}

		// 解析FREEMARKER模板
		sendMsgByTpl(phoneNumber, tplName, dataModel);

		// cacheProvicer.set(sessionKey, code, 300);

	}

	public void sendCheckCode(String smsType, String phoneNmuber) {
		System.out.println("sendCheckCode");
		ValidateUtils.isTrue(!excludePhotos.contains(phoneNmuber), "非法号码");

		String sessionKey = String.format("sms_%s_%s", smsType, phoneNmuber);
		String timeKey = String.format("smstime_%s_%s", smsType, phoneNmuber);
		String code = RandomStringUtils.randomNumeric(4);
		String hasSend = getFromCache(timeKey);
		ValidateUtils.isTrue(StringUtils.isBlank(hasSend), "请不要频繁发送短信");

		Map<String, Object> dataModel = Maps.newHashMap();
		dataModel.put("code", code);
		// 解析FREEMARKER模板
		String smsContent = String.format("【优茶联】验证码%s，三分钟内有效。", code);
		sendSms(phoneNmuber, smsContent);

		setCache(sessionKey, code, 300);
		setCache(timeKey, code, 30);
	}

	public boolean checkCode(String smsType, String phoneNmuber, String yzm) {
		ValidateUtils.isTrue(!excludePhotos.contains(phoneNmuber), "非法号码");
		
		String sessionKey = String.format("sms_%s_%s", smsType, phoneNmuber);
		String cacheYzm = getFromCache(sessionKey);
		
		return yzm.equals(cacheYzm);
	}

	public void sendCheckCodeWithInput(String smsType, String phoneNmuber,
			String code) {
		
		ValidateUtils.isTrue(!excludePhotos.contains(phoneNmuber), "非法号码");
		
		String sessionKey = String.format("sms_%s_%s", smsType, phoneNmuber);
		
		String timeStr = getFromCache(sessionKey);
		ValidateUtils.isTrue(timeStr == null, "请不要频繁发送短信");
		
		Map<String, Object> dataModel = Maps.newHashMap();
		dataModel.put("code", code);
		// 解析FREEMARKER模板
		String smsContent = FreeMarkerUtil.getValueFromTpl(smsType + ".ftl", dataModel);
		sendSms(phoneNmuber, smsContent);
		
		setCache(sessionKey, sdf.format(new Date()), 10);
		
	}
	
	private void sendSms1(final String phone, final String content){
		
		fixedThreadPool.execute(new Runnable() {
			
			public void run() {
				String userId = "257501684474667008";
				String token = "yIPofSde0Ao84ZtlBCmFAEEAslwpjlqD";
				String addr = "http://203.195.168.14:88";
				String uri = "/msgservice/sms/sendmsg";
		        
				String message = "";
		        try {
		        	message = URLEncoder.encode(content, "utf-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
				String query = String.format("%s?userId=%s&mobile=%s&content=%s", uri, userId, phone, content);
				String sign = DigestUtils.md5Hex(query + token);
				Map<String, Object> paramMap = Maps.newHashMap();
				String url = String.format("%s%s?userId=%s&mobile=%s&content=%s&sign=%s", addr, uri, userId, phone, message, sign);
				String result = HttpClientUtils.doGet(url, paramMap);
				
				System.out.println(result);
			}
		});
		
	}
	
	public void sendSms(final String phone, final String content){
		
		fixedThreadPool.execute(new Runnable() {
			
			public void run() {
				String userId = "3314";
				String account = "xmsgyy";
				String addr = "http://218.85.133.75:8888/sms.aspx";
				String password = "xmsgyy123";
		        
				String message = "";
		        try {
		        	String ncontent = content; 
		        	if (content.indexOf("【") < 0){
		        		ncontent = "【优茶联】" + content;
		        	}
		        	message = URLEncoder.encode(ncontent, "utf-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        Map<String, Object> paramMap = Maps.newHashMap();
				String query = String.format("%s?action=send&userId=%s&account=%s&password=%s&mobile=%s&content=%s", addr, userId, account, password, phone, message);
				String result = HttpClientUtils.doPost(query, paramMap);
				
				System.out.println(result);
			}
		});
		
	}
	
	private String getFromCache(final String key){
		
		return jedisTemplate.execute(new JedisCallback<String>() {

			public String doInJedis(Jedis paramJedis) {
				return paramJedis.get(key);
			}
		});
	}
	
	private void setCache(final String key, final String value, final int time){
		
		jedisTemplate.execute(new JedisCallback<String>() {

			public String doInJedis(Jedis paramJedis) {
				paramJedis.set(key, value);
				paramJedis.expire(key, time);
				
				return null;
			}
		});
		
	}
	
	public static void main(String[] args){
		new SmsServiceImpl().sendSms("18659253371", "验证码为3371");
	}

	@Override
	public void sendMsgByTpl(String phoneNumber, String tplName, Map<String, Object> data) {
		String smsContent = FreeMarkerHelper.getValueFromTpl(tplName + ".ftl", data);
		sendSms(phoneNumber, smsContent);
	}

}
