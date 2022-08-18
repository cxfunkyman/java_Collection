

import java.util.Scanner;

public class Topping {
	Scanner myKeyboard = new Scanner(System.in);	

	private String[] toppingArray = {"Minced Meat", "no Minced Meat", "Regular Pepperoni", 
			"Double Pepperoni", "Tripple Pepperoni", "No Extra Pepperoni", 
			"Chicken Ham", "Regular Ham", "No Ham", "Squid", "Shrimp", 
			"Oyster", "Fish", "No Seafood"};
	private String mincedMeat = toppingArray[1], pepperoni = toppingArray[5], 
			hamType = toppingArray[8], seaFood = toppingArray[13];  // Default Values to Show if non is chosen.

	void editMincedMeat(int editableMincedMeat) {  // choose which minced meats are available.
		System.out.println("\nPlease choose your Minced Meat.");
		System.out.println("0 - No Minced Meat. \n1 - Minced Meat.");
		System.out.print("Your option: ");
		int optionMincedMeat = myKeyboard.nextInt();

		while (optionMincedMeat <= -1 || optionMincedMeat >= 2) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Minced Meat.");
			System.out.println("0 - No Minced Meat. \n1 - Minced Meat.");
			System.out.print("Your option: ");
			optionMincedMeat = myKeyboard.nextInt();
		} 

		if (optionMincedMeat == 1) {
			System.out.println("**-You chose Minced Meat-**");
			editableMincedMeat = 0;
		}
		if (optionMincedMeat == 0) {
			System.out.println("**-You chose no Minced Meat-**");
			editableMincedMeat = 1;
		}
		mincedMeat = toppingArray[editableMincedMeat];
	}

	void editPepperoni(int editablePepperoni) { // choose which pepperonis are available.
		System.out.println("\nPlease choose your Pepp \n1 - Regular Pepperoni."
				+  "\n2 - Double Pepperoni. \n3 - Triple Pepperoni.");
		System.out.print("Your option: ");
		int optionPepperoni = myKeyboard.nextInt();

		while (optionPepperoni <= -1 || optionPepperoni >= 4) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Pepperoni.");
			System.out.println("0 - No Extra Pepperoni. \n1 - Regular Pepperoni."
					+  "\n2 - Double Pepperoni. \n3 - Triple Pepperoni.");
			System.out.print("Your option: ");
			optionPepperoni = myKeyboard.nextInt();
		}

		if (optionPepperoni == 1) {
			System.out.println("**-You chose Regular Pepperoni-**");
			editablePepperoni = 2;
		}
		if (optionPepperoni == 2) {
			System.out.println("**-You chose Double Pepperoni-**");
			editablePepperoni = 3;			
		}
		if (optionPepperoni == 3) {
			System.out.println("**-You chose Tripple Pepperoni-**");
			editablePepperoni = 4;
		}
		if (optionPepperoni == 0) {
			System.out.println("**-You chose No Extra Pepperoni-**");
			editablePepperoni = 5;
		}
		pepperoni = toppingArray[editablePepperoni];
	}

	void editHamType(int editableHamType) { // choose which ham types are available.
		System.out.println("\nPlease choose your Ham type.");
		System.out.println("0 - No Ham. \n1 - Chicken Ham."
				+  "\n2 - Regular Ham.");
		System.out.print("Your option: ");
		int optionHam = myKeyboard.nextInt();

		while (optionHam <= -1 || optionHam >= 3) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Ham type.");
			System.out.println("0 - No Ham. \n1 - Chicken Ham."
					+  "\n2 - Regular Ham.");
			System.out.print("Your option: ");
			optionHam = myKeyboard.nextInt();
		}

		if (optionHam == 1) {
			System.out.println("**-You chose Chicken Ham-**");
			editableHamType = 6;
		}
		if (optionHam == 2) {
			System.out.println("**-You chose Regular Ham-**");
			editableHamType = 7;
		}
		if (optionHam == 0) {
			System.out.println("**-You chose no Ham-**");
			editableHamType = 8;
		}
		hamType = toppingArray[editableHamType];		
	}

	void editSeaFood(int editableSeaFood) { // choose which sea foods are available.
		System.out.println("\nPlease choose your Seafood.");
		System.out.println("0 - No Seafood. \n1 - Squid."
				+  "\n2 - Shrimp. \n3 - Oyster. \n4 - Fish.");
		System.out.print("Your option: ");
		int optionSeaFood = myKeyboard.nextInt();

		while (optionSeaFood <= -1 || optionSeaFood >= 5) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Seafood.");
			System.out.println("0 - No Seafood. \n1 - Squid."
					+  "\n2 - Shrimp. \n3 - Oyster. \n4 - Fish.");
			System.out.print("Your option: ");
			optionSeaFood = myKeyboard.nextInt();
		}

		if (optionSeaFood == 1) {
			System.out.println("**-You chose Squid-**");
			editableSeaFood = 9;
		}
		if (optionSeaFood == 2) {
			System.out.println("**-You chose Shrimp-**");
			editableSeaFood = 10;
		}
		if (optionSeaFood == 3) {
			System.out.println("**-You chose Oyster-**");
			editableSeaFood = 11;
		}
		if (optionSeaFood == 4) {
			System.out.println("**-You chose Fish-**");
			editableSeaFood = 12;
		}
		if (optionSeaFood == 0) {
			System.out.println("**-You chose No Seafood-**");
			editableSeaFood = 13;
		}
		seaFood = toppingArray[editableSeaFood];		
	}

	void printToppingEdit() { // print the states of the chosen options.
		System.out.println("\nYour Topping are: ");
		System.out.println("+ " + mincedMeat 
				+	"\n+ " + pepperoni
				+	"\n+ " + hamType
				+   "\n+ " + seaFood);
	}
}
