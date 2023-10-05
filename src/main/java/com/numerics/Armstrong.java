package com.numerics;

public class Armstrong {
    public static String armstrongNumber(int n) {

        int rem;
        int digit = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }

        int temp2 = n;
        int arm = 0;
        while (temp2 > 0) {


            int mul = 1;
            for (int i = 1; i <= digit; i++) {

                rem = temp2 % 10;
                System.out.println("rem = " + rem);
                mul = mul * rem;
                    System.out.println("mul = " + mul);
            }
            arm = arm + mul;
            System.out.println("arm = " + arm);
            temp2 = temp2 / 10;
            if (arm == n) {
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        String result = armstrongNumber(125);
        System.out.println(result);
    }
}
