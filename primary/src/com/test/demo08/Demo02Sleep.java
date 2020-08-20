package com.test.demo08;

public class Demo02Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
