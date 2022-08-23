package com.noirix.homework4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CallCentre {
    int numClients = 20;    //number of clients
    int numOperators = 3;   //number of Operators
    int capacity = 5;       //capacity of the call center

    BlockingQueue<Integer> blQueue = new ArrayBlockingQueue<>(capacity, true);

    public void open() {
        System.out.println();
        System.out.println("Call center has opened.");
        System.out.println();
        for (int j = 1; j <= numOperators; j++) {
            Thread operatorThread = new Thread(new Operator(blQueue));
            String str = Integer.toString(j);
            operatorThread.setName(str);
            operatorThread.start();
            System.out.println("Operator " + operatorThread.getName() + " started work.");
        }
        System.out.println();
    }


    public void work() throws InterruptedException {
        for (int i = 1; i <= numClients; i++) {
            Thread clientThread = new Thread(new Thread(new Client(blQueue)));
            String str = Integer.toString(i);
            clientThread.setName(str);
            clientThread.start();
            System.out.println("Client " + clientThread.getName() + " called the call center.");
            Thread.sleep(1234);     //time between clients calls
            if (blQueue.isEmpty()==false) {
                System.out.println("Client " + clientThread.getName() + " waiting for a free operator.");
                System.out.println("Clients in the queue " + blQueue.size() + ".");

            }
        }
    }

    public void close() throws InterruptedException {
        Thread.sleep(numClients*1234);      //we are waiting for all clients to call
        System.out.println();
        if (blQueue.isEmpty()) {                //checking if the queue is empty
            for (int i = 1; i <= numOperators; i++) {
                System.out.println("Operator " + i + " finished work.");
            }
            System.out.println();
            System.out.println("Call center has closed");
            System.exit(0);          //shutting down the program
        }
    }
}
