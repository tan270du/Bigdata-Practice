package com.hmlyinfo.app.soutu.common.service;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class CAPTCHAServiceImpl implements ICAPTCHAService {

	private final static String captchaKey = "randCheckCode";
	
	@Override
	public BufferedImage createCAPTCHAImg(HttpSession session, int width,
			int height) {

		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB); // 创建BufferedImage类的对象
		Graphics g = image.getGraphics(); // 创建Graphics类的对象
		Graphics2D g2d = (Graphics2D) g; // 通过Graphics类的对象创建一个Graphics2D类的对象
		Random random = new Random(); // 实例化一个Random对象
		Font mFont = new Font("Arial", Font.BOLD, 36); // 通过Font构造字体
		g.setColor(getRandColor(200, 250)); // 改变图形的当前颜色为随机生成的颜色
		g.fillRect(0, 0, width, height); // 绘制一个填色矩形

		// 画一条折线
		BasicStroke bs = new BasicStroke(2f, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_BEVEL); // 创建一个供画笔选择线条粗细的对象
		g2d.setStroke(bs); // 改变线条的粗细
		g.setColor(Color.DARK_GRAY); // 设置当前颜色为预定义颜色中的深灰色
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		for (int j = 0; j < 3; j++) {
			xPoints[j] = random.nextInt(width - 1);
			yPoints[j] = random.nextInt(height - 1);
		}
		g.drawPolyline(xPoints, yPoints, 3);
		// 生成并输出随机的验证文字
		g.setFont(mFont);
		String sRand = "";
		int itmp = 0;
		for (int i = 0; i < 4; i++) {
			if (random.nextInt(2) == 1) {
				itmp = random.nextInt(26) + 65; // 生成A~Z的字母
			} else {
				itmp = random.nextInt(10) + 48; // 生成0~9的数字
			}
			char ctmp = (char) itmp;
			sRand += String.valueOf(ctmp);
			Color color = new Color(20 + random.nextInt(110),
					20 + random.nextInt(110), 20 + random.nextInt(110));
			g.setColor(color);
			/**** 随机缩放文字并将文字旋转指定角度 **/
			// 将文字旋转指定角度
			Graphics2D g2d_word = (Graphics2D) g;
			AffineTransform trans = new AffineTransform();
			trans.rotate(random.nextInt(45) * 3.14 / 180, 36 * i + 40, 40);
			// 缩放文字
			float scaleSize = random.nextFloat() + 0.8f;
			if (scaleSize > 1.1f)
				scaleSize = 1f;
			trans.scale(scaleSize, scaleSize);
			g2d_word.setTransform(trans);
			/************************/
			g.drawString(String.valueOf(ctmp), 36 * i + 40, 40);

		}
		// 将生成的验证码保存到Session中
		session.setAttribute(captchaKey, sRand);
		// System.out.println(sRand);
		g.dispose();
		
		return image;
	}
	
	private Color getRandColor(int s, int e) {
        Random random = new Random();
        if (s > 255) s = 255;
        if (e > 255) e = 255;
        int r = s + random.nextInt(e - s);
        int g = s + random.nextInt(e - s);
        int b = s + random.nextInt(e - s);
        return new Color(r, g, b);
    }

	@Override
	public String getCAPTCHAValue(HttpSession session) {
		
		return String.valueOf(session.getAttribute(captchaKey));
	}

	@Override
	public boolean validateCAPTCHA(HttpSession session, String vcode) {
		
		String captcha = String.valueOf(session.getAttribute(captchaKey));
		return vcode.equalsIgnoreCase(captcha);
	}

}
