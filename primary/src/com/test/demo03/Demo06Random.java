package com.test.demo03;

import java.util.Random;

public class Demo06Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //[0,5)变成[1,6)所以就是[1,5]
            System.out.println(r.nextInt(n) + 1);
        }
    }
}
