import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {

		/* Write a program to accept 10 positive and negative values in an integer array. 
		 * Program would shift all negative values to the left side and all positive values 
		 * to the right side of the array without sorting them.
		 */

		int arr[] = new int[10];
		int counter = 0;
		int newArr[] = new int[10]; 

		System.out.println("Please enter 10 positive or negative numbers: ");
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < arr.length; i++) 

		{
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				newArr[counter] = arr[i];
				counter++;
			}
		}

		for (int i = 0; i <arr.length; i++) {
			if (arr[i] == 0) {
				newArr[counter] = arr[i];
				counter++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				newArr[counter] = arr[i];
				counter++;
			}
		}
		System.out.print("Initial values inside the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nArray values after their shifting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		sc.close();
	}

}