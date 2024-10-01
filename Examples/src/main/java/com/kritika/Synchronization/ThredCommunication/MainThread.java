package com.kritika.Synchronization.ThredCommunication;

import com.kritika.Synchronization.ThredCommunication.MyThread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();

        synchronized (mt){
            System.out.println("Main thread is going to wait");
            mt.wait();
            System.out.println("Main Thread Notified");
            System.out.println(mt.total);
        }
    }
}
