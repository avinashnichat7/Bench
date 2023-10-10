package com.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        String[] s1 = {"apple, orange"};
        String[] s2 = {"chips", "salad"};

        String[] strings = Stream.concat(Arrays.stream(s1), Arrays.stream(s2)).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        System.out.println("***************************************");


        int[] array1 = {1, 2};
        int[] array2 = {3, 4};

        int l1 = array1.length;
        int l2 = array2.length;

        int[] result = new int[l1 + l2];

        System.arraycopy(array1, 0, result, 0, l1);
        System.arraycopy(array2, 0, result, l1, l2);

        System.out.println(Arrays.toString(result));

        System.out.println("Using Stream API");

        Stream<Integer> stream1 = Arrays.stream(array1).boxed();

        Stream<Integer> stream2 = Arrays.stream(array2).boxed();

        Integer[] integers = Stream.concat(stream1, stream2).toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));

    }
}

