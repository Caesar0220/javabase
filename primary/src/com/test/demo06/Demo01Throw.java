package com.test.demo06;

public class Demo01Throw {
    public static void main(String[] args) {
        int[] arr = {1, 2, 14, 456};
        int num = method(arr, 5);
        System.out.println(num);
    }

    public static int method(int[] arr, int index) {
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }
        return arr[index];
    }
}
