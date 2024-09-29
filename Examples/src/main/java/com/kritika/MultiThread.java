package com.kritika;

public class MultiThread extends Thread{

    public static void main(String[] args) throws InterruptedException {

        MultiThread mt = new MultiThread();
        mt.setPriority(MAX_PRIORITY); // Priority of threads
        mt.start();
        Thread currentThread = Thread.currentThread();  // Current thread name
        System.out.println("Current Thread name is "+ currentThread.getName());
        for (int j=1; j<=100; j++){
            System.out.print("j: "+ j + "\t");
            Thread.sleep(100);
        }
    }

    public void run(){

        Thread currentThread = Thread.currentThread();
        currentThread.setName("Print First N number");
        System.out.println("Current Thread name is "+ currentThread.getName());
        for(int i=1; i<=100; i++){
            System.out.print("i: "+ i + "\t");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Exiting");
            }
        }
    }
}
