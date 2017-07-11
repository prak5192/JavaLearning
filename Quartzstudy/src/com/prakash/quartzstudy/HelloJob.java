package com.prakash.quartzstudy;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job{
	 	public HelloJob() {
	    }

	    public void execute(JobExecutionContext context)
	      throws JobExecutionException
	    {
	      System.out.println("DumbJob is executing.");
	      for (int i = 0; i< 10; i++){
	    	  System.out.println(i);
	    	  
	      }
	    }
}
