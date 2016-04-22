package main;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		String c;
		System.out.println("Please enter numbers");
		
		Scanner sc = new Scanner(System.in);
		c = sc.nextLine();
		char[] ar = c.toCharArray();
		Arrays.sort(ar);
		c = Arrays.toString(ar);
		System.out.println("The result is " + c);
	}
}
