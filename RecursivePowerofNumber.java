package algorithm;

import java.util.Scanner;



public class RecursivePowerofNumber {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int numb1, numb2;		

		System.out.println("Welcome\n");
		System.out.print("Please enter a number: ");
		numb1 = myScanner.nextInt();
		System.out.print("Enter the power to use: ");
		numb2 = myScanner.nextInt();
		System.out.println("\n" + numb1 + " to the power of " + numb2 + " is equal to: " + powerof(numb1, numb2));

		myScanner.close();
	}		

	public static int powerof(int numb1, int numb2) {

		if (numb2 != 1) {
			return numb1 = numb1 * powerof(numb1, numb2 - 1);					
		}
		else {
			return numb1;
		}		
	}
}
