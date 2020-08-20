package com.test.demo01;

public class Demo05ArrayReturn {
    public static void main(String[] args) {
        int[] result = {10, 20, 30};
        int[] array = caculate(result);
        System.out.println(array[0]);
        System.out.println("================");
        System.out.println(array[1]);
    }

    public static int[] caculate(int[] array) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        avg = sum / array.length;
        array[0] = sum;
        array[1] = avg;
        return array;
    }
}
