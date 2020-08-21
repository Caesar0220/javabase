package com.test.demo16;

import java.util.Calendar;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar is = Calendar.getInstance();
        System.out.println(is.get(Calendar.YEAR));
        System.out.println(is.get(Calendar.MONTH) + 1);
        System.out.println("============================");
        System.out.println(is.get(Calendar.DAY_OF_MONTH));
    }
}
