package com.test.demo02;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "刘德华";
        person.setAge(20);
        System.out.println("我叫" + person.name + ",今年" + person.getAge() + "了");
    }
}
