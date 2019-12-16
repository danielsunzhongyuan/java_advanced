package com.zsun.java.chapter1;

/**
 * @author : zsun
 * @date : 2019/12/16 20:27
 */
public class CanStopThread {
    public static void main(String[] args) {
        try {
            MyThread1 thread = new MyThread1();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("End!");
    }
}
