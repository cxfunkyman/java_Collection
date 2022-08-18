package algorithm;

/*
 * Write a program to accept 10 values (positive, negative, or zero)
 * in an integer array. Then move all negative values to the left side 
 * and all positive values to the right side of the array without sorting them.

Sample output:
Initial values inside the array:     -12,-42,2,0,67,-66,54,-20,55,-23,
Array values after their shifting:   -12,-42,-66,-20,-23,2,0,67,54,55,

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayMoveNegativePositive {

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

					System.out.println("Enter the Values:");
					for(int i = 0; i < a.length; i++) {
						System.out.print((i + 1) + "- ");
						a[i] = myScanner.nextInt();
					}
					System.out.println("Array before:");
					for (int i = 0; i < a.length; i++) {
					if (i != a.length - 1)
						System.out.print(a[i] + ", ");
					else
						System.out.println(a[i] + ".");
					}

					for(int i = 0; i < a.length; i++) {
						
						if(a[i] < 0) {
							
							continue;
						}
						else { 
							for(int j = i; j < a.length; j++) { 

								if(a[j] < 0) {
									
									for(int t = j; t > i; t--){
										
										int temp = a[t]; 
										a[t] = a[t - 1]; 
										a[t - 1]=temp; 
									} 
									break; 
								} 
							} 
						} 
					} 
					System.out.println("\nArray after:");
					for (int i = 0; i < a.length; i++) {
					if (i != a.length - 1)
						System.out.print(a[i] + ", ");
					else
						System.out.println(a[i] + ".");
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
