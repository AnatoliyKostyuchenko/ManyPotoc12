package com.company;

public class WNALL {
    boolean a = true;
    boolean b = false;
    boolean c = false;
    Object lock = new Object();

    public synchronized <lock> void A() throws InterruptedException {
        System.out.println("A");
        wait();
        if (a = true) {
            lock.notify();
            boolean a = false;
            boolean b = true;
            boolean c = false;
        }
    }

    public synchronized <lock> void B() throws InterruptedException {
        wait();
        System.out.println("B");
        if (b = true) {
            lock.notify();
            boolean a = false;
            boolean b = false;
            boolean c = true;
        }
    }

    public synchronized <lock> void C() throws InterruptedException {
        wait();
        System.out.println("C");
        if (b = true) {
            lock.notify();
            boolean a = true;
            boolean b = false;
            boolean c = false;
        }

    }
}
