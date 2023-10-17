package com.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadClass extends Thread{
    List<Integer> list = new ArrayList<>();

    public  void run() {
        for (int i = 0; i <=5; i++) {

            list.add(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

    }
    }
}
