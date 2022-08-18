import java.util.Scanner;

public class FlagExample {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		// Three different flags to see how it works and to show that boolean is just
		// effective with two decision, while the others you can have multiple decisions.
		// And for you to see that you used this flags before.
		int flagInt1 = 0, flagInt2 = 0, flagInt3 = 0;
		String flagString1 = "", flagString2 = "", flagString3 = "";
		boolean flagBoolean = false;
		int firstNum, secondNum, numSum;
		
		System.out.println("this example is to see how a flag works.");
		System.out.println("\nWe are going to add two numbers. \nIf the result number is negative we'll print:"
				+          " The result number is negative. \nIf the result number is positive we'll print:"
				+          " The result number is positive. \nIf the result number is positive and higher than 15 we'll "
				+          "print: The result number is positive and higher than 15. \nIf the result number is positive "
				+          "but less than 15 we'll print: The result number is positive and lower than 15."
				+          "\nIf the result number is negative and higher than -15 we'll print: The result number is"
				+          " negative and higher than -15. \nIf the result number is negative and lower than -15"
				+          " we'll print: The result number is negative and lower than -15. \nIf the result number is positive"
				+          " and equals to 15 we'll print: The result number is positive and equals to 15. \nIf the result"
				+          " number is negative and equals to -15 we'll print: The result number is negative and equals to -15"
				+          "\nIf the result number is cero we'll print: The result number is cero");
		
		System.out.println();
		System.out.print("\nType the first number: ");
		firstNum = myScanner.nextInt();
		System.out.print("\nType the second number: ");
		secondNum = myScanner.nextInt();
		
		numSum = firstNum + secondNum;
		
		// The number you assign to the flag is up to you, there is no rule for that, you just have to
		// remember what number you assigned to the variable when you needed, you can put for int 123 or 486
		// or string "yes" "no" "maybe", but for boolean you can only use true and false, you can use the 
		// variable you like long numbLong = 1235897463' it doesn't matter the number you assign is meaningless.
		// this is for your own use, to make a comparison and is yours to use no the user or other people, but
		// remember when you assign something and others are going to see it, just specify it and keep it simple.
		
		if (numSum == 0) {
			flagInt1 = 0;
			flagString1 = "cero";			
		}
		if (numSum < 0) {
			flagBoolean = false;
			flagInt1 = -1;
			flagString1 = "negative";
		}
		if (numSum > 0) {
			flagBoolean = true;
			flagInt1 = 1;
			flagString1 = "positive";
		}
		if (numSum == 15) {
			flagInt2 = 15;
			flagString2 = "fithteen";
		}
		if (numSum == -15) {
			flagInt2 = -15;
			flagString2 = "minus fithteen";
		}
		if (numSum < 15 && numSum > 0) {
			flagInt3 = 14;
			flagString3 = "fourteen";
		}
		if (numSum > 15) {
			flagInt3 = 16;
			flagString3 = "sixteen";
		}
		if (numSum < -15) {
			flagInt3 = -16;
			flagString3 = "minus sixteen";
		}
		if (numSum > -15 && numSum < 0) {
			flagInt3 = -14;
			flagString3 = "minus fourteen";
		}
		// now let's use the flags to print the text.
		// LET'S START WITH THE BOOLEAN FLAG. positive and negative
		if (flagBoolean) {
			System.out.println("Boolean flag, the number " + numSum + " is positve.");// numSum is positive.
		}
		if (!flagBoolean){
			System.out.println("Boolean flag, the number " + numSum + " is negative.");// numSum is negative.
		}
		// NOW LET'S USE THE INT FLAG AND STRING FLAT SEPARTELY. without && and ||; one at a time.
		if (flagInt1 == 0) {
			System.out.println("Integer flag, the number " + numSum + " is cero.");// numSum == 0.
		}
		if (flagString1.equals("cero")) {
			System.out.println("String flag, the number " + numSum + " is cero.");// numSum == 0.
		}
		if (flagInt1 == 1) {
			System.out.println("Integer flag, the number " + numSum + " is positive.");// numSum is positive.
		}
		if (flagString1.equals("positive")) {
			System.out.println("String flag, the number " + numSum + " is positive.");// numSum is positive.
		}
		if (flagInt1 == -1) {
			System.out.println("Integer flag, the number " + numSum + " is negative.");// numSum is negative.
		}
		if (flagString1.equals("negative")) {
			System.out.println("String flag, the number " + numSum + " is negative.");// numSum is negative.
		}
		if (flagInt2 == 15) {
			System.out.println("Integer flag, the number " + numSum + " is positive and equals to 15.");// numSum == 15.
		}
		if (flagString2.equals("fithteen")) {
			System.out.println("String flag, the number " + numSum + " is positive and equals to 15.");// numSum == 15.
		}
		if (flagInt3 == 16) {
			System.out.println("Integer flag, the number " + numSum + " is positive and higher than 15.");// numSum > 15.
		}
		if (flagString3.equals("sixteen")) {
			System.out.println("String flag, the number " + numSum + " is positive and higher than 15.");// numSum > 15.
		}
		if (flagInt3 == 14) {
			System.out.println("Integer flag, the number " + numSum + " is positive and lower than 15.");// numSum < 15.
		}
		if (flagString3.equals("fourteen")) {
			System.out.println("String flag, the number " + numSum + " is positive and lower than 15.");// numSum < 15.
		}
		if (flagInt2 == -15) {
			System.out.println("Integer flag, the number " + numSum + " is negative and equals to -15.");// numSum == -15.
		}
		if (flagString2.equals("minus fithteen")) {
			System.out.println("String flag, the number " + numSum + " is negative and equals to -15.");// numSum == -15.
		}
		if (flagInt3 == -14) {
			System.out.println("Integer flag, the number " + numSum + " is negative and higher than -15.");// numSum > -15.
		}
		if (flagString3.equals("minus fourteen")) {
			System.out.println("String flag, the number " + numSum + " is negative and higher than -15.");// numSum > -15.
		}
		if (flagInt3 == -16) {
			System.out.println("Integer flag, the number " + numSum + " is negative and lower than -15.");// numSum < -15.
		}
		if (flagString3.equals("minus sixteen")) {
			System.out.println("String flag, the number " + numSum + " is negative and lower than -15.");// numSum < -15.
		}
		myScanner.close();
	}

}
