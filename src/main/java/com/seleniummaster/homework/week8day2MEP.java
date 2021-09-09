package com.seleniummaster.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class week8day2MEP {
    public static void main(String[] args) {
        //define map for state and city
        Map<String, String> myMap = new HashMap<>();

        myMap.put("MD", "Maryland");
        myMap.put("VA", "Virginia");
        myMap.put("NY", "New York");

        System.out.println("The number of states are: " + myMap.size());

        Set<String> city = myMap.keySet();
        for (String state : city) {
            System.out.println("Key: " + state + " Value: " + myMap.get(state));
        }
        for (String key : myMap.keySet()) {
            String value = myMap.get(key);
            System.out.println("The state and cities are: " + key + " " + value);

        }
    }
}