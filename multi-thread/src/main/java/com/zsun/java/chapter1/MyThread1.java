package com.zsun.java.chapter1;

/**
 * @author : zsun
 * @date : 2019/12/16 20:32
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("stopped. I am quiting");
                break;
            }
            System.out.println("i = " + (i + 1));
        }
        System.out.println("after for");
    }
}
