package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Using jump search concept, write a java program to find out 
 * whether a particular word is existing in an array of strings 
 * or not.
 */

public class JumpSearchArray {

	public static void main(String[] args) {
		
		while(true) {

			boolean loop1 = false;
			Scanner myScanner = new Scanner(System.in);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");

			try {
				int k = myScanner.nextInt();

				if (k == 1) {
					System.out.println("\nPlease enter the size of the array: ");
					int n = myScanner.nextInt();
					int root = (int) Math.sqrt(n);
					String[] a = new String[n];
					
					System.out.println("Enter the values:");
					for(int i = 0; i < n; i++) {
						System.out.print((i + 1) + "- ");
						a[i] = myScanner.next();
					}
					for (int i = 0; i < a.length; i++) {
						for (int j = i + 1; j < a.length; j++) {
							if(a[i].compareToIgnoreCase(a[j]) >= 0) {
								String temp = a[i];
								a[i] = a[j];
								a[j] = temp;
							}
						}				
					}					
					for(int i = 0; i < a.length; i++) {
						if(i < a.length - 1)
							System.out.print(a[i] + ", ");
						else
							System.out.print(a[i] + ".\n");
					}
					int root = (int)(Math.sqrt(n));
					int forloop = 0, jump = root;

					System.out.print("\nEnter a word for search: ");
					String name = myScanner.next();
					
					if (name.compareToIgnoreCase(a[0]) == 0) {
						System.out.println("Element found at position: "+ 1 + "\n");
					}

					else if(name.compareToIgnoreCase(a[n-1]) > 0 || name.compareToIgnoreCase(a[0]) < 0) {
						System.out.println("Element doesn't exist\n");					
					}
					else {

						while (a[jump].compareToIgnoreCase(name) < 0 && jump < n) {					
							forloop = jump;
							jump = jump + root; 

							if (jump > n - 1) {
								jump = n - 1;
							}
						} 
						for(int m = forloop; m <= jump; m++) {
							if(a[m].equalsIgnoreCase(name)) {
								System.out.println("Element found at position: "+(m + 1) + "\n");
								loop1 = true;
							}
						}
						if (!loop1) {
							System.out.println("Element doesn't exist\n");
						}
					}
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
