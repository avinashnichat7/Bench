package com.string;

public class CountVovels {
    public static void main(String[] args) {

        String name = "I live in India";

        int count = 0;
        String s = name.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'v' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'a' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'o') {

                count++;
            }
        }
        System.out.println(count);
    }
}
