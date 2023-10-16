package com.converting;

public class PalindronNumber {

	public static void main(String[] args) {

		int n = 151, rev = 0;

		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (temp == rev)
			System.out.println("The given number is palindrom " + temp);

		System.out.println(rev + ":" + temp);

	}
}
