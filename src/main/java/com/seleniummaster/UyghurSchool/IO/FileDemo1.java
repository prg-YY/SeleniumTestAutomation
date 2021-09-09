package com.seleniummaster.UyghurSchool.IO;

public class FileDemo1 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        String myContent="This is a text file";
        myContent=myContent+"\n"+"This is a second line";
        fileUtility.writeToFile("unitedSchool","myFile",".txt",myContent);
    }
}
