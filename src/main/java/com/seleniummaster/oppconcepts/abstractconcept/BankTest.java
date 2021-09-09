package com.seleniummaster.oppconcepts.abstractconcept;

public class BankTest {
    public static void main(String[] args) {
        //cannot insnatiate an abstract class
        Bank bank=new ICICBank();
        bank.loan();
        bank.credit();
        bank.debit();
        bank.balance=10000000;

        System.out.println(bank.amount);
        System.out.println(bank.balance);
        System.out.println(Bank.a);
    }
}
