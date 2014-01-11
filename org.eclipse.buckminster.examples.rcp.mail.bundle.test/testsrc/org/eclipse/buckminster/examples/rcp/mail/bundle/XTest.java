package org.eclipse.buckminster.examples.rcp.mail.bundle;

import static org.junit.Assert.*;

import org.junit.Test;

public class XTest {

	@Test
	public void testGetX() {
		X x = new X();
		if (!x.getX().equals("X"))
			fail(x.getX() + " should be X");
	}

}
