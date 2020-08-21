package com.test.demo14;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示号码");
    }
}
