package com.va.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class RunMeJob extends QuartzJobBean {
	ExampleBusinessObject exampleBusinessObject;

	public ExampleBusinessObject getExampleBusinessObject() {
		return exampleBusinessObject;
	}

	public void setExampleBusinessObject(
			ExampleBusinessObject exampleBusinessObject) {
		this.exampleBusinessObject = exampleBusinessObject;
	}

	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		exampleBusinessObject.doItAgain();
	}
}
