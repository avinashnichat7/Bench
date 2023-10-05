package com.practice;

public class Amstrong {
    public static void main(String[] args) {
        int no = 153;

        int t1 = no;
        int digit = 0;
        int rem;

        while (t1 > 0) {
            t1 = t1 / 10;
            digit++;
        }
        System.out.println("no of digits >>" + digit);

        int t2 = no;
        int arm = 0;
        while (t2 > 0) {
            rem = t2 % 10;

            int mul = 1;

            for (int i = 1; i <= digit; i++) {

                mul = rem * mul;
            }
            System.out.println("mul=" + mul);

            arm = arm + mul;
            t2 = t2 / 10;
        }
        System.out.println("arm =" + arm);
        if (arm == no) {
            System.out.println("it is armstrong");
        } else {
            System.out.println("it is not armstrong");
        }

    }
}
