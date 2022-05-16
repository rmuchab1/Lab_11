package com.company;

public class Priority implements Runnable {
    static int count;
    static Thread thread;
    static Boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
        return;
    }
    public void run() {
        System.out.println(thread.getName() + " is starting to operate.");
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println(thread.getName() + " is executed.");
            }
        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.getName() + " finished running.");

    }
}
