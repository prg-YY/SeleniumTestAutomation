package com.seleniummaster.oppconcepts.inheritancetutorial;

public class Student {
    //parent class
    private String firstName;
    private String lastname;
    private String gender;
    private String major;
    private String className;

    public Student() {
    }

    public Student(String firstName, String lastname, String gender, String major, String className) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
        this.major = major;
        this.className = className;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "student{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
