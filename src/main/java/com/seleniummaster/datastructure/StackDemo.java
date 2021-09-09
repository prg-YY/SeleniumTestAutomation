package com.seleniummaster.datastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        stack.push("Book4");
//        print the stack Lifo
        System.out.println(stack.toString());
//        remove the book from the stack
        String removedbook=stack.pop();
        System.out.println("The book on the top is : "+removedbook);
        System.out.println(stack.toString());
        System.out.println(stack.search("book2"));
        System.out.println(stack.search("book1"));
    }
}
