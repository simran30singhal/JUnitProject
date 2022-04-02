package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {
	
	
	@BeforeAll
	public static void SetUp() {
		
		System.setProperty("ENV", "PROD");
	}
	
	
	@Test
	public void Test1() {
		
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrome("MADAM"));
	}
	
	
}
