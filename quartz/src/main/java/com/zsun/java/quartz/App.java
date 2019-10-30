package com.zsun.java.quartz;

import com.zsun.java.quartz.Jobs.SimpleJob;
import com.zsun.java.quartz.Jobs.SimpleJobWithArgs;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final String GROUP1 = "group1";
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;
        try {
            scheduler = schedulerFactory.getScheduler();
            JobDetail simpleJob = JobBuilder.newJob(SimpleJob.class)
                .withIdentity("simpleJob", GROUP1)
                .build();

            JobDetail simpleJobWithArgs = JobBuilder.newJob(SimpleJobWithArgs.class)
                .withIdentity("simpleJobWithArgs", GROUP1)
                .usingJobData("name", "zsun")
                .usingJobData("age", 30)
                .build();

            Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger", GROUP1)
                // 把 startNow 去掉，还是会立即执行一下
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(5)
                    // 这里的count不包括立马执行的那一次
                    .withRepeatCount(5))
                .build();

            Trigger trigger2 = TriggerBuilder.newTrigger()
                .withIdentity("cronTrigger", "group1")
                .withSchedule(CronScheduleBuilder
                    .cronSchedule("0/10 * * * * ?")).build();

            scheduler.scheduleJob(simpleJob, trigger2);
            scheduler.scheduleJob(simpleJobWithArgs, trigger);
            scheduler.start();

            Thread.sleep(15 * 1000L);
        } catch (SchedulerException e) {
            System.out.println("Hello World!");
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
            System.out.println(e);
        } finally {
            if (scheduler != null) {
                try {
                    scheduler.shutdown();
                } catch (SchedulerException e) {
                    System.out.println("shutdown in finally failed");
                    System.out.println(e);
                }
            }
        }
    }
}
