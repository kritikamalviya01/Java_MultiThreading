package com.kritika.InterruptedDemo;

public class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=0; i<= 5; i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }

    }
}
