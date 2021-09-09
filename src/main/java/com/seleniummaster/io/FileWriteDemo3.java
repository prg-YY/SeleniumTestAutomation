package com.seleniummaster.io;

import com.seleniummaster.loops.ForEachLoop;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo3 {
    public static void main(String[] args) {
        //append content to an existing
        StringBuilder builder=new StringBuilder();
        builder.append("testautomation\n");
        builder.append("automation123!");
        File existingFile=new File("test-Result"+File.separator+"myfile1.txt");
        try {
            FileUtils.writeStringToFile(existingFile,builder.toString(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
