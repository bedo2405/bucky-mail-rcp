package org.eclipse.buckminster.examples.rcp.mail.bundle;

import org.apache.log4j.Logger;

public class X {
	private static final Logger logger = Logger.getLogger(X.class);
	
	public String getX() {
		logger.trace("getX()");
		return "X";
	}
	
}
