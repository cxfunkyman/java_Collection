import java.util.Arrays;
import java.util.Scanner;

// WAP to sort string array alphabetically ascending and descending.

public class SortStringArray {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
//	      String[] myArray = {"Jhon", "Name", "Laval", "Java", "Montreal", "Quebec"};
		  int nLength = 0;

			System.out.print("Enter the length of the array: ");
			nLength = myScanner.nextInt();

			String[] myArray = new String[nLength];

			System.out.println("Enter the array numbers: ");

			for (int i = 0; i < myArray.length; i++) {
				System.out.print((i + 1) + "- ");
				myArray[i] = myScanner.next();
			}
			System.out.print("\nThe original array: " + Arrays.toString(myArray));

			for(int i = 0; i < myArray.length - 1; i++) {
				
	         for (int j = i + 1; j < myArray.length; j++) {
	        	 
	            if(myArray[i].toLowerCase().compareTo(myArray[j].toLowerCase()) > 0) {
	            	
	               String temp = myArray[i];
	               myArray[i] = myArray[j];
	               myArray[j] = temp;
	            }
	         }
	      }
	      System.out.println("\nThe ascending array: " + Arrays.toString(myArray));	
	      
			for(int i = 0; i < myArray.length - 1; i++) {
				
		         for (int j = i + 1; j < myArray.length; j++) {
		        	 
		            if(myArray[i].toLowerCase().compareTo(myArray[j].toLowerCase()) < 0) {
		            	
		               String temp = myArray[i];
		               myArray[i] = myArray[j];
		               myArray[j] = temp;
		            }
		         }
		      }
		      System.out.println("The descending array: " + Arrays.toString(myArray));		
		
		myScanner.close();
	}
}
