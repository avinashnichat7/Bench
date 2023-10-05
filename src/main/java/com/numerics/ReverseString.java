package com.numerics;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("avinash"));
    }

    public static String reverse(String S) {

        int length = S.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + S.charAt(i);

        }
        return reverse;
    }
}
