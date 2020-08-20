package com.test.demo12;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03Arrays {
    public static void main(String[] args) {
        Person[] person = {
                new Person("柳岩", 18),
                new Person("古力娜扎", 20),
                new Person("马尔扎哈", 15)
        };
//        Arrays.sort(person, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        Arrays.sort(person, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Person person1 : person) {
            System.out.println(person1.getAge());
        }
    }

}
