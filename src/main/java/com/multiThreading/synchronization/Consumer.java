package com.multiThreading.synchronization;

public class Consumer extends Thread {
    Company company;

    Consumer(Company company) {
        this.company = company;
    }

    public void run() {
        int item = 1;

        while (true) {

            try {
                company.consumeItem();
                Thread.sleep(4000);
                item++;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
