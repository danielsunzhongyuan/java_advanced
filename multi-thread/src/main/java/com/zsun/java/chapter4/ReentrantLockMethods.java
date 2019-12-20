package com.zsun.java.chapter4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : zsun
 * @date : 2019/12/19 18:11
 */
public class ReentrantLockMethods {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }
}

class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("ServiceMethod 1 getHoldCount = " + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
            System.out.println("ServiceMethod 1 getHoldCount = " + lock.getHoldCount());
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("ServiceMethod 2 getHoldCount = " + lock.getHoldCount());
        } finally {
            lock.unlock();
            System.out.println("ServiceMethod 2 getHoldCount = " + lock.getHoldCount());
        }
    }
}