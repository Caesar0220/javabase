package com.test.demo18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\develop\\javabase\\primary\\src\\com\\test\\demo13\\a.txt");
        fos.write(100);
        fos.close();
    }

}
