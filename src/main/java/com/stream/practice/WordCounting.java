package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounting {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("raj", "pavan", "raj", "dipak", "ratan");

		Map<String, Long> map = l.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map);

	}
}
