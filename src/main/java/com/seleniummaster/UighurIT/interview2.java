package com.seleniummaster.UighurIT;

public class interview2 {

    public static void main(String[] args) {
        //a,o,u,i,e = sozuk tavuxlani tepix

        String word = "jlkanjkasiuroiwASLKDJWEIOURTJDKSLFNALWJIeutyweqoiwjfkzncmxbcah";

        char[] heripler = word.toLowerCase().toCharArray();

        int sinaksan = 0;

        for (char h : heripler) {
            switch (h) {
                case 'a':
                case 'u':
                case 'o':
                case 'i':
                case 'e':
                    sinaksan++;
                    break;
                default:
            }
        }
        System.out.println("this word has :" + sinaksan + " sozuk tawux bar ");
        System.out.println(heripler.length);

    }
}
