package com.seleniummaster.exceptionhandling;

public class Exceptionhandiling4 {
    public static void main(String[] args) {
        //  String name=null;
        try {
            System.out.println(1/4);
            throw new NullPointerException("String value should be initialize");
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        //System.out.println("Hello");

    }
}
