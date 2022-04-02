package packageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {
	
	

	@Tag("Sanity")
	@Test
	public void TestB() {
		
		System.out.println("Inside Test B");
	}
}
