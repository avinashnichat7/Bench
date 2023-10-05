package com.practice;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int number) {

        int rem;
        int reverse = 0;
        while (number > 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println(ReverseNumber.reverse(num));
    }
}
