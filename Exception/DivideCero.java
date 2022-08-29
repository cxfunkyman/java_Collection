package Exception;

import java.util.Scanner;

/*
 * Write a program to accept two integers, a and b, 
 * from the user and print the a/b. Using the exception 
 * handling concept, avoid the program termination caused 
 * by dividing by zero and giving the proper message to 
 * the user about the reason for not dividing two numbers. 
 * Let him try again with two other sets of numbers. 
 * Unless and until she/he has not entered the acceptable 
 * numbers try-catch block would actively keep the program 
 * running without any abnormal termination caused by dividing 
 * by zero.   
 */

public class DivideCero {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int a, b;

		while (true) {	

			System.out.print("Please enter two numbers to perform the division. \nValue of a: ");
			a = myScanner.nextInt();
			System.out.print("Value of b: ");
			b = myScanner.nextInt();

			try {
				System.out.print("Result of a/b: " + a / b + "\n");
			}
			catch(ArithmeticException e){
				System.out.println("\n" + e);
				System.out.println("Can't divide by zero. Please try again.\n");
			}
		}
	}
}
