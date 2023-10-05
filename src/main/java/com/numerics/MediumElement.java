package com.numerics;

import java.util.Arrays;

public class MediumElement {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5};
        MediumElement medium = new MediumElement();
        System.out.println(medium.find_median(v));
    }

    public int find_median(int[] v) {
        Arrays.sort(v);

        int length = v.length;
        int half_Length = length / 2;
        if (half_Length % 2 == 0) {

            int medium = (v[half_Length] + v[half_Length - 1]) / 2;
            return medium;
        } else return v[half_Length];
    }
}
