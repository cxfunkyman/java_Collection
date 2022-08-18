package Exams;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * WAP to create an array list “Original” of string type with user 
 * inputs (as long as he wants and continues to input). Then create 
 * 2 other array lists: one string type, and the other one integer 
 * type. Start checking the inputted values in Original array list: 
 * if value is convertible to an integer number add it to your 
 * integer type array list, and if not convertible add it to the 
 * string type array list. Using exception handling concept, 
avoid unwanted termination of program.
At the end, show 3 array lists: Original one, the one including 
integer values, and the one including non-integer values.

 */
public class ArrayListFilter {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		ArrayList<String> original = new ArrayList<>();
		ArrayList<String> arrSt = new ArrayList<>();
		ArrayList<Integer> arrInt = new ArrayList<>();
		boolean flag = true;

		while (flag) {
			System.out.println("Do you want to enter a value. 1- Yes, 2- No.");
			int input = myScanner.nextInt();

			if (input == 1) {
				System.out.print("Enter a Value: ");
				String data = myScanner.next();
				original.add(data);
			}
			else if (input == 2) {	
				flag = false;
			}
		}

		for(int i = 0; i < original.size(); i++) {

			try {
				if(original.get(i).matches("[0-9]+")) { 
					arrInt.add(Integer.parseInt(original.get(i)));
				}
				else {
					arrSt.add(original.get(i));	
					throw new NumberFormatException();
				}

			}  catch (NumberFormatException e) {
				System.out.println(e + ": For input string: " + original.get(i));
			}
		}

		System.out.println("Original array list: " + original);
		System.out.println("Created Array list for strings: " + arrSt);
		System.out.println("Created Array list for integers: " + arrInt);
	}
}
