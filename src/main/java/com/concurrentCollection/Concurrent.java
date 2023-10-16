package com.concurrentCollection;

import java.util.ArrayList;
import java.util.List;

public class Concurrent {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Runnable t1 = () -> {

            list.stream().forEach(x -> System.out.println(x));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable t2 = () -> {

            list.add("5");
            list.add("6");
            list.add("7");
        };

        new Thread(t2).start();
        new Thread(t1).start();


    }


}
