package junits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	
	@ParameterizedTest
	@ValueSource(strings= {"radar","madam"})
	public void Test1(String name) {
		
		assertTrue(StringFunctions.isPalindrome(name));
		
	}
	

	@ParameterizedTest
	@ValueSource(ints= {4,8,6,2})
	public void Test2(int num) {
		
		assertTrue(num%2==0);
		
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void Test3(Month month) {
		
		int monthVal=month.getValue();
		System.out.println(month.name() + "-"+monthVal);
		assertTrue(monthVal<=12);
		
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class,names= {"APRIL","JUNE","SEPTEMBER","NOVEMBER"})
	public void Test4(Month month) {
		

		assertEquals(30,month.length(false));
		
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class,names= {"FEBRUARY"})
	public void Test5(Month month) {
		

		assertEquals(28,month.length(false));
		
	}
	
	@ParameterizedTest
	@MethodSource("dpmethod")
	public void Test6(String name) {
		
		assertTrue(StringFunctions.isPalindrome(name));
		
	}
	
	public static Stream<String> dpmethod() {
		
		return Stream.of("radar","mom","dad","racecar");
	}
}
