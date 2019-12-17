package com.zsun.java.chapter2;

/**
 * @author : zsun
 * @date : 2019/12/17 20:28
 */
public class Main {
    public synchronized void serviceMethod() {
        try {
            System.out.println("int main next step: sleep begin threadName=" + Thread.currentThread().getName() + ", time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main next step: sleep end threadName=" + Thread.currentThread().getName() + ", time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
