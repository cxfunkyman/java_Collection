/*
 * Write an abstract superclass encapsulating a vacation: 
 * A vacation has two attributes: a budget and a destination. 
 * It has an abstract method returning by how much the vacation 
 * is over or under budget. This class has two non-abstract 
 * subclasses: one encapsulating an all-inclusive vacation, and 
 * the other encapsulating a vacation bought piecemeal. An 
 * all-inclusive vacation has three additional attributes: a brand 
 * (for instance ClubMed); a rating, expressed as a number of stars;
 * and a price. A piecemeal vacation has two additional attributes: 
 * a set of items (hotel, meal, airfare, …), and a set of corresponding 
 * costs. You also need to include a class to test these two classes.
 */

import java.util.Scanner;

abstract class vacation {
	double budget;
	String destination;

	abstract double budremain(double resortBudget);
}

class allinclusive extends vacation {
	String chain;
	int rating;
	double price;

	allinclusive(String destination, double budget, String chain, int rating, double price){

		super.destination = destination;
		super.budget = budget;
		this.price = price;
		this.chain = chain;
		this.rating = rating;
	}

	double budremain(double price) {
		return super.budget - price;
	}

	void info() {
		System.out.println("\nDestination: " + super.destination + String.format("\nNecessary budget: %.2f", super.budget) + " $CAD"
				+ "\nHotel chain: " + this.chain + "\nRate: " + this.rating + " stars hotel" 
				+ String.format("\nYour are %.2f", budremain(this.price))+ " $CAD over the necessary budget");
	}
}

class piecemeal extends vacation {
	String setofitems;
	double resortBudget;

	piecemeal(String destination,double budget,String setofitems,double resortBudget) {
		super.destination = destination;
		super.budget = budget;
		this.setofitems = setofitems;
		this.resortBudget = resortBudget;
	}

	double budremain(double price) {
		return super.budget - price;
	}

	void info() {
		System.out.println("\nDestination: " + super.destination + String.format("\nNecessary budget: %.2f", super.budget) + " $CAD"
				+ "\nItems: " + this.setofitems + String.format("\nCorresponding cost %.2f", this.resortBudget) + " $CAD"
				+  String.format("\nYour are %.2f", budremain(this.resortBudget))+ " $CAD over the necessary budget");
	}
}

class validateinputs {
	Scanner myScanner = new Scanner(System.in);
	int flagNumbInput;
	String flagString;

	void validateinput(int minVal, int maxVal) {

		boolean flagBoolean = true;

		while(flagBoolean) {
			this.flagNumbInput = myScanner.nextInt();
			if (this.flagNumbInput < minVal || this.flagNumbInput > maxVal ) {
				System.out.println("Wrong input try again");
				System.out.print("Your option: ");
			}
			else {
				flagBoolean = false;				
			}
		}
	}
}
class choices {
	Scanner myScanner = new Scanner(System.in);

	void choiseone(String destination, double budget) {

		System.out.print("\nPlease enter the resort chain name: ");
		String brand = myScanner.next();

		System.out.print("Please enter the rating stars: ");
		int rating = myScanner.nextInt();

		System.out.print("Please enter the price: ");
		double price = myScanner.nextDouble();
		allinclusive inclusive = new allinclusive(destination, budget, brand, rating, price);

		inclusive.info();
	}
	void choisetwo(String destination,double budget) {

		System.out.print("\nPlease enter the corresponding cost: ");
		double cost = myScanner.nextDouble();

		System.out.print("Please enter the set of items: ");
		String setofitem = myScanner.next();
		piecemeal meal = new piecemeal(destination, budget, setofitem, cost);

		meal.info();
	}
}
public class Resort{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		validateinputs validate = new validateinputs();
		choices choices = new choices();
		boolean loopW = true;

		while (loopW) {	

			System.out.print("Please enter your desire vacation destination: ");
			String destination = myScanner.next();

			System.out.print("Please enter your budget: ");
			double budget = myScanner.nextDouble();

			System.out.print("Please choose one of the following options (type only 1 or 2): "
					+ "\n1- ALL-INCLUSIVE   2- PIECEMEAL \nYour option: ");

			validate.validateinput(1, 2);

			if (validate.flagNumbInput ==1) {
				choices.choiseone(destination, budget);
			}
			else {
				choices.choisetwo(destination, budget);
			}
			
			System.out.println("\nDo you want to choose again. \nChoose from the following options: "
						+ "\n1- CHOOSE AGAIN. 2- EXIT.");

				validate.validateinput(1, 2);

				if (validate.flagNumbInput == 2) {
					myScanner.close();
					System.exit(0);
				}
			}
			System.out.println();		
	}
}
