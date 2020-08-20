package com.test.demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("柳岩");
        list.add("高圆圆");
        list.add("赵又廷");
        System.out.println(list);
        System.out.println("==============");
        System.out.println(list.remove(1));
        System.out.println(list.get(0));
        System.out.println(list.size());
    }
}
