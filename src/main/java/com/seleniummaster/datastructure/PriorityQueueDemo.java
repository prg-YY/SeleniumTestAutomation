package com.seleniummaster.datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Banana");
        queue.add("Apple");
        queue.add("Pear");
        queue.add("Cycle");
        Iterator<String> iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.println(queue.toString());
        }
    }
}
