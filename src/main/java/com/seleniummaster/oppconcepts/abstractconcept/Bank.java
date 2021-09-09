package com.seleniummaster.oppconcepts.abstractconcept;

public abstract class Bank {
    int balance=1000000;
    final int amount=100000;
    final static int a=19938;
    //abstract method
    public abstract void loan();
    //non abstract method
    public void credit(){
        System.out.println("Bank credit");
    }
    public void debit(){
        System.out.println("debit");
    }
}
