package com.arrays;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SumOFArrays {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int sum1=calculateSum(array,1,4);

        System.out.println(sum1);
        int calculateSum = calculateSum(array, 3, 7);

        System.out.println(calculateSum);

        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }

    public static int calculateSum(int array[], int start, int end) {

        int sum = 0;

        for (int i = start; i < end; i++) {
            sum = sum + array[i];

        }
        return sum;

    }
}