package com.string;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String reverse = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();
        int length = name.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);



        String rev="";


    }
}
