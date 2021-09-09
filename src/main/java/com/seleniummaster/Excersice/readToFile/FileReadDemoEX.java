package com.seleniummaster.Excersice.readToFile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileReadDemoEX {
    public static void main(String[] args) {
        File fileToRead=new File("last Ex"+File.separator+"last");
        String fileContend=null;
        try {
             fileContend= FileUtils.readFileToString(fileToRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileContend);
    }
}
