package com.seleniummaster.homework2.W10D3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

class GoogleSearch_Searchwords {
    public static void main(String[] args) throws InterruptedException {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","/Users/prg/Documents/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver(options);
        //maximize the browser
        driver.manage().window().maximize();

        //open google site
        driver.get("https://www.google.com");
        //find search box element
//        WebElement searchBox=driver.findElement(By.name("q"));
        SearchWord word1=new  SearchWord();
        word1.setKeyWords("Java");
        SearchWord word2=new SearchWord();
        word2.setKeyWords("Javascript");
        SearchWord word3=new SearchWord();
        word3.setKeyWords("C++");


        List<SearchWord> wordList=new ArrayList<>();
        wordList.add(word1);
        wordList.add(word2);
        wordList.add(word3);

        for (SearchWord word :wordList){
            driver.findElement(By.name("q")).sendKeys(word.getKeyWords()+Keys.ENTER);
            Thread.sleep(3000);
            driver.navigate().back();


        }


        driver.close();
        driver.quit();


    }
}
