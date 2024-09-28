package com.kritika;

public class MultiThread extends Thread{

    public static void main(String[] args) {

        MultiThread mt = new MultiThread();
        mt.start();

        for (int j=1; j<=100; j++){
            System.out.print("j: "+ j + "\t");
        }
    }

    public void run(){
        for(int i=1; i<=100; i++){
            System.out.print("i: "+ i + "\t");
        }
    }
}
