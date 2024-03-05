package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Reduce {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,44,55,56,7,8,9,3);
        Optional<Integer> sum = list.stream().reduce((a,b) -> a + b);
        System.out.println("Sum of array list is : " + sum.get());


        List<Double> list2 = Arrays.asList(100.0,50.0,25.0,12.5);
        Optional<Double> reduce= list2.stream().reduce((a,b)-> a-b);
        System.out.println("Reducing of numbers by half is: " + reduce.get());
    }
}
