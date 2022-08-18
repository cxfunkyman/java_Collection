package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {

		String[] a = {"leo", "sky", "petar", "winston", "alex", "ray", "jean", "basil", "tyler", "emil"};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].compareToIgnoreCase(a[j]) >= 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}				
		}
		while(true) {
			boolean loop1 = true;
			Scanner myScanner = new Scanner(System.in);

			int n = a.length;
			int low = 0, high = n;
			int mid = low + ((low - high) / 2);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");					

			try {
				int k = myScanner.nextInt();

				if (k == 1) {

					for (int i = 0; i < a.length; i++) {
						if (i < a.length - 1)
							System.out.print(a[i] + ", ");
						else
							System.out.print(a[i] + ".\n");
					}					
					System.out.print("\nEnter a word for search: ");
					String name = myScanner.next();

					while (low <= high) {
						if (low == n)
							break;
						mid = low + ((high - low) / 2);
						
						if (a[mid].compareToIgnoreCase(name) < 0) {
							if (a[mid].equalsIgnoreCase(name)) {
								System.out.println("Number found at position " + (mid + 1) + "\n");
								loop1 = false;
								break;
							}
							else {
								low = mid + 1;
							}								
						}
						if (a[mid].compareToIgnoreCase(name) > 0) {
							if (a[mid].equalsIgnoreCase(name)) {
								System.out.println("Number found at position " + (mid + 1) + "\n");
								loop1 = false;
								break;
							}							
							else {
								high = mid - 1;
							}							
						}
						if (a[mid].equalsIgnoreCase(name)) {
							System.out.println("Number found at position " + (mid + 1) + "\n");
							loop1 = false;
							break;
						}
					}
					if(loop1) {
						System.out.println("Number not found\n");
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
				System.out.println("\nWrong Type of Input!!!\n");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\nNot a Valid Array Index!!!\n");
			}			
			catch (Exception e) {
				System.out.println("\nAn Error Ocurred!!!\n");
			}
		}
	}
}
