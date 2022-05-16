package com.company;

public class Threads implements Runnable {
    Thread thread;
    Threads(String name) {
        thread = new Thread(this, name);
    }
    public static Threads createAndStart(String name) {
        Threads T = new Threads(name);
        T.thread.start();
        return T;
    }
    public void run() {
        System.out.println(thread.getName() + "START. ");
        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(100);
                System.out.println(thread.getName() + " EXECUTED " +
                        i + "TIMES.");
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " SYSTEM DISTURBED");
        }
        System.out.println(thread.getName() + " STILL UNDER PROCESSING.");
    }
    public void join() {
    }
}
