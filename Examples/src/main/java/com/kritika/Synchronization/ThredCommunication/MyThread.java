package com.kritika.Synchronization.ThredCommunication;

public class MyThread extends Thread{

    int total;

    @Override
    public void run(){

        synchronized (this){
            System.out.println("Child thread is calculating the sum: ");
            for (int i= 1; i<10; i++){
                total += i;
            }
            this.notify();
        }

    }

}
