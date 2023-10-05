package com.string;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicatesitems {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 6, 4, 5, 6);

        int a[] = {1, 2, 3, 4, 1, 2, 6, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.err.println(a[i]);
                }
            }
        }
        HashSet<Object> set = new HashSet<>();

        List<Integer> duplicates = list.stream()
                .filter(x -> !set.add(x)).collect(Collectors.toList());

        System.out.println(duplicates);

        System.err.println("***************************************");
        Set<Integer> duplicatesItems = list.stream()
                .filter(n -> Collections.frequency(list, n) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicatesItems);
        System.err.println("**************************************");
    }
}
