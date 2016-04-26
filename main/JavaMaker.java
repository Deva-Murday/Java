package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import main.Answer;

public class JavaMaker {
	static String var1, file, javaclass, javatype, javamain, javapackage, answer ;

public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Hi, do you want to continue editing your class or start from scratch ?");
	answer = sc.nextLine();
	System.out.println("What is the name of the Java Class ?");
	javaclass = sc.nextLine();
	file = "C:/Users/Devilz/Desktop/Cours/DUT R&T/Bergen/Java/Git/Practice/main/" + javaclass + ".java";
	if (answer.equals("edit")) {}
	else if (!answer.equals("edit")) {	scratch(file);}
}

public static void scratch(String file) throws IOException {
	BufferedWriter bws = new BufferedWriter(new FileWriter(file));
	Scanner scs = new Scanner(System.in);
	
	System.out.println("What is the package of the Java Class ?");
	javapackage = scs.nextLine();
	bws.write ("package " + javapackage +";");
	bws.write ("\r\n");
	System.out.println("Your class is public or private ?");
	javatype = scs.nextLine();
	bws.write(javatype + " class " + javaclass + "{");	
	bws.write ("\r\n");
	
	
	while (!(Answer.answer().equals("no"))) {
	while (!(Answer.answerVariable().equals("no"))) {
		String var1value;
		System.out.println("Insert your variable and it type as '<type> variable' ");
		var1 = scs.nextLine();
		System.out.println("Do you want to add a value to " + var1);			
		answer = scs.nextLine();
		if (answer.equals("no")) {
			bws.write ("\t" + "static " + var1 + ";");	
			bws.write ("\r\n");
		}
		else {
			System.out.println("What is the value ?");
			var1value = scs.nextLine();
			bws.write ("\t" + "static " + var1 + " = " + var1value +";");
			bws.write ("\r\n");
		}	
	}
	
	System.out.println("Does your class contains a 'public static void main(String[] args)' ?");
	answer = scs.nextLine();
	if (answer.equals("yes")) {
		bws.write(javatype + " static void main(String[] args) {");
		bws.write ("\r\n"); }
	
	System.out.println("Does your class contains a Scanner ?");
	answer = scs.nextLine();
	if (answer.equals("yes")) {
		System.out.println("What is the name of the Scanner ?");
		String scannername = scs.nextLine();
		bws.write("Scanner " + scannername + "= new Scanner(System.in)");
		bws.write ("\r\n"); }
	
	while (!(Answer.answerPrintln().equals("no"))) {
		System.out.println("What is the message ?");
		String msg = scs.nextLine();
		bws.write ("\t" + "System.out.println(" +msg+ ");");
		bws.write ("\r\n");	}
	}
	
	
    System.out.println("Bye !");
    if (answer.equals("yes")) { bws.write("\t" + "}"); }
    bws.write ("\r\n" + "}");
    bws.close();
	}
}









