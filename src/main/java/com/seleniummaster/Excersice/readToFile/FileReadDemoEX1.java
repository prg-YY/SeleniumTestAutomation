package com.seleniummaster.Excersice.readToFile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileReadDemoEX1 {
    public static void main(String[] args) {
        File fileToRead=new File("last EX"+File.separator+"last");
        String contend=null;
        try {
             contend=FileUtils.readFileToString(fileToRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contend);
    }
}
