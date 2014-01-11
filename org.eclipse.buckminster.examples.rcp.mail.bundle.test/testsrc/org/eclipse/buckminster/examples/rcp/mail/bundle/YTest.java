package org.eclipse.buckminster.examples.rcp.mail.bundle;

import static org.junit.Assert.*;

import org.junit.Test;

public class YTest {

	@Test
	public void testGetY() {
		Y y = new Y();
		if (!y.getY().equals("Y"))
			fail(y.getY() + " should be Y");
	}
}
