package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10,15, 30,50, 900,23,43, 11, 13, 27);
        //even numbers
        List<Integer> evenIntegers = list.stream()
                                            .filter(e -> e % 2 == 0) // take each element mod by 2 and if it equals 0  we will keep in the stream
                                                .collect(Collectors.toList()); // take said stream and collect them to a list to return
    
                                                System.out.println("even number: "+evenIntegers);

        //Odd numbers
        List<Integer> oddIntgers = list.stream()
        .filter(e -> e % 2 != 0) // take each element mod by 2 and if it not equals 0  we will keep in the stream
            .collect(Collectors.toList()); // take said stream and collect them to a list to return

            System.out.println("odd number: "+ oddIntgers);
    }
    
  

                        

    
}
