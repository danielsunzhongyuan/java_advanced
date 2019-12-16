package com.zsun.java.chapter1;

/**
 * @author : zsun
 * @date : 2019/12/16 19:57
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 250000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }
}
