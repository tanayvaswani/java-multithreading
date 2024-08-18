package com.locks;

public class BankAccount {

    private int balance = 100;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if (balance >= amount) {
            System.out.println("Withdrawing INR" + amount + " from: " + Thread.currentThread().getName());

            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed. Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}
