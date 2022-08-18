import java.util.Scanner;

/*
 * 1- WAP to accept 12 numbers in a 3*4 array and print the 
 *    values column-wise.
 *    
 *    Seky Perez Moya 219-5412.
 */

public class ArrayPrintColumn {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int myArray[][] = new int [3][4];
		int maxLengh = myArray.length - 1;
//		int myArray[][] = {{96, 85, 74, 14}, {25, 36, 78, 45}, {12, 32, 65, 98}};

		System.out.println("Enter a value for the array:");

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[maxLengh].length; j++) {
				System.out.print("Array Position: " + (i + 1) + "-" + (j + 1 )+ ": ");
				myArray[i][j] = myScanner.nextInt();				
			}
		}			
		System.out.println("\nMy Array: ");

		for (int j = 0; j < myArray[maxLengh].length; j++) {						
			for (int i = 0; i < myArray.length; i++) {			
				System.out.print(myArray[i][j] + ", "); 			
			}
			System.out.println();			
		}
		myScanner.close();
	}
}
