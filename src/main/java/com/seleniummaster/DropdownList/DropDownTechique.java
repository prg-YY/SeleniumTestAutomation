package com.seleniummaster.DropdownList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class DropDownTechique {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.facebook.com/" +
                "reg/?rs=6&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA1MDI4NjA4LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");

        List<WebElement> list=driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }

    }
}
