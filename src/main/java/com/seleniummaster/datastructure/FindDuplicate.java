package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> countryName=new ArrayList<>();
        countryName.add("Australia");
        countryName.add("Brazil");
        countryName.add("canada");
        countryName.add("Brazil");
        countryName.add("Uk");
        countryName.add("canada");
        countryName.add("Us");

//        not allow duplicate``
        Set<String> set=new HashSet<>();
        for (int i=0; i<countryName.size();i++){
            String names=countryName.get(i);
            if (set.add(names)==false){
                System.out.println(names+" Is duplicated");
            }
        }



    }
}
