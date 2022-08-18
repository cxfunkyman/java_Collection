package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInsertFirst {

	public static void main(String[] args) {

		boolean loop1 = true;
		int[] a = new int[20];

		while(loop1) {
			Scanner myScanner = new Scanner(System.in);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");

			try {
				int k = myScanner.nextInt();

				if (k == 1) {
					System.out.println("\nPlease enter the size of the array: ");
					int n = myScanner.nextInt();
					
					System.out.println("Enter the values:");
					for(int i = 0; i < n; i++) {
						System.out.print((i + 1) + "- ");
						a[i] = myScanner.nextInt();
					}
					System.out.println("Array before insertion");
					for (int i = 0; i < n; i++)
						System.out.print(a[i] + " ");
					
					System.out.print("\nEnter another value (max " + (a.length - n) + "): ");
					for (int i = n; i < a.length; i++) {
						System.out.print("Value: ");						
						n++;
						
						for(int j = n; j >= 0; j--) {
							a[j + 1] = a[j];							
						}						
					
					a[0] = myScanner.nextInt();
					
					System.out.println("1- Add another number (max " + (a.length - n) + ") - 2- Exit");
					int t = myScanner.nextInt();
					if (t == 2)
						break;
					}

					System.out.println("\nArray after insertion");
					for (int i = 0; i < n; i++)
						System.out.print(a[i] + " ");

					//System.out.println(count);
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

//import java.util.Scanner;
//public class A {//at the beginning
//  public static void main(String[] args) {
//      Scanner h=new Scanner(System.in);
//      int a[]=new int[20],i;
//      System.out.println("How many numbers to enter? ");
//      int n=h.nextInt();
//      for(i=0;i<n;i++) {
//          System.out.print("Enter the " + (i+1) +" number");
//          a[i]=h.nextInt();
//          }
//      for(i=0;i<n;i++)System.out.print(a[i] + ",");
//      System.out.println("\nWhich number to insert? ");
//      int m=h.nextInt();
//      for(i=n;i>0;i--)a[i]=a[i-1]; //shifting the array to right
//      a[0]=m;
//      for(i=0;i<n+1;i++)System.out.print(a[i] + ",");
//      }
//}