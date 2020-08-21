package com.test.demo14;

public class Phone {
    public Phone() {
    }

    public static void methodStatic() {
        System.out.println("父类的静态方法");
    }

    public void call() {
        System.out.println("打电话！");
    }

    public void send() {
        System.out.println("发短信！");
    }

    public void show() {
        System.out.println("来电显示！");
    }
}
