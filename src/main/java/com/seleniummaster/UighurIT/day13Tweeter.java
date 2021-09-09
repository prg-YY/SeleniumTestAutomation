package com.seleniummaster.UighurIT;

import java.util.Scanner;

public class day13Tweeter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Only enter 20 letters!");

        String tweet= scanner.nextLine();

        if (tweet.length()>140){
            System.out.println("20 heriptiin exip kettilsjd,qayta kirguzug");
        }else {
            System.out.println(tweet);
        }

    }
}
