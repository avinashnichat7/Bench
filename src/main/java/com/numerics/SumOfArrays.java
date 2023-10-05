package com.numerics;

public class SumOfArrays {
    public static void main(String[] args) {
        long a[] = {1, 2, 3, 4};
        long n = 4;

        SumOfArrays sumOfArrays = new SumOfArrays();
        System.out.println(sumOfArrays.getSum(a, n));
    }

    public long getSum(long a[], long n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
