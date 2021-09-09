package com.seleniummaster.Excersice.writetofile;

public class FileUtilityDemoEx1 {
    public static void main(String[] args) {
        FileUtilityEX1 fileUtilityEX1=new FileUtilityEX1();
        StringBuilder fileContend=new StringBuilder();
        fileContend.append("asdasdasdasdsadasd\n");
        fileContend.append("sadasda\n");
        fileUtilityEX1.file1("maxik"+System.currentTimeMillis(),"file"+System.currentTimeMillis(),".txt",fileContend.toString());
    }
}
