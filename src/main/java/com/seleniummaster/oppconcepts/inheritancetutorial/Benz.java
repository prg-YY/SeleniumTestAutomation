package com.seleniummaster.oppconcepts.inheritancetutorial;

public class Benz extends BMW{
    public void Start(){
        System.out.println("Benz----start");
    }

    public static void main(String[] args) {
        Benz benz=new Benz();
        benz.Start();
        benz.stop();
        benz.refuel();
        benz.theftSafety();
    }
}
