import java.util.Scanner;

// WAP to find a palindrome string.

public class PalindromeString {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		String myString = "", reverseString = "";
		int stringLength;
		
		System.out.print("Enter a string: ");
		myString = myScanner.next();
		
		stringLength = myString.length();
		
		for (int i = stringLength; i > 0; i--) {
			reverseString += myString.charAt(i - 1);
		}
		System.out.println(reverseString);
		
		if (reverseString.toLowerCase().equals(myString.toLowerCase())) 
			System.out.println("The string is a Palindrome.");
		else
			System.out.println("The string is not a Palindrome.");	
		
		myScanner.close();
	}
}
