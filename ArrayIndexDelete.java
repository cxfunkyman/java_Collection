package algorithm;

import java.util.Scanner;

/*
 * Write a program to create an array of n integers (selected by user). 
 * Then, try to delete an element based on the index number entered by user.
 */

public class ArrayIndexDelete {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int n = 0;	

		System.out.println("Please enter the size of the array: ");
		n = myScanner.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "- ");
			a[i] = myScanner.nextInt();
		}
		System.out.println("Array before delete");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println("\nPlease enter in which index you desire to delete the number: ");
		System.out.println("Enter a value from 1 to " + n);
		n = myScanner.nextInt();


		for(n--; n < a.length - 1; n++) {
			a[n] = a[n + 1];
		}
		
		System.out.println("Array after delete");
		for (int i = 0; i < a.length - 1; i++)
			
			System.out.print(a[i] + " ");
	}
}
