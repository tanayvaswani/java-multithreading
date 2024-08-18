package com.sync;

public class Sync {
    public static void main(String[] args) {
        Counter counter = new Counter();

        TestThread t1 = new TestThread(counter);
        TestThread t2 = new TestThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(counter.getCount());
    }
}
