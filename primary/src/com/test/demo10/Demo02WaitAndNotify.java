package com.test.demo10;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object o = new Object();
        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                synchronized (o) {
                    System.out.println("告知老板包子的种类和数量");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //唤醒之后执行的代码
                System.out.println("包子已经做好了，开吃！");
                System.out.println("=========================");
            }
        }.start();
        //创建一个老板线程
        new Thread() {
            @Override
            public void run() {
                //花了5秒钟做包子
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("老板5秒钟之后做好包子，告知顾客可以吃包子了");
                        o.notify();
                    }
                }
            }
        }.start();
    }
}
