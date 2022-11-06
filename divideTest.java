package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		double output=test.divide(4,2);
		assertEquals(2,output,0.001);
		
	}

}
