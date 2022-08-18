package Exams;

import java.util.InputMismatchException;
import java.util.Scanner;

class PrintArray {

	int n = 0;

	PrintArray () {

	}
	void Printoption(String [] arr, int size) {

		for (int i = 0; i < size; i++) {
			if (i < size - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.print(arr[i] + ".");
		}

	}
}

public class StringArray {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		boolean loop1 = true;
		String[] a = new String[20];
		PrintArray p = new PrintArray();

		System.out.println("Welcome!!");		
		System.out.print("How many words to enter: ");		

		try {
			p.n = myScanner.nextInt();

			System.out.println();

			for(int i = 0; i <  p.n; i++) {
				System.out.print("Enter the word " + (i + 1) + " : ");
				a[i] = myScanner.next();

				if (i ==  p.n - 1)
					loop1 = false;
			}			
		} 
		catch (InputMismatchException e) {
			System.out.println("\nWrong Type of Input!!!");
			System.exit(0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nNot a Valid Array Index!!!");
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("\nAn Error Ocurred!!!");
			System.exit(0);
		}

		while(true) {

			try {

				System.out.print("\nEnter your option: 1- Show  2- Move  3- Delete  4- Insert  5- Repeat  6- Exit : ");
				int q = myScanner.nextInt();

				if (q == 1) {
					System.out.println("Current status:");					
					p.Printoption(a, p.n);
				}

				else if (q == 2) {
					System.out.println("Current status:");					
					p.Printoption(a, p.n);
					System.out.print("\nFrom which position: ");
					int pos1 = myScanner.nextInt();				
					System.out.print("To which position: ");
					int pos2 = myScanner.nextInt();

					if (pos1 < pos2) {
						for (int i = pos1; i < pos2 ; i++) {
							String temp = a[i];
							a[i] = a[i + 1];
							a[i + 1] = temp;
						}
					}
					else if (pos2 < pos1) {
						for (int i = pos1; i > pos2; i--) {
							String temp = a[i];
							a[i] = a[i - 1];
							a[i - 1] = temp;
						}
					}
					System.out.println("After modification:");					
					p.Printoption(a, p.n);
				}
				else if (q == 3) {
					System.out.println("Current status:");					
					p.Printoption(a, p.n);
					System.out.print("\nWhich posistion : ");
					int pos4 = myScanner.nextInt();

					for (int i = pos4; i < p.n - 1; i++) {	
						a[i] = a[i +1];
					}
					p.n--;
					System.out.println("After deletion:");					
					p.Printoption(a, p.n);
				}
				else if (q == 4) {
					System.out.println("Current status:");					
					p.Printoption(a, p.n);
					System.out.print("\nEnter a word:");
					String mString1 = myScanner.next();
					System.out.print("\nTo which position: ");
					int pos3 = myScanner.nextInt();

					for (int i = p.n; i >= pos3; i--) {
						a[i + 1] = a[i];	
					}					
					a[pos3] = mString1;	
					p.n++;
					System.out.println("After modification:");					
					p.Printoption(a, p.n);
				}
				else if (q == 5) {
					System.out.println("Current status:");					
					p.Printoption(a, p.n);
					System.out.print("\nFrom which position: ");
					int pos5 = myScanner.nextInt();				
					System.out.print("To which position: ");
					int pos6 = myScanner.nextInt();

					String copy = a[pos5];
					for (int i = p.n; i >= pos6; i--) {
						a[i + 1] = a[i];	
					}					
					a[pos6] = copy;	
					p.n++;
					System.out.println("After modification:");					
					p.Printoption(a, p.n);
				} 
				else if (q == 6){
					System.out.println("Bye Bye!");
					myScanner.close();
					System.exit(0);
				}
				else {
					System.out.println("Wrong input. Try againg");
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



