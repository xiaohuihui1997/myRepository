package com.offcn.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String getFormatTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        return format;
    }

    public static String getFormatTime(String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }

    public static String getFormatTime(String pattern,Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String string = simpleDateFormat.format(date);
        return string;
    }
}
