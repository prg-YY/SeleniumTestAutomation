package com.seleniummaster.UighurIT;

public class NestedLoop1 {
    public static void main(String[] args) {

        int group=5;
        int esker=10;

        for (int p=1; p<=group;p++){
            System.out.println("group "+p+" diki eskerler: " );
            for (int w=1; w<=esker;w++){

                System.out.println("esker: "+w );
            }

        }
    }
}
