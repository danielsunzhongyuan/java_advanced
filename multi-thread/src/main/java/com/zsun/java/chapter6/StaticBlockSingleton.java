package com.zsun.java.chapter6;

/**
 * Created by qzou at 2019-12-21 00:30
 *
 * @author qzou
 */
public class StaticBlockSingleton {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();
        MyThread4 t3 = new MyThread4();
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyObject4 {
    private static MyObject4 myObject = null;

    static {
        myObject = new MyObject4();
    }

    private MyObject4() {
    }

    public static MyObject4 getInstance() {
        return myObject;
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject4.getInstance().hashCode());
        }
    }
}
