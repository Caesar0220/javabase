package com.test.demo13;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\develop\\javabase\\primary\\src\\com\\test\\demo13\\b.txt");
        byte[] bytes = {97, 98, 99, 100};
        fos.write(bytes);

        byte[] bytes1 = {-65, -66, -27, -8};
        fos.write(bytes1);
        fos.close();
    }
}
