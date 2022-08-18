import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input a number: ");
		int input = keyboard.nextInt();
		
		if(input > 0) {
			System.out.println("Number is positive.");
		} else if(input < 0) {
			System.out.println("Number is negative.");
		} else {
			System.out.println("Number is zero.");
		}
		
	}
}
