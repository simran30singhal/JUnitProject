package junits;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	
	
	@TestFactory
	public List<DynamicTest> Method1(){
		
		return Arrays.asList(
				DynamicTest.dynamicTest("Positive Test", ()-> assertTrue(StringFunctions.isPalindrome("MADAM"))),
				DynamicTest.dynamicTest("Negative Test", ()-> assertFalse(StringFunctions.isPalindrome("Simran"))));
	}
}
