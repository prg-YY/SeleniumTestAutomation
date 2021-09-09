package com.seleniummaster.homework2.sprint3;

public class TestCase5Cube {
    public static void main(String[] args) throws InterruptedException {
        CubeCartPlanBase cubeCartPlanBase = new CubeCartPlanBase();
        cubeCartPlanBase.openBrowser();
        cubeCartPlanBase.logIn();
        cubeCartPlanBase.deleteReview();
        cubeCartPlanBase.closeBrowser();
    }
}
