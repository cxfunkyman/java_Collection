package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Delete all repeated occurrences in a string array. 
 * This means after program execution, the array would 
 * include totally unique strings/words.
 */

public class ArrayDelRepeatedStrings {

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
					String[] a = new String[n];

					System.out.println("Enter the Strings:");
					for(int i = 0; i < a.length; i++) {
						System.out.print((i + 1) + "- ");
						a[i] = myScanner.next();
					}
					System.out.println("Array before delete");
					for (int i = 0; i < a.length; i++)
						System.out.print(a[i] + " ");

					int count = 0;

					for (int i = 0; i < n; i++) {
						for (int j = i + 1; j < n; j++) {
								if (a[i].compareToIgnoreCase(a[j]) == 0) {
									count++;
									for (int p = j; p < n - 1; p++) {
										a[p] = a[p + 1];
									}
									j--;
									n--;
								}
						}
					}
					System.out.println("\nArray after delete");
					for (int i = 0; i < a.length - count; i++) {			
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
				System.out.println("\nWrong Type of Input!!!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\nNot a Valid Array Index!!!");
			}			
			catch (Exception e) {
				System.out.println("\nAn Error Ocurred!!!");
			}
		}
	}
}
