package com.test.demo16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd H:m:s");
        System.out.println(sdf.format(new Date()));
    }
}
