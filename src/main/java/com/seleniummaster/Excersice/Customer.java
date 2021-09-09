package com.seleniummaster.Excersice;

public class Customer {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String password;
    private String confirmPassword;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int phoneNumber, String email, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getEmail() {
        return email;
    }
}