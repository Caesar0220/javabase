package com.test.demo16;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("================");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }
}
