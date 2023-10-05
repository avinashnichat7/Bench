package com.practice;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String name) {

        String reverse = "";

        int length = name.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(ReverseString.reverse(name));
    }
}