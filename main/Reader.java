package main;

import java.io.*;

public class Reader{

	static char line;
	static String lines;
	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader ("C:/Users/Devilz/Desktop/Cours/DUT R&T/Bergen/Java/Git/Practice/main/Test.java");
	    line =(char) fr.read();
	    	lines = Character.toString(line);
	    	if (lines.equals("//	Here")) {
	    	System.out.print (lines);	}	}
	    }
	
