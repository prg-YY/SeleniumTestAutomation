package com.seleniummaster.classconcept.Comparable;

import com.seleniummaster.classconcept.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "White", 1000));
        carList.add(new Car("Honda", "Black", 200));
        carList.add(new Car("BMV", "Yellow", 300000));
        carList.add(new Car("Benz", "Red", 50000));
        System.out.println(carList.toString());

        //comparable interface comparator method
        //carList.sort(Comparator.comparing(Car::getPrice));
       // System.out.println(carList.toString());
        //carList.sort(Comparator.comparing(Car::getPrice).reversed());
        //System.out.println(carList.toString());

        Collections.sort(carList);
        System.out.println(carList.toString());

    }
}
