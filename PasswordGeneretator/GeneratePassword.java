
//
// Purpose: The purpose of this assignment is to generate automatic different passwords obtain it randomly 
//          from a multidimensional array, this is the main class.

public class GeneratePassword {

	public static void main(String[] args) {

		PasswordProcess newPasswordSelection = new PasswordProcess();
		PasswordErrorCheck checkForError = new PasswordErrorCheck();

		//		int lowerTest = 0; // Used just for the lower case test option.

		// Variables used for the count of errors while doing the password generation.
		int newNextLineCount = 0;
		int singleCounter = 0;
		int equalCounter = 0;
		int lengthCounter = 0;
		int upperCounter = 0;
		int lowerCounter = 0;
		int specialCharCounter = 0; 

		int countWhileLoopTenThounsand = 0; // Counter used to finish the loop at 10,000 password generated.

		// Variables used to control the loops for every option. for more info check the comments.
		boolean nextLineFoundLoop = true, lengthStringPasswordLoop = true, equalStringsLoop = true;
		boolean singleCharLoop = true, upperCaseLoop = true, specialCharLoop = true;
		boolean lowerCaseLoop =true, secondSpecialLoop = true;

		String passwordString = ""; // used to store the final password after using String.format.

		System.out.println("Welcome to the second password generator game!\n");

		while (countWhileLoopTenThounsand < 10000) { // while loop for 10,000 password generating.

			do { // Second special loop, checking if there are more than one special char.

				do { // Special loop, checking if there is a special character.

					do { // Lower loop checking if there is a lower case char.

						do { // Upper loop checking if there is an upper case char.

							do { // Length loop the length of the string, must be between 8 and 16.

								do { // Equal loop checking if there are the same char between the 3 selected strings.

									do { // Single loop checking if there is a single char of the 3 selected strings.

										do { // Next line loop checking if there is a \n in the password.											

											newPasswordSelection.passwordSelection();
											
//											System.out.println(newPasswordSelection.finalPassString);

											if (checkForError.checkForNextLine(newPasswordSelection.firstStringForPassString, 
													newPasswordSelection.secondStringForPassString, 
													newPasswordSelection.thirdStringForPassString) == true)  { // If process to check if the words contains \n with them.

												newNextLineCount++; // If found /n in the string add one to the newNextLineCount and restart the hole process again to choose another password.
											}

											else {

												nextLineFoundLoop = false; // If not set the boolean nextLineLoop
											}

										} while (nextLineFoundLoop); // Do loop to find if the string have a /n, if not found start over again inside the loop.
										nextLineFoundLoop = true;

										if (checkForError.checkForSingleChar(newPasswordSelection.firstStringForPassString, 
												newPasswordSelection.secondStringForPassString, 
												newPasswordSelection.thirdStringForPassString) == true) { // If process to check if contains a single character.

											singleCounter++; // If the string is just one char add one to the singleCounter and restart the hole process again to choose another password.
										}

										else {

											singleCharLoop = false; // If not set the boolean singleLoop to false
										}

									} while(singleCharLoop); // Do loop to find if the string have a single character, if not found start over again inside the loop.
									singleCharLoop = true;

									if (checkForError.checkForEqualString(newPasswordSelection.firstStringForPassString, 
											newPasswordSelection.secondStringForPassString, 
											newPasswordSelection.thirdStringForPassString) == true) {

										equalCounter++; // If found that two strings are the same add one to the equalCounter and restart the hole process again to choose another password.
									}

									else {

										equalStringsLoop = false; // If not set the boolean equalLoop to false.
									}

								} while(equalStringsLoop); // Do loop to find if the string have equals words, if not found start over again inside the loop.
								equalStringsLoop = true;

								//newPasswordSelection.finalPassString

								if (checkForError.checkForLength(newPasswordSelection.finalPassString) == true) {

									lengthCounter++; // If found that the string is less than 8 char or more than 16 char add one to the lengthCounter and restart the hole process again to choose another password.				
								}

								else {

									lengthStringPasswordLoop = false; // If not set the boolean lengthLoop to false
								}

							} while (lengthStringPasswordLoop); // Do loop to find if the string have the required length, if not found start over again inside the loop.
							lengthStringPasswordLoop = true;

							if (checkForError.checkForUpperCase(newPasswordSelection.finalPassString) == true) { // If process to check if the words contains upper case with them.

								upperCounter++; // If found that there isn't an upper case char in the string add one to the upperCounter and restart the hole process again to choose another password.						
							}

							else {

								upperCaseLoop = false; // If not set the boolean upperLoop to false.
							}

						} while (upperCaseLoop); // Do loop to find if the string have at least one upper case, if not found start over again inside the loop.
						upperCaseLoop = true;

						if (checkForError.checkForLowerCase(newPasswordSelection.finalPassString) == true) { // If process to check if the words contains lower case with them.

							lowerCounter++; // If found that there isn't a lower case in the string add one to the newLine and restart the hole process again to choose another password.						
						}

						else {

							lowerCaseLoop = false; // If not set the boolean lowerLoop to false.
						}

					} while (lowerCaseLoop); // Do loop to find if the string have at least one lower case, if not found start over again inside the loop.
					lowerCaseLoop = true;

					if (checkForError.checkForSpecialChar(newPasswordSelection.finalPassString) == true) { // If process to check if the words contains special char with them.

						specialCharCounter++; // If found that there isn't a special char in the string add one to the specialCharCounter and restart the hole process again to choose another password.

					}

					else {

						specialCharLoop = false; // If not set the boolean specialLoop to false.				
					}

				} while (specialCharLoop); // Do loop to find if the string have at least one special char, if not found start over again inside the loop.
				specialCharLoop = true;

				if (checkForError.checkForOneSpecialChar(newPasswordSelection.finalPassString) == true) {  // If proceeds to check if the password contains more than one special char with them.

					specialCharCounter++;	// If true then add one to the specialCount counter.					
				}						

				else {

					secondSpecialLoop = false; // If the specialCount is less than 2 then set the boolean secondSpecialLoop to false to get out of the while loop.
				}

			} while (secondSpecialLoop);
			secondSpecialLoop = true;

			// This if is to test the condition of, if there is a case where lower case is not equal to zero.
			//			if (lowerTest == 100) {
			//				++lower;
			//			}

			passwordString = String.format("%-16s", newPasswordSelection.finalPassString); // Formatting the string output to 16 spaces.

			System.out.println("Password = " + passwordString + "\tNewline = " + newNextLineCount + "\tSingle = " + singleCounter 
					+ "\tEqual = " + equalCounter + "\tLength = " + lengthCounter + "\tUpper = " + upperCounter + "\tLower = " + lowerCounter 
					+ "\tSpecial = " + specialCharCounter); // + "\t count = " + countWhileLoopTenThounsand); // This part is just for test.

			if (lowerCounter != 0) // if lower case is not equal to zero, then get out of the loop.
				break;

			countWhileLoopTenThounsand++;
			newNextLineCount = 0;
			singleCounter = 0;
			equalCounter = 0;
			lengthCounter = 0;
			upperCounter = 0;
			lowerCounter = 0;
			specialCharCounter = 0;

			//			lowerTest++; // this increment int is for testing the lower case not equal to zero option.

		} // while loop for 10,000 password generating.

		System.out.println();
		System.out.println("Total passwords generated: " + countWhileLoopTenThounsand + "\n");
		System.out.println("Thanks for using the password generator game. Good bye.");

	}
}
