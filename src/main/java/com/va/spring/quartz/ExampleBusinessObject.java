package com.va.spring.quartz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleBusinessObject {
	
	private static Logger logger = LogManager.getLogger();

	public void doIt() {
		logger.info("doIt() ran");
	}
	
	public void doItAgain() {
		logger.info("doItAgain() ran");
	}
}
