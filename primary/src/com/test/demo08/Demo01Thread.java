package com.test.demo08;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        new MyThread("robinhan").start();
        new MyThread("lucas").start();
        new MyThread("xiaohu").start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("=================");
        new MyThread("jessca").start();
        new MyThread("rose").start();
        System.out.println(Thread.currentThread().getName());
    }
}
