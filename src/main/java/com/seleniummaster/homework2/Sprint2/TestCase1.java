package com.seleniummaster.homework2.Sprint2;

import com.seleniummaster.UyghurSchool.IO.FileUtility;
import com.seleniummaster.configutility.ApplicationConfig;
import com.seleniummaster.configutility.UiUtility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestCase1 {
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

        //verify login and Screen shot
        WebElement verifyLogin = driver.findElement(By.xpath("//a[@class=\"user-icon user-icon-25\"]"));
        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        if (verifyLogin.isDisplayed()) {
            utility.waitForElementPresent(verifyLogin);
            result.append("Login successfully").append("\n");
            utility.takeScreenShot("login successfully.png");
            fileUtility.writeToFile("maharatest-Result", "maharaResult", ".txt", result.toString());
        }
        //create a  plan
        driver.findElement(By.xpath("//div[@class=\"widget-heading\"]")).click();
        //click the dropdown list
        driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button/span[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        //click the plans
        driver.findElement(By.linkText("Plans")).click();
        //click the new plan icon
        driver.findElement(By.xpath("//div[@class=\"btn-group btn-group-top\"]/a/span")).click();
        //type the plan title and description
        StudentPlan plan = new StudentPlan("my plan-yusuf", "this is my first plan");
        driver.findElement(By.id("addplan_title")).sendKeys(plan.getTitle());
        driver.findElement(By.id("addplan_description")).sendKeys(plan.getDescription());
        //click the save button
        driver.findElement(By.id("addplan_submit")).click();

        //verify plan have added
        String verifyPlanSaved = driver.findElement(By.id("messages")).getText();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (driver.getPageSource().contains(verifyPlanSaved)) {
            result.append("Plan saved successfully").append("\n");
            plan.getDescription().getBytes(StandardCharsets.UTF_8);
            utility.takeScreenShot("Plan saved successfully.png");
            fileUtility.writeToFile("maharatest-Result", "maharaResult", ".txt", result.toString());

        }

        //click the logout dropdown list icon
        driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button[2]/span[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click the logout dropdown list icon
        String logout1 = driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button[2]/span[2]")).getText();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click the logout teb
        driver.findElement(By.xpath("//*[@id=\"main-nav-user\"]/ul/li[5]/a")).click();
        if (driver.getPageSource().contains(logout1)) {

            result.append("Log Out Successfully");
            utility.takeScreenShot("logoutSuccess.png");
        }
        File existingFile = new File("maharatest-Result" + File.separator + "maharaResult.txt");

        try {
            FileUtils.writeStringToFile(existingFile, result.toString());
        } catch (IOException e) {
            e.printStackTrace();

        }
        driver.close();
        driver.quit();
    }

}
