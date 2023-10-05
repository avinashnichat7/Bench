package com.numerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N) {
        // code here
        ArrayList<Integer> table = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {

            table.add(i * N);
        }

        return table;

    }

    public static void main(String[] args) {
        getTable(9);
    }
}
