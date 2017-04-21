package com.lbayer.idea171761;

public class Reproduction {
    public static void main(String[] args) {
        Thread a = new Thread(Reproduction::run, "A");
        Thread b = new Thread(Reproduction::run, "B");

        a.start();
        b.start();
    }

    private static void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
        System.out.println(Thread.currentThread().getName() + " Middle");
        System.out.println(Thread.currentThread().getName() + " End");
    }
}
