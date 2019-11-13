package com.zsun.java.quartz;

import com.zsun.java.quartz.Jdbc.SqliteConnection;
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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try (Connection connection = SqliteConnection.getConnection();
             Statement statement = connection.createStatement()) {
//            String sql = "CREATE TABLE COMPANY " +
//                "(ID INT PRIMARY KEY     NOT NULL," +
//                " NAME           TEXT    NOT NULL, " +
//                " AGE            INT     NOT NULL, " +
//                " ADDRESS        CHAR(50), " +
//                " SALARY         REAL)";
//            statement.executeUpdate(sql);

            String sql = "insert into company (ID, NAME, AGE, ADDRESS, SALARY) values (1, 'PAUL', 32, 'California', 20000);";
//            statement.executeUpdate(sql);

            sql = "select * from company2";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");
                System.out.println("ID = " + id);
                System.out.println("Name = " + name);
                System.out.println("Age = " + age);
                System.out.println("Address = " + address);
                System.out.println("Salary = " + salary);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        final String group1 = "group1";
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;
        try {
            scheduler = schedulerFactory.getScheduler();
            JobDetail simpleJob = JobBuilder.newJob(SimpleJob.class)
                .withIdentity("simpleJob", group1)
                .build();

            JobDetail simpleJobWithArgs = JobBuilder.newJob(SimpleJobWithArgs.class)
                .withIdentity("simpleJobWithArgs", group1)
                .usingJobData("name", "zsun")
                .usingJobData("age", 30)
                .build();

            Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger", group1)
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
