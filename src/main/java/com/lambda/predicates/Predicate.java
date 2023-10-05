package com.lambda.predicates;

import java.util.Arrays;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream().filter(t->t%2==0).forEach(x-> System.out.println(x));


    }


}
