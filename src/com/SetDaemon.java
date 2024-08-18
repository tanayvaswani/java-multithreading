package com;

public class SetDaemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Check");
        }
    }

    public static void main(String[] args) {
        System.out.println("main thread started");
        SetDaemon sd = new SetDaemon();
        sd.setDaemon(true);
        sd.start();
        System.out.println("main thread ended");
    }
}
