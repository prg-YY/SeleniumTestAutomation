package com.seleniummaster.Excersice.writetofile;

public class FileWriteDemoEX {
    public static void main(String[] args) {
        FileUtilityEX fileUtilityEX=new FileUtilityEX();
        StringBuilder fileContentEX=new StringBuilder();
        fileContentEX.append("sadasdasd \n");
        fileContentEX.append("sdasdasdasd \n");
        fileUtilityEX.writeToFile("maxik folder"+System.currentTimeMillis(),"hojet"+System.currentTimeMillis(),".txt",fileContentEX.toString());
    }
}
