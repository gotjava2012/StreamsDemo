package com.example.streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10, 20, 30, 40,  100, 400, 500, 800);
        // 10,20, 100, 400, 500, 800 - > e * e
        //then we want numbers greater then 100  so we will filter e >100

        double numsAverageGreaterThen100 = list.stream()
                                                .map( e -> e * e)
                                                    .filter(e -> e > 100)
                                                        .mapToInt(e -> e) //Returns an IntStream consisting of the results of applying the given function to the elements of this stream.
                                                            .average()
                                                                .getAsDouble();
                        

        System.out.println("Square Numbers average greater then 100 : "+ numsAverageGreaterThen100);
        



    }
}
