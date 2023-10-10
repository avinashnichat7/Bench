package com.string;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        //Write a program to remove character “i” from the below String and print the output.

        String name = "I live in India";

        String str = name.toLowerCase();

        System.out.println(str.replace("I", ""));

    }
}
