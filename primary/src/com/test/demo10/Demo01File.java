package com.test.demo10;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String separator = File.separator;
        System.out.println(separator);
        System.out.println("==========");
        File files = new File("D:\\develop\\javabase\\primary\\src\\com\\test\\demo01");
        for (String file : files.list()) {
            System.out.println(file);
        }
    }
}
