package Quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuartzMain {
    private final static Logger LOGGER = Logger.getLogger(QuartzMain.class.getName());

    public static void main(String[] args) {
        try {
            JobDetail job = JobBuilder.newJob(QuartzJob.class).build();
            Trigger t1 = TriggerBuilder
                    .newTrigger()
                    .withIdentity("CronTrigger")
                    .withSchedule(SimpleScheduleBuilder
                            .simpleSchedule()
                            .withIntervalInSeconds(05)
                            .repeatForever())
                    .build();
            Scheduler sc = StdSchedulerFactory.getDefaultScheduler();
//        sc.start();
//        sc.shutdown();
            sc.scheduleJob(job, t1);
            LOGGER.info("Quartz start...");
            sc.start();

            Thread.sleep(20 * 1000);
            LOGGER.info("Quartz standby...");
            sc.standby();
//            System.out.println("Quartz paused/shutdown");

            Thread.sleep(10 * 1000);
            LOGGER.info("Quartz start again...");
            sc.start();
//            System.out.println("Quartz start again");

        } catch (InterruptedException | SchedulerException e) {
//            e.printStackTrace();
            LOGGER.log(Level.INFO, "Got an exception.", e);
        }
    }
}
