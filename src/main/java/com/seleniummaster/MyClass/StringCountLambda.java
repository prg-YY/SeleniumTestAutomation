package com.seleniummaster.MyClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountLambda {
        public static void main(String[] args) {
            String myString="kfdjfieruekdasdasdasdasdasdasdghtyjgbvxcdrtyuioplkjmnbvcxdzsawertyhjnbvcxfjdklfaafdaddfdfdfd";
            List<String> stringList=new ArrayList<>();
            for(int i=0;i<myString.length();i++)
            {
                stringList.add(myString.substring(i,i+1));
            }
            Map<String, Long> result=  stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(result);
        }
    }

