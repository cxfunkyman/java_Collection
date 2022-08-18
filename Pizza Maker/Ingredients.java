

import java.util.Scanner;

public class Ingredients {
	Scanner myKeyboard = new Scanner(System.in);

	private String[] ingredientsArray = {"Pepper", "Hot Pepper", "Onion", "No Vegetables",
			"Double Cheese", "Tripple Cheese", "Cheddar Cheese", "Goat Cheese",
			"Regular Cheese", "Spicy Oil", "Olive Oil", "No Oil"};
	private String vegetables = ingredientsArray[3], cheese = ingredientsArray[8], 
			oil = ingredientsArray[11];  // Default Values to Show if non is chosen.

	void editVegetables(int editableVegetables) {	// choose which vegetables are available. 
		System.out.println("\nPlease choose your Vegetables.");
		System.out.println("0 - No Vegetables. \n1 - Pepper."
				+  "\n2 - Hot Pepper. \n3 - Onion.");
		System.out.print("Your option: ");
		int optionVegetables = myKeyboard.nextInt();

		while (optionVegetables <= -1 || optionVegetables >= 4) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Vegetables.");
			System.out.println("0 - No Vegetables. \n1 - Pepper."
					+  "\n2 - Hot Pepper. \n3 - Onion.");
			System.out.print("Your option: ");
			optionVegetables = myKeyboard.nextInt();
		}
		if (optionVegetables == 1) {
			System.out.println("**-You chose Pepper-**");
			editableVegetables = 0;
		}
		if (optionVegetables == 2) {
			System.out.println("**-You chose Hot Pepper-**");
			editableVegetables = 1;
		}
		if (optionVegetables == 3) {
			System.out.println("**-You chose Onion-**");
			editableVegetables = 2;
		}
		if (optionVegetables == 0) {
			System.out.println("**-You chose No Vegetables-**");
			editableVegetables = 3;
		}
		vegetables = ingredientsArray[editableVegetables];
	}

	void editCheese(int editableCheese) { // choose which cheeses are available. 
		System.out.println("\nPlease choose your Cheese.");
		System.out.println("0 - Regular Cheese. \n1 - Double Cheese."
				+  "\n2 - Tripple Cheese. \n3 - Cheddar Cheese. \n4 - Goat Cheese.");
		System.out.print("Your option: ");
		int optionCheese = myKeyboard.nextInt();

		while (optionCheese <= -1 || optionCheese >= 5) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Vegetables.");
			System.out.println("0 - Regular Cheese. \n1 - Double Cheese."
					+  "\n2 - Tripple Cheese. \n3 - Cheddar Cheese. \n4 - Goat Cheese.");
			System.out.print("Your option: ");
			optionCheese = myKeyboard.nextInt();
		}

		if (optionCheese == 1) {
			System.out.println("**-You chose Double Cheese-**");
			editableCheese = 4;
		}
		if (optionCheese == 2) {
			System.out.println("**-You chose Tripple Cheese-**");
			editableCheese = 5;
		}
		if (optionCheese == 3) {
			System.out.println("**-You chose Cheddar Cheese-**");
			editableCheese = 6;
		}
		if (optionCheese == 4) {
			System.out.println("**-You chose Goat Cheese-**");
			editableCheese = 7;
		}
		if (optionCheese == 0) {
			System.out.println("**-You chose Regular Cheese-**");
			editableCheese = 8;
		}
		cheese = ingredientsArray[editableCheese];		
	}

	void editOil(int editableOil) { // choose which oils are available.
		System.out.println("\nPlease choose your Oil");
		System.out.println("0 - No Oil. \n1 - Spicy Oil."
				+  "\n2 - Olive Oil.");
		System.out.print("Your option: ");
		int optionOil = myKeyboard.nextInt();

		while (optionOil <= -1 || optionOil >= 3) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your Vegetables.");
			System.out.println("0 - No Oil. \n1 - Spicy Oil."
					+  "\n2 - Olive Oil.");
			System.out.print("Your option: ");
			optionOil = myKeyboard.nextInt();
		}

		if (optionOil == 1) {
			System.out.println("**-You chose Spicy Oil-**");
			editableOil = 9;
		}
		if (optionOil == 2) {
			System.out.println("**-You chose Olive Oil-**");
			editableOil = 10;
		}
		if (optionOil == 0) {
			System.out.println("**-You chose no Oil-**");
			editableOil = 11;
		}
		oil = ingredientsArray[editableOil];		
	}

	void printIgedientsEdit() { // print the states of the chosen options.
		System.out.println("\nYour Ingredients are: ");
		System.out.println("+ " + vegetables 
				+	"\n+ " + cheese
				+	"\n+ " + oil);
	}
}
