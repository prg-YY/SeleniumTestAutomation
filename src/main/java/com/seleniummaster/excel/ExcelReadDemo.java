package com.seleniummaster.excel;


import java.util.List;

public class ExcelReadDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        excelUtility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx"
                ,"Sheet1",0,0);
        excelUtility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx"
                ,"Sheet1",0,1);
        excelUtility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx"
                ,"Sheet1",1,0);
        excelUtility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx"
                ,"Sheet1",1,1);
        List<LoginInfo> loginUser=excelUtility.readMultipleCellValue("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx"
                ,"Sheet1",1);
        for (LoginInfo users:loginUser){
            System.out.println(String.format("username=%s password=%S",users.getUsername(),users.getPassword()));
        }

    }
}
