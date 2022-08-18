package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Using binary search approach, find out the number of 
 * occurrences of an inputted word in an array of strings.
 */

class Collection {	
	
	int count, pos[];
	
	void sortnumb (int[] a, int count) {
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}				
		}		
	}
	
	void sortword (String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].compareToIgnoreCase(a[j]) >= 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}				
		}
	}
	void counter(String[] a, String name, int mid, int count, int[] pos) {
		this.count = count;
		this.pos = pos;
		
		this.pos[this.count] = mid + 1;
		this.count++;
		for (int left = mid -1 ; left >= 0 && a[left].equalsIgnoreCase(name) ; left-- ) {
			this.pos[this.count] = left + 1;
			this.count++;			
		}								

		for (int right = mid +1; right < a.length && a[right].equalsIgnoreCase(name) ; right++ ) {
			this.pos[this.count] = right + 1;
			this.count++;			
		}								
		sortnumb(this.pos, this.count);
	}

}

public class BinarySearchArray {
	
	public static void main(String[] args) {
		Collection c = new Collection();

		String[] a = {"leo", "sky", "wally", "alex", "petar", "sky", "wally", "alex", "sky", "ray", "jean", "alex", "basil", "tyler", "sky", "emil"};

		c.sortword(a);

		while(true) {
			boolean loop1 = true;
			Scanner myScanner = new Scanner(System.in);

			int n = a.length;
			int low = 0, high = n;
			int mid = low + ((low - high) / 2);
			int count = 0;

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
					int[] pos = new int[a.length];
					System.out.print("\nEnter a word for search: ");
					String name = myScanner.next();

					while (low <= high) {
						if (low == n)
							break;
						mid = low + ((high - low) / 2);

						if (a[mid].compareToIgnoreCase(name) < 0) {
							low = mid + 1;															
						}
						else if (a[mid].compareToIgnoreCase(name) > 0) {			
							high = mid - 1;														
						}
						else {													
							c.counter(a, name, mid, count, pos);							
							System.out.println("Number of occurrence: " + c.count);
							System.out.print("Number found at position: ");
							for(int i = 0; i < c.count; i++)
								System.out.print(c.pos[i] + " ");
							loop1 = false;
							System.out.println("\n");
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
