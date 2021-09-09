package com.seleniummaster.Json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seleniummaster.excel.ExcelUtility;
import com.seleniummaster.excel.LoginInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleBaseSecurityTestWithJson {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        //for getting the start time
        TestResult testResult=new TestResult();
        String startTime=TestHelper.getToday()+ " "+ TestHelper.getCurrentTime();
        String startTIme=new Date().toString();
        testResult.setTestStartTime(startTIme);
        //for current time
        testResult.setTestExecutedBy(TestHelper.getCurrentUse());

        ObjectMapper mapper = new ObjectMapper();
        Users loginUser = null;
        try {
            loginUser = mapper.readValue(new File("json/users.json"), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<TestResultObject> testResultObjectList=new ArrayList<>();
        List<User> users = loginUser.getUsers();
        for (User user : users) {
            TestResultObject testResultObject=new TestResultObject();
            if (user.getActive()) {

                testResultObject.setTestModule("Login");
                testResultObject.setTestName("Login");

                String testDate=TestHelper.getToday();
                testResultObject.setTestData(testDate);
                String testTime=TestHelper.getCurrentTime();
                testResultObject.setTestTime(testTime);

                WebElement userNameField = driver.findElement(By.id("username"));
                waitForElementPresent(driver, userNameField);
                String username = user.getUsername();
                userNameField.sendKeys(user.getUsername());
                WebElement passwordField = driver.findElement(By.id("password"));
                waitForElementPresent(driver, passwordField);
                String password = user.getPassword();
                passwordField.sendKeys(user.getPassword());
                WebElement loginButton = driver.findElement(By.id("login"));
                waitForElementPresent(driver, loginButton);
                loginButton.click();
                WebElement productLink = driver.findElement(By.id("nav_products"));
                if (productLink.isDisplayed()) {
                    System.out.println("Login test passed");
                    testResultObject.setTestStatus(true);

                } else {
                    System.out.println("Login test failed");
                    testResultObject.setTestStatus(false);

                }
                WebElement logOutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
                waitForElementPresent(driver, logOutIcon);
                logOutIcon.click();
                Thread.sleep(3000);
            }
            testResultObjectList.add(testResultObject);
        }
        driver.close();
        driver.quit();
        testResult.setTestEndTime(TestHelper.getToday()+" "+TestHelper.getCurrentTime());
        testResult.setTestResultObjectList(testResultObjectList);
        ObjectMapper mapper1=new ObjectMapper();
        try {
            mapper1.writeValue(new File("json/login-test-result.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sleep(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void waitForElementPresent(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
