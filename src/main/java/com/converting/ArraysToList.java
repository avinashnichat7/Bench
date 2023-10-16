package com.converting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToList {

	public static void main(String[] args) {
		
		int []a= {12,3,4,6,5,55,44,33};
		
		List<Integer> list = Arrays.stream(a)
				.boxed()
				.collect(Collectors.toList());
		
		 int[] array = list.stream()
		 .mapToInt(Integer::valueOf)
		 .toArray();
		 System.out.println(Arrays.toString(array));
		
			
	}
}
