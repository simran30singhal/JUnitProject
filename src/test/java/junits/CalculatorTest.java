package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	
	@Test
	public void addTest1() {
		
		
		assertEquals(9,Calculator.add(5, 4));
	}
	
	@Test
	public void subTest2() {
		
		
		assertEquals(1,Calculator.sub(5, 4));
	}
	
}
