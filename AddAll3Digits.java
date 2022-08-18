// Java program to find sum of all digits
// Provided a number and we have to use java program
// to find sum of all its digits.
// Example:
// Input:
// Number: 852
// Output:
// Sum of all digits: 15

import java.util.Scanner;

public class AddAll3Digits {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int myInputNum, temp1 = 0, temp2 = 0, temp3 = 0, sumDigits = 0;
		
		System.out.println("Please enter an Integer between 0 and 999");
		
		myInputNum = myScanner.nextInt();
		
		temp1 = myInputNum % 10;
		sumDigits += temp1; 
		temp2 = myInputNum / 10;
		temp1 = temp2 % 10;
		sumDigits += temp1;
		temp3 = myInputNum / 100 ;
		sumDigits += temp3;
		
		System.out.println("The addition of " + myInputNum + " is " + sumDigits);
		
		myScanner.close();		

	}

}
