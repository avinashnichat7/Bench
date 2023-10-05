package com.assesment;

public class CountDigit {
    public static void main(String[] args) {

        int num = 123;

        int temp = num;
        int digit = 0;

        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        System.err.println("no of digit " + digit);

    }
}
