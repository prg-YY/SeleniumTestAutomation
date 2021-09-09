package com.seleniummaster.oppconcepts.interFaceconcept;

public class TestBank {
    public static void main(String[] args) {
        //we cannot instantiate an interface(Create new object)
        USBank bank=new HSBCBank();
        bank.credit();
        bank.debit();
        bank.transferMoney();

        System.out.println(USBank.min_balance);

    }
}
