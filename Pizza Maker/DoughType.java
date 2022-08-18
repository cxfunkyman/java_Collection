

import java.util.Scanner;

public class DoughType {
	Scanner myKeyboard = new Scanner(System.in);	

	private String[] doughArray = {"Regular Crispy", "Extra Crispy", "No Crispy", "Regular Dough Bread", 
			"Spongy Dough Bread", "No Dough Bread", "Spicy Doug", "Garlic Doug", 
			"No Addition", "Mozzarella", "Cheddar", "Cheddar & Mozzarella", 
			"Cheddar, Mozzarella & Garlic", "No Border with Cheese"};
	private String doughCrispy = doughArray[2], doughBread = doughArray[5], 
			doughRegular = doughArray[8], doughBorderCheese = doughArray[13];  // Default Values to Show if non is chosen.


	void editDoughCrispy(int editableDoughCrispy) { // choose which Doughs crispy are available.
		System.out.println("\nPlease choose your type of Crispy Dough.");
		System.out.println("0 - No Crispy. \n1 - Regular Crispy."
				+  "\n2 - Extra Crispy.");
		System.out.print("Your option: ");
		int optionDoughCrispy = myKeyboard.nextInt();

		while (optionDoughCrispy <= -1 || optionDoughCrispy >= 3) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your type of Crispy Dough.");
			System.out.println("0 - No Crispy. \n1 - Regular Crispy."
					+  "\n2 - Extra Crispy.");
			System.out.print("Your option: ");
			optionDoughCrispy = myKeyboard.nextInt();
		}

		if (optionDoughCrispy == 1) {
			System.out.println("**-You chose Regular Crispy-**");
			editableDoughCrispy = 0;
		}
		if (optionDoughCrispy == 2) {
			System.out.println("**-You chose Extra Crispy-**");
			editableDoughCrispy = 1;
		}
		if (optionDoughCrispy == 0) {
			System.out.println("**-You chose no Crispy-**");
			editableDoughCrispy = 2;
		}
		doughCrispy = doughArray[editableDoughCrispy];
	}

	void editDoughBread(int editableDoughBread) { // choose which doughs bread are available.
		System.out.println("\nPlease choose your type of Dough Bread.");
		System.out.println("0 - No Dough bread. \n1 - Regular Dough Bread."
				+  "\n2 - Spongy Dough Bread.");
		System.out.print("Your option: ");
		int optionDoughBread = myKeyboard.nextInt();

		while (editableDoughBread <= -1 || editableDoughBread >= 3) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your type of Dough Bread.");
			System.out.println("0 - No Dough bread. \n1 - Regular Dough Bread."
					+  "\n2 - Spongy Dough Bread.");
			System.out.print("Your option: ");
			editableDoughBread = myKeyboard.nextInt();
		}

		if (optionDoughBread == 1) {
			System.out.println("**-You chose Regular Dough Bread-**");
			editableDoughBread = 3;
		}
		if (optionDoughBread == 2) {
			System.out.println("**-You chose Spongy Dough Bread-**");
			editableDoughBread = 4;
		}
		if (optionDoughBread == 0) {
			System.out.println("**-You chose no Dough Bread-**");
			editableDoughBread = 5;
		}
		doughBread = doughArray[editableDoughBread];
	}

	void editDoughRegular(int editableDoughRegular) { // choose which doughs regular are available.
		System.out.println("\nPlease choose your type of Regular Dough.");
		System.out.println("0 - No Addition. \n1 - Spicy Dough."
				+  "\n2 - Garlic Dough.");
		System.out.print("Your option: ");
		int optionDoughRegular = myKeyboard.nextInt();

		while (optionDoughRegular <= -1 || optionDoughRegular >= 3) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your type of Regular Dough.");
			System.out.println("0 - No Addition. \n1 - Spicy Dough."
					+  "\n2 - Garlic Dough.");
			System.out.print("Your option: ");
			optionDoughRegular = myKeyboard.nextInt();
		}

		if (optionDoughRegular == 1) {
			System.out.println("**-You chose Spicy Doug-**");
			editableDoughRegular = 6;
		}
		if (optionDoughRegular == 2) {
			System.out.println("**-You chose Garlic Doug-**");
			editableDoughRegular = 7;
		}
		if (optionDoughRegular == 0) {
			System.out.println("**-You chose no Addition-**");
			editableDoughRegular = 8;
		}
		doughRegular = doughArray[editableDoughRegular];
	}

	void editDoughBorderCheese(int editableDoughBorderCheese) {  // choose which Doughs Border with Cheese are available.
		System.out.println("\nPlease choose your type of Border with Cheese.");
		System.out.println("0 - No Border with Cheese. \n1 - Mozzarella."
				+  "\n2 - Cheddar. \n3 - Cheddar & Mozzarella."
				+ "\n4 - Cheddar, Mozzarella & Garlic.");
		System.out.print("Your option: ");
		int optionDoughBorderCheese = myKeyboard.nextInt();

		while (optionDoughBorderCheese <= -1 || optionDoughBorderCheese >= 5) { //wait for the user to input a correct option.
			System.out.println("\nIncorrect input");
			System.out.println("Please choose your type of Border with Cheese.");
			System.out.println("0 - No Border with Cheese. \n1 - Mozzarella."
					+  "\n2 - Cheddar. \n3 - Cheddar & Mozzarella."
					+ "\n4 - Cheddar, Mozzarella & Garlic.");
			System.out.print("Your option: ");
			optionDoughBorderCheese = myKeyboard.nextInt();
		}

		if (optionDoughBorderCheese == 1) {
			System.out.println("**-You chose Mozzarella-**");
			editableDoughBorderCheese = 9;
		}
		if (optionDoughBorderCheese == 2) {
			System.out.println("**-You chose Cheddar-**");
			editableDoughBorderCheese = 10;
		}
		if (optionDoughBorderCheese == 3) {
			System.out.println("**-You chose Cheddar & Mozzarella-**");
			editableDoughBorderCheese = 11;
		}
		if (optionDoughBorderCheese == 4) {
			System.out.println("**-You chose Cheddar, Mozzarella & Garlic-**");
			editableDoughBorderCheese = 12;
		}
		if (optionDoughBorderCheese == 0) {
			System.out.println("**-You chose no Border with Cheese-**");
			editableDoughBorderCheese = 13;
		}
		doughBorderCheese = doughArray[editableDoughBorderCheese];
	}

	void printDoughEdit() { // print the states of the chosen options.
		System.out.println("\nYour Dough type is: ");
		System.out.println("+ " + doughCrispy 
				+	"\n+ " + doughBread
				+	"\n+ " + doughRegular
				+   "\n+ " + doughBorderCheese);
	}
}
