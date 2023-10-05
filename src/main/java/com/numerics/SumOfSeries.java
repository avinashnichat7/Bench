package com.numerics;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

        int num = 5;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        //normal Way
        System.out.println(sum);

        // 2nd way
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        SumOfSeries sumOfSeries = new SumOfSeries();
        System.out.println(sumOfSeries.seriesSums(x));
    }

    long seriesSum(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;

    }

    // other way using formula to optimize code;
    long seriesSums(int n) {
        int sum = 0;
        sum = n * (n + 1) / 2;
        return sum;
    }
}

