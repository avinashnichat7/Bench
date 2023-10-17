package com.multiThreading.synch;

public class Producer extends Thread {

    Company company;

    public Producer(Company company) {

        this.company = company;
    }

    public void run() {
        int item = 1;
        while (true) {

            try {
                company.produceItem(item);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(5000);

                item++;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
