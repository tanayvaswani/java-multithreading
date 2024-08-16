package com.main;

import com.newMain.NewMain;
import com.submain.SubMain;

public class Main {
    public static void main(String[] args) {
        // Approach1 : by implementing Runnable Class
        SubMain sm = new SubMain();
        Thread nt1 = new Thread(sm);
        nt1.start();

        // Approach 2 : by extending Thread Class
        NewMain nm = new NewMain(); // State: NEW
        nm.start();                 // State: RUNNABLE
                                    // State: RUNNING
                                    // State: BLOCKED/WAITING
                                    // State: TERMINATED

        // thread for main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
