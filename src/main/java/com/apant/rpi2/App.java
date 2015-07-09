package com.apant.rpi2;

import org.apache.log4j.Logger;

public class App {
	private static Logger logger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		ControlGpio cg = new ControlGpio();
		try {
			if (logger.isDebugEnabled()) {
				logger.info("Trying to start pulsar");
			}
			cg.runPulsar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
