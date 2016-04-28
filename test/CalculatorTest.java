package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	double nb_1 = 2;
	double nb_2 = 3;
	String answer = "no";
	
	@Test
	public final void testMain() {
		assertNotNull("Empty", nb_1);
		assertNotNull("Empty", nb_2);
	}
	@Test
	public final void testMultiply() {
		assertEquals("Wrong multiply",6.0,Calculator.multiply(nb_1,nb_2),0.0);
		
	}
	@Test
	public final void testAdd() {
		assertEquals("Wrond add",5,Calculator.add(nb_1, nb_2),0.0);
	}
	@Test
	public final void testSubstract() {
		assertEquals("Wrong substract",-1,Calculator.substract(nb_1, nb_2),0.00);
	}
	@Test
	public final void testDivide() {
		assertEquals("Wrong divide",0.66,Calculator.divide(nb_1, nb_2),0.01);
	}

	@Test
	public final void testAnswer() {
		assertTrue("You must say yes or no !", answer.equals("yes") || answer.equals("no"));
		assertNotNull("Empty", answer == "");
	}

}
