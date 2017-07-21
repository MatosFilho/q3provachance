package q3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests {

	Matematica mat; 
	
	@Before
	public void setUp() {
		mat = new Matematica();
	}

	@Test
	public void testeFibonaccis() {
		assertEquals(mat.fibonacci(5), 5);
		assertEquals(mat.fibonacci(0), 0);
		assertEquals(mat.fibonacci(1), 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeFibonacciNegativo() {
			mat.fibonacci(-3);
	}	
	
}
