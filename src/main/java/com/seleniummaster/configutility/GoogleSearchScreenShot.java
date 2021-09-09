package com.seleniummaster.configutility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GoogleSearchScreenShot {
    public static void main(String[] args) {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","/Users/prg/Documents/chromedriver");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        //find search box element
        String[] searchWord=new String[]{"Turkey","Japan","Dubai","Finland","Komul"};
        UiUtility utility=new UiUtility(driver);
        for (String words:searchWord){
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(words + Keys.ENTER);
            utility.takeScreenShot(words+".png");
            driver.navigate().back();

        }

        driver.close();
        driver.quit();

    }

    }

