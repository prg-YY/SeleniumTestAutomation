package com.seleniummaster.UighurIT;

import com.seleniummaster.UyghurSchool.IO.FileUtility;

import java.io.File;

public class Day2 {
    public static void main(String[] args) {
       int score=80;
       if ( score>50){
           System.out.println("grade=passed");
        }if (score==50){
            System.out.println("grade=Average");
        }else System.out.println("Failed");
        System.out.println();

    }
}
