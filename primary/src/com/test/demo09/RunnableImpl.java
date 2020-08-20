package com.test.demo09;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
//    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            payTicket();
        }
    }

    public synchronized void payTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-正在卖第" + ticket + "号票");
            ticket--;
        }
    }
}
