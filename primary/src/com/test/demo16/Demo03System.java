package com.test.demo16;

import java.util.Arrays;

public class Demo03System {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        int[] decArr = {7, 8, 9, 10, 11, 12, 33};
        System.out.println(Arrays.toString(decArr));
        System.out.println("================");
        System.arraycopy(intArr, 0, decArr, 0, 3);
        System.out.println(Arrays.toString(decArr));
    }
}
