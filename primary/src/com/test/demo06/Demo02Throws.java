package com.test.demo06;

import java.io.IOException;

public class Demo02Throws {
    public static void main(String[] args) throws Exception {
        readFile("d:\\a.tx");
    }

    public static void readFile(String fileName) throws Exception {
//        if (!fileName.equals("c:\\a.txt")) {
//            throw new FileNotFoundException("文件路径找不到");
//        }
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
        System.out.println("程序执行结束");
    }
}
