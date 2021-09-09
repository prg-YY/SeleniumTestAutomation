package com.seleniummaster.Excersice.writetofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtilityEX1 {
    public void file1(String folderName,String fileName,String extension,String fileContent){
        String directory=System.getProperty("user.dir");
        String finalDirectory=directory+ File.separator+folderName;
        File file=new File(finalDirectory);
        if (!file.exists()){
            file.mkdir();
            System.out.println("Create a Folder");
        }
        String finalFileName=directory+File.separator+fileName+extension;
        File finalFile=new File(finalFileName);
        FileWriter writer= null;
        try {
            writer = new FileWriter(finalFile.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        try {
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
