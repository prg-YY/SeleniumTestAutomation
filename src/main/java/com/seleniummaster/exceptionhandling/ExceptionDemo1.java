package com.seleniummaster.exceptionhandling;

public class ExceptionDemo1 {
    public static void main(String[] args) throws InterruptedException {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("In Catch block");
        }
        System.out.println("Hello World");
        Thread.sleep(3000);



    }
}
