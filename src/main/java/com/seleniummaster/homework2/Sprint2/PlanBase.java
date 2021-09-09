package com.seleniummaster.homework2.Sprint2;


import com.seleniummaster.MaharaProject.MaharaLogin;
import com.seleniummaster.configutility.ApplicationConfig;
import com.seleniummaster.configutility.UiUtility;
import com.seleniummaster.datastructure.TreeSetDemo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

//        1-step
public class PlanBase {
    WebDriver driver;

    public PlanBase() {

    }

    public void openBrowser(String SiteURL) {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SiteURL);

    }

    public void logIn() {
        MaharaLogin login = new MaharaLogin("yusufyakup", "!@#A12345prg");
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

    public void createPlan() {
        driver.findElement(By.xpath("//div[@class=\"widget-heading\"]")).click();
        //click the main menu dropdown  list
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
        String verify = driver.findElement(By.id("messages")).getText();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (driver.getPageSource().contains(verify)) {
            System.out.println("Plan saved successfully");
        } else {
            System.out.printf("Plan Creation failed");
        }
    }


    //add task method
    public void addTask(){
        // click the drop down list
        driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button/span[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // click the create tab on the drop down list
        driver.findElement(By.xpath("//div[@id=\"main-nav\"]/ul/li[2]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //click the plans
        driver.findElement(By.xpath("//*[@id=\"childmenu-1\"]/li[5]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click the manage tasks
        driver.findElement(By.xpath("//div[@class=\"float-right btn-group btn-group-top\"]/a[2]")).click();
        //click the new task tab
        driver.findElement(By.xpath("//div[@class=\"btn-top-right btn-group btn-group-top\"]/a/span")).click();
        //type the task tittle on the task text box
        StudentPlan task=new StudentPlan("my task","first task");
        driver.findElement(By.id("edittask_tittle")).sendKeys(task.getTitle());
        //type the task description
        driver.findElement(By.id("edittask_description")).sendKeys(task.getDescription());
        //click the sava task button
        driver.findElement(By.id("edittask_submit")).click();
        //verify the new task added successfully
        String successfully =driver.findElement(By.id("message")).getText();
        if (driver.getPageSource().contains(successfully)){
            System.out.println("New Task Added Successfully");
            //take screen shot
            UiUtility utility=new UiUtility(driver);
            utility.takeScreenShot("add task.png");
        }else {
            System.out.println("Add New Task failed");
        }

    }

    //Edit task method
    public void editTask(){
        driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button/span[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // click the create tab on the drop down list
        driver.findElement(By.xpath("//div[@id=\"main-nav\"]/ul/li[2]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //click the plans
        driver.findElement(By.xpath("//*[@id=\"childmenu-1\"]/li[5]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click the manage tasks
        driver.findElement(By.xpath("//div[@class=\"float-right btn-group btn-group-top\"]/a[2]")).click();
        //click the manage
        driver.findElement(By.id("//div[@class=\"text-nowrap\"]/div/a/span")).click();
        //Clear the task title
        driver.findElement(By.id("edittask_reminder")).clear();
        //change the task title
        driver.findElement(By.id("edittask_reminder")).sendKeys("first task");
        //select the remainder
        WebElement remainder=driver.findElement(By.id("edittask_reminder_units"));
      //  remainder.click();
      driver.findElement(By.id("//select[@id=\"edittask_reminder_units\"]/option[2]"));
        //click the lable(yes or no)
        driver.findElement(By.xpath("//*[@class=\"switch-label\"]/span[4]")).click();
        //save button
        driver.findElement(By.id("edittask_submit")).click();
        //verify edit task successfully
        String verifyEditTask=driver.findElement(By.id("messages")).getText();
        if (driver.getPageSource().contains(verifyEditTask)){
            System.out.println("Task saved successfully");
        }

    }

    //logout
    public void logout() {
        //click the logout dropdown list icon
        driver.findElement(By.xpath("//div[@class=\"nav-toggle-area\"]/button[2]/span[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //click the logout teb
        driver.findElement(By.xpath("//*[@id=\"main-nav-user\"]/ul/li[5]/a")).click();

    }

    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
    private int timeout=Integer.parseInt(ApplicationConfig.readConfigProperties("mahara.properties",
            "timeout"));
    private WebDriver driver1;
    public PlanBase(WebDriver driver1){
        this.driver1=driver1;
    }
    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void takeScreenShot(String fileName){
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
        String folder=ApplicationConfig.readConfigProperties("mahara.properties","imagefolder");
        File finalFile=new File(folder+File.separator+fileName);
        try {
            FileUtils.copyFile(screenshotFile,finalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}