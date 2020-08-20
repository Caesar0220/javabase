package com.test.demo06;

import java.io.FileNotFoundException;

public class Demo03TryCatchFinally {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("继续执行");
        }
    }

    public static void readFile(String fileName) throws Exception {
        if (!fileName.equals("d:\\b.txt")) {
            throw new Exception("文件路径不正确");
        }
        System.out.println("后续代码");
    }
}
