package com.seleniummaster.homework2.sprint3;

public class TestCase2Cube {
    public static void main(String[] args) throws InterruptedException {
        CubeCartPlanBase cube2=new CubeCartPlanBase();
        cube2.openBrowser();
        cube2.logIn();
        cube2.ChangeBulkPrice();
        cube2.closeBrowser();
    }
}
