import java.util.Arrays;
import java.util.Scanner;

/*
 _____________________________________________________
 Duplicate Elimination
 Use a one-dimensional array to solve the following problem: Write an application that inputs 
 ten numbers, each between 10 and 100, both inclusive. Save each number that was read in an 
 array that was initialized to a value of -1 for all elements. Assume a value of -1 indicates 
 an array element is empty. You are then to process the array, and remove duplicate elements 
 from the array containing the numbers you input. Display the contents of the array to 
 demonstrate that the duplicate input values were actually removed.
 ______________________________________________________________________________________________
 */


public class DuplicateElimination {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		
		int i, j, k, arrayNewIndex = 0, outOFLoop;
		
		int[] myArray = new int[11];
		
		int[] removedDuplicateArray = new int[myArray.length];
		
		int arrayValue;
		
		boolean exitContinue = true;
		
		System.out.println("Welcome to Duplicate removal.");
		
		do {
		System.out.println("Please input 10 values between 10 and 100:");
		
		for (i = 1; i < myArray.length; i++) { // The user enters the value for the array, using a for loop.
			System.out.print("Value " + i + ": ");
			 arrayValue = myKeyboard.nextInt();
			 myArray[i] = arrayValue;
			
			while (arrayValue <= 9 || arrayValue >= 101) { // While loop to ask for the correct value.
				System.out.print("Wrong value, please input a value between 10 and 100: ");
				 arrayValue = myKeyboard.nextInt();
				 myArray[i] = arrayValue;
			}			
		}
		Arrays.sort(myArray); // Sort the array.
		
		for (j = 0; j < myArray.length - 1; j++) { // a loop to erase the duplicate number
			if (myArray[j] != myArray[ j + 1])     // if statement to compare to position values of the array.
				removedDuplicateArray[arrayNewIndex++] = myArray[j]; // Store the value se;lected in a new array.
				
		}
		removedDuplicateArray[arrayNewIndex++] = myArray[myArray.length - 1] ;	// Move the original array to the duplicate remived array.	
		
		System.out.println("The unique values are:");
		
		for (k = 1; k < arrayNewIndex; k++) { // Print the content of the new array.
				
				System.out.print(removedDuplicateArray[k] + "  ");
		}
		System.out.println();
		System.out.println("\nDo you want to start over or exit");
		System.out.println("For start over input 1, to exit input 2");
		
		outOFLoop = myKeyboard.nextInt(); // Ask the user for a new entry to continue or quit.
		
		while (outOFLoop <= 0 || outOFLoop >= 3) { // Ask the user to input the correct value.
			System.out.print("Wrong input, for start over input 1, to exit input 2");
			outOFLoop = myKeyboard.nextInt();
		}
		
		if (outOFLoop == 1) { // comparison of the value to continue or quit			
			arrayNewIndex = 0; // If the user continue set array index to 0 to avoid conflicts when initialize the program again. 
			System.out.println();
		}
		else
			exitContinue = false;	// If the user quit, change the value to false	
		
		}while(exitContinue); // condition true to make an infinity loop.
		
		System.out.println("\nBYE !!!!!");
		
		myKeyboard.close();
	}

}
