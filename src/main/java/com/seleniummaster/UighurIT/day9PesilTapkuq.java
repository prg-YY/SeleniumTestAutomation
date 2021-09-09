package com.seleniummaster.UighurIT;

import java.util.Scanner;

public class day9PesilTapkuq {
    public static void main(String[] args) {


        System.out.println("hazir kanqinji ay:");
        Scanner pesil=new Scanner(System.in);

        int ay=pesil.nextInt();

        if (ay>=1 && ay<4){
            System.out.println("kish");
        }else if (ay>=4 && ay<7){
            System.out.println("yaz");
        }else if (ay>=7 && ay<10){
            System.out.println("kuz");
        }else if (ay>=10 && ay<13){
            System.out.println("atiyaz");
        }else {
            System.out.println("hata bopkaldi epndim");
        }
    }
}
