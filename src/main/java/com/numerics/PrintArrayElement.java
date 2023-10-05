package com.numerics;

import org.springframework.beans.factory.SmartInitializingSingleton;

public class PrintArrayElement {
    public static void printArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");


        }

    }

    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        PalindromArray  arrays = new PalindromArray();
       printArray(arr,n);
    }
    }
