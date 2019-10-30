package com.zsun.java.quartz.Jobs;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by zsun.
 * DateTime: 2019/10/30 15:05
 *
 * @author zsun
 */
public class SimpleJobWithArgs implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();

        String name = jobDataMap.getString("name");
        int age = jobDataMap.getInt("age");

        System.out.println("My name is " + name + ", and I am " + age + " years old.");
    }
}
