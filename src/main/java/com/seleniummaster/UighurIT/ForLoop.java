package com.seleniummaster.UighurIT;


public class ForLoop {
    public static void main(String[] args) {

        for (int i=1;i<=10;i++){
            if (i%2==0)
            System.out.print(i+",");
        }
        System.out.println();
        for (int i=20;i>10;i--){
            if (i%2!=0)
            System.out.print(i+" ");
        }
    }
}
