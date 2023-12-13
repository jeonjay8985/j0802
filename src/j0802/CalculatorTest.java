package j0802;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test                                //@=annotation
	void testSum() {
		Calculator cal=new Calculator();
		assertEquals(30, cal.sum(10, 20));
		assertEquals(300, cal.mul(10, 30));
		assertEquals(5050, cal.for1(1, 100));
	}

	
}
