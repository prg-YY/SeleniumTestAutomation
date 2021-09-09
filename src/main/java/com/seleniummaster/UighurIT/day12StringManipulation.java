package com.seleniummaster.UighurIT;

public class day12StringManipulation {
    public static void main(String[] args) {
        String isim="mamutjan";
        String isim2=new String("mamutjan");

        System.out.println(isim);
        System.out.println(isim2);

        //1 lenght()
        System.out.println(isim.length());

        //2.indexOf()
        System.out.println("index: "+isim.indexOf("n"));

        //3.charAt
        System.out.println("charAt: "+isim.charAt(5));

        //4.substring()
        System.out.println("substring: "+isim.substring(5,isim.length())); //length 8ge teg

        //5.concat
        String tegAt="Amut";
        System.out.println(isim.concat(tegAt));

        //6.toUpperCase()
        System.out.println(isim.toUpperCase());

        //7.toLowerCase
        System.out.println(isim.toLowerCase());

        //8.trim()
        String t="  sen barmu dunya ";
        System.out.println(t.trim());
        System.out.println(t);

        //9. replace
        System.out.println(isim.replace("mamut","osman"));

    }
}
