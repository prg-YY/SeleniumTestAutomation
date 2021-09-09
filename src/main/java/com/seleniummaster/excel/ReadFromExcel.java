package com.seleniummaster.excel;

import com.seleniummaster.classconcept.FunctionLibrary;
import com.seleniummaster.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;

public class ReadFromExcel {
    public static void main(String[] args) {
        WebDriver driver;
        FunctionLibrary functionLibrary=new FunctionLibrary();
        ApplicationConfig config=new ApplicationConfig();
        String url= ApplicationConfig.readConfigProperties("config.properties","qaurl");
        functionLibrary.openBrowser(url);

        ExcelUtility utility=new ExcelUtility();
        String username=utility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx",
                "Sheet1",1,0);
        String password=utility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file.xlsx",
                "Sheet1",1,1);
        functionLibrary.logIn(username,password);
        functionLibrary.addProduct();

        functionLibrary.closeBrowser();

    }
}
