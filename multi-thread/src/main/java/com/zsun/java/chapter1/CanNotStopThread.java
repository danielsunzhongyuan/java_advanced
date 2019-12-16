package com.zsun.java.chapter1;

/**
 * @author : zsun
 * @date : 2019/12/16 20:07
 */
public class CanNotStopThread {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();

            // false false
            System.out.println("stopped? 1 = " + myThread.interrupted());
            System.out.println("stopped? 2 = " + myThread.interrupted());

            // true true
            System.out.println("stopped? 3 = " + myThread.isInterrupted());
            System.out.println("stopped? 4 = " + myThread.isInterrupted());

            // false false
            System.out.println("stopped? 5 = " + Thread.interrupted());
            System.out.println("stopped? 6 = " + Thread.interrupted());

            Thread.currentThread().interrupt();
            // *** true false ***
            System.out.println("stopped? 7 = " + Thread.interrupted());
            System.out.println("stopped? 8 = " + Thread.interrupted());

        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
