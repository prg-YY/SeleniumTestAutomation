package com.seleniummaster.classconcept.MultiThread1121;

public class VariableScope {
    //Global variable ---class level variable
    String name = "Tom";
    int age = 20;

    public static void main(String[] args) {
        int i = 10;//local variable
        System.out.println(i + 6);
        System.out.println(i);
        VariableScope variableScope = new VariableScope();
        System.out.println(variableScope.age);
        variableScope.sum(3);
        add(10);
    }

    public void sum(int a) {
        //local variable only accessible within the method
        int i = 10;
        int j = 20;
        int age = 20;
    }

    public static void add(int a) {

    }
}
