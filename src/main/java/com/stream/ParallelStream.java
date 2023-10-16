package com.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        
		l.stream().forEach(e -> {
			System.out.println(e + Thread.currentThread().getName());

		});

		
		//l.parallelStream().sorted().forEach(e->System.out.println(e));
		
		// parallel Stream
		System.err.println("parallel stream**************");
		l.parallelStream().forEach(e -> {
			System.out.println(e + Thread.currentThread().getName());
		});

	}
}
