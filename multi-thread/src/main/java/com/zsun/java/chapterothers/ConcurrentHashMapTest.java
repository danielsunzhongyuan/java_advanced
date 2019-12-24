package com.zsun.java.chapterothers;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by qzou at 2019-12-23 23:23
 *
 * @author qzou
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyService.record();
            }
        };
        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                MyService.report();
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
        Thread.sleep(7000);

        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}

class MyService {
    private static ConcurrentHashMap<String, AtomicLong> statMap = new ConcurrentHashMap<>();

    public static void record() {
        for (int i = 0; i < 100; i++) {
            AtomicLong a = statMap.get("a");
            if (a == null) {
                synchronized (statMap) {
                    AtomicLong b = statMap.get("a");
                    if (b == null) {
                        statMap.put("a", new AtomicLong(1L));
                    } else {
                        b.incrementAndGet();
                    }
                }
            } else {
                a.incrementAndGet();
            }
        }
    }

    public static void report() {
        try {
            while (true) {
                Thread.sleep(5000);
                Iterator<Map.Entry<String, AtomicLong>> iterator = statMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, AtomicLong> next = iterator.next();
                    System.out.println(next.getKey() + " " + next.getValue().getAndSet(0L));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
