package com.numerics;

public class RemoveSpace {
    public static void main(String[] args) {
        String name = "asf dg";
        char[] chars = name.toLowerCase().toCharArray();

        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ' ') {
                continue;
            }
            buffer.append(chars[i]);

        }
        System.out.println(buffer);

    }
}


