package com.seleniummaster.classconcept.MultiThread1121;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleGoogleSearch implements Runnable {
    private String searchWord;

    public MultipleGoogleSearch(String searchWord) {
        this.searchWord = searchWord;
    }

    @Override
    public void run() {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchWord + Keys.ENTER);

    }
}
