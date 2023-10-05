package com.numerics;

public class ReverseDigit {
    public long reverse_digit(long n)
    {

        long rem;
        long rev=0;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }return rev;
}

    public static void main(String[] args) {
        ReverseDigit reverseDigit = new ReverseDigit();
        System.out.println(reverseDigit.reverse_digit(122));
    }}
