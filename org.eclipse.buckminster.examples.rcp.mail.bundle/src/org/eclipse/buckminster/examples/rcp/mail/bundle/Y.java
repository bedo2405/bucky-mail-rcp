package org.eclipse.buckminster.examples.rcp.mail.bundle;

import org.apache.log4j.Logger;

public class Y {

	private static final Logger logger = Logger.getLogger(Y.class);

	public String getY() {

		logger.trace("getY()");

		return "Y";
	}
}
