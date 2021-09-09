package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        File fileToread = new File("test-result" + File.separator + "myfile1.txt");
        String fileContent = null;
        try {
            fileContent = FileUtils.readFileToString(fileToread);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileContent);
    }
}
