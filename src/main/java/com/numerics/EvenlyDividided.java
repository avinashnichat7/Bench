package com.numerics;

public class EvenlyDividided {

    static int evenlyDivide(int N) {

        int temp = 0;
        int rem;
        int digit = 0;
        while (temp != 0) {
            rem = temp % 10;
            if (rem != 0 && N % rem == 0) ;
            digit++;
            temp = temp / 10;
        }
        return digit;
    }


//    Given a number N. Count the number of digits in N which evenly divides N.

    public static void main(String[] args) {

        int x = 32;

        System.err.println(evenlyDivide(x));

        int temp = x;
        int rem;
        int n = 0;
        while (temp != 0) {

            rem = temp % 10;
            if ((rem != 0) && (x % rem == 0))
                n++;
            temp = temp / 10;

        }
        System.out.println(n);
    }

}

