package com.test.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo08RandomGameTimes {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("您一共有五次机会哦！：");
        for (int i = 1; i < 6; i++) {
            System.out.println("请输入猜测的数字：");
            int guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("太大了，请重试");
                System.out.println("您还有" + (5 - i) + "次机会");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试");
                System.out.println("您还有" + (5 - i) + "次机会");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
