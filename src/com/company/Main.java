package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("M U L T I T H R E A D I N G");
        Threads thread1 = Threads.createAndStart("1");
        Threads thread2 = Threads.createAndStart("2");
        Threads thread3 = Threads.createAndStart("3");
        Threads thread4 = Threads.createAndStart("4");

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}
