package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	@Test
	public void addTest1() {
		
		System.out.println("Inside Test1");
		assertEquals(9,Calculator.add(5, 4));
	}
	
	@Test
	public void addTest2() {
		
		System.out.println("Inside Test2");
		assertEquals(9,Calculator.add(4, 5));
	}
	
	
	@BeforeEach
	public void method1() {
		
		System.out.println("Inside Before Each");
	}
	
	@AfterEach
	public void method2() {
		
		System.out.println("Inside After Each");
	}
	
	@BeforeAll
	public static void method3() {
		
		System.out.println("Inside Before All");
	}
	
	@AfterAll
	public static void method4() {
			
		System.out.println("Inside After All");
	}
}
