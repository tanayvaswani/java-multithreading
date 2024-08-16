package com.main;

import com.submain.SubMain;

public class Main {
    public static void main(String[] args) {
        SubMain sm = new SubMain();
        Thread nt1 = new Thread(sm);
        nt1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
