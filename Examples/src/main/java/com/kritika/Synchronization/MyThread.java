package com.kritika.Synchronization;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;
    int age;

    MyThread(DisplayMessage dm, String name, int age){
        this.dm = dm;
        this.name = name;
        this.age = age;
    }

    public void run(){
        try {
            dm.display(name);
            dm.display(name, age);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
