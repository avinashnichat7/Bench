package com.numerics;

public class AllArrayPalindrome {
    public static int palinArray(int array[], int n) {

        int temp = 0;
        int rem = 0;
        for (int i = 0; i < n; i++) {
            temp = array[i];
            int rev = 0;

            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (array[i] != rev) {
                return 0;

            }
        }
        return 1;
    }
        public static void main (String[]args){
            int array[] = {111, 222, 333, 444, 555};
            int n = 5;
            int result = palinArray(array, n);

            System.out.println(result);

        }
    }
