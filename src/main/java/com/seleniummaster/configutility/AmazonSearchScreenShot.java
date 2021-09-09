package com.seleniummaster.configutility;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchScreenShot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        //define chrome driver object instance
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.amazon.com");
        //multiple product search iphone ipad sumsung
        //String[] products = {"Iphone", "Ipad", "Sumsung", "Mac"};
        List<String> products=new ArrayList<>();
        products.add("Iphone");
        products.add("Ipad");
        products.add("Mac");
        UiUtility utility=new UiUtility(driver);
        StopWatch watch=new StopWatch();
        watch.start();
        for (String keyWords : products) {
            WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
            serachBox.sendKeys(keyWords+ Keys.ENTER);
            utility.takeScreenShot(keyWords+".png");
            driver.navigate().back();
        }
        watch.stop();
        System.out.println(watch);
        driver.close();
        driver.quit();
    }
}
