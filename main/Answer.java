package main;

import java.util.Scanner;

public class Answer {
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
	public static String answerVariable() {
		String answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add another variable ?"); 
		answer = sc.nextLine();
		if (answer.equals("no")) {
			answer = "no";
			return answer;	}
		return answer;
	}
	public static String answerPrintln() {
		String answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add another System.out.println ?"); 
		answer = sc.nextLine();
		if (answer.equals("no")) {
			answer = "no";
			return answer;	}
		return answer;
	}
}
