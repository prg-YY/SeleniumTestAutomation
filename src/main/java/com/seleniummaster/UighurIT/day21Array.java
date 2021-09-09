package com.seleniummaster.UighurIT;

import java.util.Arrays;

public class day21Array {
    public static void main(String[] args) {
        //1.Declaring an array ..

        String[] name1={"Memet","Emet","Semet"};
        String[] name2=new String[]{"Adil","tayir","kirem"};
        String[] name3=new String[3];


        //2.how to print an array

        for (String name:name1){
            System.out.print(name+" ");
        }
        System.out.println();

        for (int i=0;i<name2.length;i++){
            System.out.print(name2[i]+" ");
        }
        System.out.println();

        //check if an array contains a specific value
        System.out.println(Arrays.asList(name1).contains("Memet"));
    }

}
