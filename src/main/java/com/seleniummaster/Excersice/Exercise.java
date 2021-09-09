package com.seleniummaster.Excersice;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        if (number.nextInt()%2==0)
            System.out.println("You entered an even number");
        else
            System.out.println("You entered an odd number");
    }
}
