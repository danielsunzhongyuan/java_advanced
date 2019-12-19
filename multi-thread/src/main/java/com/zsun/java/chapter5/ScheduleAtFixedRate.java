package com.zsun.java.chapter5;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by qzou at 2019-12-19 22:38
 *
 * @author qzou
 */
public class ScheduleAtFixedRate {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        System.out.println("NOW  time = " + new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) +2 );
        Date runDate = calendar.getTime();
        System.out.println("PLAN time = " + runDate);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTask, runDate, 2000);
    }
}

class MyTask extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("begin timer = " + new Date());
            int millis = new Random().nextInt(3) + 1;
            System.out.println("sleep " + millis + " seconds");
            Thread.sleep(millis * 1000L);
            System.out.println("  end timer = " + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
