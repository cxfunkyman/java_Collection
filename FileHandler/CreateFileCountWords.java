package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileCountWords {

	public static void main(String[] args) {
		int counter = 0;
		int datalength = 0;

		try {
			FileWriter myfile = new FileWriter("D:\\FilesJava\\newfile.txt");
			myfile.write("Hello world. \nAre you ok. \nYes. \nWe're ok. \nProgramming is fun.");
			myfile.close();

			File myObj = new File("D:\\FilesJava\\newfile.txt");

			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNext()) {

				String data = myReader.next();
				System.out.println(data);

				//datalength = datalength + data.length();
				datalength++;
			}
			System.out.println("\nThe file has " + datalength + " words.");
			myReader.close();

		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
