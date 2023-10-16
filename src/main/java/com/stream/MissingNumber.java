package com.stream;

public class MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		
		//it will return 1 t0 10 number sum//=55
		int sum = (10 * 11) / 2;

		int actualsum = 0;

		for (int i = 0; i < arr.length; i++) {

			actualsum = actualsum + arr[i];
		}

		System.out.println(sum - actualsum);
	}
}
