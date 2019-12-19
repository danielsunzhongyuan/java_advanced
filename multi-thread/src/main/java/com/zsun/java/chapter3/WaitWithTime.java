package com.zsun.java.chapter3;

/**
 * @author : zsun
 * @date : 2019/12/18 15:00
 */
public class WaitWithTime {
    private static Object lock = "123";
    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer = " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end timer = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable);
        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized ("123") {
                        System.out.println("lock 123 for 10 seconds, begin: " + System.currentTimeMillis());
                        Thread.sleep(10000);
                        System.out.println("lock 123 for 10 seconds, end: " + System.currentTimeMillis());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}

