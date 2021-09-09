package com.seleniummaster.UighurIT;

public class forEachLoop2 {
    public static void main(String[] args) {
        //reverse men kim-> mik name

        String text="obdan turlamu gang";
        String tetur="" ;
       // System.out.println(text.length());
       // System.out.println(text.charAt(22));

        for (int i=text.length()-1;i>=0;i--){
            tetur+=text.charAt(i);

        }
        System.out.println(tetur);
    }
}
