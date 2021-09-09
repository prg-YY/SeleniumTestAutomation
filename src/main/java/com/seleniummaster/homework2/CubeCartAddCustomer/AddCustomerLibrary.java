package com.seleniummaster.homework2.CubeCartAddCustomer;

import com.seleniummaster.homework2.cubecartCategory.LoginUserCategory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;

public class AddCustomerLibrary {

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


    public boolean addCustomer() {
        Random random = new Random();
        int ran = random.nextInt(100);
        Customer customer1 = new Customer("prg0" , "yakuf", "rhinoprg1111116111@gmail.com" , "2828288", "adam123", "adam123");

        driver.findElement(By.xpath("//a[@target=\"_self\"]")).click();
        driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.xpath("//img[@rel=\"#customer_status\"]")).click();
        driver.findElement(By.name("customer[first_name]")).sendKeys(customer1.getFirstName());
        driver.findElement(By.name("customer[last_name]")).sendKeys(customer1.getLastName());
        driver.findElement(By.name("customer[email]")).sendKeys(customer1.getEmail());
        driver.findElement(By.name("customer[phone]")).sendKeys(customer1.getPhoneNumber());
        driver.findElement(By.name("customer[password]")).sendKeys(customer1.getPassword());
        driver.findElement(By.name("customer[passconf]")).sendKeys(customer1.getConfirmPassword());
        driver.findElement(By.name("save")).click();
        WebElement successM=driver.findElement(By.xpath("//div[@class=\"success\"]"));
        if (successM.isDisplayed()){
            System.out.println("Add customer successfully");
            return true;
        }
        else {
            System.out.println("Add customer test failed");
            return false;
        }

    }





    //delete customer
    public boolean deleteCustomer() {
        //click the customer list
        driver.findElement(By.xpath("//div[@id=\"navigation\"]//ul//a")).click();
        //find the Email web element
        //WebElement search=driver.findElement(By.xpath("//*[@id=\"customer-list\"]//thead/tr/td[4]/a[1]/div[1]"));
        //search.click();
        //find the created Email address
        //search. sendKeys("rhinoprg11111111@gmail.com");
        //click the delete icon
       driver.findElement(By.xpath("//*[@id=\"customer-list\"]//tbody/tr/td[7]/a[3]/i")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement successMessage = driver.findElement(By.id("gui_message"));
        String successWord = successMessage.getText();
        if (successWord.contains("Customer successfully deleted")) {
            System.out.println("Customer successfully deleted");
            return true;
        } else {
            System.out.println("Delete Customer test failed ");
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