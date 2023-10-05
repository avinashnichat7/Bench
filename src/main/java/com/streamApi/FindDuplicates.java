package com.streamApi;

import javax.naming.ldap.HasControls;
import javax.print.attribute.HashAttributeSet;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 4);

        List<Integer> findDuplicates = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getKey() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(findDuplicates);
        System.err.println("*********************************");

        Set<Integer> duplicates = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.toSet());

        System.err.println("Duplicates = " + duplicates);

        HashSet<Integer> set = new HashSet<>();

        Set<Integer> collect = list.stream()
                .filter(x -> !set.add(x)).collect(Collectors.toSet());

        System.err.println("Duplicates = " + collect);


    }
}
