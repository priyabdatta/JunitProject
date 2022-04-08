package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
public class StringFunctionTest {
	
	@Tag("Sanity")
	@DisplayName("positive Test")
	@Test
	public void test1() {
		assertTrue(StringFunction.isPalindrome("madam"));
		assertTrue(StringFunction.isPalindrome("racecar"));
		
	}
	
	@CustomAnnotation
	public void test2() {
		assertFalse(StringFunction.isPalindrome("priya"));
		
	}

}
