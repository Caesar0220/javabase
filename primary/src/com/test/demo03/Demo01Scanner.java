package com.test.demo03;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("键盘输入的数字是:" + num);
        String str = scanner.next();
        System.out.println("键盘输入的字符串是：" + str);
    }
}
