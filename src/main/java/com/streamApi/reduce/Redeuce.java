package com.streamApi.reduce;

import java.util.ArrayList;
import java.util.List;

public class Redeuce {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);

        Integer reduce = list.stream().limit(2).reduce(0, (a, b) -> a + b);

        System.out.println(reduce);

        if (list.size() >= 2) {
            int index1 = 0; // Index of the first element
            int index2 = 1; // Index of the second element

            int element1 = list.get(index1);
            int element2 = list.get(index2);

            int product = element1 * element2;

            System.out.println("The product of elements at index " + index1 + " and index " + index2 + " is: " + product);
        } else {
            System.out.println("The list does not have at least two elements to find a product.");
        }
    }

}
