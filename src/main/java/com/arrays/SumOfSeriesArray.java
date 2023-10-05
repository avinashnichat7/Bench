package com.arrays;

public class SumOfSeriesArray {
    public static int sumElement(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3};
        int n=3;
        int result = sumElement(arr, n);
        System.out.println(result);
    }

}
