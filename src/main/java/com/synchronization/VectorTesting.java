package com.synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting {

    public static void main(String[] args) throws InterruptedException {
        int size = 1000001;
        List<Integer> arrayList = new ArrayList<>();
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i<size; i++) {
//            arrayList.add(i);
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println("Added "+size +" element to ArrayList: "+(end - start) + "ms");
//        System.out.println("arrayList.size() :: "+arrayList.size());
////
//        List<Integer> vector = new Vector<>();
////
//        start = System.currentTimeMillis();
//
//        for (int i = 0; i<size; i++) {
//            vector.add(i);
//        }
//        end = System.currentTimeMillis();
//
//        System.out.println("Added "+size +" element to Vectors : "+(end - start) + "ms");
//        System.out.println("vector.size() :: "+vector.size());


        List<Integer> multiThreadedList = Collections.synchronizedList(new ArrayList<>());

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedList.add(i);
            }
        });
//
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("Added element to multiThreaded list : " + (end - start) + "ms");
        System.out.println("multiThreaded list :.size() :: " + multiThreadedList.size());
//
//
        List<Integer> multiThreadedVector = new Vector<>();

        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedVector.add(i);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedVector.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added element to multiThreaded vector : " + (end - start) + "ms");
        System.out.println("multiThreaded vector :.size() :: " + multiThreadedVector.size());

    }
}

