package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsApplayOnList {

	public static void main(String[] args) {
		//return true or false
		Predicate<Integer>predicate=t->t % 2==0;
		
		//it not return anything ///
		Consumer<Integer>consumer=t->System.out.println(t);
		
	//	Function<Integer, Integer>fun=(t)->t+2;
		
		
		List<Integer> list = Arrays.asList(12,34,55,656,78,98,76,55);
		list
		.stream()
		.filter(predicate)
		.forEach(consumer);
		
		
	}
}
