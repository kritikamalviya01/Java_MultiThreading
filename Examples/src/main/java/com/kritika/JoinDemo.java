package com.kritika;

import java.util.Scanner;

public class JoinDemo extends Thread{

    static int n, sum =0;

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        System.out.println("Sum of first N Numbers");
        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        JoinDemo.n = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();
        System.out.println("Sum of "+ JoinDemo.n+ " Numbers is "+ JoinDemo.sum);

        long end = System.currentTimeMillis();
        System.out.println("Total time taken is "+ (end-start)/1000 + " seconds");
    }

    public void run(){
        for(int i = 0; i< JoinDemo.n; i++){
            JoinDemo.sum += i;
        }
    }
}
