package com.stream;

public class A {

//	public static void concat1(String s1)
//    {
//        s1 = s1 + "forgeeks";
//    }
//	
	public static void concat2(StringBuffer s1) {
		s1 = s1.append("forgeeks");
	}

	public static void concat3(StringBuilder s1) {
		s1 = s1.append("forgeeks");
	}

	public static void main(String[] args) {

	//	String s1 = "greeks";
//		
//		concat1(s1);
//		System.out.println(s1);

		StringBuffer s2 = new StringBuffer("greeks");
		concat2(s2);
		System.out.println(s2);

		StringBuilder s3 = new StringBuilder("Greeks");
		concat3(s3);
		System.out.println(s3);

		// @oneToOne
		// dif bet Post and Get
		// java8

		// Functional interface
		// Lamda
		// Default method
		// Static method in curent Interface
		// Equal and hashcode method
		//

	}
}
