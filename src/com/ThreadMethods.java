package com;

public class ThreadMethods extends Thread {
    public ThreadMethods(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadMethods l = new ThreadMethods("Low");
        ThreadMethods m = new ThreadMethods("Medium");
        ThreadMethods h = new ThreadMethods("High");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}

// METHODS :-
// - start()
// - run()
// - sleep()
// - join()
// - setPriority()