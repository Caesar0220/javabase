package com.test.demo17;

public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("a");
        sb.append("a");
        System.out.println(sb);
        System.out.println("=============");
        sb.append("中国").append("加油");
        System.out.println(sb);
    }
}
