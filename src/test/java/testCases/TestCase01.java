package testCases;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase01 {
	@Test
	public void test01() {
		assertEquals(true, true);
	}
	
	public void test02() {
		assertEquals(true, false);
	}
}
