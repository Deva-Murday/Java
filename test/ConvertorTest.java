package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.Convertor;


public class ConvertorTest {
	String answer = "yes";
	double number = 150;
	
	
	@Test
	public final void testMain() {
		assertNotNull("Empty", number);
	}
	@Test
	public final void testMoney() {
	assertEquals("",103,5,Convertor.money(number));
	}
	@Test
	public final void testDistance() {
	assertEquals("",150000,Convertor.distance(number),0.0);
	}
	@Test
	public final void testTemperature() {
		assertEquals("",302,Convertor.temperature(number),0.01);
	}
	
	@Test
	public final void testAnswer() {	
	assertNotNull("Empty", answer == "");
	}

}
