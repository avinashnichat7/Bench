package com.multiThreading.synchronization;

public class Producer extends Thread {

    Company company;

    Producer(Company company) {
        this.company = company;
    }

    public void run() {
        int item = 1;
        while (true) {


            try {
                company.produceItem(item);

                Thread.sleep(4000);
                item++;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}