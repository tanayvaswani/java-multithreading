package com.sync;

public class Counter {

    private int count = 0;

    // public synchronized void increment()  {
    public void increment()  {
        synchronized(this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
