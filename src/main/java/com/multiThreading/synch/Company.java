package com.multiThreading.synch;

public class Company {
    int item;

    /*
        when the producer producer item them should not get any intruption
            or producer producer item  then cosumer should not work while running producer
        so we are using synchronized
        same as for consumer method
    */
    boolean f = false; //chance prodeucer

    synchronized public void produceItem(int item) throws Exception {
        if (f){
            wait();
        }
        this.item = item;
        System.out.println("Produce Item:: =" + this.item);
            f=true;
            notify();
    }

    public int consumeItem() throws InterruptedException {
        if (!f) {
            wait();
        }
        System.out.println("Consume item:: = " + this.item);
        f = false;
        notify();
        return this.item;

    }
}
