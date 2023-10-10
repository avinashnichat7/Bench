package com.numerics;

public class SumOfDigitIsPalindrom {
    public static void main(String[] args) {
        SumOfDigitIsPalindrom sumOfDigitIsPalindrom = new SumOfDigitIsPalindrom();
        int result = sumOfDigitIsPalindrom.isDigitSumPalindrome(123);
        System.out.println(result);
    }

    public int isDigitSumPalindrome(int N) {
        int temp = N;
        int rev = 0;
        int rem;
        int sum = 0;
        while (temp > 0) {
            rem = temp % 10;    //123
            sum = rem + sum;
            temp = temp / 10;
        }
        System.out.println("sum=" + sum);
        int temp2 = sum;

        while (temp2 > 0) {
            rem = temp2 % 10;
            System.out.println("rem="+rem);
            rev = rev * 10 + rem;
            temp2 = temp2 / 10;

        }
        System.out.println("rev =" + rev);
        if (sum == rev) {
            return 1;
        } else {
            return 0;
        }
    }
}
