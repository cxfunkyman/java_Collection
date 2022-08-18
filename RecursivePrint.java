package algorithm;

import java.util.Scanner;

public class RecursivePrint {

	public static int printsum(int numb1) {

		if (numb1 != 0) {
			return numb1 = numb1 + printsum(numb1 - 1);					
		}
		else {
			return numb1;
		}		
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int numb1;

		System.out.println("Welcome\n");
		System.out.print("Please enter a number: ");
		numb1 = myScanner.nextInt();

		System.out.println("\nThe sum of all the number from " + numb1 + " to one is equal to: " + printsum(numb1));

		myScanner.close();
	}
}
