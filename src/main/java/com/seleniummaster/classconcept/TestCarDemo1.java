package com.seleniummaster.classconcept;

import java.util.Arrays;

public class TestCarDemo1 {
    public static void main(String[] args) {

        Car[] cars=new Car[3];
        Car c1=new Car();
        c1.setBrand("BMW");
        c1.setYear(2019);
        c1.setPrice(9000);
        c1.setColor("Black");
        cars[0]=c1;

        Car c2=new Car("Toyota","japan","white","45000" );
        cars[1]=c2;
        Car c3=new Car("Honda","Japan","Red","55000");
        cars[2]=c3;

       for (Car car:cars){
           System.out.println(car.toString());
           System.out.println();

//            System.out.print(car.getBrand()+" "+car.getColor()+" "+car.getYear()+" "+car.getPrice()+car.getMileAge());
//            System.out.println();
        }
//        System.out.println(cars.toString());




    }


}
