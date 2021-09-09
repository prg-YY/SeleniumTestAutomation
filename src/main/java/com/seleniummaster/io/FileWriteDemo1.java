package com.seleniummaster.io;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        StringBuilder fileContant=new StringBuilder();
        fileContant.append("I love coding in Jaca \n");
        fileContant.append("Java coding is fun \n");
        fileContant.append("Java Test Automation Demo \n");
        fileContant.append("Test Passed ");
        fileUtility.writeToFile("test-Result","result"+System.currentTimeMillis()
                ,".txt",fileContant.toString());

    }
}
