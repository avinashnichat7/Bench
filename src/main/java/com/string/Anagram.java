package com.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        String str1 = s1.replace(" ", "");
        String str2 = s2.replace(" ", "");

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        Boolean flag = false;

        for (int i = 1; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                flag=true;
            }
        else{
            flag = false;
        }}
        if (flag = true) {
            System.out.println("It is anagram");
        } else {
            System.out.println("it is not anagram");
        }

}}