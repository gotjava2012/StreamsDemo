package com.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(0,1,2,4,3,5,6,7,4,5,6,66,5,44,33);

        int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secondLowest);

        int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondHighest);

        int[] list2 = list.stream().mapToInt(Integer::intValue).toArray();;

       print2largest(list2);

    }

    // Methos to print the second largest elements 
static void print2largest(int[] arr)
{
    int i,  second;
    int arr_size = arr.length;
 
    // Validation check : There should be atleast two elements
    if (arr_size < 2)
    {
        System.out.printf(" Invalid Input ");
        return;
    }
 
    int largest = second = Integer.MIN_VALUE;
 
    // Find the largest element
    for(i = 0; i < arr_size; i++)
    {
        largest = Math.max(largest, arr[i]); // using Math.max to compare the numbers to find the largest
    }
 
    // Find the second largest element
    for(i = 0; i < arr_size; i++)
    {
        if (arr[i] != largest) //checking if the number in the array is not equal to the already found largest
            second = Math.max(second, arr[i]);
    }
    if (second == Integer.MIN_VALUE) // Validation check to see if all the numbers are the same
        System.out.printf("There is no second " +
                          "largest element\n");
    else
        System.out.printf("The second largest " +
                          "element is %d\n", second);
}
}
