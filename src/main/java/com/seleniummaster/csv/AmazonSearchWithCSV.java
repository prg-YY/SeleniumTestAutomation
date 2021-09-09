package com.seleniummaster.csv;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchWithCSV {
    public static void main(String[] args) {
        CSVFileUtility csvFileUtility = new CSVFileUtility();
        List<String> searchwords = csvFileUtility.readCSVFile("test-Result", "amazon-products.csv",
                "searchwords");


        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        //define chrome driver object instance
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.amazon.com");
        StopWatch watch = new StopWatch();
        watch.start();
        for (String keyWords : searchwords) {
            WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
            serachBox.sendKeys(keyWords + Keys.ENTER);
            driver.navigate().back();
        }
        watch.stop();
        System.out.println(watch);
        driver.close();
        driver.quit();

    }

}
