package com.multiThreading.threadPool;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Trigger {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        for (int i = 0; i <= 10; i++) {
            MyThread thread = new MyThread("MyThread :" + i);

            executorService.execute(thread);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {


        }
        System.out.println("sucessfully done");
    }

}
