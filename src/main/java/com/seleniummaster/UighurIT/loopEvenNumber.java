package com.seleniummaster.UighurIT;

public class loopEvenNumber {
    public static void main(String[] args) {
        //2,4,6,8,10,12,14,16,18,20

        int i = 1;
        int Even=0;
        int Odd=0;

        do {
            if (i % 2 != 0) {
                System.out.println("Even number:" + i);
            }else if (i % 2!=0)
                System.out.println("Odd number :" +i);
            i++;
        } while (i <= 20);

    }
}