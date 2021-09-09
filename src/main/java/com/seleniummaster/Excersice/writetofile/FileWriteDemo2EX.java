package com.seleniummaster.Excersice.writetofile;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2EX {
    public static void main(String[] args) {
        String content="`Test Passed \n,adsasdasdadasdasd";
        content=content+"adsde adam nig ";
        //define timestamp for the file
        DateTime date=new DateTime();
        DateTimeFormatter format=DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        String timeStamp=date.toString(format);

        String fileName="test"+timeStamp+".txt";
        File myFile=new File("maxik"+File.separator+fileName);
        try {
            FileUtils.writeStringToFile(myFile,content);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
