package com.seleniummaster.MaharaProject;

import com.seleniummaster.MaharaProject.UpdateGroup.LoginUpdate;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;

public class MaharaFunctionLibrary {
    WebDriver driver;

    //mahara login
    public void openBrowser(String SiteURL) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SiteURL);

        //mahara Login
    }

    public void logIn() {
        MaharaLogin login = new MaharaLogin("yusufyakup", "#A2267187a");
        driver.findElement(By.id("login_login_username")).sendKeys(login.getUserName());
        driver.findElement(By.id("login_login_password")).sendKeys(login.getPassword());
        driver.findElement(By.id("login_submit")).click();

        //verify login

        WebElement verifyLogin = driver.findElement(By.xpath("//a[@class=\"user-icon user-icon-25\"]"));
        if (verifyLogin.isDisplayed()) {
            System.out.println("Test passed,Login successfully");
        } else {
            System.out.println("Test Failed, Can not Login");
        }
    }
    //craete group

        public void createGroup() throws InterruptedException {
            Random ran = new Random();
            int r = ran.nextInt(100);
            MaharaLogin maharaLogin = new MaharaLogin();
            maharaLogin.setGroupName("yusuf "+r);
            //click the Engage future
            driver.findElement(By.xpath("//*[@id=\"home-info-engage\"]/div/div/span")).click();
            //click the create group icon
            driver.findElement(By.xpath("//*[@class=\"btn-top-right btn-group btn-group-top\"]/a/span")).click();
            //type the group name
            driver.findElement(By.id("editgroup_name")).sendKeys(maharaLogin.getGroupName());
            Thread.sleep(3000);
            //click the Save button
            driver.findElement(By.id("editgroup_submit")).click();
            //verify New Group added successfully
            String verifyMessage = driver.findElement(By.xpath("//div[@id=\"messages\"]/div")).getText();
            if (driver.getPageSource().contains(verifyMessage)) {
                System.out.println("Test passed. New Group successfully added");
            } else {
                System.out.println("Add group test failed");
        }
    }
    public boolean updateGroup() throws InterruptedException {
        driver.findElement(By.linkText("My groups:")).click(); // click the my group future
        driver.findElement(By.xpath("//*[@class=\"btn-action-list\"]/div/a/span")).click();// click the Setting
        //switch to frame
        LoginUpdate groupDescription=new LoginUpdate(" My new Mahara  group");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"tox-sidebar-wrap\"]/div/iframe")));
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys(groupDescription.getGroupDescription());
        driver.switchTo().defaultContent(); // switch to default content
        Thread.sleep(3000);
        driver.findElement(By.id("editgroup_submit")).click(); // click the save Button
        //verify group successful updated //Group saved successfully
        String  groupSavedSuccessfully=driver.findElement(By.id("messages")).getText();
        if (driver.getPageSource().contains(groupSavedSuccessfully)){
            System.out.println("Update Group test passed."+"\n"+"System successfully updated your group");
            return true;
        }
        else {
            System.out.println("Test Failed, system can not update Group");
            return false;
        }
    }








    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}