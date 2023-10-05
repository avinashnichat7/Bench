package com.assesment;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.");
        int no = scanner.nextInt();
        int rev = 0;
        int rem;
        while (no > 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        System.out.println(rev);


    }
}