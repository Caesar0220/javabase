package com.test.demo;

public class Demo01ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 20, 1000, 500, 10000, -20};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值:" + max);
    }
}
