

import java.util.Scanner;

public class PizzaMaker {

	public static void main(String[] args) {
		Scanner mykeyboard = new Scanner(System.in);

		int chooseOption, chooseOwnPizza,  continueOrQuit;
		boolean answerYesOrNo = true, doWhileLoop = true;
		Ingredients ingredients2 = new Ingredients();
		Topping topping2 = new Topping();
		DoughType doughType = new DoughType();

		do { //Repeat the program in a infinite loop.
			System.out.println("Welcome to Vanier Pizza.");
			System.out.println("These are the Options Pizza:");
			System.out.println("1 - Garlic Pizza. \n2 - Regular Pizza (Cheese & Pepperoni)."
					+ "\n3 - Make your own Pizza. \n4 - Exit.");
			System.out.print("Your option: ");
			chooseOption = mykeyboard.nextInt();

			while (chooseOption <= 0 || chooseOption >= 5) { //wait for the user to input a correct option.
				System.out.println("\nWe don't have that option or incorrect input.");
				System.out.println("Please Choose from the 4 options:");
				System.out.println("1 - Garlic Pizza. \n2 - Regular Pizza (Cheese & Pepperoni). "
						+ "\n3 - Make your own Pizza. \n4 - Exit.");
				System.out.print("Your option: ");
				chooseOption = mykeyboard.nextInt();
			}
			if (chooseOption == 1) {
				System.out.println("\nYou chose Garlic Pizza."
						+ "\nYour order will be ready in 10 minutes");
				System.out.println("Thank you for buying at Vanier Pizza.");
			}
			if (chooseOption == 2) {
				System.out.println("\nYou chose Regular Pizza (Cheese & Pepperoni)."
						+ "\nYour order will be ready in 15 minutes");
				System.out.println("Thank you for buying at Vanier Pizza.");
			}
			if (chooseOption == 3) {
				System.out.println("\nYou chose to make your own Pizza. "
						+ "\nWe have these options.");

				do { //Repeat the program in a small infinite loop with an option to end the loop.
					System.out.println("\n1 - Add Ingredients: \n* - Vegetables."
							+ "\n* - Cheese. \n* - Oil.");
					System.out.println("\n2 - Add Topping: \n* - Minced Meat."
							+ "\n* - Extra Pepperoni. \n* - Ham. \n* - Seafood.");
					System.out.println("\n3 - Add Dough Type: \n* - Dough Crispy."
							+ "\n* - Dough Bread. \n* - Dough Regular. \n* - Border with Cheese.");
					System.out.print("\nChoose one of the three options: ");
					chooseOwnPizza = mykeyboard.nextInt();
					
					while (chooseOwnPizza <= 0 || chooseOwnPizza >= 4) { //wait for the user to input a correct option.
						System.out.println("\nWe don't have that option or incorrect input.");
						System.out.println("Please Choose from the 3 options:");
						System.out.println("1 - Add Ingredients. \n2 - Add Topping. "
								+ "\n3 - Add Dough Type.");
						System.out.print("Your option: ");
						chooseOwnPizza = mykeyboard.nextInt();
					}
					if (chooseOwnPizza == 1) { //Call the Ingredients.java class to make the operations.
						System.out.print("\nChoose your option.");
						ingredients2.editVegetables(0);
						ingredients2.editCheese(0);
						ingredients2.editOil(0);
					}
					if (chooseOwnPizza == 2) { //Call the Topping.java class to make the operations.
						System.out.print("\nChoose your option.");
						topping2.editMincedMeat(0);
						topping2.editPepperoni(0);
						topping2.editHamType(0);
						topping2.editSeaFood(0);
					}
					if (chooseOwnPizza == 3) {  //Call the DoughType.java class to make the operations.
						System.out.print("\nChoose your option.");
						doughType.editDoughCrispy(0);
						doughType.editDoughBread(0);
						doughType.editDoughRegular(0);
						doughType.editDoughBorderCheese(0);
					}
					System.out.println("\nDo you want to add one more option");
					System.out.print("To add more press 1. \nTo finish your order press 2. \nYour option: ");
					continueOrQuit = mykeyboard.nextInt();

					while (continueOrQuit <= 0 || continueOrQuit >= 3) { //wait for the user to input a correct option.
						System.out.println("\nWrong input");
						System.out.println("To add more press 1"+"\nTo finish your order press 2");
						continueOrQuit = mykeyboard.nextInt();				
					}
					if (continueOrQuit == 2) { // If the user quit, print the order and get out of the loop.
						answerYesOrNo = false;
						ingredients2.printIgedientsEdit();
						topping2.printToppingEdit();
						doughType.printDoughEdit();
						System.out.println("\nYour order will be ready in 20 minutes");
						System.out.println("Thank you for buying at Vanier Pizza.");
					}

				}while (answerYesOrNo);
			}
			if (chooseOption == 4) { // For the user exit the program.
				System.out.println("\nYou chose exit. Great!, Have a nice day. "
						+ "\nThank you for buying at Vanier Pizza.	");
				System.out.println("Good bye!!");
				doWhileLoop = false;
			}
			System.out.println();

		}while(doWhileLoop);

		mykeyboard.close();
		System.exit(0);

	}
}

