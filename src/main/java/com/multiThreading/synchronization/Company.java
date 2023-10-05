package com.multiThreading.synchronization;

public class Company {
    int item;

    boolean isFound = false;

    //if(isFound==false) chance : producer
    //if(isFound==true) chance :consumer
    synchronized public void produceItem(int item) throws InterruptedException {
        if (isFound) {
            wait();
        }
        this.item = item;
        System.out.println("produce item: " + this.item);
        isFound = true;
        notify();
    }
    synchronized public int consumeItem() throws InterruptedException {

        if (!isFound) {
            wait();
        }
        System.out.println("consume Item: " + this.item);
        isFound = false;
        notify();
        return this.item;
    }
}
