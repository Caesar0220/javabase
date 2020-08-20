package com.test.demo14;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArr);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("Hello"));
        System.out.println("Hello".equals(str1));
    }
}
