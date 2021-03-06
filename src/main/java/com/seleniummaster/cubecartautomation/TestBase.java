package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static String browserName="chrome";

    public static void initialization(){
        //singleton design pattern
        if (driver==null){
            if (browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","/Users/prg/Documents/chromedriver");
                driver=new ChromeDriver();
                driver.manage().window().maximize();
            }
            else if (browserName.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", "/Users/prg/Documents/geckodriver.exe");
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
            }
        }
    }
    public static void closeBrowser(){
        driver.quit();
        driver=null;
    }
    public void waitForElementPresent(WebElement element,int timeOut){
        WebDriverWait wait=new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void fluentWait(WebElement element){
        Wait<WebDriver> wait=new FluentWait<>(driver).withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void sleep(int seconds) {


        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

