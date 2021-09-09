package com.seleniummaster.homework2.cubecartCategory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;

public class  AddCategoryLibrary {


    //1.open browser
    WebDriver driver;

    public void openBrowser(String siteURL) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(siteURL);
    }

    // 2.login
    //3.verify login
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

    //4.click the category link
    //5.add  the category
    // 6.Enable status check box
    //7.enable visible check box
    // 8.type category name
    //9.click save button
    //10.verify successfully  added massage
    public boolean addCategory() {
        driver.findElement(By.id("nav_categories")).click();
        driver.findElement(By.linkText("Add Category")).click();
        //driver.findElement(By.xpath("//img[@rel=\"#status\"]")).click();
        //driver.findElement(By.xpath("//img[@class=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//img[@rel=\"#status\"]")).click();
        driver.findElement(By.xpath("//img[@rel=\"#visible\"]")).click();

        Random random = new Random();
        int ran = random.nextInt(100);
        driver.findElement(By.name("cat[cat_name]")).sendKeys("prg" + ran);
        driver.findElement(By.id("cat_save")).click();
        WebElement successMessage = driver.findElement(By.xpath("//div[@class=\"success\"]"));

        if (successMessage.isDisplayed()) {
            System.out.println("Category added successfully");
            return true;
        } else {
            System.out.println("Add category test failed");
            return false;
        }

    }
    //delete category
    public boolean deleteCategory(){
        driver.findElement(By.id("nav_categories")).click();
        driver.findElement(By.xpath("//*[@id=\"categories\"]//tbody/tr/td[7]/a[4]/i")).click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        String successMessage= driver.findElement(By.xpath("//div[@class=\"success\"]")).getText();
        if (driver.getPageSource().contains(successMessage)){
            System.out.println("Test passed, Category successfully deleted");
            return true;
        }
        else {
            System.out.println("Delete Category failed");
            return false;
        }

    }


    //11.logout
    public void logOut() {
        driver.findElement(By.xpath("//i[@class=\"fa fa-sign-out\"]")).click();
    }

    //12.close browser
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }


}
