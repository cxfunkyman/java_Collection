import java.util.Scanner;

public class CommonIntInTwoArrays {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int[] arrayInt1 = new int[20];
		int[] arrayInt2 = new int[20];
		int arrayInput, count = 1;

		System.out.println("Please enter 20 numbers for first array: ");
		
		for (int i = 0; i < arrayInt1.length; i++) {	

			System.out.print(count++ + "- Enter a number: ");
			arrayInput = myScanner.nextInt();
			arrayInt1[i] = arrayInput;			
		}
		count = 1;
		System.out.println("\nPlease enter 20 numbers for second array: ");
		
		for (int i = 0; i < arrayInt2.length; i++) {	

			System.out.print(count++ + "- Enter a number: ");
			arrayInput = myScanner.nextInt();
			arrayInt2[i] = arrayInput;			
		}
		System.out.print("\nNumbers inside the first array: ");
		for (int i = 0; i < arrayInt1.length; i++) {     

			System.out.print(arrayInt1[i] + " ");    
		}
		System.out.println();
		System.out.print("\nNumbers inside the second array: ");
		for (int i = 0; i < arrayInt2.length; i++) {     

			System.out.print(arrayInt2[i] + " ");    
		}
		System.out.println();
		System.out.print("\nCommon numbers between the two arrays: ");

		for(int i = 0; i < arrayInt1.length; i++) {

			for(int j = 0; j < arrayInt2.length; j++) { 

				if(arrayInt1[i] == arrayInt2[j]){

					System.out.print(arrayInt1[i] + " ");
					break;
				}
			}
		} 
		myScanner.close();
	}
}
