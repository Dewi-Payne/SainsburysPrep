package testCases;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.Before;

public class TestCase01 {
	@Before
	private static void setUp() {
		assertEquals(true, false);	
	}
	
}
