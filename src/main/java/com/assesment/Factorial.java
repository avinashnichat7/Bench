package com.assesment;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(6));
    }

    public int factorial(int no) {
        int fact = 1;
        for (int i = no; i >= 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
