package com.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {
    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(3,1,44,55,6,7,8,99,0,11,21);

        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> decending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(decending);
    }
}
