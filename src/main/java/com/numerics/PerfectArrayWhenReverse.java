package com.numerics;

public class PerfectArrayWhenReverse {
    public static boolean isPerfect(int arr[], int n) {
        boolean flag = false;
        int rev = 0;
        int rem;
        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {

            temp = arr[i];
            while (temp > 0) {

                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if (arr[i] == temp) {
                System.out.println("value" + temp);
                return flag;

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        int n = arr.length;

        System.out.println(isPerfect(arr, n));
    }
}
