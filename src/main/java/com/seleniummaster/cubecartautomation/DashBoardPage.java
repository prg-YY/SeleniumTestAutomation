package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends TestBase {
    public void logOut(){
        WebElement logOutButton=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitForElementPresent(logOutButton,5);
        logOutButton.click();
    }
}
