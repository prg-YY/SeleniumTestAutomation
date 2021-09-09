package com.seleniummaster.Excersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {
    public static void main(String[] args) throws InterruptedException {
        Customer[] customers=new Customer[1];

        Customer customer1=new Customer("yusuf","jacob"
                ,222222,"731731435@gmail.com","1234567","1234567");
//        Customer customer2=new Customer("adil","mogo",123123,"7314345@gmail.com"
//                ,"123456","123456");
        customers[0]=customer1;
//        customers[1]=customer2;

        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");


            driver.findElement(By.name("username")).sendKeys("testautomation");
            driver.findElement(By.name("password")).sendKeys("automation123!");
            driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//a[@target=\"_self\"]")).click();



            for (Customer c:customers){
                driver.findElement(By.linkText("Add Customer")).click();
                Thread.sleep(3000);
                driver.findElement(By.id("cust-firstname")).sendKeys(c.toString());
                Thread.sleep(3000);
                driver.findElement(By.id("cust-lastname")).sendKeys(c.getLastName());
                Thread.sleep(3000);
                driver.findElement(By.id("cust-email")).sendKeys(c.getEmail());
                Thread.sleep(3000);
                driver.findElement(By.name("customer[password]")).sendKeys(c.getPassword());
                Thread.sleep(3000);
                driver.findElement(By.name("customer[password]")).sendKeys(c.getConfirmPassword());
                Thread.sleep(3000);
                driver.findElement(By.name("save")).click();
        }

            driver.close();
            driver.quit();




    }
}
