
//
// Purpose: The purpose of this assignment is to generate automatic different passwords obtain it randomly 
//          from a multidimensional array, in this class is located the password error checker. Here is where
//          the password is tested to see if have the requirement given in the assignment, here is called as well
//          the pattern checker.

public class PasswordErrorCheck {
	
	PatternPasswordChecker newCheckPattern = new PatternPasswordChecker();


	public boolean checkForNextLine (String firstNestLineString, String secondNextLineString, String thirdNextLineString) {


		if (firstNestLineString.contains("\n") || secondNextLineString.contains("\n") || thirdNextLineString.contains("\n")) { // If process to check if the words contains \n with them.

			return true; // If found /n in the string return true.
		}

		else {

			return false; // If not return false
		}
	}
	
	public boolean checkForSingleChar (String firstSingleString, String secondSingleString, String thirdSingleString) {


		if (firstSingleString.length() <= 1 || secondSingleString.length() <= 1 || thirdSingleString.length() <= 1) { // If process to check if contains a single character.

			return true; // If the string is just one char  return true.
		}

		else {

			return false; // If not return false.
		}

	}

	public boolean checkForEqualString (String firstEqualString, String secondEqualString, String thirdEqualString) {

		if (firstEqualString.compareTo(secondEqualString) == 0 || firstEqualString.compareTo(thirdEqualString) == 0 
				|| secondEqualString.compareTo(thirdEqualString) == 0) {

			return true; // If found that two strings are the same return true.
		}

		else {

			return false; // If not return false.
		}

	}

	public boolean checkForLength (String lengthCheckString) {

		if (lengthCheckString.length() < 8 || lengthCheckString.length() > 16) { // If process to check if the password has a length between 8 and 16 char.

			return true; // If found that the string is less than 8 char or more than 16 char return true.				
		}

		else {

			return false; // If not return false.
		}
	}

	public boolean checkForUpperCase (String upperCaseCheckString) {

		if (newCheckPattern.checkUpperCase(upperCaseCheckString) == false) { // If process to check if the words contains upper case with them.

			return true; // If found that there isn't an upper case char in the string return true.						
		}

		else {

			return false; // If not return false.
		}
	}

	public boolean checkForLowerCase (String lowerCaseChecksString) {

		if (newCheckPattern.checkLowerCase(lowerCaseChecksString) == false) { // If process to check if the words contains lower case with them.

			return true; // If found that there isn't a lower case in the string return true.							
		}

		else {
			return false; // If not return false.
		}
	}

	public boolean checkForSpecialChar (String specialCharChecksString) {

		if (newCheckPattern.checkSpecialChar(specialCharChecksString) == false) { // If process to check if the words contains special char with them.

			return true; // If found that there isn't a special char in the string return true.	

		}

		else {
			return false; // If not return false.				
		}
	}

	public boolean checkForOneSpecialChar (String oneSpecialCharsString) {
		
		int specialCharCount = 0;
		
		for (int i = 0, j = 0, k = 1; i < oneSpecialCharsString.length(); i++, j++, k++) {  // For loop process to iterate through the string password char by char.
						
			if (newCheckPattern.checkSpecialChar(oneSpecialCharsString.substring(j, k)) == true) {  // If proceeds to check if the password contains more than one special char with them.
				specialCharCount++;	// If true then add one to the specialCount counter.					
			}						
		}

		if (specialCharCount >= 2) {
			
			return true; // If the specialCount counter is more than one  return true.	
		}

		else {
			
			return false; // If not return false.
		}

	}

}
