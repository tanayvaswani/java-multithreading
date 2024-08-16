package com.myThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        // State of mt: RUNNING (comes under RUNNABLE only) ref -> java.lang.thread.state
        System.out.println("RUNNING");

        try {
            Thread.sleep(2000); // State of mt: RUNNABLE -> TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        System.out.println(mt.getState()); // State of mt: NEW
        mt.start(); // NEW -> RUNNABLE
        System.out.println(mt.getState()); // State of mt: RUNNABLE

        Thread.sleep(100); // This is for main thread

        System.out.println(mt.getState()); // State of mt: TIMED_WAITING
        mt.join(); // State of mt: TIMED_WAITING -> TERMINATED
        System.out.println(mt.getState()); // State of mt: TERMINATED
    }
}
