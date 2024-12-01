package com.kritika.deamon;

public class DeamonThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());

        MyThread thread = new MyThread();
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
        thread.start();
    }
}
