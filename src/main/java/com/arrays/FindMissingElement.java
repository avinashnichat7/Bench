package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        System.err.println("****************using Stream**********");

        int expected_lenghts = Arrays.stream(array).max().getAsInt();

        int sums = expected_lenghts * (expected_lenghts + 1) / 2;
        int sums2 = Arrays.stream(array).sum();

        int missing = sums - sums2;
        System.out.println("missing >>"+missing);


        List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());

        System.out.println(findMissingElements(collect));

    }

    public static int findMissingElements(List<Integer> list) {
        int expected_length = list.size() + 1;
        int sum = expected_length * (expected_length + 1) / 2;

        int sum2 = 0;
        sum2 = list.stream().mapToInt(Integer::intValue).sum();

        return sum - sum2;

    }

}
