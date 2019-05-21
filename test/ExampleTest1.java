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
	public void testeven() {
		EvenNumber x = new EvenNumber();
		boolean actualOutput = x.isEven(2);
		assertEquals(true,actualOutput);
	}
	
	@Test
	public void testOdd() {
		EvenNumber x = new EvenNumber();
		boolean actualOutput = x.isEven(2);
		assertEquals(false,actualOutput);
	}
	
	@Test
	public void testLessThan1() {
		EvenNumber x = new EvenNumber();
		boolean actualOutput = x.isEven(0);
		System.out.println("function ouput" +x.isEven(0));
		assertEquals(true,actualOutput);
	}

}
