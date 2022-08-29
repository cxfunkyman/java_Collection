package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInsertSortUser {

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
					for(int i = 0; i < n; i++) {
						System.out.print((i + 1) + "- ");
						int user = myScanner.nextInt();

						if(i == 0) {
							a[i] = user;
						}
						else if (i == 1)  {
							if (a[i - 1] > user) {
								a[i] = a[i -1];
								a[i -1] = user;
							}
							else {
								a[i] = user;
							}
						}
						else if (i > 1) {

							for(int j = 0; j < i; j++) {
								if (a[j] >= user) {
									for (int w = i; w > j; w--)
										a[w] = a[w - 1];

									a[j] = user;
									break;
								}
								else {
									a[i] = user;
								}
							}						
						}
					}
					System.out.println("Sorted array");
					for (int i = 0; i < n; i++)
						System.out.print(a[i] + " ");
					
					System.out.println("\n");
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
