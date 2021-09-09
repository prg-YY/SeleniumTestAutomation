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


public class TestCase2 {
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

        UiUtility utility=new UiUtility(driver);
        WebElement username=driver.findElement(By.id("login_login_username"));
        String userNameConfig=ApplicationConfig.readConfigProperties("mahara.properties","username");
        username.sendKeys(userNameConfig);
        utility.waitForElementPresent(username);

        WebElement password=driver.findElement(By.id("login_login_password"));
        String passwordConfig=ApplicationConfig.readConfigProperties("mahara.properties","password");
        password.sendKeys(passwordConfig);
        utility.waitForElementPresent(password);

        WebElement login=driver.findElement(By.id("login_submit"));
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

        driver.findElement(By.xpath("//div[@class=\"btn-top-right btn-group btn-group-top\"]/a/span")).click();//click the new task tab
        StudentPlan task=new StudentPlan("my task","first task");//type the task tittle on the task text box
        driver.findElement(By.id("edittask_title")).sendKeys(task.getTitle());
        driver.findElement(By.id("edittask_description")).sendKeys(task.getDescription());//type the task description
        driver.findElement(By.id("edittask_submit")).click(); //click the sava task button

        String successfully=driver.findElement(By.id("messages")).getText();//verify
        StringBuilder result1=new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        if (driver.getPageSource().contains(successfully)){
            result1.append("Login successfully").append("\n");
            utility.takeScreenShot("login successfully.png");
            fileUtility.writeToFile("maharatest-Result", "maharaResult", ".txt", result1.toString());

            //System.out.println("New Task Added Successfully");

            utility.takeScreenShot("add task success.png"); //take screen shot
        }else {
            System.out.println("Add New Task failed");

           String logOut1=driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button[2]/span[2]")).getText();//click the logout dropdown list icon
            driver.findElement(By.xpath("//*[@id=\"main-nav-user\"]/ul/li[5]/a")).click();//click the logout teb
            if (driver.getPageSource().contains(logOut1)){
                System.out.println("LogOut Successfully");
            }








    }
        driver.close();
        driver.quit();
}}