package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondHighestNumber {

    public static void main(String[] args) {

        int[] n = {1, 21, 13, 4, 5, 6, 22};
//
//
//        Integer findSecondHighest = Arrays.stream(n).boxed()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst().get();
        System.err.println("*****************find  2nd hightest number ******************");
//
//        System.out.println(findSecondHighest);

        List<Integer> list = Arrays.asList(1, 11, 2, 10, 14, 12, 14, 6, 11, 7, 8, 9, 12, 13);



        Integer secondHighestNumber = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.err.println("SecondHighest  number is " + secondHighestNumber);
    }
}
