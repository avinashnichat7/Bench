package com.assesment;

public class SumOFDigit {
    public static void main(String[] args) {

        int num = 123;

        int rem;
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            rem = temp % 10;

            sum = sum + rem;
            temp = temp / 10;

        }
        System.out.println(sum);
    }
}
