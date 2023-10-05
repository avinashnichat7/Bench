package com.numerics;

public class Palindrom {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        String palindrome = palindrom.is_palindrome(555);
        System.out.println(palindrome);
    }

    public String is_palindrome(int n) {

        int rem;
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rem = temp % 10; //555
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n) {
            return "yes";
        }
        return "no";
    }
}