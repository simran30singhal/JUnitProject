package packageA;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

public class ClassATest {
	
	
	@Tag("Sanity")
	@Test
	public void TestA() {
		
		System.out.println("Inside Test A");
	}
}
