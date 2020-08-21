package com.test.demo15;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("古力娜扎", 10);
        Person person1 = new Person("古力娜扎", 10);
        boolean equals = person.equals(person1);
        System.out.println(equals);
    }
}
