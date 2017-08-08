/**
 * @author Eric Wayman
 */

package com.searchincite.server.data;

import org.quartz.CronExpression;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class AutofeedCronTriggerRunner {

	public void task() throws SchedulerException
	{
		// Initiate a Schedule Factory
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		// Retrieve a scheduler from schedule factory
		Scheduler scheduler = schedulerFactory.getScheduler();
		
		// Initiate JobDetail with job name, job group, and executable job class
		JobDetail jobDetail = 
				new JobDetail("jobAutofeedFetcher", "jobAutofeedFetcherGroup", AutofeedFetcherJob.class);
		// Initiate CronTrigger with its name and group name
		CronTrigger cronTrigger = new CronTrigger("cronTrigger", "cronTriggerGroup");
		try {
			// setup CronExpression
			CronExpression cexp = new CronExpression("0 * * * * ?");
			// Assign the CronExpression to CronTrigger
			cronTrigger.setCronExpression(cexp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// schedule a job with JobDetail and Trigger
		scheduler.scheduleJob(jobDetail, cronTrigger);

		// start the scheduler
		scheduler.start();
	}
}