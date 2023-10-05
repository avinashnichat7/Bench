package com.numerics;

import java.util.Scanner;

public class OddOrEven {
    static String oddEven(int N) {
        if (N % 2 == 0) {
            return "even";
        }

        return "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddEven(5));
    }
}

