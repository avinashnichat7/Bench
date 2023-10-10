package com.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReapetedFirstCharacterFromString {

    public static void main(String[] args) {

        String input = "avinash";


        Optional<Character> first = input.chars()
                .mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).findFirst();


        System.out.println("first non repeated character " + first);


        input.chars()
                .mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .findFirst()
                .ifPresent(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 2);


        Set<Integer> collect = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.toSet());

//        System.out.println(collect);


        HashSet<Integer> set = new HashSet();

        List<Integer> findDuplicates = list.stream()
                .filter(x -> !set.add(x))
                .collect(Collectors.toList());

//        System.out.println(findDuplicates);

        String name = "dehgfdsfdxv";


        List<Character> collect1 = name.chars().mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).collect(Collectors.toList());


        String[] split = name.split("");

        Map<String, Long> countOccance = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> nonRepeatedFirstCharacter = countOccance.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get();

        System.out.println("nonRepeatedFirstCharacter =" + nonRepeatedFirstCharacter);
    }


}
