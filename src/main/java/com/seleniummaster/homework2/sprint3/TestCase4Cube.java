package com.seleniummaster.homework2.sprint3;

public class TestCase4Cube {
    public static void main(String[] args) throws InterruptedException {
        CubeCartPlanBase cubeCartPlanBase = new CubeCartPlanBase();
        cubeCartPlanBase.openBrowser();
        cubeCartPlanBase.logIn();
        cubeCartPlanBase.updateReview();
        cubeCartPlanBase.closeBrowser();
    }
}