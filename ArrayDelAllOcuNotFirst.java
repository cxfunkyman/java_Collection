package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Write a program to create an array of n integers (selected by user).
 * Then, accept another number and try to find and delete all its
 * occurrences – except for the first one.
 */

public class ArrayDelAllOcuNotFirst {

	public static void main(String[] args) {
		
		boolean loop1 = true;

		while(loop1) {
			Scanner myScanner = new Scanner(System.in);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");
			
			try {
			int k = myScanner.nextInt();

			if (k == 1) {
				System.out.println("\nPlease enter the size of the array: ");
				int n = myScanner.nextInt();
				int[] a = new int[n];
				
				System.out.println("Enter the values:");
				for(int i = 0; i < a.length; i++) {
					System.out.print((i + 1) + "- ");
					a[i] = myScanner.nextInt();
				}
				System.out.println("Array before delete");
				for (int i = 0; i < a.length; i++)
					System.out.print(a[i] + " ");

				System.out.println("\nPlease enter a number: ");
				int m = myScanner.nextInt();
				int count = 0, counter = 0;

				for (int i = 0; i < a.length; i++) {
					
					if(a[i] == m && counter <= 0) {
						a[count++] = a[i];
						counter++;
					}
					else if (a[i] != m) {
						a[count++] = a[i];						
					}
				}
				System.out.println("\nArray after delete");
				for (int i = 0; i < count; i++) {			
					System.out.print(a[i] + " ");	
				}
				System.out.println();
				} 			
			
			else if (k == 2){
				myScanner.close();
				System.exit(0);
			}
			else {
				System.out.println("Wrong input. Select 1 or 2 as your options!!!");
			}
			}
			catch (InputMismatchException e) {
				System.out.println("Wrong Type of Input!!!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Not a Valid Array Index!!!");
			}			
			catch (Exception e) {
				System.out.println("An Error Ocurred!!!");
			}
		}
	}
}
