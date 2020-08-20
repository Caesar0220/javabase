package com.test.demo09;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread thread01 = new Thread(r);
        Thread thread02 = new Thread(r);
        Thread thread03 = new Thread(r);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
