package main;
import java.util.Scanner;

public class Calculator {
	static double nb_1, nb_2, res;
	static String op, answer;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (!answer().equals("no")) {
		System.out.println("Please enter the operation symbol as + - * /");
		op = sc.nextLine();
		System.out.println("Please enter the first number");
		nb_1 = sc.nextInt();
		System.out.println("Please enter the second number");
		nb_2 = sc.nextInt();
		
		if 		(op.equals("+")) { 	
			System.out.println("The result is :" + add(nb_1, nb_2)); 
		}
		else if (op.equals("-")) { 	
			System.out.println("The result is :" + substract(nb_1, nb_2));			
		}
		else if (op.equals("*")) { 	
			System.out.println("The result is :" + multiply(nb_1, nb_2));	
		}
		else if (op.equals("/")) { 	
			System.out.println("The result is :" + divide(nb_1, nb_2)); 
		}}
		System.out.print("Bye !");
		}
	public static double add(double nb_1, double nb_2) {
		res = nb_1 + nb_2;
		return res;
	}
	public static double substract(double nb_1, double nb_2) {
		res = nb_1 - nb_2;
		return res;
	}
	public static double multiply(double nb_1, double nb_2) {
		res = nb_1 * nb_2;
		return res;
	}
	public static double divide(double nb_1, double nb_2) {
		res = nb_1 / nb_2;
		return res;
	}
	public static String answer() {
		System.out.println("Do you want to continue ?"); 
		answer = sc.nextLine();
		if (answer.equals("no")) {
			answer = "no";
			return answer;	}
		return answer;
	}

}	
