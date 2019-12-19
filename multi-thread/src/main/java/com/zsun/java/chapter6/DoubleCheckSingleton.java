package com.zsun.java.chapter6;

/**
 * Created by qzou at 2019-12-19 23:44
 *
 * @author qzou
 */
public class DoubleCheckSingleton {
    private static final int THREADS = 1000;

    public static void main(String[] args) {
        MyThread[] x = new MyThread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            x[i] = new MyThread();
        }
        for (int i = 0; i < THREADS; i++) {
            x[i].start();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

class MyObject {
    private volatile static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            if (myObject == null) {
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
