package Exception;

import java.util.Scanner;

/*
 * Seky Perez Moya 219-5412
 * 
 * Write a program to accept ten strings from the user
 * and keep them in a string array. Strings can be of 
 * any kind (alphabets, numbers, etc.) Try to convert 
 * these strings to integers and print them accordingly. 
 * Using the exception handling concept, avoid the program 
 * termination caused by impossible conversion and give a 
 * message: “Impossible to convert to number” to the user 
 * about the reason and continue the execution for the rest 
 * of the blocks. 
 */

public class StringConvertInt {


	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		String[] names = new String[10];
		
		while(true) {
		System.out.println("Please enter a set of 10 strings.\nCan be numbers, words or special characters.");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + 1 +": ");
			names[i] = myScanner.next();
		}
		System.out.println("Let's convert your string into integer. ");
		for (int i = 0; i < names.length; i++) {
			try {
				System.out.print(i + 1 + ": " + Integer.valueOf(names[i]) + "\n");
			} catch (NumberFormatException e) {
				System.out.println(e);
				System.out.println("Can't convert (" + names[i] + ") into Int, sorry.");				
			}			
		}
		System.out.println();
		}
	}
}
