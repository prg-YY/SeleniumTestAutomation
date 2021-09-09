package com.seleniummaster.classconcept;

import com.seleniummaster.excel.ExcelUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionLibrary {
    WebDriver driver;//class level  gloable
    //define open browser method
    public void openBrowser(String siteURL){
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(siteURL);
    }
    public void logIn(LoginUser user){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public void logIn(String username,String password){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public boolean verifyLogin(){
        WebElement logOutLink=driver.findElement(By.xpath("//div[@id=\"header\"]/span/a[2]"));
        if(logOutLink.isDisplayed()) {
            System.out.println("Login successfully");
            return true;
        }
        else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void addProduct(){
        ExcelUtility excelUtility=new ExcelUtility();
        String productName=excelUtility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file (1).xlsx",
                "Sheet1",4,0);
        String productWeight=excelUtility.readExcelCell("/Users/prg/IdeaProjects/SeleniumTestAutomation/testdata/first exel file (1).xlsx",
                "Sheet1",4,1);
        driver.findElement(By.id("nav_products")).click();//click the product tab
        driver.findElement(By.linkText("Add Product")).click();//click the add product filed

        for (int i=0;i<=2;i++){
            driver.findElement(By.name("name")).sendKeys(productName);
            driver.findElement(By.name("product_weight")).sendKeys(productWeight);
            driver.findElement(By.xpath("//input[@value='Save']")).click();
            //verify add product
            String verify=driver.findElement(By.xpath("//div[@class=\"success\"]")).getText();
            if (driver.getPageSource().contains(verify)){
                System.out.println("Add Product successfully");
            }else {
                System.out.println("failed");
            }
            driver.findElement(By.linkText("Add Product")).click();//click the add product filed
        }
//        WebElement productsLink=driver.findElement(By.id("nav_products"));
//        productsLink.click();
//        WebElement addProductLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
//        addProductLink.click();
//        driver.findElement(By.id("name")).sendKeys(productName);
//        driver.findElement(By.name("product_weight")).sendKeys(weight);
//        driver.findElement(By.xpath("//input[@value='Save']")).click();

    }
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public Object getDriver() {
        return driver;
    }
}


