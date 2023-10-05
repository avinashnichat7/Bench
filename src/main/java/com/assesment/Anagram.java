package com.assesment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = scanner.next();

        System.out.println("Enter the first String");
        String s2 = scanner.next();

        boolean anagram = isAnagram(s1, s2);

        System.out.println(anagram);
    }

    public static boolean isAnagram(String s1, String s2) {
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


}

