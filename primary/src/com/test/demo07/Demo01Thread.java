package com.test.demo07;

/**
 * 创建多线程程序的第一种方式:
 */
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }

}
