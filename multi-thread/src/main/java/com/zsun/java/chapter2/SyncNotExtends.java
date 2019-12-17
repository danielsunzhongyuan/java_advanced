package com.zsun.java.chapter2;

/**
 * @author : zsun
 * @date : 2019/12/17 20:28
 */
public class SyncNotExtends {

    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThread1 myThread1 = new MyThread1(subRef);
        myThread1.setName("A");
        myThread1.start();

        MyThread1 myThread2 = new MyThread1(subRef);
        myThread2.setName("B");
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    private Sub sub;

    public MyThread1(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}