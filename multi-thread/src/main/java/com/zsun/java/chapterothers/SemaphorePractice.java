package com.zsun.java.chapterothers;

import java.util.concurrent.Semaphore;

/**
 * @author : zsun
 * @date : 2020/01/07 15:03
 */
public class SemaphorePractice {
    public static void main(String[] args) {
        int n = 8;
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < n; i++) {
            new Worker2(i, semaphore).start();
        }
    }

    static class Worker2 extends Thread {
        private int num;
        private Semaphore semaphore;

        public Worker2(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                System.out.println("worker " + num + " is waiting");
                semaphore.acquire();
                System.out.println("worker " + num + " is working");
                Thread.sleep(2000);
                System.out.println("worker " + num + " releases");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
