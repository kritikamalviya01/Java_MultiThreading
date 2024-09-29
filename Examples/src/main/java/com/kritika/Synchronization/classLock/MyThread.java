package com.kritika.Synchronization.classLock;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;
    int age;

    MyThread(String name, int age){
        this.name = name;
        this.age = age;
    }

    MyThread(DisplayMessage dm,String name, int age){
        this.dm = dm;
        this.name = name;
        this.age = age;
    }

    public void run(){
        try {
            DisplayMessage.display(name);
            dm.display(name, age);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
