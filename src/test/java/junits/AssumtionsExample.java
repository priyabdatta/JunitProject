package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumtionsExample {
	
	@BeforeAll
	public static void SetUp() {
		System.setProperty("ENV","DEV");
		
	}
	
	
	@Test
	public void test1() {
		

		assumeFalse("DEV".equals(System.getProperty("ENV")));
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunction.isPalindrome("madam"));
		assertTrue(StringFunction.isPalindrome("racecar"));
		
	}

}
