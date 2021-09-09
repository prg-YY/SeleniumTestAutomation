package com.seleniummaster.UighurIT;
import java.util.Scanner;
public class Day9Scanner {
    public static void main(String[] args) {

        System.out.println("ismigizni kirguzug: ");
        Scanner komul=new Scanner(System.in);
        String isim=komul.nextLine();
        System.out.println("obdan turlamu "+isim);

        System.out.println("yesigizni kirguzug");
        int yash=komul.nextInt();

        System.out.println("salam "+isim+".yexigiz "+yash );

    }
}
