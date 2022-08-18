import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a year: ");
		int input = scanner.nextInt();

		if(input % 400 == 0) 
			System.out.println("This is a leap year!");
		else if(input % 100 == 0) 
			System.out.println("This is not a leap year!");
		else if(input % 4 == 0) 
			System.out.println("This is a leap year!");
		else 
			System.out.println("This is not a leap year!");


		scanner.close();
	}
}
