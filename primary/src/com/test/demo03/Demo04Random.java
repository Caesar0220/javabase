package com.test.demo03;

import java.util.Random;

public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt();
        System.out.println("随机数是" + num1);
    }
}
