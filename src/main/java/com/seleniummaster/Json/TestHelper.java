package com.seleniummaster.Json;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class TestHelper {
    public static String getToday(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd");
        return dateTime.toString(formatter);
    }
    public static String getCurrentTime(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter=DateTimeFormat.forPattern("HH-mm-ss-SS");
        return dateTime.toString(formatter);
    }

    public static String getCurrentUse(){
        String currentUser=System.getProperty("user.name");
        return currentUser;
    }
}
