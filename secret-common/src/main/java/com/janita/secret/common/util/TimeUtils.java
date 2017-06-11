package com.janita.secret.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Janita on 2017/6/11- 22:30
 * 该类是:时间
 */
public class TimeUtils {

    private static final String FMT_yyyy = "yyyy";
    private static final String FMT_mm = "MM";
    private static final String FMT_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    private static final String FMT_yyy_MM_dd = "yyyy-MM-dd";


    private TimeUtils(){

    }

    /**
     * 格式化毫秒时间戳，输出yyyy
     *
     * @param timestampInMs
     * @return
     */
    public static String formatYear(Long timestampInMs) {
        if (timestampInMs == null) {
            return null;
        }
        return new SimpleDateFormat(FMT_yyyy).format(new Date(timestampInMs));
    }

    /**
     * 格式化毫秒时间戳，输出年月日
     *
     * @param timestampInMs
     * @return
     */
    public static String formatYearMonthDay(Long timestampInMs) {
        if (timestampInMs == null) {
            return null;
        }
        return new SimpleDateFormat(FMT_yyy_MM_dd).format(new Date(timestampInMs));
    }

    /**
     * 格式化毫秒时间戳，输出MM
     *  返回的是01,02,03...11,12
     * @param timestampInMs
     * @return
     */
    public static String formatMonth(Long timestampInMs) {
        if (timestampInMs == null) {
            return null;
        }
        return new SimpleDateFormat(FMT_mm).format(new Date(timestampInMs));
    }


    /**
     * 通过yyyy-MM-dd HH:mm:ss 获取13位时间戳
     * @param dateTime
     * @return
     */
    public static Long get13Timestamp(String dateTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FMT_yyyy_MM_dd_HH_mm_ss);
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /**
     * 获取当天0:0:0的时间戳
     * @param time  当天的任意时刻时间戳
     * @return
     */
    public static long get000Timestamp(long time){
        String day = formatYearMonthDay(time);
        day = day + " 0:0:0";
        return get13Timestamp(day);
    }
}
