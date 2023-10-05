package com.string;

import java.util.Scanner;

public class SortStringwithoutUsingInbuidMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Stirng");
        String next = scanner.next();

        String sort = sort(next);

        System.out.println(sort);

    }

    public static String sort(String input) {

        char[] charArray = input.toCharArray();


        int length = charArray.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {

                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;

                }
            }
        }
        return new String(charArray);
    }

}
