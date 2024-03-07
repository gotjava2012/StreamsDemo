package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LimitNumbers {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(22, 39, 33,1,3,4,5,66,55,34,226,54);

        List<Integer> firstFive = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(firstFive);

        int sumOfFirstFive = list.stream().limit(5).reduce((a,b) -> a+b).get();
        System.out.println(sumOfFirstFive);

        List<Integer> skipFirstFive = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipFirstFive);

        int skipFirstFiveThenGetSum = list.stream().skip(5).reduce( (a,b) -> a+b).get();
        System.out.println(skipFirstFiveThenGetSum);
    }
}
