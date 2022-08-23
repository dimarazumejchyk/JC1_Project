package com.noirix.homework4;

import java.util.concurrent.BlockingQueue;

public class Client implements Runnable {
    private BlockingQueue<Integer> blQueue;

    public Client(BlockingQueue<Integer> blQueue) {
        this.blQueue = blQueue;
    }

    @Override
    public void run() {
        try {
            Integer x = new Integer(Thread.currentThread().getName());
            this.blQueue.put(x);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
