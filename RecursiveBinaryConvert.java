package algorithm;

import java.util.Scanner;

/*
 * Using recursive method, write a program to accept 
 * and then convert a positive decimal number to its 
 * binary equivalent.
 */

public class RecursiveBinaryConvert {
	int count = 0;
	int a[] = new int[24];
	
		public static int convertbinary(int numb1, int numb2) {

			if (numb1 == 0) {				
				return 0;					
			}
			else {
				return (numb1 % numb2 + 10 * convertbinary(numb1/numb2, numb2));
				
			}
		}
	public static void main(String[] args) {		
		Scanner myScanner = new Scanner(System.in);

		int numb1, base = 2;

		System.out.println("Welcome\n");
		System.out.print("Please enter a number: ");
		numb1 = myScanner.nextInt();
		
		System.out.print(numb1 + " converted to binary is: " + convertbinary(numb1, base));
		

		myScanner.close();
	}
}
