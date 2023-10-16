package com.stream;

import java.util.Arrays;

public class CheckTwoArraysAreEquals {

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 5, 7 };
		int arr2[] = { 3, 2, 8, 7 };

		if (arrayEquals(arr1, arr2)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays not equal");
		}

	}

	private static boolean arrayEquals(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length) {

			return false;
		} else {

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			return Arrays.equals(arr1, arr2);
		}

	}
}
