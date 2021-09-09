package com.seleniummaster.UighurIT;

import java.util.Scanner;

public class day10Pesil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Halighan bir isim kirguzung:");
        String isim = input.nextLine();
        String upperCaseIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        String result = "";
        for (int i = 0; i <= upperCaseIsim.length()-1 ; i++) {
            result += upperCaseIsim.charAt(i) + ".";
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
