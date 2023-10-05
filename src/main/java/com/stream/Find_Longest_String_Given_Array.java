package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_Longest_String_Given_Array {

    public static void main(String[] args) {
        String[] array = {"spring, spingboot, microsoft,microservices, java"};

        String findLongestLengthString = Arrays.stream(array)
                .reduce((a1, a2) -> a1.length() > a2.length() ? a1 : a2)
                .get();

        System.out.println(findLongestLengthString);
        System.out.println("*********************************************************************");


        String findFirstLongestString = Arrays.stream(array)
                .sorted(Comparator.comparing(String::length)
                        .reversed())
                .findFirst().get();

        System.err.println("findFirstLongestString = "+ findFirstLongestString);


        System.err.println("find the  whose start with 1");


        int n[] = {1, 2, 3, 4, 5, 6, 7, 11};


        List<String> strings = Arrays.stream(n)
                .boxed().map(x -> x + "")
                .filter(x -> x.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(strings);

    }
}
