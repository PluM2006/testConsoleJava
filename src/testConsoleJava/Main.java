package testConsoleJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		System.out.println(args[0]);
		try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      FileWriter myWriter = new FileWriter(myObj);
		      myWriter.write("јга тут" + args[0]);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
