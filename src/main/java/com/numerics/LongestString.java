package com.numerics;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    public static void main(String[] args) {
        String[] names = {"dasfd", "rewt", "dsdsdfgas", "hg"};
        int n = names.length;

        LongestString longestString = new LongestString();
        String result = longestString.longest(names, n);
        System.out.println(result);



    }

    public String longest(String[] names, int n) {
        return Arrays.stream(names)
                .sorted(Comparator.comparing(String::length)
                        .reversed()).findFirst().get();
    }
}
