package com.seleniummaster.lambdaexpresssion;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {
    public static void main(String[] args) {
        Consumer<String> c1=s -> System.out.println(s+" "+"is Fun");
        Consumer<String> c2=s -> System.out.println(s+" "+"is Not Difficult");
        Consumer<String> c3=s -> System.out.println(s+" "+"is Interesting");
//        c1.accept("Java");
//        c2.accept("Java");
//        c3.accept("Java");
        c1.andThen(c2).andThen(c3).accept("Java");


        Supplier s=()->new Date();
        System.out.println(s.get());

    }
}
