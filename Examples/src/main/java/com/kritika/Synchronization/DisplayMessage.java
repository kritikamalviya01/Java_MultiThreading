package com.kritika.Synchronization;

public class DisplayMessage {
    public synchronized void display(String name) throws InterruptedException {
        for (int i=1; i<10; i++){
            System.out.println("Hello, How are you "+ name);
            Thread.sleep(1000);
        }
    }

    public void display(String name, int age) {
        for (int i=1; i<10; i++){
            System.out.println("Hello, How are you "+ name + " " + age);
        }
    }
}
