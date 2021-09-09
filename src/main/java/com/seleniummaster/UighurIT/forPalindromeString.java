package com.seleniummaster.UighurIT;

import java.util.Scanner;

public class forPalindromeString {
    public static void main(String[] args) {
        //palindrome string
        //qazaq, qapaq, yuy

        Scanner urumqi=new Scanner(System.in);
        System.out.println("Enter a word");
        String soz=urumqi.nextLine();

        String teturSoz="";
        for (int i=soz.length()-1;i>=0;i--){
            teturSoz+=soz.charAt(i);
        }

         // while (i>0=){
         //   teturSoz+=soz.charAt(i);
         //   i--;
         // }


        if (teturSoz.equalsIgnoreCase(soz)){
            System.out.println(soz+" is palindrome");
        }else {
            System.out.println(soz+" is not palindrome");
        }



    }
}
