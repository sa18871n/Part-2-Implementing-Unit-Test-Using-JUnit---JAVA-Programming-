package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	void negativetest() {
		JunitTesting test=new JunitTesting();
		Exception exception=assertThrows(ArithmeticException.class,() -> test.divide(1,0));
		assertEquals("divide by 0",exception.getMessage());
		
		assertTrue(exception.getMessage().contains("zero"));
		
		
	}
	@Test
	void positiveTest(){
		JunitTesting test=new JunitTesting();
		double output=test.divide(4,2);
		assertEquals(2,output,0.001);
	}

}
