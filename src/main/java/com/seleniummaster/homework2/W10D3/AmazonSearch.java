//package com.seleniummaster.homework2.W10D3;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class AmazonSearch {
//    public static void main(String[] args) throws InterruptedException {
//        //String[] products=new String[]{"drone","adidas sneaker","fishing rods"};
//        //SearchWord product =new SearchWord();
//
//
//        System.setProperty("webdriver.chrome.driver", "/Users/prg/Documents/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        //options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        //WebDriver driver=new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://www.amazon.com");
//
//        com.seleniummaster.homework2.Product products = new Product();
//        products.setProducts(new String[]{"drone","adidas sneaker","fishing rods"});
//        int countBack=1;
//
//        for (String s: products.getProducts()){
//            WebElement searchBox = driver.findElement(By.name("field-keywords"));
//            searchBox.sendKeys(s+Keys.ENTER);
//            Thread.sleep(1000);
//            if (countBack<products.getProducts().length)
//                driver.navigate().back();
//            countBack++;
//        }
//
//        driver.close();
//        driver.quit();
//
//
//    }
//}
//
