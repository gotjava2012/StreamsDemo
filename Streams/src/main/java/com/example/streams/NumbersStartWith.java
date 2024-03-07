package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith {
    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(2, 22, 222, 41, 43, -21, 3300, 39, 5200, 21, -2121);

        List<Integer> startsWith2 = list.stream()
                                        .map( e -> String.valueOf(e)) // convert stream to of integers to strings
                                            .filter( e -> e.startsWith("2")) // filter through for numbers that start with 2
                                                .map( Integer::valueOf) // convert streat back to integers
                                                    .collect(Collectors.toList()); // collect all the remaining values to a list that will be returned

                                                    System.out.println(startsWith2);

         List<Integer> startsWith2orNeg = list.stream()
                                        .map( e -> String.valueOf(e)) // convert stream to of integers to strings
                                            .filter( e -> e.startsWith("2") || e.startsWith("-2")) // filter through for numbers that start with 2
                                                .map( Integer::valueOf) // convert streat back to integers
                                                    .collect(Collectors.toList()); // collect all the remaining values to a list that will be returned

                                                    System.out.println(startsWith2orNeg);

        List<Integer> startsWith4 = list.stream()
                                        .map( e -> String.valueOf(e))
                                            .filter(e -> e.startsWith("4"))
                                                .map(Integer::valueOf)
                                                    .collect(Collectors.toList());
                                                    System.out.println(startsWith4);
        List<Integer> startsWith3 = list.stream()
                                        .map(e -> String.valueOf(e))
                                            .filter(e -> e.startsWith("3"))
                                                .map(Integer::valueOf)
                                                    .collect(Collectors.toList());
                                                    System.out.println(startsWith3);
                                            
    }
}
