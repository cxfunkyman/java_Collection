import java.util.Scanner;

/*
 * Write a program to create an array of 30 blocks. Accept first 
 * 10 numbers from the user. Fill the second ten blocks with 
 * calculating factorial of first ten elements. Fill the third 
 * ten blocks with the square of first ten elements.
 *
 * Sample output:
 * 1	2	3	4	 5    6	   7	  8	     9	     10	
 * 1    2	6	24	 120  720  5040   40320	 362880	 3628800  
 * 1    4   9   16   25   36   49     64     81      100
 */

public class ArrayPuzzle {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int[] myArray = new int[30];
		int i, j, k, w, factorial;

		System.out.println("Please Enter 10 Numbers:");

		for(i = 0, j = 10, w = 20; i < 10; i++, j++, w++) {
			System.out.print((i +  1) + "- Enter a number: ");
			myArray[i] = myScanner.nextInt();

			for(k = myArray[i], factorial = 1; k > 0; k--) {
				factorial = factorial * k;
			}
			myArray[j] = factorial;
			myArray[w] = myArray[i] * myArray[i];
		}
		System.out.print("\n"+"| ");
		for (i = 0; i < 30; i++) {
			System.out.print(myArray[i] + " | ");
		}
	}
}
