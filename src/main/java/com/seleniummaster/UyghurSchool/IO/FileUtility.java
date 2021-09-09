package com.seleniummaster.UyghurSchool.IO;

import com.seleniummaster.homework2.sprint3.CubeCartInfo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {


    //create a method to write a text file
    public void writeToFile(String folderName, String fileName, String fileExtension, String fileContent) {

        //create a folder if the folder does not exist
        String workingDirectory = System.getProperty("user.dir");
        String finalDirectory = workingDirectory + File.separator + folderName;
        System.out.println(finalDirectory);

        //define a file
        File file = new File(finalDirectory);
        if (!file.exists()) { //if the folder does not exists

            file.mkdir();
            System.out.println("Folder has been created");
        }
        String finalFileName = finalDirectory + File.separator + fileName + "-" +
                System.currentTimeMillis() + fileExtension;
        System.out.println(finalFileName);
        FileWriter fileWriter = null;
        File f = new File(finalFileName);
        try {
            fileWriter = new FileWriter(f.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //create a buffer writer instance
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
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
//    public String readTextFile(String folderName,String fileName){
//        String workingDir=System.getProperty("user.dir");
//        StringBuilder fileContent=new StringBuilder();
//        File file=new File()
//    }

}
