package com.zsun.java.chapter6;

/**
 * Created by qzou at 2019-12-20 23:20
 *
 * @author qzou
 */
public class SimpleStaticInnerClassSingleton {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyObject2 {
    private static class MyObjectHandler {
        private static MyObject2 myObject = new MyObject2();
    }

    private MyObject2() {
    }

    public static MyObject2 getInstance() {
        return MyObjectHandler.myObject;
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject2.getInstance().hashCode());
    }
}
