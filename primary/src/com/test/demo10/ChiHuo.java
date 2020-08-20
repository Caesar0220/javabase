package com.test.demo10;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //对包子的状态进行判断
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后的代码，吃包子
                System.out.println("吃货正在吃" + bz.getPi() + bz.getXian() + "的包子");
                bz.setFlag(false);
                //吃货唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经吃完" + bz.getPi() + bz.getXian() + "的包子");
            }
        }
    }
}
