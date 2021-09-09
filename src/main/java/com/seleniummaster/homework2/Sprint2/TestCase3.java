package com.seleniummaster.homework2.Sprint2;

import com.seleniummaster.UyghurSchool.IO.FileUtility;
import com.seleniummaster.configutility.ApplicationConfig;
import com.seleniummaster.configutility.UiUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url;
        String configFile = "mahara.properties";
        if (Integer.parseInt(ApplicationConfig.readConfigProperties(configFile, "qa")) == 1) {
            url = ApplicationConfig.readConfigProperties(configFile, "maharaurl");
        } else {
            url = ApplicationConfig.readConfigProperties(configFile, "maharaurl1");
        }
        driver.get(url);
        UiUtility utility = new UiUtility(driver);//wait driver
        WebElement username = driver.findElement(By.id("login_login_username"));
        String usernameConfig = ApplicationConfig.readConfigProperties("mahara.properties", "username");
        utility.waitForElementPresent(username);
        username.sendKeys(usernameConfig);
        WebElement password = driver.findElement(By.id("login_login_password"));
        String passwordConfig = ApplicationConfig.readConfigProperties("mahara.properties", "password");
        utility.waitForElementPresent(password);
        password.sendKeys(passwordConfig);
        WebElement login = driver.findElement(By.id("login_submit"));
        utility.waitForElementPresent(login);
        login.click();

        driver.findElement(By.xpath("//div[@class=\"widget-heading\"]")).click();// click the drop down list
        driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button/span[2]")).click();// click the create tab on the drop down list
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("Plans")).click();//click the plans
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class=\"float-right btn-group btn-group-top\"]/a[2]")).click();//click the manage tasks
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //find edit button
        driver.findElement(By.xpath("//span[@class='icon icon-pencil-alt icon-lg']")).click();
        //update existing title
        WebElement editTaskTitle=driver.findElement(By.cssSelector("input[id='edittask_title']"));
        editTaskTitle.clear();
        editTaskTitle.sendKeys("make new task");//write title
        //change completion date
        WebElement completionDate = driver.findElement(By.cssSelector("input[name='completiondate']"));
        completionDate.sendKeys("2020/12/20");
        //edit description
        WebElement taskDescription = driver.findElement(By.cssSelector("textarea[id='edittask_description']"));
        taskDescription.clear();
        taskDescription.sendKeys("first task");
        //save updated information
        WebElement saveTaskButton = driver.findElement(By.cssSelector("button[id='edittask_submit']"));
        saveTaskButton.submit();

        //verify
        String successfully=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        StringBuilder result1=new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        if (driver.getPageSource().contains(successfully)){
            result1.append("The Task Saved successfully").append("\n");
            utility.takeScreenShot("The Task Saved successfully.png");
            fileUtility.writeToFile("maharatest-Result", "maharaResult", ".txt", result1.toString());


    }
        driver.close();
        driver.quit();
}}