package com.streamApi.parellelStream.employee;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();

        IntStream.range(1, 10).forEach(x -> System.out.println("Thread : " + x));
        end = System.currentTimeMillis();

        System.out.println("time execution took  normal stream" + (end - start));

        start = System.currentTimeMillis();

        IntStream.range(1, 10).parallel().forEach(x -> System.out.println("Thread : " + x));

        end = System.currentTimeMillis();

        System.out.println("time execution took  for Parallel Stream" + (end - start));

    }

}
