package algorithm;
/*
 * Using recursive method, write a program to 
 * print all prime numbers between 3 and 100.
 */

import java.util.Scanner;

public class RecursivePrintPrime {
	
	public static boolean printprime(int numb1, int numb2) {

		if (numb1 == numb2) 
			return true;
		else if (numb1 % numb2 == 0)
			return false;	
		else
			return printprime(numb1, numb2 + 1);
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int numb1, max;

		System.out.println("Welcome\n");
		System.out.print("Please enter a number: ");
		numb1 = myScanner.nextInt();
		System.out.print("Now enter the maximum value: ");
		max = myScanner.nextInt();

		for (int i = numb1; numb1 <= max; numb1++)
			System.out.println(numb1 + " is prime: " + printprime(numb1,2));

		myScanner.close();
	}
}

