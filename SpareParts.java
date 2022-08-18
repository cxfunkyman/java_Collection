package Exams;

import java.util.Scanner;

/*
 * Write an abstract class encapsulating a part, with two attributes: 
 * the part number, and a budget cost for it. 
 * This class has two non-abstract subclasses: one encapsulating a self-manufactured part, 
 * and the other encapsulating an outsourced part. A self-manufactured part has a cost and 
 * a drawing number; it also has a method returning whether it is over budget or under budget. 
 * An outsourced part has a set of suppliers, each with a price for the part. It also has a 
 * method to retrieve the lowest-cost supplier for a part and the corresponding cost. 
 * You also need to include a class to test these two classes. 
 */

abstract class part{
	String partNumb;
	double budget;
	final int n = 3;

	abstract void info();
}
class PartInfo extends part{
	String drawing;
	double partcost;

	PartInfo(String partNumb,double budget,String drawing,double partcost) {
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
	int i, partpos;

	String[] partSupply = new String[super.n];
	double[] partPrice = new double[super.n];

	bestcost(String partNumb, double budget, String[] partSupply, double[] partPrice){
		super.partNumb = partNumb;
		super.budget = budget;
		this.partSupply = partSupply;
		this.partPrice = partPrice;
	}
	int bestprice() {

		this.partpos = 0;

		for(int i = 1, j = 0; i < this.n; i++) {

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
class ValidationLoop {
	
	ValidationLoop() {
		
	}	
	Scanner myScanner = new Scanner(System.in);
	int flagInput;
	
	void ValidLoop2 (int minVal, int maxVal) {
		boolean flagBoolean = true;
		
		while(flagBoolean) {
			this.flagInput = myScanner.nextInt();
			if (this.flagInput < minVal || this.flagInput > maxVal ) {
				System.out.println("Wrong input try again");
				System.out.print("Your option: ");
			}
			else {
				flagBoolean = false;				
			}
		}
	}
}

public class SpareParts {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		final int n = 3;
		ValidationLoop validation = new ValidationLoop();

		while (true) {
			System.out.println("Welcome");
			System.out.print("Enter the part number: ");
			String partString = myScanner.next();
			System.out.print("Enter the budget cost: "); 

			double budgetcost = myScanner.nextDouble();

			System.out.println("Please select the supplier. \n1- Self Manufacturing   2- Outsourcing \nEnter just 1 or 2 please.");

			validation.ValidLoop2(1, 2);
			
			if (validation.flagInput == 1) {
				
				System.out.print("Enter the part drawing number: ");
				String drawingString = myScanner.next();

				System.out.print("Enter the part cost: ");		
				Double partcost = myScanner.nextDouble();

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
					partprice[i] = myScanner.nextDouble();
				}

				bestcost offerBestcost = new bestcost(partString,budgetcost,suppliername,partprice);
				offerBestcost.info();
			}
		}
	}
}

/*
 * import java.util.Scanner;
abstract class part{
    String part_no;
    float budget_cost;
    abstract void show_info();
}
class self extends part{
    String drawing_no;
    float cost;
    self(String p_no,float bug_co,String draw_no,float cost){
        super.part_no=p_no;
        super.budget_cost=bug_co;
        this.drawing_no=draw_no;
        this.cost=cost;
    }
    float over_under_cal(){
        return super.budget_cost - this.cost;
    }
    void show_info() {
        System.out.println("\nThe part number: " + super.part_no);
        System.out.println("The budget cost: " + super.budget_cost + " $CAD");
        System.out.println("The drawing number: " + this.drawing_no);
        System.out.print("The balance: " + over_under_cal());
    }
}
class out extends part{
    int i;
    String supplier[]=new String[3];
    float price[]=new float[3];
    out(String p_no,float bug_co,String[] supplier,float[] price){
        super.part_no=p_no;
        super.budget_cost=bug_co;
        this.supplier=supplier;
        this.price=price;
    }
    int lower_cost() {
        float min=this.price[0];
        int j=0;
        for(int i=1;i<3;i++) {
            if(this.price[i]<min) {
                min=this.price[i];
                j=i;
                }
        }
        return j;
    }
    void show_info() {
        int j=lower_cost();
        System.out.println("\nThe part number: " + super.part_no);
        System.out.println("The budget cost: " + super.budget_cost + " $CAD");
        System.out.println("The best supplier name: " + this.supplier[j]);
        System.out.print("The best price offered: " + this.price[j] + " $CAD");
    }
}
public class A{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int i;
        System.out.print("Enter the part number: ");
        String p_no=in.next();
        System.out.print("Enter the budget cost: ");
        float bug_co=in.nextFloat();
System.out.print("Choose:  1- Self Manufacturing   2- Outsourcing (enter 1 or 2)");
        int ch=in.nextInt();
        switch(ch) {
            case 1: System.out.print("Enter the drawing number: ");
                    String draw_no=in.next();
                    System.out.print("Enter the cost: ");
                    float cost=in.nextFloat();
                    self s=new self(p_no,bug_co,draw_no,cost);
                    s.show_info();
                    break;
            case 2: String supplier[]=new String[3];
                    float price[]=new float[3];
                    for(i=0;i<3;i++) {
                          System.out.print("Enter the supplier name: ");
                        supplier[i]=in.next();
                        System.out.print("Enter his cost offer: ");
                        price[i]=in.nextFloat();
                    }
                    out o=new out(p_no,bug_co,supplier,price);
                    o.show_info();
                    break;
        }
    }
}
*/
