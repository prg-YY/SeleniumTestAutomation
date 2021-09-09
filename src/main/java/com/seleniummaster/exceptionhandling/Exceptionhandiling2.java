package com.seleniummaster.exceptionhandling;

public class Exceptionhandiling2 {
    public static void main(String[] args) throws InterruptedException {
        try {
            int[] arr = new int[]{3, 4, 5};
            System.out.println(arr[2]);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Hello");
        }
    }
}
