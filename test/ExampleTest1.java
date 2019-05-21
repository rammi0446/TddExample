import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		EvenNumber x = new EvenNumber();
		boolean actualOutput = x.isEven(2);
		assertEquals(true,actualOutput);
				
				
	}

}
