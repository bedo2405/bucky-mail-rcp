package org.eclipse.buckminster.examples.rcp.mail.bundle;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomethingTest {

	@Test
	public void testGetX() {
		Something something = new Something();
		if (!something.getX().equals("X"))
			fail(something.getX() + " should be X");
	}

}
