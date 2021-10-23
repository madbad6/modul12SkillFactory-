package com.madbad;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NumberTread nTest1 = new NumberTread("test1.txt");
        NumberTread nTest2 = new NumberTread("test2.txt");

        Thread thread1 = new Thread(nTest1);
        Thread thread2 = new Thread(nTest2);

        thread1.start();
        System.out.println(thread1.getName());
        thread1.join();
        thread2.start();
        System.out.println(thread2.getName());
    }
}
