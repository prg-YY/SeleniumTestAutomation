package com.seleniummaster.homework2.cubecartCategory;

public class LoginUserCategory {
    private String userName;
    private String password;

    public LoginUserCategory() {
    }


    public LoginUserCategory(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
