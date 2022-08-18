package FileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileCountChar {

	public static void main(String[] args) {
		int counter = 0;
		int datalength = 0;

		try {
			FileWriter myfile = new FileWriter("C:\\Users\\Seky-Vanier\\Desktop\\newfile.txt");
			myfile.write("Hello world. \nAre you ok. \nYes. \nWe're ok. \nProgramming is fun.");
			//myfile.write("Hello word.");
			myfile.close();

			File myObj = new File("C:\\Users\\Seky-Vanier\\Desktop\\newfile.txt");

			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {

				String data = myReader.nextLine();
				System.out.println(data);

				datalength = datalength + data.length();

				//counter++;
			}
			System.out.println("\nThe file has " + datalength + " chars.");
			myReader.close();

		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
