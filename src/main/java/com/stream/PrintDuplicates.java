package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 3, 2, 5, 9, 10);

        List<Integer> printDuplicates = list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toList());

        System.out.println(printDuplicates);

        Set<Integer> set = new HashSet<Integer>();

        System.out.println("-----------------------------------------------------------------");

        list.stream().filter(x->!set.add(x)).forEach(x-> System.out.println("print_duplicates= "+x));



        System.out.println("-----------------------------------------------------------------");

        System.out.println("find first duplicate");

        Integer integer = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .findFirst().get();

        System.out.println(integer);

        String name= "I live in India";
        System.out.println(name.replace("I", ""));

    }
}
