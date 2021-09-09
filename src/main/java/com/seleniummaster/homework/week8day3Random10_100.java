package com.seleniummaster.homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class week8day3Random10_100 {
    public static void main(String[] args) {

        Random randomNum=new Random();
//        Assign the numbers to an array
//        Generate 10 random numbers from 10 to 100;
        int[] numberArr=new int[10];
        System.out.println("10 random numbers from 10 to 100: ");
        for (int i=0;i<numberArr.length;i++){
            numberArr[i]=9+randomNum.nextInt(91);
            System.out.print(numberArr[i]+", ");
        }
        //        Sort the numbers in the ascending order and print out
        System.out.println("\n"+"ascending number :");
        Arrays.sort(numberArr);
        System.out.println(Arrays.toString(numberArr));

//        Sort the numbers in the descending order and print out
        System.out.println("dessending number :");
        for (int i=numberArr.length-1;i>=0;i--){
            System.out.print(numberArr[i]+", ");

        }


        }
        }











