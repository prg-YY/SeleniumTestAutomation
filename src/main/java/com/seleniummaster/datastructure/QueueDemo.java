package com.seleniummaster.datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        LinkedList class implements the queue interface
//        Queue FIFI firts in first out
        Queue<Integer> customers=new LinkedList<>();
        customers.add(1);
        customers.add(2);
        customers.add(3);
        customers.add(4);
        System.out.println(customers.toString());
        customers.remove();
        System.out.println(customers.toString());
//        check the next customer exist or not
        System.out.println(customers.peek());
        customers.poll();
        System.out.println(customers.toString());
        System.out.println(customers.add(5));
        System.out.println(customers.toString());
        customers.remove();
        customers.remove();
        customers.remove();
        customers.peek();
        customers.poll();
        customers.remove(4);
        System.out.println(customers.toString());
        System.out.println(customers.contains(7));

        System.out.println("Priority Queue");
        Queue<String> priorityQueue1=new PriorityQueue<>();
        priorityQueue1.add("Banana");
        priorityQueue1.add("Apple");
        priorityQueue1.add("Pear");
        priorityQueue1.add("Grape");
        priorityQueue1.add("Cycle");
        priorityQueue1.remove();
        System.out.println(priorityQueue1.toString());



    }
}
