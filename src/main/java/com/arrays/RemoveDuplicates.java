package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String name[] = {"1", "2", "3", "4", "5", "5"};


        List<String> stream = Arrays.asList(name);

        List<String> collect = stream.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("******************************************");
        int[] array = {1, 2, 2, 3, 4, 5, 6, 7, 6, 8, 7, 9, 10};

        int[] ints = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(ints));
    }
}
