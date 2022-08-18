import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input the 1st number: ");
		int numOne = scanner.nextInt();
		
		System.out.println("Input the 2nd number: ");
		int numTwo = scanner.nextInt();
		
		System.out.println("Input the 3rd number: ");
		int numThree = scanner.nextInt();

		if(numOne > numTwo)
			if(numOne > numThree)
				System.out.println("The greatest: " + numOne);
		
		if(numTwo > numOne)
			if (numTwo > numThree) 
				System.out.println("The greatest: " + numTwo);
		
		if(numThree > numOne)
			if (numThree > numTwo)
				System.out.println("The greatest: " + numThree);
		
		if(numOne == numTwo)
			System.out.println("Two equal numbers: " + numOne);
		
		if(numOne == numThree)
			System.out.println("Two equal numbers: " + numOne);
		
		if(numTwo == numThree)
			System.out.println("Two equal numbers: " + numTwo);
	}

}
