package com.kritika;

import java.util.Scanner;

public class JoinDemo extends Thread{

    static int n, sum =0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sum of first N Numbers");
        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        JoinDemo.n = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();
        System.out.println("Sum of "+ JoinDemo.n+ " Numbers is "+ JoinDemo.sum);

    }

    public void run(){
        for(int i = 0; i< JoinDemo.n; i++){
            JoinDemo.sum += i;
        }
    }
}
