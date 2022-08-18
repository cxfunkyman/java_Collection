package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3-	Write a program to accept n integer values in an array 
 * (array size defined and inputted by the user). Then start 
 * showing/printing the existing values in the following format.

Sample output:

How many numbers do you want to enter? (array size) 6
Enter the 1 number: 1
Enter the 2 number: 2
Enter the 3 number: 3
Enter the 4 number: 4
Enter the 5 number: 5
Enter the 6 number: 6

Cyclic print of existing values:
 - Cycle 1:  1,2,3,4,5,6
 - Cycle 2:  6,1,2,3,4,5
 - Cycle 3:  5,6,1,2,3,4
 - Cycle 4:  4,5,6,1,2,3
 - Cycle 5:  3,4,5,6,1,2
 - Cycle 6:  2,3,4,5,6,1

 */

public class ArrayCyclicPrint {

	public static void main(String[] args) {

		boolean loop1 = true;

		while(loop1) {
			Scanner myScanner = new Scanner(System.in);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");

			try {
				int t = myScanner.nextInt();

				if (t == 1) {
					System.out.println("\nHow many numbers do you want to enter? (array size): ");
					int n = myScanner.nextInt();
					int[] a = new int[n];

					System.out.println("Enter the Values:");
					for(int i = 0; i < a.length; i++) {
						System.out.print("Enter the " + (i + 1) + " number: ");
						a[i] = myScanner.nextInt();
					}
					System.out.println("\nCyclic print of existing values:");
					
					for (int i = 0; i < a.length; i++) {
						
						if (i > 0) {
						for(int j = a.length - 1; j > 0; j--) {
							int temp = a[j];
							a[j] = a[j - 1];
							a[j - 1] = temp;							
						}						
						}
						
					System.out.print(" - Cycle " + (i + 1) + ":  ");
					for (int k = 0; k < a.length; k++) {
					if (k != a.length - 1)
						System.out.print(a[k] + ", ");
					else
						System.out.println(a[k] + ".");
					}
					}
					System.out.println();
				} 	
				else if (t == 2){
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
