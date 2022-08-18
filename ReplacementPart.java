import java.util.Scanner;

abstract class part{
	String partNumb;
	double budget;

	abstract void info();
}
class PartInfo extends part{
	String drawing;
	double partcost;

	PartInfo(String partNumb,double budget,String drawing,double partcost){
		super.partNumb = partNumb;
		super.budget = budget;
		this.drawing = drawing;
		this.partcost = partcost;
	}
	double remainbalance(){

		return super.budget - this.partcost;
	}
	void info() {
		System.out.println("\nThe part number: " + super.partNumb + String.format("\nThe budget cost: %.2f", super.budget)
		+ "\nParts drawing number: " + this.drawing + "\nThe remaining balance: " + remainbalance());
	}
}
class bestcost extends part{
	int i, j, partpos;
	final int n = 3;

	String[] partSupply = new String[n];
	double[] partPrice = new double[n];

	bestcost(String partNumb, double budget, String[] partSupply, double[] partPrice){
		super.partNumb = partNumb;
		super.budget = budget;
		this.partSupply = partSupply;
		this.partPrice = partPrice;
	}
	int bestprice() {

		this.partpos = 0;

		for( i = 1, j = 0; i < this.n; i++) {

			if(this.partPrice[i] < this.partPrice[j]) {
				this.partPrice[j] = this.partPrice[i];
				this.partpos = i;
			}
		}
		return partpos;
	}
	void info() {
		int j = bestprice();
		System.out.println("\nThe part number: " + super.partNumb + String.format("\nThe budget cost: %.2f", super.budget) 
		+ "$CAD \nThe best supplier name: " + this.partSupply[j] 
				+ String.format("\nThe best price offered: %.2f", this.partPrice[j]) + "$CAD");
	}
}

public class ReplacementPart {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		final int n = 3;
		

		while (true) {
			System.out.println("Welcome");
			System.out.print("Enter the part number: ");
			String partString = myScanner.next();
			System.out.print("Enter the budget cost: "); 

			double budgetcost = myScanner.nextDouble();

			System.out.println("Please select the supplier. \n1- Self Manufacturing   2- Outsourcing \nEnter just 1 or 2 please.");

			int input = myScanner.nextInt();

			if(input == 1) {
				System.out.print("Enter the part drawing number: ");
				String drawingString = myScanner.next();

				System.out.print("Enter the part cost: ");		
				float partcost = myScanner.nextFloat();

				PartInfo information = new PartInfo(partString,budgetcost,drawingString,partcost);
				information.info();
			}
			else {
				String suppliername[]=new String[n];
				double partprice[]=new double[n];

				for( int i = 0; i < n ;i++) {
					System.out.print("Enter supplier name: ");
					suppliername[i] = myScanner.next();
					System.out.print("Enter the cost: ");
					partprice[i] = myScanner.nextFloat();
				}

				bestcost offerBestcost = new bestcost(partString,budgetcost,suppliername,partprice);
				offerBestcost.info();
			}
		}

	}

}
