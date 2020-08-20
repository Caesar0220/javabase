package com.test.demo01;

import java.util.Arrays;

public class Demo06PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        //要求打印格式为：[10,20,30,40,50]
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.println(array[i] + ", ");
            }
        }
        System.out.println("==============");
        System.out.println(Arrays.toString(array));
    }
}
