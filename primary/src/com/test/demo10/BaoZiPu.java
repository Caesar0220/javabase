package com.test.demo10;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        while (true) {
            synchronized (bz) {
                //对包子的状态进行判断
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后执行，包子铺生产包子
                if (count % 2 == 0) {
                    //
                    bz.setPi("薄皮");
                    bz.setXian("牛肉馅");
                } else {
                    bz.setPi("冰皮");
                    bz.setXian("三鲜馅");
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.getPi() + bz.getXian() + "包子");
                //生产包子需要3秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setFlag(true);
                bz.notify();
                System.out.println("包子铺已经开始生产" + bz.getPi() + bz.getXian() + "包子，吃货可以开始吃了");
            }
        }
    }
}
