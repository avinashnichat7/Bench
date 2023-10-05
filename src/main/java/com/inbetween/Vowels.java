package com.inbetween;

import java.util.List;
import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n ; i++){
            str[i] = sc.next();
        }

        for(int j = 0; j < n ; j++){
            System.out.println(pallindrome(str[j]));
        }

    }

    public static String pallindrome(String str){
        List<Character> vowels = List.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(vowels.contains(Character.toLowerCase(str.charAt(i))))
                sb.append(Character.toLowerCase(str.charAt(i)));
        }

        if(String.valueOf(sb).equals(String.valueOf(sb.reverse()))){
            return "Yes";
        }
        else
            return "No";
    }

}
