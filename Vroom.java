import java.util.Scanner;

public class Vroom {

	public static void main(String[] args) {
		Scanner myKeayboard = new Scanner(System.in);
		
		double numb3 = 0;		
		
		System.out.println("*** Welcom to Vroom! ***");
		System.out.println("Buy or rent a car? Enter B for buying, R for renting.");

	// Set the string input to get the B, b, R, r letters.		
		String input = myKeayboard.next();
		
	// Use the switch to compare in every case which letter is used.
		switch (input) {		
		
	// case 1, compare the B or b letter chosen and if is true continue the process 
	// inside the brackets of case 1 if not jump to the next case.
		case "B", "b":
		{
			System.out.println("So you'are here to Buy!");
			System.out.println("We have three different cars available:");
			System.out.println("1 - Toyota, 12K. \n2 - Ford, 25K. \n3 - Ferrari, 100K.");
			System.out.println("Which one do you want?");

	// Now we check the options for buying the car.		
			int num1 = myKeayboard.nextInt();
					
				if (num1 == 1)
					System.out.println("You got the Toyota \nBye !!");
				else if (num1 == 2)
					System.out.println("You got the Ford \nBye !!");
				else if (num1 == 3)
					System.out.println("You got the Ferrari \nBye !!");
	// else is apply if the number typed is not 1, 2 or 3. 
				else 
					System.out.println("Oops! We don't have that option \nBye !!");
		}	
		break;

		// case 1, compare the B or b letter chosen and if is true continue the process 
		// inside the brackets of case 1 if not jump to the next case.
		case "R" , "r":
		{
			System.out.println("So you'are here to Rent!");
			System.out.println("For how many days do you need the car:");
			double num2 = myKeayboard.nextDouble();
			
				if (num2 <= 0)
					System.out.println("Numbers of days can't be zero or negative \nBye");
		// else is apply if the number typed is greater than 0.
				else {
					numb3 = (3.5 * Math.pow(num2, 2)) / 2;
					System.out.println("Total rent is: C$"+ numb3);
					System.out.println("Bye !!");
				}
				
			}
		break;
		
		default:
			System.out.println("You didn't enter B or R and we don't offer any other services! \nBye !!");

		}
		
		myKeayboard.close();
		
	}
}
