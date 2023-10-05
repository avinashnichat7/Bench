package com.arrays;

public class FindMissingElement {

    public static void main(String[] args) {


        int array[] = {1, 2, 3, 4, 5, 6, 7, 9};
        int expected_length = array.length + 1;
        int sum = expected_length * (expected_length + 1) / 2;

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 = sum2 + array[i];
        }
        System.out.println("missing array = " + (sum - sum2));
    }
}
