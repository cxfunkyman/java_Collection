import java.util.Scanner;

public class ordinalSetName {

	public static void main(String[] args) {

		Scanner myKeyBoard = new Scanner(System.in);

		int intelCPUGeneration;

		while(true) {

			System.out.println("Enter a number to convert to ordinal between 1 and 1000");		
			intelCPUGeneration = myKeyBoard.nextInt();


			String[] ordinalNumber = {"st", "nd", "rd", "th"}; // String array to set the proper ordinal number state
			String ordinalString = "";

			if (intelCPUGeneration == 11 || intelCPUGeneration == 12 || intelCPUGeneration == 13) {
				ordinalString = ordinalNumber[3];
			}

			else {

				if (intelCPUGeneration % 10 == 1) { // if the number is one set ST like 1st
					ordinalString = ordinalNumber[0];
				}

				else if (intelCPUGeneration % 10 == 2) { // if the number is two set ND like 2nd
					ordinalString = ordinalNumber[1];
				}

				else if (intelCPUGeneration % 10 == 3) { // if the number is three set RD like 3rd
					ordinalString = ordinalNumber[2];
				}

				else { // if the number is any other than 1, 2 or 3 set TH like 4th, 7th, 9th
					ordinalString = ordinalNumber[3];
				}
			}
			System.out.println("Your ordinal number is: " + intelCPUGeneration + ordinalString);

		}

		//myKeyBoard.close();
	}
}
