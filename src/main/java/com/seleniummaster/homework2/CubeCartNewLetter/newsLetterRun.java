package com.seleniummaster.homework2.CubeCartNewLetter;

import com.seleniummaster.homework2.cubecartCategory.LoginUserCategory;

public class newsLetterRun {
    public static void main(String[] args) throws InterruptedException {

        createNewsLetter letter = new createNewsLetter();
        letter.openBrowser("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        LoginUserCategory userCustomer=new LoginUserCategory("testautomation","automation123!");
        letter.logIn(userCustomer);
        letter.createNews();
        letter.logOut();
        letter.closeBrowser();


    }
}
