package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,32,11,23,11,12);
		
		Map<Integer, Long> map = list.stream()
		.collect(Collectors
				.groupingBy(e->e,Collectors.counting()));
		
		map.forEach((k,v)->{
			
			if(map.get(k)>1) {
				System.out.println(k+":"+v);
			}
		});
		//System.out.println(map);
	}
}
