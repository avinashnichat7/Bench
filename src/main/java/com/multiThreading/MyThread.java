package com.multiThreading;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("program start");

        int x = 54 + 54;
        System.out.println("sum of x values =" + x);


        Thread threadName = Thread.currentThread();
        String t = threadName.getName();

        System.out.println("current thread  "+t );


        threadName.setName("main Thread");

        System.out.println("main thread "+threadName);

            Thread.sleep(3000);


        System.out.println("program end ");

    }
}
