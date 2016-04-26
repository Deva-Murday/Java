package test;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import main.Answer;

public class JavaMakerTest {
	String answer = "edit";
	String javaclass = "test";
	String file = "C:/Users/Devilz/Desktop/Cours/DUT R&T/Bergen/Java/Git/Practice/main/Tess.java";
	
	String javatype = "public";
	String javamain;
	String javapackage;
	
	String var1;
	
	@Test
public void testMain() {
	assertTrue("You have to provide a file", answer != "");
	assertTrue("You have to choose between editing a file of start from scratch",answer.equals("edit") || answer.equals("scratch"));
	
	assertTrue("You have to provide a file", file != "");
	assertTrue("You have to provide a file", file != "");
	assertTrue("You have to provide a java file with a correct path", file.contains(".java") || file.contains(":") || file.contains("/"));
}

	@Test
public void testScratch() throws IOException {
	assertTrue("You have to provide a class name, a type and a package", javatype != "" || javapackage != "" || javamain != "");
	assertTrue("You have to choose between type public or private ",javatype.equals("public") || javatype.equals("private"));
//	assertTrue("You must say yes or no !",
//			answer.equals("yes") || answer.equals("yes") || 
//			Answer.answerVariable().equals("yes") || Answer.answerVariable().equals("no") || 
//			Answer.answerPrintln().equals("yes") || Answer.answerPrintln().equals("yes") || 
//			Answer.answer().equals("yes") || Answer.answer().equals("yes"));
	assertFalse("Invalid variable", var1 == "");
	
	}

}
