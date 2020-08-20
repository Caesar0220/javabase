package com.test.demo12;

public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程被创建了：" + Thread.currentThread().getName());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程被创建了：" + Thread.currentThread().getName());
            }
        }).start();
        //Lambda表达式
        new Thread(() -> System.out.println("新线程被创建了：" + Thread.currentThread().getName())
        ).start();
    }
}
