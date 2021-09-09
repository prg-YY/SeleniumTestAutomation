package com.seleniummaster.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo1 {
    public static void main(String[] args) {
        ExcelUtility utility=new ExcelUtility();
        String fileName="/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata//testReport.xlsx";
        List<String> testReport=new ArrayList<>();
        testReport.add("testName,testModule,TestStatus,executesAt,executedBy");
        testReport.add("Login,Login,passed,2020-12-12,prg");
        testReport.add("Add Product,Inventory,Password,2020-12-12,prg");
        testReport.add("LogOut,login-logout,passed,2020-12-12,prg");
        utility.writeToExcelMultipleCells(fileName,"Regression-Test",testReport);
    }
}
