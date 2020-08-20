package com.test.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student a = new Student("洪七公", 20);
        Student b = new Student("黄药师", 30);
        Student c = new Student("欧阳锋", 25);
        Student d = new Student("一灯大师", 40);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名:" + list.get(i).getName() + "，年龄：" + list.get(i).getAge());
        }
    }
}
