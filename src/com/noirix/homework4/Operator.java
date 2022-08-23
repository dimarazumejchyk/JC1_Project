package com.noirix.homework4;

import java.util.concurrent.BlockingQueue;

public class Operator implements Runnable {
    private BlockingQueue<Integer> blQueue;

    public Operator(BlockingQueue<Integer> queueOperator) {
        this.blQueue = queueOperator;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer number = blQueue.take();
                System.out.println("Operator " + Thread.currentThread().getName() + " started a conversation with a Client " + number + ".");
                Thread.sleep(5555);       //talk time
                System.out.println("Operator " + Thread.currentThread().getName() + " ended the conversation with the Client " + number + ".");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
