import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		
		boolean divisible = false;
		
		System.out.print("Please enter a number: ");
		int primeNumb = myKeyboard.nextInt();
					
			for (int i = 2; i < primeNumb; i++) {
				
				divisible = primeNumb % i == 0;
				if (divisible)
					break; 
			}
			if (!divisible) // ok ?
				System.out.println(primeNumb + " is a prime number.");
			
			else {
				System.out.println(primeNumb + " is not a prime number.");
			}
	
		myKeyboard.close();	

	}
}
