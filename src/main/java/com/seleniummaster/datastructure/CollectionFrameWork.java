package com.seleniummaster.datastructure;

import java.util.*;

public class CollectionFrameWork {
    public static void main(String[] args) {
        int[] array={4,20,50,70,80};
        List<Integer> list= new ArrayList<>();
        for (int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        System.out.println(list.toArray());
        System.out.println("Min number: "+Collections.min(list));
        System.out.println("Max number: " +Collections.max(list));
        Collections.sort(list);
        System.out.println("After sorted"+list.toString());
        Collections.reverse(list);
//        System.out.println("After reverse: "+Collections.reverse());

    }
}
