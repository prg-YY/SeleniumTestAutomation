package com.seleniummaster.homework2.sprint3;

import com.seleniummaster.UyghurSchool.IO.FileUtility;
import com.seleniummaster.configutility.ApplicationConfig;
import com.seleniummaster.configutility.UiUtility;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CubeCartPlanBase {
    WebDriver driver;
    String configFile = "config.properties";


    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ApplicationConfig.readConfigProperties(configFile, "produrl"));
    }

    public void logIn() {
        //wait driver
        UiUtility utility = new UiUtility(driver);
        String configFile = "config.properties";
        WebElement username = driver.findElement(By.name("username"));
        String CubeUsername = ApplicationConfig.readConfigProperties(configFile, "username");
        utility.waitForElementPresent(username);
        username.sendKeys(CubeUsername);

        WebElement password = driver.findElement(By.name("password"));
        String CubePassword = ApplicationConfig.readConfigProperties(configFile, "password");
        utility.waitForElementPresent(password);
        password.sendKeys(CubePassword);
        driver.findElement(By.name("login")).click();

        WebElement verifyLogin = driver.findElement(By.xpath("//span[@class=\"user_info\"]"));
        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        if (verifyLogin.isDisplayed()) {
            utility.waitForElementPresent(verifyLogin);
            result.append("Login successfully").append("\n");
            utility.takeScreenShot("login successfully.png");
            fileUtility.writeToFile("CubeCart-Result", "login successfully", ".txt", result.toString());
        }
    }

    public void AddProduct() throws InterruptedException {
        UiUtility utility = new UiUtility(driver);
        List<CubeCartInfo> products = new ArrayList<>();
        products.add(new CubeCartInfo("Adam giya", "0902", "1000Kg", "" +
                "", "100", "80", "60"));
        products.add(new CubeCartInfo("drone SG907", "", "300g", "" +
                "", "1000", "800", "600"));
        products.add(new CubeCartInfo("Subaru WRX", "", "" +
                "", "New", "10000", "8000", "6000"));
        for (CubeCartInfo cartInfo : products) {

            driver.findElement(By.id("nav_products")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"tab\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("name")).sendKeys(cartInfo.getProductName());
            Thread.sleep(1000);
            driver.findElement(By.id("product_code")).sendKeys(cartInfo.getProductCode());
            Thread.sleep(1000);
            driver.findElement(By.id("product_weight")).sendKeys(cartInfo.getProductWeight());
            Thread.sleep(1000);
            WebElement dropDown = driver.findElement(By.id("condition"));
            Thread.sleep(1000);
            Select selectDropDown = new Select(dropDown);
            selectDropDown.selectByValue("used");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@id=\"tab_control\"]/div[3]")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("price")).sendKeys(cartInfo.getRetailPrice());
            Thread.sleep(1000);
            driver.findElement(By.id("sale_price")).sendKeys(cartInfo.getSalePrice());
            Thread.sleep(1000);
            driver.findElement(By.id("cost_price")).sendKeys(cartInfo.getCostPrice());
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"form_control\"]/input[3]")).click();
            Thread.sleep(1000);

            WebElement AddProduct = driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div[2]"));
            StringBuilder result = new StringBuilder();
            FileUtility fileUtility = new FileUtility();
            if (AddProduct.isDisplayed()) {
                utility.waitForElementPresent(AddProduct);
                result.append("Add Product Successfully").append("\n");
                utility.takeScreenShot("Add Product Successfully.png");
                fileUtility.writeToFile("CubeCart-Result", "Add Product Successfully", ".txt", result.toString());
            }
        }
    }

    public void ChangeBulkPrice() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@id=\"menu_Inventory\"]/li[9]")).click();
        Thread.sleep(5000);
        WebElement select1 = driver.findElement(By.xpath("//select[@id=\"bulk_price_method\"]"));
        Select byPercent = new Select(select1);
        byPercent.selectByIndex(1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"price[value]\"]")).sendKeys("10");

        WebElement select2 = driver.findElement(By.xpath("//select[@name=\"price[field]\"]"));
        Select salePrice = new Select(select2);
        salePrice.selectByIndex(2);
        Thread.sleep(3000);
        List<WebElement> tr = Collections.singletonList(driver.findElement(By.xpath("//*[@id=\"bulk_update_products\"]/div/table/tbody/tr")));
        for (WebElement trs : tr) {
            if (trs.getText().equals("Adan giya")) {
                break;
            }
            driver.findElement(By.xpath("//input[@value=\"14082\"]")).click();
            Thread.sleep(3000);
        }
        driver.findElement(By.xpath("//div[@class=\"form_control\"]/input")).click();
        Thread.sleep(3000);

        WebElement bulkPriceChange = driver.findElement(By.xpath("//div[@class=\"success\"]"));
        UiUtility utility = new UiUtility(driver);
        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        if (bulkPriceChange.isDisplayed()) {
            utility.waitForElementPresent(bulkPriceChange);
            result.append("Change Bulk Price Successfully").append("\n");
            utility.takeScreenShot("Change Bulk Price Successfully.png");
            fileUtility.writeToFile("CubeCart-Result", "Change Bulk Price Successfully", ".txt", result.toString());


        }


    }

    public void addReview() throws InterruptedException {
        //String configFile2 = "config.properties";
        String ProductName = ApplicationConfig.readConfigProperties(configFile, "ProductName");
        String ReviewName = ApplicationConfig.readConfigProperties(configFile, "ReviewName");
        String Email = ApplicationConfig.readConfigProperties(configFile, "Email");
        String Title = ApplicationConfig.readConfigProperties(configFile, "Title");
        String Content = ApplicationConfig.readConfigProperties(configFile, "Content");

        WebElement reviewClick = driver.findElement(By.xpath("//ul[@id=\"menu_Inventory\"]/li[3]/a"));
        reviewClick.click();
        Thread.sleep(1000);
        WebElement addReviewTab = driver.findElement(By.xpath("//div[@class=\"tab\"]/a"));
        addReviewTab.click();
        Thread.sleep(1000);
        WebElement searchProductName = driver.findElement(By.xpath("//input[@id=\"ajax_name\"]"));
        searchProductName.sendKeys(ProductName);
        Thread.sleep(1000);
        driver.findElement(By.name("1")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("review_name")).sendKeys(ReviewName);
        Thread.sleep(1000);
        driver.findElement(By.id("review_email")).sendKeys(Email);
        Thread.sleep(1000);
        driver.findElement(By.id("review_title")).sendKeys(Title);
        Thread.sleep(1000);
        driver.findElement(By.name("review[review]")).sendKeys(Content);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class=\"star-rating-control\"]/div[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"form_control\"]/input[2]")).click();
        Thread.sleep(1000);

        WebElement verifyAddReview = driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div"));

        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        UiUtility utility = new UiUtility(driver);
        if (verifyAddReview.isDisplayed()) {
            result.append("Add Review Successfully").append("\n");
            utility.takeScreenShot("Add Review Successfully.png");
            fileUtility.writeToFile("CubeCart-Result", "Add Review Successfully", ".txt", result.toString());

        }
    }

    public void updateReview() throws InterruptedException {
//        WebElement reviewClick = driver.findElement(By.xpath("//ul[@id=\"menu_Inventory\"]/li[3]/a"));
//        Thread.sleep(2000);
//        reviewClick.click();
//        List<WebElement> review = Collections.singletonList(driver.findElement(By.xpath("//div[@id=\"reviews\"]")));
//        Thread.sleep(2000);
//        for (WebElement reviews : review) {
//            if (reviews.getText().equals("this is a amazing product")) {
//                Thread.sleep(3000);
//
//                driver.findElement(By.xpath("//i[@class=\"fa fa-pencil-square-o\"]")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.id("review_content")).clear();
//                Thread.sleep(2000);
//                driver.findElement(By.id("review_content")).sendKeys("I love this product");
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//div[@class=\"form_control\"]/input[2]")).click();
//                Thread.sleep(1000);
//                break;
//            }
        String ProductName = ApplicationConfig.readConfigProperties(configFile, "ProductName");
        String newContent = ApplicationConfig.readConfigProperties(configFile, "newContent");

        driver.findElement(By.xpath("//*[@id=\"menu_Inventory\"]/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tab_search")).click();
        Thread.sleep(2000);
        WebElement myProduct = driver.findElement(By.id("search-products"));
        Thread.sleep(2000);
        myProduct.sendKeys(ProductName);
        Thread.sleep(2000);
        driver.findElement(By.name("1")).click();  // select first result
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='form_control']/input[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='note']/span/a/i")).click();
        Thread.sleep(2000);
        WebElement content1 = driver.findElement(By.id("review_content"));
        Thread.sleep(2000);
        content1.clear();
        content1.sendKeys(newContent);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"form_control\"]/input[2]")).click();


        WebElement verifyAddReview = driver.findElement(By.xpath("//div[@class=\"success\"]"));
        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        UiUtility utility = new UiUtility(driver);
        if (verifyAddReview.isDisplayed()) {
            result.append("Update Review Successfully").append("\n");
            utility.takeScreenShot("Update Review Successfully.png");
            fileUtility.writeToFile("CubeCart-Result", "Update Review Successfully", ".txt", result.toString());
        }
    }


    // Delete review method
    public void deleteReview() throws InterruptedException {
        // 1-click the reviews
        String reviewKeyword = ApplicationConfig.readConfigProperties(configFile, "Content");
        String productName = ApplicationConfig.readConfigProperties(configFile, "ProductName");
        driver.findElement(By.xpath("//*[@id=\"menu_Inventory\"]/li[3]/a")).click();
        //2- click the search tab on the reviews dashboard
        driver.findElement(By.id("tab_search")).click();
        WebElement keyword = driver.findElement(By.id("search-keywords"));
        keyword.sendKeys(reviewKeyword);

        WebElement myProduct = driver.findElement(By.id("search-products"));
        myProduct.sendKeys(productName);
        Thread.sleep(2000);
        driver.findElement(By.name("1")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//div[@class='form_control']/input[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='note']/span/a[2]")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement deleteReview = driver.findElement(By.xpath("//div[@id='gui_message']/div[2]"));
        StringBuilder result = new StringBuilder();
        FileUtility fileUtility = new FileUtility();
        UiUtility utility = new UiUtility(driver);
        if (deleteReview.isDisplayed()) {
            result.append("Delete Review Successfully").append("\n");
            utility.takeScreenShot("Delete Review Successfully.png");
            fileUtility.writeToFile("CubeCart-Result", "Delete Review Successfully", ".txt", result.toString());
        }


    }


    public void closeBrowser() {
        driver.close();
        driver.quit();


    }
}