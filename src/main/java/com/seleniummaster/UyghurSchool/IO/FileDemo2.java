package com.seleniummaster.UyghurSchool.IO;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder();
        myString.append("This is line 1").append("\n");
        myString.append("This is line 2").append("\n");
        myString.append("This is line 3").append("\n");
        myString.append("This is line 4").append("\n");
        myString.append(1234);

        File file = new File("doc1\\test1.txt");
        try {
            FileUtils.writeStringToFile(file,myString.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

