package pub.makers.shop.base.utils;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pub.makers.shop.base.constants.Constants;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by dy on 2017/5/9.
 */
public class DateParseUtil {
    protected static Logger logger = LoggerFactory.getLogger(DateParseUtil.class);
    public final static String NAME = "name";
    public final static String STARTDATE = "startDate";
    public final static String ENDDATE = "endDate";
    public final static String VALMAP = "valMap";
    public final static String KEYLIST = "keyList";

    public static Date parseDate(String dateString, String parsePattern) {
        try {
            return DateUtils.parseDate(dateString, new String[]{parsePattern});
        } catch (Exception e) {
            return new Date();
        }

    }

    public static Date parseDate(String dateString, String[] parsePatterns) {
        try {
            return DateUtils.parseDate(dateString, parsePatterns);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 获取格式化日期yyyy-MM-dd
     * @param dateString
     * @return
     */
    public static Date parseDate(String dateString) {
        try {
            return DateUtils.parseDate(dateString, new String[]{Constants.YYYYMMDD});
        } catch (Exception e) {
            return new Date();
        }

    }

    public static boolean compareDates(Date dates, Date dist) {
        try {
            return dates.getTime() > dist.getTime() ? true : false;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * 获取指定格式化日期
     * @param date
     * @param formatPattern
     * @return
     */
    public static String formatDate(Date date, String... formatPattern) {
        SimpleDateFormat sdf;
        if (formatPattern.length > 0) {
            sdf = new SimpleDateFormat(formatPattern[0]);
        } else {
            sdf = new SimpleDateFormat(Constants.YYYYMMDD);
        }
        return sdf.format(date);
    }

    public static boolean isCorrectDate(String dateString, String[] parsePatterns) {
        try {
            DateUtils.parseDate(dateString, parsePatterns);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static int getMonthDifference(Date date1, Date date2) {
        Calendar bigCalendar = Calendar.getInstance();
        Calendar smallCalendar = Calendar.getInstance();
        bigCalendar.setTime(date1.getTime() > date2.getTime() ? date1 : date2);
        smallCalendar.setTime(date1.getTime() < date2.getTime() ? date1 : date2);
        int bigYear = bigCalendar.get(Calendar.YEAR);
        int smallYear = smallCalendar.get(Calendar.YEAR);
        int bigMonth = bigCalendar.get(Calendar.MONTH);
        int smallMonth = smallCalendar.get(Calendar.MONTH);
        int bigDay = bigCalendar.get(Calendar.DAY_OF_MONTH);
        int smallDay = smallCalendar.get(Calendar.DAY_OF_MONTH);
        return bigMonth + (bigYear > smallYear ? (bigYear - smallYear) * 12 : 0) - smallMonth + (bigDay >= smallDay ? 0 : -1);
    }

    public static Map<String, Object> getMapDate(String start, String end) {
        try {

            if (start == null || end == null) {
                return null;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

            Date dateS = sdf.parse(start);
            Date dateE = sdf.parse(end);
            Map<String, Object> map = new LinkedHashMap<String, Object>();
            while (dateE.after(dateS) || dateE.equals(dateS)) {
                String mapKey = sdf.format(dateS);
                dateS = getNextMonth(dateS);
                map.put(mapKey, new Long(0));
            }
            return map;

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static String getUpaMonthYear(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            Date dateRes = sdf.parse(date);
            dateRes = getOnaYeah(dateRes);
            return sdf.format(dateRes);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static String getUpaMonth(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            Date dateRes = sdf.parse(date);
            dateRes = getOnaMonth(dateRes);
            return sdf.format(dateRes);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static Date getNextMonth(Date date) {
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.MONTH, 1);
        return gc.getTime();
    }

    public static Date getJiduStart(int year, int quarterly) {
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.set(year, (quarterly - 1) * 3, 1, 0, 0, 0);
        return gc.getTime();
    }

    public static Date getNianduStart(int year) {
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.set(year, 0, 1, 0, 0, 0);
        return gc.getTime();
    }

    public static Map<String, Map<String, Date>> getDateList(int year, int yearend) {
        Map<String, Map<String, Date>> mapRes = new LinkedHashMap<String, Map<String, Date>>();
        if (yearend < year) {
            return mapRes;
        }
        while (true) {
            if (year > yearend) {
                break;
            }
            Map<String, Date> map = new HashMap<String, Date>();
            String mapKey = year + "";
            map.put(STARTDATE, getNianduStart(year));
            year++;
            map.put(ENDDATE, getNianduStart(year));
            mapRes.put(mapKey, map);
        }
        return mapRes;
    }

    public static Map<String, Map<String, Date>> getDateList(int year, int quarterly, int yearend, int quarterlyend) {
        Map<String, Map<String, Date>> mapRes = new LinkedHashMap<String, Map<String, Date>>();
        while (true) {
            if (year > yearend || (year == yearend && quarterlyend < quarterly)) {
                break;
            }
            Map<String, Date> map = new HashMap<String, Date>();
            String mapKey = year + "-Q" + quarterly;
            map.put(STARTDATE, getJiduStart(year, quarterly));
            if (quarterly == 4) {
                year++;
                quarterly = 1;
            } else {
                quarterly++;
            }
            map.put(ENDDATE, getJiduStart(year, quarterly));
            mapRes.put(mapKey, map);
        }
        return mapRes;
    }

    public static Date getOnaYeah(Date date) {
        if (date == null) {
            return new Date();
        }
        Calendar ca1 = Calendar.getInstance();
        ca1.setTime(date);
        ca1.add(Calendar.YEAR, -1);
        return ca1.getTime();
    }

    public static Date getOnaMonth(Date date) {
        if (date == null) {
            date = new Date();
        }
        Calendar ca1 = Calendar.getInstance();
        ca1.setTime(date);
        ca1.add(Calendar.MONTH, -1);
        return ca1.getTime();
    }

    public static List<List<String>> getMapList(List<Map<String, Object>> list, List<Map<String, Object>> listUpA) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        Map<String, List> valMapOld = new HashMap<String, List>();
        for (Map<String, Object> map : listUpA) {
            valMapOld.put(map.get(NAME).toString(), (List) map.get(VALMAP));
        }
        for (Map<String, Object> map : list) {
            Set<String> keyList = (Set<String>) map.get(KEYLIST);
            String name = map.get(NAME).toString();
            List valMap = (List) map.get(VALMAP);
            int k = 0;
            for (String key : keyList) {
                if (valMapOld.get(name) != null && valMapOld.get(name).size() > 0) {
                    List valListOld = valMapOld.get(name);
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        Long new1 = (Long) valMap.get(k);
                        Long old = (Long) valListOld.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        Long new1 = (Long) valMap.get(k);
                        Long old = (Long) valListOld.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        Long new1 = (Long) valMap.get(k);
                        listRes.add("0");
                        listRes.add(shangge(new Long(0), new1));
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        Long new1 = (Long) valMap.get(k);
                        listRes.add("0");
                        listRes.add(shangge(new Long(0), new1));
                        resMap.put(key, listRes);
                    }
                }
                k++;
            }
        }
        return new ArrayList(resMap.values());
    }

    public static List<List<String>> getDoubleMapList(List<Map<String, Object>> list, List<Map<String, Object>> listUpA) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        Map<String, List> valMapOld = new HashMap<String, List>();
        for (Map<String, Object> map : listUpA) {
            valMapOld.put(map.get(NAME).toString(), (List) map.get(VALMAP));
        }
        for (Map<String, Object> map : list) {
            Set<String> keyList = (Set<String>) map.get(KEYLIST);
            String name = map.get(NAME).toString();
            List valMap = (List) map.get(VALMAP);
            int k = 0;
            for (String key : keyList) {
                if (valMapOld.get(name) != null && valMapOld.get(name).size() > 0) {
                    List valListOld = valMapOld.get(name);
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        Double new1 = (Double) valMap.get(k);
                        Double old = (Double) valListOld.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        Double new1 = (Double) valMap.get(k);
                        Double old = (Double) valListOld.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        Double new1 = (Double) valMap.get(k);
                        listRes.add("0");
                        listRes.add(shangge(new Double(0), new1));
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        Double new1 = (Double) valMap.get(k);
                        listRes.add("0");
                        listRes.add(shangge(new Double(0), new1));
                        resMap.put(key, listRes);
                    }
                }
                k++;
            }
        }
        return new ArrayList(resMap.values());
    }

    public static List<List<String>> getMapList(List<Map<String, Object>> list) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        for (Map<String, Object> map : list) {
            Set<String> keyList = (Set<String>) map.get(KEYLIST);
            List valMap = (List) map.get(VALMAP);
            int k = 0;
            for (String key : keyList) {
                if (k == 0) {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        listRes.add("--");
                        listRes.add("--");
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        listRes.add("--");
                        listRes.add("--");
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        Long old = (Long) valMap.get(k - 1);
                        Long new1 = (Long) valMap.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        Long old = (Long) valMap.get(k - 1);
                        Long new1 = (Long) valMap.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    }
                }
                k++;
            }
        }
        return new ArrayList(resMap.values());
    }

    public static List<List<String>> getDoubleMapList(List<Map<String, Object>> list) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        for (Map<String, Object> map : list) {
            Set<String> keyList = (Set<String>) map.get(KEYLIST);
            List valMap = (List) map.get(VALMAP);
            int k = 0;
            for (String key : keyList) {
                if (k == 0) {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        listRes.add("--");
                        listRes.add("--");
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        listRes.add("--");
                        listRes.add("--");
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        Double old = (Double) valMap.get(k - 1);
                        Double new1 = (Double) valMap.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        Double old = (Double) valMap.get(k - 1);
                        Double new1 = (Double) valMap.get(k);
                        listRes.add(old + "");
                        listRes.add(shangge(old, new1));
                        resMap.put(key, listRes);
                    }
                }
                k++;
            }
        }
        return new ArrayList(resMap.values());
    }

    public static List<List<String>> getMapListBar(List<Map<String, Object>> list) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        for (Map<String, Object> map : list) {
            Set<String> keyList = (Set<String>) map.get(KEYLIST);
            List valMap = (List) map.get(VALMAP);
            int k = 0;
            for (String key : keyList) {
                if (k == 0) {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    }
                }
                k++;
            }
        }
        return new ArrayList(resMap.values());
    }

