package com.test.demo13;

import java.io.File;

public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("D:\\develop\\javabase\\primary\\src\\com\\test");
        getAllFiles(file);
    }

    public static void getAllFiles(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            //对得到的File对象file进行判断，判断是否是文件夹
            if (file.isDirectory()) {
                getAllFiles(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
