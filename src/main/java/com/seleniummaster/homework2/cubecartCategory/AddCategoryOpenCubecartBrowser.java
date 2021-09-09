package com.seleniummaster.homework2.cubecartCategory;

public class AddCategoryOpenCubecartBrowser {
    public static void main(String[] args) {

        AddCategoryLibrary library=new AddCategoryLibrary();
        library.openBrowser("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        LoginUserCategory userCategory=new LoginUserCategory("testautomation","automation123!");
        library.logIn(userCategory);
        library.addCategory();
        library.deleteCategory();
        library.logOut();
        library.closeBrowser();

    }
}
