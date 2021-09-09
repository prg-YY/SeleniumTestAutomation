package com.seleniummaster.homework2.sprint3;



public class TestCase1Cube {
    public static void main(String[] args) throws InterruptedException {
        CubeCartPlanBase planBaseCubeCart=new CubeCartPlanBase();
        planBaseCubeCart.openBrowser();
        planBaseCubeCart.logIn();
        planBaseCubeCart.AddProduct();
        planBaseCubeCart.closeBrowser();

    }

}
