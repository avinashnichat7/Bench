package com.numerics;

public class AlternativeElement {
    public static void print(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if (temp % 2 != 0) {

                System.out.println(temp);
            }

        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        print(arr,n);
    }
}
