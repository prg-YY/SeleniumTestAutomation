package com.seleniummaster.UighurIT;

import java.util.Scanner;

public class day10Nomur {
    public static void main(String[] args) {

        System.out.println("Imtahandin kanqe aldigiz: ");
        Scanner scan=new Scanner(System.in);
        int nomur=scan.nextInt();

        switch (nomur){

            case 60:
                System.out.println("naqar");
                break;
            case 70:
                System.out.println("biraz yahxi");
                break;
            case 80:
                System.out.println("yahxi");
                break;
            case 90:
                System.out.println("nahayiti yahxi");
                break;
            case 100:
                System.out.println("kaltis");
                break;
            default:
                System.out.println("peqet 60,70,80,90,100 numurlanila kirguzeleysiz");

        }


    }
}
