package com.zsun.java.chapter2;

/**
 * Created by qzou at 2019-12-17 23:55
 *
 * @author qzou
 */
public class VolatileWithServer {
    public static void main(String[] args) {
        System.out.println("dfk");
    }
}

class RunThread extends Thread {
    private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
}
