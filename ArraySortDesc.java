import java.util.Scanner;

/*
 * 3- WAP to accept 12 numbers in a 3*4 array and sort it in 
 *    descending order.
 */

public class ArraySortDesc {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int myArray[][] = new int [3][4];
//		int myArray[][] = {{16, -85, 84, 54}, {25, 36, -58, 45}, {-92, 32, 65, 48}};
		int maxLength = myArray.length - 1;
		int i, j, w, z, temp;

				System.out.println("Enter a value for the array:");
		
				for (i = 0; i < 3; i++) {
					for (j = 0; j < 4; j++) {
						System.out.print("Array Position: " + (i + 1) + "-" + (j + 1)+ ": ");
						myArray[i][j] = myScanner.nextInt();				
					}
				}
		System.out.println("\nMy inputed Array: ");

		for (i = 0; i < myArray.length; i++) {						
			for (j = 0; j < myArray[maxLength].length; j++) {			
				System.out.print(myArray[i][j] + ", "); 			
			}
			System.out.println();			
		}		
		for (i = 0; i < myArray.length; i++) {						

			for (j = 0; j < myArray[maxLength].length; j++) {

				for (w = 0; w < myArray.length; w++) {

					for (z = 0; z < myArray[maxLength].length; z++) {

						if (myArray[i][j] > myArray[w][z]) {
							temp = myArray[i][j];
							myArray[i][j] = myArray[w][z];
							myArray[w][z] = temp;
						}
					}				 			
				}
			}
		}
		System.out.println("\nMy sorted Array: ");

		for (i = 0; i < myArray.length; i++) {						
			for (j = 0; j < myArray[maxLength].length; j++) {			
				System.out.print(myArray[i][j] + ", "); 			
			}
			System.out.println();			
		}
		myScanner.close();
	}
}
