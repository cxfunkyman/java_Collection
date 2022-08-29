package ArrayList;

import java.util.ArrayList;

/*
 * Create a class that accepts the strings from the user 
 * (as long as he wants to enter), and then, when the user 
 * has finished with his data entry, checks for the duplicate 
 * values and deletes them from the ArrayList. Print the final 
 * unified list of strings. 
 */

import java.util.Scanner;

// Write a program that removes duplicates string in an array;

public class DuplicateStrings {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		ArrayList<String> arrString = new ArrayList<>();
		boolean flag = true;
		
		while (flag) {
			System.out.println("Do you want to enter a value. 1- Yes, 2- No.");
			int input = myScanner.nextInt();
			
			if (input == 1) {
				System.out.print("Enter the string: ");
				String myString = myScanner.next();
				arrString.add(myString);
			}
			else {
				flag = false;
			}
		}
		System.out.println(arrString);

		for (int i = 0; i < arrString.size(); i++) {
			for(int j = i + 1; j < arrString.size(); j++) {
				if (arrString.get(i).equalsIgnoreCase(arrString.get(j))) {
					arrString.remove(j);
					j--;
				}
			}
		}

		System.out.println(arrString);

	}

}
