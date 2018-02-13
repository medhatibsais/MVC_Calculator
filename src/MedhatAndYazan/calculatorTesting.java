package MedhatAndYazan;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTesting {

	CalculatorModel modelTest=new CalculatorModel();
	CalculatorView viewTest=new CalculatorView();
	
	@Test
	public void test() {

		
		assertEquals(6, modelTest.Add(1,5),0.00001);
		assertEquals(-4, modelTest.Subtract(1,5),0.00001);
		assertEquals(20, modelTest.Multiply(4,5),0.00001);
		assertEquals(-2, modelTest.Divide(1,0),0.00001);
		assertEquals(-2, modelTest.Mod(1,0),0.00001);
		assertEquals(6, modelTest.MySqrt(36),0.00001);
		assertEquals(-2, modelTest.MySqrt(-36),0.00001);

		
	}


}
