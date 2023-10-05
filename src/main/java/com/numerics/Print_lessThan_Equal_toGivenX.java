package com.numerics;

public class Print_lessThan_Equal_toGivenX {
    public static void main(String[] args) {
        long arr[] = {1, 2, 4, 5, 8, 10};
        long n = 6;
        long x = 9;
        Print_lessThan_Equal_toGivenX givenX = new Print_lessThan_Equal_toGivenX();
        long result = givenX.countOfElements(arr, n, x);

        System.out.println(result);
    }

    public long countOfElements(long arr[], long n, long x) {
        long temp = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            if (temp <=x) {

                count++;
            }
        }
        return count;
    }
}