    public static List<List<String>> getMapListReason(Map<String, Map<String, Object>> tableMap) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        for (String fisrtKey : tableMap.keySet()) {
            Map<String, Object> map = tableMap.get(fisrtKey);
            int k = 0;
            for (String key : map.keySet()) {
                if (k == 0) {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(map.get(key).toString());
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(map.get(key).toString());
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(map.get(key).toString());
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(map.get(key).toString());
                        resMap.put(key, listRes);
                    }
                }
                k++;
            }
        }

        return  new ArrayList(resMap.values());
    }

    public static String count(String a, String b) {
        Long av = new Long(a);
        Long bv = new Long(b);

        return (av + bv) + "";
    }

    public static List<List<String>> getMapListBarCount(List<Map<String, Object>> list) {
        Map<String, List<String>> resMap = new LinkedHashMap<String, List<String>>();
        List<String> listResCount = new ArrayList<String>();
        listResCount.add("总计");
        for (Map<String, Object> map : list) {
            Set<String> keyList = (Set<String>) map.get(KEYLIST);
            List valMap = (List) map.get(VALMAP);
            int k = 0;
            Long count = 0l;
            for (String key : keyList) {
                if (k == 0) {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    }
                } else {
                    if (resMap.get(key) == null) {
                        List<String> listRes = new ArrayList<String>();
                        listRes.add(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    } else {
                        List<String> listRes = resMap.get(key);
                        listRes.add(valMap.get(k).toString());
                        resMap.put(key, listRes);
                    }
                }
                count += new Long(valMap.get(k).toString());
                k++;
            }
            listResCount.add(count + "");
        }
        resMap.put("总计", listResCount);
        return new ArrayList(resMap.values());
    }

    public static List<String[]> countAsProduct(List<String[]> list) {
        Map<String, Double> map = new HashMap<String, Double>();
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String[] str : list) {
            String productName = str[1];
            double val = Double.valueOf(str[6]);
            if (map.get(productName) == null) {
                map.put(productName, val);
                countMap.put(productName, 1);
            } else {
                if (map.get(productName) < val) {
                    map.put(productName, val);
                }
                countMap.put(productName, countMap.get(productName) + 1);
            }
        }
        List<String[]> res = new ArrayList<String[]>();
        for (String key : map.keySet()) {
            String[] str = new String[3];
            str[0] = key;
            str[1] = String.valueOf(map.get(key));
            str[2] = String.valueOf(countMap.get(key));
            res.add(str);
        }
        return res;
    }

    public static double countDate(Date start, Date end) {
        long lo = start.getTime() - end.getTime();
        double x = (double) (lo) / 24 / 60 / 60 / 1000;
        return Math.floor(x) + 1;
    }

    public static String shangge(Long old, Long new1) {
        if (old == 0) {
            if (new1 == 0) {
                return "0%";
            }
            return "100%";
        }
        float x = (float) (new1 - old) / old * 100;
        if (x == 0) {
            return "0%";
        }
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(x) + "%";
    }

    public static String shangge(Double old, Double new1) {
        if (old == 0 || old == 0.00) {
            if (new1 == 0 || new1 == 0.00) {
                return "0%";
            }
            return "100%";
        }
        double x = (double) (new1 - old) / old * 100;
        if (x == 0 || x == 0.00) {
            return "0%";
        }
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(x) + "%";
    }

    public static float getMathCount(Long old, Long new1) {
        if (old == 0) {
            if (new1 == 0) {
                return 0;
            }
            return 100;
        }
        float x = (float) (new1 - old) / old * 100;
        BigDecimal bg = new BigDecimal(x);
        float f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        return f1;
    }

    public static Date[] getLastWeekTime(Date... date) {
        Date c_time, s_time, e_time;
        if (date.length < 1) {
            c_time = new Date();
        } else {
            c_time = date[0];
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(c_time);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        int c_wd = cal.get(Calendar.DAY_OF_WEEK);
        if (c_wd == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -6);
            e_time = cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, -7);
            s_time = cal.getTime();
        } else {
            cal.add(Calendar.DAY_OF_MONTH, 2 - c_wd);
            e_time = cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, -7);
            s_time = cal.getTime();
        }
        return new Date[]{s_time, e_time};
    }

    public static Date[] getCurrentWeekTime(Date... date) {
        Date c_time, s_time, e_time;
        if (date.length < 1) {
            c_time = new Date();
        } else {
            c_time = date[0];
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(c_time);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        int c_wd = cal.get(Calendar.DAY_OF_WEEK);
        if (c_wd == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -6);
            s_time = cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, 7);
            e_time = cal.getTime();
        } else {
            cal.add(Calendar.DAY_OF_MONTH, 2 - c_wd);
            s_time = cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, 7);
            e_time = cal.getTime();
        }
        return new Date[]{s_time, e_time};
    }

    /**
     * 获取某年某季度的时间范围
     *
     * @param quarter
     * @param year
     * @return Date[] 0:开始时间(包含),1:结束时间(包含)
     */
    public static Date[] getQuarterRange(int quarter, int year) {
        quarter = quarter > 4 ? 4 : quarter;
        quarter = quarter < 1 ? 1 : quarter;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, (quarter - 1) * 3);
        Date start = calendar.getTime();
        calendar.add(Calendar.MONTH, 3);
        calendar.add(Calendar.MILLISECOND,-1);
        Date end = calendar.getTime();
        return new Date[]{start, end};
    }

    /**
     * 获取当前季度的时间范围
     *
     * @return Date[] 0:开始时间(包含),1:结束时间(包含)
     */
    public static Date[] getCurrentQuarterRange() {
        return getQuarterRange(getCurrentQuarter(), getCurrentYear());
    }

    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return date == null ? 0 : calendar.get(Calendar.YEAR);
    }

    public static int getQuarter(Date date) {
        int month = getMonth(date);
        return month == 0 ? 0 : month / 3 + 1;
    }

    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH);
        return date == null ? 0 : month + 1;
    }

    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public static int getCurrentQuarter() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) / 3 + 1;
    }

    /**
     * 返回只包含日期信息的Date
     * @return
     */
    public static  final Date getDate(Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    /**
     * 返回当前日期
     * @return
     */
    public static final Date getCurrentDateOnlyDate(){
        return getDate(new Date());
    }
    /**
     * 返回当前月份(1-12)
     * @return
     */
    public static final int getCurrentMonth(){
        Calendar calendar=Calendar.getInstance();
        return calendar.get(Calendar.MONTH)+1;
    }

    //得到n天前的时间
    public static final Date getBeforeDate(Date date,int num){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-num);
        return calendar.getTime();
    }
    //得到n天后的时间
    public static final Date getLastDate(Date date,int num){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,num);
        return calendar.getTime();
    }

    //得到n个月前的时间
    public static final Date getBeforeMonthDate(Date date,int num){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,-num);
        return calendar.getTime();
    }
    //得到n个月后的时间
    public static final Date getLastMonthDate(Date date,int num){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,num);
        return calendar.getTime();
    }

    public static final boolean equalDate(Date d1,Date d2){
        Calendar calendar1=Calendar.getInstance();
        calendar1.setTime(d1);
        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(d2);
        return calendar1.get(Calendar.YEAR)==calendar2.get(Calendar.YEAR)
                &&calendar1.get(Calendar.DAY_OF_YEAR)==calendar2.get(Calendar.DAY_OF_YEAR);
    }

    //得到相差天数
    public static final int getDifferenceDate(Date d1,Date d2){
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        c1.set(Calendar.HOUR_OF_DAY,0);
        c2.set(Calendar.HOUR_OF_DAY,0);
        c1.set(Calendar.MINUTE,0);
        c2.set(Calendar.MINUTE,0);
        c1.set(Calendar.SECOND,0);
        c2.set(Calendar.SECOND,0);
        c1.set(Calendar.MILLISECOND,0);
        c2.set(Calendar.MILLISECOND,0);
        int result= (int)((c1.getTime().getTime()-c2.getTime().getTime())/1000/3600/24);
        return result;
    }

    //和当前日期相差的天数
    public static final int getDifferenceDateWithNow(Date date){
        return getDifferenceDate(date,new Date());
    }

    //增加天数
    public static final String addDate(String dateStr,int increment){
        Date d=parseDate(dateStr);
        Calendar c=Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_YEAR,increment);
        Date nd=c.getTime();
        return formatDate(nd);
    }

    // 增加月份
    public static String getmonthByDateStringAndAmount(String indexDate, int amount) {
        Date date = parseDate(indexDate+"-01");
        date = DateUtils.addMonths(date, amount);
        return DateFormatUtils.format(date, "yyyy-MM");
    }
    //获取已当天为基准的日期
    public static String getDate(int offset){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,offset);
        return formatDate(calendar.getTime());
    }

    /**
     * 获取date所对应周的周一的日期字符串
     * @param date
     * @return
     */
    public static String getCurrentWeekStartDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int b = date.getDay();
        if(b > 0){
            Long endTime = date.getTime()+ (1 - b) * 24 * 3600000;
            date.setTime(endTime);
            return sdf.format(date);
        }else{
            Long endTime = date.getTime() - 6 * 24 * 3600000;
            date.setTime(endTime);
            return sdf.format(date);
        }
    }

    /**
     * 获取date所对应周的周日的日期字符串
     * @param date
     * @return
     */
    public static String getCurrentWeekEndDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int b = date.getDay();
        if(b > 0){
            Long endTime = date.getTime()+ (7 - b) * 24 * 3600000;
            date.setTime(endTime);
            return sdf.format(date);
        }else{
            return sdf.format(date);
        }
    }

    /**
     * 获取某月的最后一天
     * @Title:getLastDayOfMonth
     * @Description:
     * @param:@param year
     * @param:@param month
     * @param:@return
     * @return:String
     * @throws
     */
    public static Date getLastDayOfMonth(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        return cal.getTime();
    }



    /**
     * 格式化时间字符串
     * @param dateString
     * @param parsePattern
     * @return
     */
    public static Date simpleDateFormat(String dateString,String parsePattern){
        try{
            if(parsePattern != "" && dateString!= ""){
                SimpleDateFormat fmt = new SimpleDateFormat(parsePattern);
                return fmt.parse(dateString);
            }
            if (parsePattern == "" || dateString == ""){
                SimpleDateFormat fmt = new SimpleDateFormat(parsePattern == "" ? "yyyy-MM-dd HH:mm:ss":parsePattern);
                return dateString == "" ? new Date():fmt.parse(dateString);
            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return new Date();
    }

    /**
     * 比较日期1和日期2的是否相同，精确到月份
     * @param d1
     * @param d2
     * @return
     */
    public static final int isDefferenceDate(Date d1,Date d2){
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        c1.set(Calendar.DAY_OF_MONTH,0);
        c2.set(Calendar.DAY_OF_MONTH,0);
        c1.set(Calendar.HOUR_OF_DAY,0);
        c2.set(Calendar.HOUR_OF_DAY,0);
        c1.set(Calendar.MINUTE,0);
        c2.set(Calendar.MINUTE,0);
        c1.set(Calendar.SECOND,0);
        c2.set(Calendar.SECOND,0);
        c1.set(Calendar.MILLISECOND,0);
        c2.set(Calendar.MILLISECOND,0);
        int result= (int)((c1.getTime().getTime()-c2.getTime().getTime())/1000/3600/24/30);
        return result;
    }


    /**
     * 比较日期是否相等，精确到小时
     * @param date1
     * @param date2
     * @return
     */
    public static final int getDifferenceHour(Date date1,Date date2){
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        c1.set(Calendar.MINUTE,0);
        c2.set(Calendar.MINUTE,0);
        c1.set(Calendar.SECOND,0);
        c2.set(Calendar.SECOND,0);
        c1.set(Calendar.MILLISECOND,0);
        c2.set(Calendar.MILLISECOND,0);
        int result= (int)((c1.getTime().getTime()-c2.getTime().getTime())/1000/3600);
        return result;
    }

    public static String getYesterDay(Date date,String... formatPattern){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return formatDate(calendar.getTime(),formatPattern);
    }
    public static Date getDayBy(Integer day){
        Calendar curr = Calendar.getInstance();
        if(curr.get(Calendar.DATE)>day){
            curr.set(Calendar.MONTH,curr.get(Calendar.MONTH)+1);
        }
        curr.set(Calendar.DATE,day);
        Date date=curr.getTime();
        return date;
    }

    public static String getYearMoth(Date date) {
        int year = getYear(date);
        int month = getMonth(date);
        return year + "" + month;
    }
}
