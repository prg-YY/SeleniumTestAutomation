package com.seleniummaster.Sreamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiFunctions {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,0,10,9,8,6,5,7);
        Optional<Integer>minValue=numbers.stream().min(Integer::compareTo);
        System.out.println(minValue.get());

        Optional<Integer>maxValue=numbers.stream().max(Integer::compareTo);
        System.out.println(maxValue.get());

        List<Integer> sortedLit=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedLit);

        List<Integer> reversedList=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedList);

        List<String>fruits=Arrays.asList("one Apple","one Banana","Two Amut","one Uzum","Three Aluqa");
        boolean result=fruits.stream().anyMatch(value->{
            return value.startsWith("one");});
        System.out.println(result);





    }
}
