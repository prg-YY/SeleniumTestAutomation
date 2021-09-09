package com.seleniummaster.homework2.sprint3;

public class allRun {
    public static void main(String[] args) throws InterruptedException {
        CubeCartPlanBase allRun=new CubeCartPlanBase();
        allRun.openBrowser();
        allRun.logIn();
        allRun.AddProduct();
        allRun.ChangeBulkPrice();
        allRun.addReview();
        allRun.updateReview();
        allRun.deleteReview();
        allRun.closeBrowser();

    }
}
