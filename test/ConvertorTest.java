package test;

import static org.junit.Assert.*;
import org.junit.Test;


public class ConvertorTest {
	String answer = "yes";
	double number = 150;
	String convertor = "temperature";
	
	
	@Test
	public final void testMain() {
		assertTrue("You can only convert money, temperature or distance", convertor.equals("money") || convertor.equals("temperature") || convertor.equals("distance"));
		assertNotNull("Empty", number);
		assertFalse("Empty", convertor == "");
	}
	@Test
	public final void testMoney() {
	String unit = "NOK";
	String res = "dollar";
	assertTrue("You can only convert money with USD $ , GBP Pound, Norway NOK and Euros €", 
			unit.equals("dollar") 	|| unit.equals("$") 		|| unit.equals("Dollar") 	|| 
			unit.equals("euros") 	|| unit.equals("€") 		|| unit.equals("Euros") 	|| 
			unit.equals("krone") 	|| unit.equals("NOK")  		|| unit.equals("Krone") 	||
			unit.equals("pound") 	|| unit.equals("£") 		|| unit.equals("Pound"));
		
	assertTrue("You can only convert money with USD $ , GBP Pound, Norway NOK and Euros €", 
			res.equals("dollar")	|| res.equals("$") 		|| res.equals("Dollar") 		|| 
			res.equals("euros") 	|| res.equals("€") 		|| res.equals("Euros") 			|| 
			res.equals("krone") 	|| res.equals("NOK")  	|| res.equals("Krone") 			||
			res.equals("pound") 	|| res.equals("£") 		|| res.equals("Pound"));
		
	assertFalse("Empty", unit == "");
	assertFalse("Empty", res == "");
	}
	@Test
	public final void testDistance() {
	String unit = "m";
	String res = "km";
	assertTrue("You can only convert km, m, cm or mm", 
			unit.equals("km") 	|| unit.equals("kilometers") 		|| 
			unit.equals("m") 	|| unit.equals("meters") 			||  
			unit.equals("cm") 	|| unit.equals("centimeters")  		|| 
			unit.equals("mm") 	|| unit.equals("milimeters") 		);
	assertTrue("You can only convert money km, m, cm or mm", 
			res.equals("km") 	|| res.equals("kilometers") 		|| 
			res.equals("m") 	|| res.equals("meters") 			||  
			res.equals("cm") 	|| res.equals("centimeters")  		|| 
			res.equals("mm") 	|| res.equals("milimeters") 		);

	assertFalse("Empty", unit == "");
	assertFalse("Empty", res == "");
	}
	@Test
	public final void testTemperature() {
	String unit = "°F";
	assertTrue("You can only convert Celcuis or Fahrenheit", 
			unit.equals("celsuis") || unit.equals("°C") || unit.equals("Celsuis") ||
			unit.equals("fahrenheit") || unit.equals("°F") || unit.equals("Fahrenheit"));
	assertNotNull("Empty", number);
	assertFalse("Empty", unit == "");
	}
	
	@Test
	public final void testAnswer() {	
	assertTrue("You must say yes or no !", answer.equals("yes") || answer.equals("no"));
	assertNotNull("Empty", answer == "");
	}

}
