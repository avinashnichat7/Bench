package com.arrays;

import java.util.HashMap;

public class PrintDuplicatesElementArrays {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 6, 2, 8};

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
        System.out.println("********************print Unique Element************************************");
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int num : array) {

            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for (int num : array) {
            if (hashMap.get(num) == 1) {
                System.out.println(num + "");
            }
        }
    }
}
