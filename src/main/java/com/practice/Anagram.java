package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String s2 = scanner.nextLine();

        boolean result = areAnagrams(s1, s2);

        if (result) {
            System.out.println("They are anagrams.");
        } else {
            System.out.println("They are not anagrams.");
        }
    }
}


