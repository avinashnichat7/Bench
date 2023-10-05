package com.numerics;

import java.util.Arrays;

//Given an array of N distinct elements, the task is to
//        find all elements in array except two greatest elements in sorted order.
public class At_least_two_greater_elements {
    public static void main(String[] args) {
        long array[] = {2, 8, 7, 1, 5};
        int length = array.length;

        At_least_two_greater_elements atLeastTwoGreaterElements = new At_least_two_greater_elements();

        System.out.println(atLeastTwoGreaterElements.findElements(array, length));
    }

    public long[] findElements(long a[], long n) {
        Arrays.sort(a);
        long ans[] = new long[(int) n - 2];
        for (int i = 0; i < ans.length; i++)
            ans[i] = a[i];
        return ans;
    }
}



