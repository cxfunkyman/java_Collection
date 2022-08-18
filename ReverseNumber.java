import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int[] arrayInt = new int[10];
		int arrayInput, remainder, arrayNumb, temp = 0, count = 1;

		System.out.println("Please enter 10 numbers for first array: ");
		
		for (int i = 0; i < arrayInt.length; i++) {	

			System.out.print(count++ + "- Enter a number: ");
			arrayInput = myScanner.nextInt();
			arrayInt[i] = arrayInput;			
		}
		System.out.println();
		System.out.print("\nNumbers inside the array: ");
		for (int i = 0; i < arrayInt.length; i++) {     

			if (i != arrayInt.length - 1)
			System.out.print(arrayInt[i] + ", "); 
			
			else
				System.out.println(arrayInt[i] + ".");
		}
		
		for (int i = 0; i < arrayInt.length; i++) {
		
			arrayNumb = arrayInt[i];
			temp = 0;

			while (arrayNumb != 0)
			{
				//remainder = arrayNumb % 10;
				temp = temp * 10 + arrayNumb % 10; //remainder;
				arrayNumb = arrayNumb / 10;
			}
			arrayInt[i] = temp;
		}
		System.out.print("\nThe Reverse number array: ");
		for (int i = 0; i < arrayInt.length; i++) {     

			if (i != arrayInt.length - 1)
			System.out.print(arrayInt[i] + ", "); 
			
			else
				System.out.println(arrayInt[i] + ".");
		}
	}
}
