package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Limit {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,56,87,98,65,43,21,34,56,7,89,98,65);
		
		
		 Integer i = list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.limit(1)
				.findAny()
				.get();
				
				
		System.out.println(i);
	}
}
