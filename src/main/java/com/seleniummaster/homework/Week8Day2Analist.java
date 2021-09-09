package com.seleniummaster.homework;

import java.util.Arrays;

public class Week8Day2Analist {
    public static void main(String[] args) {
        double[] values=new double[10];
//        {0,1,4,9,16,25,36,49,64,81}


        for (int i=0;i<10;i++){
            values[i]=i*i;
        }
        System.out.println(Arrays.toString(values));

    }
}
