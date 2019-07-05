package com.zsun.java.tij.chapter21;

/**
 * Created by zsun.
 * DateTime: 2019/07/05 10:08
 *
 * @author zsun
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private static final int ID = taskCount++;
    private String[] results;

    public LiftOff() {
        results = new String[countDown];
    }

    public LiftOff(int countDown) {
        if (countDown >= 1) {
            this.countDown = countDown;
        }
        this.results = new String[this.countDown];
    }

    private String status() {
        return "#" + ID + "(" + (countDown > 0 ? countDown : "LiftOff!") + ").";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            results[countDown] = status();
            Thread.yield();
        }
    }

    public String[] getResults() {
        return results.clone();
    }
}
