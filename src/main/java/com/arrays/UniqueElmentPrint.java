package com.arrays;

import java.lang.reflect.Array;
import java.util.*;

public class UniqueElmentPrint {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 2, 6, 1};

        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();


        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (countMap.get(num) == 1) {
                System.out.println(num + "");
            }
        }

        int[] ints = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(ints));
    }
}
