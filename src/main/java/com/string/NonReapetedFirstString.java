package com.string;

import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReapetedFirstString {

    public static void main(String[] args) {
        String name= "affsfdgfdgdfg";

        Character character = name.chars()
                .mapToObj(x -> Character.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .findFirst().get();

        System.out.println(character);

    }
}
