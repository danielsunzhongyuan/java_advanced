package com.zsun.java.chapter2;

/**
 * @author : zsun
 * @date : 2019/12/17 20:30
 */
public class Sub extends Main {
    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub next step: sleep begin threadName=" + Thread.currentThread().getName() + ", time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub next step: sleep end threadName=" + Thread.currentThread().getName() + ", time=" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
