package com.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList( 1,2,1,3,4,5,5,6,7,8,9,1);

        Set<Integer> dup = list.stream()
                                    .filter(e -> Collections.frequency(list, e) > 1) // take current stream and check with list to see if there are any elements occuring more then 1 times
                                        .collect(Collectors.toSet()); // take values in stream and put them in a set to return
        System.out.println(dup);

        List<Integer> list2 = Arrays.asList( 1,2,1,3,4,5,5,6,7,8,8,8,9,1);

        Set<Integer> dups = list2.stream().filter(e -> Collections.frequency(list2, e)>1).collect(Collectors.toSet());
        System.out.println(dups);

    }
}
