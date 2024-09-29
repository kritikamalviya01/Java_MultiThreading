package com.kritika.Synchronization.classLock;

public class SyncDemo {



    public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();
        MyThread mt = new MyThread(displayMessage,"Kritika", 22);
        MyThread mt2 = new MyThread(displayMessage, "Kinesh", 20);

        mt.start();
        mt2.start();
    }


}
