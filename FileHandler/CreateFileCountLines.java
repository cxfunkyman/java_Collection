package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileCountLines {

	public static void main(String[] args) {
		int counter = 0;
		
		try {
			FileWriter myfile = new FileWriter("D:\\FilesJava\\newfile.txt");
			myfile.write("Hello world. \nAre you ok. \nYes. \nWe're ok. \nProgramming is fun.");
			//myfile.write("Hello word.");
			myfile.close();
		      
			  File myObj = new File("D:\\FilesJava\\newfile.txt");

		      Scanner myReader = new Scanner(myObj);

		      while (myReader.hasNextLine()) {

		        String data = myReader.nextLine();
		        System.out.println(data);
		        counter++;
		      }
		      System.out.println("\nThe file has " + counter + " lines.");
		      myReader.close();
		      
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
