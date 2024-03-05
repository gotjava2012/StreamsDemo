package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(-1, 2,1,3,44,55,6,77,8,9,0,66,555,69);

        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
