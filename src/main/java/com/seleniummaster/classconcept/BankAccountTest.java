package com.seleniummaster.classconcept;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountStatic.setAccountBalance(30000);
        BankAccountStatic.setAccountNumber(8976544);
        BankAccountStatic.setAccountName("swedbank");
        BankAccountStatic.getAccountInformation();
        BankAccountStatic.withdrawMoney(10000);
    }
}
