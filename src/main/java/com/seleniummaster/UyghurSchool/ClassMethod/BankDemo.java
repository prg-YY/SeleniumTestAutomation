package com.seleniummaster.UyghurSchool.ClassMethod;

public class BankDemo {
    private int accountNumber;
    private double balance;
    //constructor,getter , setter
    public BankDemo(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //deposit money
    public double depositMoney(double amount)
    {
        balance=balance+amount;
        return balance;
    }
    //withdraw money
    public double withdrawMoney(double amount)
    {
        if (amount<balance){
            balance=balance-amount;
            System.out.println("Balance:"+balance);
        }else{
            System.out.println("Your balance was:"+balance);
            System.out.println("You cannot withdraw money more than your balance");
        }
        return balance;
    }
    public static void main(String[] args){
        BankDemo bankDemo=new BankDemo(1234,1000);
        System.out.println(bankDemo.depositMoney(500));
        System.out.println(bankDemo.depositMoney(1000));
        bankDemo.withdrawMoney(10000);
        bankDemo.withdrawMoney(2000);
    }



}
