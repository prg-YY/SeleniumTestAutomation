package com.seleniummaster.UighurIT;

import java.util.Scanner;

public class day13Isim {
    public static void main(String[] args) {
       // String isim1="Almasjan";
        //String isim2="Osmanjan";
       // String isim3="Rabigul";
       // String isim4="Jack";


        Scanner prg=new Scanner(System.in);
        System.out.println("Isim kirguzug");
        String isim=prg.next();

        if (isim.substring(isim.length()-3,isim.length()).equals("jan")){
            System.out.println("Ogul balanig ismi");
        }else if (isim.substring(isim.length()-3,isim.length()).equals("gul")){
            System.out.println("qiz balnig ismi");
        }else {
            System.out.println("bashka milletnig ismi");
        }

    }
}
