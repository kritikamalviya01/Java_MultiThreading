package com.kritika.InterruptedDemo;

import com.kritika.InterruptedDemo.MyThread;

public class InterupDemo {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        mt.interrupt();

        System.out.println("Main Threas End");
    }
}
