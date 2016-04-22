package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	double nb_1 = 18;
	double nb_2 = 3;
	String answer = "no";
	String op = "+";
	
	@Test
	public final void testMain() {
		assertTrue("You can only add, multiply, divide or substract !", op.equals("+") || op.equals("*")|| op.equals("/")|| op.equals("-"));
		assertNotNull("Empty", op == "");
		assertNotNull("Empty", nb_1);
		assertNotNull("Empty", nb_2);
	}
	@Test
	public final void testMultiply() {
		assertTrue("Unable to multiply with 0", nb_1 != 0.0);
		assertTrue("Unable to multiply with 0", nb_2 != 0.0);
		
	}
	@Test
	public final void testDivide() {
		assertTrue("Unable to divide with 0", nb_1 != 0.0);
		assertTrue("Unable to divide with 0", nb_2 != 0.0);
	}

	@Test
	public final void testAnswer() {
		assertTrue("You must say yes or no !", answer.equals("yes") || answer.equals("no"));
		assertNotNull("Empty", answer == "");
	}

}
