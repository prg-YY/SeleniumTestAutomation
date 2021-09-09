package com.seleniummaster.Excersice.readToFile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CompareClass {
    public static void main(String[] args) {
        File file=new File("last EX"+File.separator+"last");
        File file1=new File("maxik"+File.separator+"myFile");

        String fileContent= null;
        try {
            fileContent = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String file1Content= null;
        try {
            file1Content = FileUtils.readFileToString(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileContent.equalsIgnoreCase(file1Content)){
            System.out.println("file are the same");
        }else System.out.println("file are different");
    }
}
