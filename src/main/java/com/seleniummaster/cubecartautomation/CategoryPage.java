package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryPage extends  TestBase{
    public boolean addCategory(){
        WebElement categoryLink=driver.findElement(By.id("nav_categories"));
        waitForElementPresent(categoryLink,10);
        categoryLink.click();
        WebElement addCatogoryLink=driver.findElement(By.linkText("Add Category"));
        waitForElementPresent(addCatogoryLink,10);
        addCatogoryLink.click();
        WebElement nameTexField=driver.findElement(By.id("name"));
        waitForElementPresent(nameTexField,5);
        nameTexField.sendKeys("Galiskar kalhesi");
        WebElement saveButton=driver.findElement(By.id("cat_save"));
        waitForElementPresent(saveButton,5);
        saveButton.click();
        WebElement successfulMessage=driver.findElement(By.cssSelector("div.success"));
        if (successfulMessage.isDisplayed()){
            System.out.println("A product category is added successfully");
            System.out.println("Test passed");
            return true;
        }
        else {
            System.out.println("Product category test failed");
            return false;
        }


    }
}
