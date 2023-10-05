package com.string;

public class CountTheSpace {
    public static void main(String[] args) {
        String name = "i'm software developer";
        int count = 0;

        for (int i = 1; i < name.length(); i++) {
            char ch = ' ';
            if (name.charAt(i) == ch) {

                count++;
            }
        }
        System.out.println(count);
    }
}
