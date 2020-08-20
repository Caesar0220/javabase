package com.test.demo09;

public class Demo02TicketLock {
    public static void main(String[] args) {
        RunnableImpl01 r = new RunnableImpl01();
        Thread thread01 = new Thread(r);
        Thread thread02 = new Thread(r);
        Thread thread03 = new Thread(r);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
