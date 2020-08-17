package com.test.demo;

public class Demo02ArrayMin {
    public static void main(String[] args) {
        int[] array = {1, 20, 1000, 500, 10000, -20};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值:" + min);
    }
}
