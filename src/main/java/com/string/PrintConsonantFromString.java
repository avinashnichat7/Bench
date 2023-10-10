package com.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a program to count and print the number of occurrences of each consonant in the below String.
//        “I live in India”
//        Sample answer (considering the above input string) -
//        l = 1
//        v = 1
//        n = 2
//        d = 1
// Apart from Vovel Called Consonants
public class PrintConsonantFromString {
    public static void main(String[] args) {

        String name = "I live in India";
        String str = name.toLowerCase();

        Map<Character, Long> countOccarances = str.chars().mapToObj(x -> Character.valueOf((char) x))
                .filter(x -> x >= 'a' && x <= 'z' && "aeiov".indexOf(x) == -1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countOccarances.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
