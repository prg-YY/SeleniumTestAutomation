package com.seleniummaster.Datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class JodaDateTime {
    public static void main(String[] args) {
//        define a new joda date time
        DateTime date = new DateTime();
        System.out.println(date.toString());
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd=HH-mm-ss-SS");
        System.out.println(date.toString(formatter));

        DateTime universalTime = new DateTime(DateTimeZone.UTC);
        System.out.println("Universal Time :" + universalTime);

        DateTimeZone istanbulTimeZone = DateTimeZone.forID("Europa/Istanbul");
        DateTime istanbulTime = new DateTime(istanbulTimeZone);
        System.out.println("Istanbul Time is : " + istanbulTime);
        Set<String> timeZones = ZoneId.getAvailableZoneIds();
        for (String s : timeZones) {
            System.out.println(s);
        }
//        get the day Name
        DateTime.Property dayName = universalTime.dayOfWeek();
        System.out.println(dayName.getAsShortText());
        System.out.println(universalTime.plusDays(5));
        System.out.println(universalTime.minusDays(2));

//        get difference of two dayName
        DateTime beginDate=new DateTime("2020-10-20");
        DateTime exexuteDate=new DateTime();
        Period period=new Period(beginDate,exexuteDate, PeriodType.days());
        Period period1=new Period(beginDate,exexuteDate,PeriodType.weeks());
        System.out.println("Total weeks : "+period1.getWeeks());
        System.out.println("Total days : "+period.getDays());


    }
}
