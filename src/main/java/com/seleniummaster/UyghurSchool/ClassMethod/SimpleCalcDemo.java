package com.seleniummaster.UyghurSchool.ClassMethod;

public class SimpleCalcDemo {
    public static void main(String[] args) {
        SimpleCalc simpleCalc=new SimpleCalc();
        simpleCalc.printInfo("This is Java Method Example");
        double sum=simpleCalc.addTwoNumber(5,10);
        System.out.println(sum);
        System.out.println(simpleCalc.addTwoNumber(100,200));
        System.out.println(simpleCalc.subtractTwoNumbers(10,5));
        System.out.println(simpleCalc.subtractTwoNumbers(10000,50000));
        simpleCalc.addTwoCircleArea(5,10);
        simpleCalc.addTwoCircleArea(1,3);
        simpleCalc.rectangleArea(10,100);


    }
}
