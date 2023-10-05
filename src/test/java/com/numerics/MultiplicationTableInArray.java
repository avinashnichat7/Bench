package com.numerics;

import org.json.*;

import java.util.ArrayList;

public class MultiplicationTableInArray {
    public static ArrayList<Integer> getTable(int N) {
        ArrayList<Integer> result = new ArrayList<Integer>();


        for (int i = 1; i <= 10; i++) {


            System.out.print(result + " ");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getTable(9));
    }
}
