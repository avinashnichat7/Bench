package com.stream;

public class CountDigit {

	public static void main(String[] args) {
		
		
		int n=1234533;
		
		int count=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		
		
		System.out.println(count);	
	}
}
