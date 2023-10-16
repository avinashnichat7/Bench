package com.stream;

public class PrintStringLowerAndUppercase {

	public static void main(String[] args) {
		
		String s="The cloud tech The cloud tech";
		
		int mid=s.length()/2;
		
		String lower="";
		String upper="";
		
		for(int i=0;i<s.length();i++) {
			
			if(i<=mid) {
				lower=lower+Character.toLowerCase(s.charAt(i));
			}
			else {
				upper=upper+Character.toUpperCase(s.charAt(i));
			}
		}
		
		System.out.println(lower+upper);
		
		
	}
}
