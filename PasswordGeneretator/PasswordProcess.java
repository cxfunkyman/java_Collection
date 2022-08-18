
//
// Purpose: The purpose of this assignment is to generate automatic different passwords obtain it randomly 
//          from a multidimensional array, in this class is located the password generator. Here is where
//          the password is generated for later test to see if have the requirement given in the assignment.
//          after learning how to use random i've removed the IF, ELSE statements.

import java.util.Random;

public class PasswordProcess {

	// Variables used for the array and final code generated.
	int bookPage, bookParagraphs, bookLineParagraph;  // Used to get the random number to select the line text from the Book Array codeArray.bookStrings[][][].
	int answerArraySplit0 = 0, answerArraySplit1 = 0, answerArraySplit2 = 0;  // Stores the random number for the selection of the separated words from the line text.
	int differentWordSelectionCount = 0;

	// Declaration of strings to manage the array and the process of making the password.
	String selectedBookString; // Used to store the selected line text from the Book Array.
	String[] selectedBookSplitStrings; // Used to store the selected line from the book after using string split.
	
	public String finalPassString = ""; // Used to store the password after generating the random number.
	public String firstStringForPassString = ""; // Used to store the first single word selected from my array.
	public String secondStringForPassString = ""; // Used to store the second single word selected from my array.
	public String thirdStringForPassString = ""; // Used to store the third single word selected from my array.

	private boolean differentWordSelection = true;

	BookArray myBookArray = new BookArray(); // Calling the BookArray class where the array with the text is stored.

	// Declaration of variables for the random number generation for the selection of the text line of the Book Array,
	// and the random creation of the password.
	Random arrayRandomSelection = new Random(); // Selection of the text line from the text in the Book Array codeArray.bookStrings[][][].
	Random arraySelectword = new Random(); // Selection of the words from the line text selected from the Book Array.

	public void passwordSelection() {

		do { // Selection for the line text from the Book Array, select one word from three different line text.
			
			bookPage = arrayRandomSelection.nextInt(myBookArray.bookStrings.length);
			bookParagraphs = arrayRandomSelection.nextInt(myBookArray.bookStrings[bookPage].length);
			bookLineParagraph = arrayRandomSelection.nextInt(myBookArray.bookStrings[bookPage][bookParagraphs].length);			
						
			selectedBookString = myBookArray.bookStrings[bookPage][bookParagraphs][bookLineParagraph]; // Put the value of the array codeArray (Text line), in the string myArrayString. 
			
			selectedBookSplitStrings = selectedBookString.split(" "); // Put the value of myArrayString into myArrayStringSplit after the process of splitting the string and separate them with space (" ").

			if (differentWordSelectionCount == 0) {
				answerArraySplit0 = arraySelectword.nextInt(selectedBookSplitStrings.length); // Randomly choose the first selected word inside the array for the password.
				firstStringForPassString = selectedBookSplitStrings[answerArraySplit0]; // Put the value of myArrayStringSplit into a string (firstString) with a random index number.										
			}
			else if (differentWordSelectionCount == 1) {
				answerArraySplit1 = arraySelectword.nextInt(selectedBookSplitStrings.length); // Randomly choose the second selected word inside the array for the password.
				secondStringForPassString = selectedBookSplitStrings[answerArraySplit1]; // Put the value of myArrayStringSplit into a string (secondString) with a random index number.
			}
			else {
				answerArraySplit2 = arraySelectword.nextInt(selectedBookSplitStrings.length); // Randomly choose the third selected word inside the array for the password.											
				thirdStringForPassString = selectedBookSplitStrings[answerArraySplit2]; // Put the value of myArrayStringSplit into a string (thirdString) with a random index number.
				differentWordSelection = false;
			}

			differentWordSelectionCount++;

		} while (differentWordSelection); // Do loop for the selection for the line text from the Book Array, select one word from three different line text.
		differentWordSelection = true;
		differentWordSelectionCount = 0;

		finalPassString = firstStringForPassString + secondStringForPassString + thirdStringForPassString;

	}

}
