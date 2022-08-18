import java.util.Scanner;

public class PrimeEmirpNumber {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int[] arrayInt = new int[10];
		int arrayInput, temp = 0;

		System.out.println("Please enter 10 numbers first array: ");
		System.out.println();

		for (int i = 0; i < arrayInt.length; i++) {	

			System.out.print("Enter a number: ");
			arrayInput = myScanner.nextInt();
			arrayInt[i] = arrayInput;

			//			System.out.println();
		}
		// find prime number.
		boolean isPrime = false;
		int remainder, arrayNumb;

		System.out.println();

		for(int i = 0; i < arrayInt.length; i++) {

			isPrime = arrayInt[i] % 2 == 0;

			if(!isPrime) {
				arrayNumb = arrayInt[i];

				while (arrayNumb != 0)
				{

					remainder = arrayNumb % 10;
					temp = temp * 10 + remainder;
					arrayNumb = arrayNumb / 10;
				}
			}
			if (!(temp % 2 == 0))
				System.out.println(arrayInt[i] + " is a PRIME number and " + temp + " is a EMIRP number");
			temp = 0;
		}
		myScanner.close();
	}
}
