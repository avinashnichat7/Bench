package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNoFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 810, 9};

        int i = Arrays.stream(array).max().orElseGet(null);


        System.out.println(i);
        System.out.println("*****************************************");


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 810, 9);

        Integer collect = integers.stream()
                .sorted(Collections.reverseOrder())
                .findFirst().get();


        System.out.println(collect);


    }}
