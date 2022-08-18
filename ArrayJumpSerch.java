package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayJumpSerch {

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
					int[] a = new int[n];

					System.out.println("Enter the values:");
					for(int i = 0; i < n; i++) {
						System.out.print((i + 1) + "- ");
						a[i] = myScanner.nextInt();
					}
					for (int i = 0; i < a.length; i++) {
						for (int j = i + 1; j < a.length; j++) {
							if(a[i] > a[j]) {
								int temp = a[i];
								a[i] = a[j];
								a[j] = temp;
							}
						}				
					}
					int root = (int)(Math.sqrt(n));

					System.out.print("\nEnter a value for search: ");
					int numb = myScanner.nextInt();

					if(numb > a[n - 1] || numb < a[0]) {
						System.out.println("Element doesn't exist\n");						
					}
					else {
					int i = 0;
					int j = root;
					while(a[j] < numb && j < n) {						
						i = j;
						j = j + root; 

						if(j > n - 1) {
							j = n - 1;
						}
					} 
					for(int m = i; m <= j; m++) {
						if(a[m] == numb) {
							System.out.println("Element found at position:"+(m + 1) + "\n");
													
						}
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
