package com.seleniummaster.homework2.CubeCartAddCustomer;

import com.seleniummaster.homework2.cubecartCategory.LoginUserCategory;

public class AddCustomerRun {
    public static void main(String[] args) {
        AddCustomerLibrary library=new AddCustomerLibrary();
        library.openBrowser("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        LoginUserCategory userCustomer=new LoginUserCategory("testautomation","automation123!");
        library.logIn(userCustomer);
        library.addCustomer();
        library.deleteCustomer();
        library.logOut();
        library.closeBrowser();




    }
    }

