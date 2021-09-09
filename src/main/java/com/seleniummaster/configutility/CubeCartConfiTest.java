package com.seleniummaster.configutility;

import com.seleniummaster.UyghurSchool.IO.FileUtility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CubeCartConfiTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String url;
        String configFile = "config.properties";
        if (Integer.parseInt(ApplicationConfig.readConfigProperties(configFile, "qa")) == 1) {
            url = ApplicationConfig.readConfigProperties(configFile, "qaurl");
        } else {
            url = ApplicationConfig.readConfigProperties(configFile, "produrl");
        }
        driver.get(url);
        UiUtility uiUtility = new UiUtility(driver);
        WebElement userNameField = driver.findElement(By.id("username"));
        String userName = ApplicationConfig.readConfigProperties(configFile, "username");
        uiUtility.waitForElementPresent(userNameField);
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.id("password"));
        String password = ApplicationConfig.readConfigProperties(configFile, "password");
        uiUtility.waitForElementPresent(passwordField);
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        uiUtility.waitForElementPresent(loginButton);
        loginButton.click();
        WebElement logoutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        if (logoutIcon.isDisplayed()) {
            result.append("Login successfully").append("\n");
            uiUtility.takeScreenShot("login successfully.png");
        }
        fileUtility.writeToFile("test-Result", "cubecartresult", ".txt", result.toString());
        uiUtility.waitForElementPresent(logoutIcon);
        logoutIcon.click();
        WebElement loginButtonafterlogout = driver.findElement(By.id("login"));
        if (loginButtonafterlogout.isDisplayed()) {
            result.append("Log Out Successfully");
            uiUtility.takeScreenShot("logoutSuccess.png");
        }
        File existingFile = new File("test-Result" + File.separator + "cubecart-result.txt");

        try {
            FileUtils.writeStringToFile(existingFile, result.toString());
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
