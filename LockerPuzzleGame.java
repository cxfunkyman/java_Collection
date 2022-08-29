/*
 _________________________________________________
 Question 1: (locker puzzle game)
 A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
 As the students enter, the first student, denoted S1, opens every locker. 
 Then the second student, S2, begins with the second locker, denoted L2, and closes every other 
 locker. Student S3 begins with the third locker and changes every third locker 
 (closes it if it was open, and opens it if it was closed). Student S4 begins with locker L4 and 
 changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on 
 until student S100 changes L100. After all the students have passed through the building and 
 changed the lockers, which lockers are open? Write a program to find your answer. 
 After all the students have passed through the building and changed the lockers, which lockers are open? 
 __________________________________________________________________________________________________________
 */

/* Let's say:
 *            0 - All lockers are close.
 *            1 - S1 enters and open all lockers.
 *            2 - S2 enters and closes every other the lockers starting at L2.
 *            3 - S3 enters and change every third locker starting at L3.
 *            4 - S4 enters and change every fourth locker starting at L4.
 *            5 - S5 enters and change every fourth locker starting at L5.
 *            6 - Continue like this till the count reach S100 / L100.
 *            
 *  For what i understand from this problem this, is a perfect square root problem and every locker with a number
 *  with perfect root, will be open after every student passed trough.
 */


public class LockerPuzzleGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Locker Puzzle Game.\nThe lockers that remains open are:"); // Print out a welcome / introduction message.

		int student, locker, printLocker; // declaration of the variables for the For Loop;

		String openClosemessage; // Declaration of a string to change from true/false for open/close.

		boolean[] schoolLocker = new boolean[101]; // make an array of 101 positions because i'll start at 1 and finish at 101 = 100,
		// if the array is 100 is going to be from 0 to 99.

		for (student = 1; student < schoolLocker.length; student++) { //A For Loop for every student who enters the school.
			for (locker = student; locker < schoolLocker.length; locker += student) { // A For Loop to open/close every locker at school.

				if (schoolLocker[locker] == false) // Check the condition of the locker and change the value.
					schoolLocker[locker] = true; // If the value of the locker is close change it to open.

				else {
					schoolLocker[locker] = false; // If the value of the locker is open, change it to close.
				}
			}
		}
		for (printLocker = 1; printLocker < schoolLocker.length; printLocker++) { // A For Loop to print every locker and their state close/open.

			if (schoolLocker[printLocker] == true) // check the state of the locker true/false.
				openClosemessage = "open"; // If is true change it to the string open.

			else
				openClosemessage = "close"; // if is false change it to the string close.			

			if (schoolLocker[printLocker] == true) // Check the state of the locker true. If you want to print all the lockers skip this IF statement.
				System.out.println("Locker " + printLocker + " is " + openClosemessage); // Print every or selected lockers and their state.
		}
		System.out.println("\nBye bye!!!!!!");
	}
}
