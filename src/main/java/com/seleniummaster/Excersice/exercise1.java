package com.seleniummaster.Excersice;

public class exercise1 {
    public static void main(String[] args) {
        int i=1;

        do {
            if (i%2==0){
                System.out.println("Even number: "+i);
            }else{
                System.out.println("Odd number :"+i);
            }
            i++ ;
        }while (i<=100);
        System.out.println(i);

    }
}
