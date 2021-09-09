package com.seleniummaster.MaharaProject;

public class MaharaTest {
    public static void main(String[] args) throws InterruptedException {
        MaharaFunctionLibrary library = new MaharaFunctionLibrary();
        library.openBrowser("http://mahara.unitedcoderschool.com/mahara/");
        library.logIn();
        library.createGroup();
        library.updateGroup();
        library.closeBrowser();

    }
}