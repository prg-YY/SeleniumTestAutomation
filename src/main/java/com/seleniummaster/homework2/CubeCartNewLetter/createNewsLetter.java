package com.seleniummaster.homework2.CubeCartNewLetter;

import com.seleniummaster.homework2.cubecartCategory.LoginUserCategory;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;

public class createNewsLetter {

    WebDriver driver;

    public void openBrowser(String siteURL) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(siteURL);
    }

    public boolean logIn(LoginUserCategory user) {
        driver.findElement(By.name("username")).sendKeys(user.getUserName());
        driver.findElement(By.name("password")).sendKeys(user.getPassword());
        driver.findElement(By.name("login")).click();
        WebElement verifyLogin = driver.findElement(By.xpath("//span[@class=\"user_info\"]"));
        if (verifyLogin.isDisplayed()) {
            System.out.println("Login successfully");
            return true;
        } else {
            System.out.println("Login tent filed");
            return false;
        }
    }

    public boolean createNews() throws InterruptedException {
        Random random = new Random();
        int ran = random.nextInt(100);
        NewsLetter newsLetter = new NewsLetter("todaysnews", "prg", "asdahfgsd@gmail.com" , "who is the president of usa");

        driver.findElement(By.xpath("//div[@id=\"navigation\"]/ul/li[4]/a")).click();
        driver.findElement(By.linkText("Create Newsletter")).click();
        driver.findElement(By.name("newsletter[subject]")).sendKeys(newsLetter.getNewsletterSubject());
        driver.findElement(By.name("newsletter[sender_name]")).sendKeys(newsLetter.getSenderName());
        driver.findElement(By.name("newsletter[sender_email]")).sendKeys(newsLetter.getSenderEmail());
        driver.findElement(By.xpath("//*[@id=\"content\"]//div/div[2]")).click();

        NewsLetter htmlContent=new NewsLetter();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\\\"cke_1_contents\\\"]/iframe")));
        driver.findElement(By.xpath("/html/body")).sendKeys(htmlContent.getHtmlContent());
        Thread.sleep(3000);
        driver.switchTo().defaultContent();


        //driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe"));
        //driver.findElement(By.xpath("//div[@class=\"form_control\"]/input[3]")).click();

        WebElement succesN=driver.findElement(By.xpath("//div[@class=\"success\"]"));
        if (succesN.isDisplayed()){
            System.out.println("create news latter successfully");
            return true;
        }
        else {
            System.out.println("create news failed");
            return false;
        }
    }

    public void logOut(){
        driver.findElement(By.xpath("//i[@class=\"fa fa-sign-out\"]")).click();
    }

    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
