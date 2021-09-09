package com.seleniummaster.UighurIT;

public class NestedLoop {
    public static void main(String[] args) {
        //nested loop


        //for (bashkanma;sherit;increment){
        //    for(bashkanma;sherit;increment){
        //         inner loop
        //      }
        //       // outer loop內循環
        //      }

        int row=6; //row=kur

        for (int i=1; i<=row; i++)  {

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
