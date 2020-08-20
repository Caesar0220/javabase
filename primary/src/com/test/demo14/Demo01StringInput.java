package com.test.demo14;

import java.util.Scanner;

public class Demo01StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String input = sc.next();
        char[] chars = input.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                countUpper++;
            } else if ('a' <= chars[i] && chars[i] <= 'z') {
                countLower++;
            } else if ('0' <= chars[i] && chars[i] <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母个数:" + countUpper);
        System.out.println("小写字母个数:" + countLower);
        System.out.println("数字个数:" + countNumber);
        System.out.println("其他个数:" + countOther);
    }
}
