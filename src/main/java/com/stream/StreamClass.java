package com.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamClass {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 23, 45, 500, 6, 78, 99, 9);

        Optional<Integer> sumOfNumber = list.stream().reduce((a, b) -> a + b);

        System.out.println("sumOfNumber" + sumOfNumber);

        double average = list.stream()
                .filter(x -> x > 100)
                .mapToInt(x -> x).average().getAsDouble();
        System.err.println("average" + average);


        IntStream square = list.stream().mapToInt(x -> x).map(x -> x * x);

        System.out.println(square);

        List<String> startWith = list.stream().map(x -> String.valueOf(x)).filter(x -> x.startsWith("2")).collect(Collectors.toList());

        System.err.println("start with " + startWith);


        Set<Integer> DuplicateElement = list.stream().filter(x -> Collections.frequency(list, x) >1).collect(Collectors.toSet());

        System.err.println("duplicate element " + DuplicateElement);


        Set<Integer> set = new HashSet<>();

        List<Integer> printDuplicates = list.stream().filter(x -> !set.add(x)).collect(Collectors.toList());

        System.err.println("Duplicates: " + printDuplicates);


        String input ="dfghhfdsaa";


        Character character = input.chars().mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).findFirst().get();


        System.out.println(character);
    }

}