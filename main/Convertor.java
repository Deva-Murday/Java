package main;

import java.util.Scanner;

public class Convertor {

	public static void main(String[] args) {
		double number;
		double number22;
		String convertor;
		
	while (!answer().equals("no")) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to convert money, temperature or distance");
		convertor = sc.nextLine();		
		System.out.println("Enter your value");
		number= sc.nextInt();
		
		if (convertor.equals("money")) {
			System.out.println("The result is :" + money(number));
		} 
		
		else if (convertor.equals("temperature")) {
			System.out.println("The result is :" + temperature(number)); 	
		}
		else if (convertor.equals("distance")) {
			System.out.println("The result is :" + distance(number)); 	
		}
	}
	System.out.println("Bye !");
}
	
	public static double money(double number) {
		String unit;
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your money is in USD $, GBP £, NOK Krone or Euros € ?");
		unit = sc.nextLine();
		System.out.println("In which money to you want to convert it ?");
		res = sc.nextLine();
		
		while (unit.equals("dollar") || unit.equals("$") || unit.equals("Dollar")) {
			if (res.equals("pound") || res.equals("£") || res.equals("Pound")) 	
				{number = number * 0.69; }
			else if (res.equals("euros") || res.equals("€") || res.equals("Euros")) 	
				{number = number * 0.88;}
			else if (res.equals("krone") || res.equals("NOK") || res.equals("Krone")) 	
				{number = number * 8.12;}
			return number;	
		}
		while (unit.equals("euros") || unit.equals("€") || unit.equals("Euros")) {
			if (res.equals("pound") || res.equals("£") || res.equals("Pound")) 	 	
				{number = number * 0.78;}
			else if (res.equals("dollar")|| res.equals("$") || res.equals("Dollar")) 
				{number = number * 1.13;}
			else if (res.equals("krone") || res.equals("NOK") || res.equals("Krone"))
				{number = number * 9.18;}
			return number;
		}
		while (unit.equals("pound") || unit.equals("£") || unit.equals("Pound")) {
			if (res.equals("krone") || res.equals("NOK") || res.equals("Krone"))	
				{number = number * 11.67;}
			else if (res.equals("dollar")|| res.equals("$") || res.equals("Dollar"))  
				{number = number * 1.43;}
			else if (res.equals("euros") || res.equals("€") || res.equals("Euros")) 
				{number = number * 1.26;}
			return number;
		}
		while (unit.equals("krone") || unit.equals("NOK")  || unit.equals("Krone")) {
			if (res.equals("pound") || res.equals("£") || res.equals("Pound")) 		
				{number = number / 11.67;}
			else if (res.equals("dollar")|| res.equals("$") || res.equals("Dollar"))   
				{number = number / 8.12;}
			else if (res.equals("euros") || res.equals("€") || res.equals("Euros")) 
				{number = number / 9.18;}
			return number;
		}
		return number;
	}
	public static String distance(double number) {
	String unit;
	String res;
	Scanner sc = new Scanner(System.in);
	System.out.println("Your distance is in km, m, cm or mm ?");
	unit = sc.nextLine();
	System.out.println("In which metric to you want to convert it ?");
	res = sc.nextLine();
	
	while (unit.equals("km")) {
		if(res.equals("m")) { number = number * 1000; }
		else if(res.equals("cm")) { number = number * 100000; }
		if(res.equals("m")) { number = number * 1000000; }
		return number + res;
	}
	while (unit.equals("m")) {
		if(res.equals("km")) { number = number * 0.001; }
		else if(res.equals("cm")) { number = number * 1000; }
		if(res.equals("mm")) { number = number * 1000; }
		return number + res;
	}
	while (unit.equals("cm")) {
		if(res.equals("km")) { number = number * 0.00001; }
		else if(res.equals("m")) { number = number * 0.01; }
		if(res.equals("mm")) { number = number * 10; }
		return number + res;
	}
	while (unit.equals("mm")) {
		if(res.equals("km")) { number = number * 0.000001; }
		else if(res.equals("m")) { number = number * 0.001; }
		if(res.equals("cm")) { number = number * 0.1; }
		return number + res;
	}
	return number + res;	
	}
	public static String temperature(double number) {
	String unit;
	Scanner sc = new Scanner(System.in);
	System.out.println("Your measure is in Celsuis or Fahrenheit ?");
	unit = sc.nextLine();
	if (unit.equals("celsuis") | unit.equals("°C") | unit.equals("Celsuis")) {	
		number = number - 32;
		number = number *5;
		number = number / 9;
		return number + "°F"; }
	else {
		number = number * 1.8;
		number = number +32;
		return number + "°C"; }
	}
	
	public static String answer() {
		String answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to continue ?"); 
		answer = sc.nextLine();
		if (answer.equals("no")) {
			answer = "no";
			return answer;	}
		return answer;
	}

}
