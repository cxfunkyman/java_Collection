import java.util.Scanner;

// WAP to sort string 2d array.

public class SortMultiArrayString {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		//String[][] myArray = {{"Jhon", "Name", "Laval"}, {"Seafood", "Montreal", "Quebec"}, {"Lizz", "Time", "Reaper"}};
        String[][] myArray = new String[3][3];
		int size = myArray.length - 1;
		
		System.out.println("Enter 9 string: ");
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[size].length; j++) {
				System.out.print("Array Position: " + (i + 1) + "-" + (j + 1 )+ ": ");
				myArray[i][j] = myScanner.next();
			}
		}
		
		System.out.println("\nOriginal array: ");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[size].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}

		for(int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[size].length; j++) {
				for(int w = 0; w < myArray.length; w++) {
					for (int z = 0; z < myArray[size].length; z++) {

						if(myArray[i][j].toLowerCase().compareTo(myArray[w][z].toLowerCase()) < 0) {
							String temp = myArray[i][j];
							myArray[i][j] = myArray[w][z];
							myArray[w][z] = temp;
						}
					}
				}
			}
		}
		System.out.println("\nSorted Array Ascending:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[size].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[size].length; j++) {
				for(int w = 0; w < myArray.length; w++) {
					for (int z = 0; z < myArray[size].length; z++) {

						if(myArray[i][j].toLowerCase().compareTo(myArray[w][z].toLowerCase()) > 0) {
							String temp = myArray[i][j];
							myArray[i][j] = myArray[w][z];
							myArray[w][z] = temp;
						}
					}
				}
			}
		}
		System.out.println("\nSorted array descending");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[size].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		myScanner.close();
	}
}
