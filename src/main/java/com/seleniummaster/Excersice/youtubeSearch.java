package com.seleniummaster.Excersice;

import com.seleniummaster.homework2.W10D3.SearchWord;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class youtubeSearch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/prg/Documents/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        SearchWord search1=new SearchWord();
        search1.setKeyWords("uyghur etot");
        SearchWord search2=new SearchWord();
        search2.setKeyWords("baris bra");
        SearchWord search3=new SearchWord();
        search3.setKeyWords("kozmik karinca");

        List<SearchWord> searchList=new ArrayList<>();
        searchList.add(search1);
        searchList.add(search2);
        searchList.add(search3);

        for (SearchWord s:searchList){
            driver.findElement(By.name("q")).sendKeys(s.getKeyWords()+ Keys.ENTER);
            Thread.sleep(3000);
            driver.navigate().back();


        }
        driver.close();
        driver.quit();

    }
}
