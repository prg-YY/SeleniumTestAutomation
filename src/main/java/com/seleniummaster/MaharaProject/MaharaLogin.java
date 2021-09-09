package com.seleniummaster.MaharaProject;

public class MaharaLogin {
    private String userName;
    private String password;
    private String groupName;


    public MaharaLogin() {
    }


    public MaharaLogin(String groupName) {
        this.groupName = groupName;
    }


    public MaharaLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}

