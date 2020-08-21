package com.test.demo17;

public class Demo02String {
    public static void main(String[] args) {
        String r = "中国";
        System.out.println("String:" + r);
        StringBuilder bu = new StringBuilder(r);
        bu.append("加油");
        System.out.println("StringBuilder:" + bu);
        String s = bu.toString();
        System.out.println("toString:" + s);
    }
}
