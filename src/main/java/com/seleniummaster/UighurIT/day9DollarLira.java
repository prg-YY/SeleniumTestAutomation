package com.seleniummaster.UighurIT;
import java.util.Scanner;

public class day9DollarLira {
    public static void main(String[] args) {

        System.out.println("dollar miktarini kirgyzyg");
        Scanner scan=new Scanner(System.in);

        double dollar=scan.nextDouble();
        double lira=dollar*7;
        System.out.println(dollar+"  dollar " + lira +"  lira boldu ");




    }
}
