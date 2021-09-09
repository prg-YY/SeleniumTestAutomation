package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        String content="Test passed"+"\n";
        content=content+"test passeddd";
        //define timeStamp for the file
        DateTime date=new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd=HH-mm-ss-SS");
        String timeStamp=date.toString(formatter);
        String fileName="Test "+timeStamp+".txt";
        File myFile=new File("folder1"+File.separator+fileName);
        try {
            FileUtils.writeStringToFile(myFile,content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
