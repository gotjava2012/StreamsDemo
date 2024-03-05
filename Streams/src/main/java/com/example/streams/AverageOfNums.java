package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNums {
   public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1,2,3,4,5);
    OptionalDouble avg = list.stream().mapToDouble(e -> e).average();
    System.out.println("average is "+ avg.getAsDouble());

  
    double avg2 = list.stream().mapToDouble(e -> e).average().getAsDouble();
    System.out.println("average is "+ avg2);

   }
}
