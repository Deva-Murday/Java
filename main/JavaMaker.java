package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import main.Answer;

public class JavaMaker {
	static String file;
	static String var1 = " ";
	static String javaclass, javatype, javamain, javapackage;
	static String answer;
	
	
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	
	BufferedWriter bw = null;
	System.out.println("Hi, do you want to edit a JavaClass or create a new one ?");
	answer = sc.nextLine();
	if (answer.equals("edit")) {
		System.out.println("What is the name of the Java Class ?");
		javaclass = sc.nextLine();
		file = "C:/Users/Devilz/Desktop/Cours/DUT R&T/Bergen/Java/Git/Practice/main/" + javaclass + ".java";
		System.out.println(file);
		bw = new BufferedWriter(new FileWriter(file));
		
		System.out.println("Hi, what is the package of the Java Class ?");
		javapackage = sc.nextLine();
		bw.write ("package " + javapackage +";");
		bw.write ("\r\n");
		bw.write ("\r\n");
		System.out.println("Your class is public or private ?");
		javatype = sc.nextLine();
		bw.write(javatype + " class " + javaclass + "{");	
		bw.write ("\r\n");

		
		while (!(Answer.answerVariable().equals("no"))) {
			String var1value;
			System.out.println("Insert your variable and it type as '<type> variable' ");
			var1 = sc.nextLine();
			System.out.println("Do you want to add a value to " + var1);			
			answer = sc.nextLine();
			if (answer.equals("no")) {
				bw.write ("\t" + "static " + var1 + ";");	
				bw.write ("\r\n");
				}
			else {
				System.out.println("What is the value ?");
				var1value = sc.nextLine();
				bw.write ("\t" + "static " + var1 + " = " + var1value +";");
				bw.write ("\r\n");
			}	
			}
		
		System.out.println("Does your class contains a 'public static void main(String[] args) {' ?");
		answer = sc.nextLine();
		if (answer.equals("yes")) {
				bw.write(javatype + " static void main(String[] args) {");
				bw.write ("\r\n");}
		
		while (!(Answer.answerPrintln().equals("no"))) {
			System.out.println("What is the message ?");
    		String msg = sc.nextLine();
    		bw.write ("\t" + "System.out.println(" +msg+ ");");
    		bw.write ("\r\n");
		}
	
    System.out.println("Bye !");
    if (answer.equals("yes")) { bw.write("\t" + "}"); }
    bw.write ("\r\n" + "}");
    bw.close();
	}}
}