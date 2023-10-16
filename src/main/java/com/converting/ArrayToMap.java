package com.converting;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {

	public static void main(String[] args) {
		
		String []r= {"kailas","avinash"};
		
		 Map<String, String> map = Arrays.stream(r)
		.collect(Collectors.toMap(String::new, String::toLowerCase));
		
		System.out.println(map);
	}
}
