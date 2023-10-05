package com.multiThreading.threadPool;
//this is job
public class MyThread implements Runnable {
    private String name;

    public MyThread(String name) {

        this.name = name;
    }

    @Override
    public void run() {


            System.out.println(" Thread start : " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Thread : "+ name);
    }
}
