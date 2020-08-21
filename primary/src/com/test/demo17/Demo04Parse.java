package com.test.demo17;

public class Demo04Parse {
    public static void main(String[] args) {
        //基本类型转换成字符串类型
        int i = 100;
        String s1 = i + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        //字符串类型转换成基本类型
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
    }
}
