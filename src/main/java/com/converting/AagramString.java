package com.converting;

import java.util.Arrays;

public class AagramString {

	public static void main(String[] args) {

		String s = "Care";
		String s2 = "race";

		if (s.length() != s2.length()) {
			System.out.println("Not ");
		} else {
			String str1 = s.replaceAll(" ", "");
			String str2 = s2.replaceAll(" ", "");
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag = true;

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
				} else {
					flag = true;
				}

			}

			if (flag) {
				System.out.println("Anagram");
			} else {
				System.out.println("not");
			}
		}
	}
}
