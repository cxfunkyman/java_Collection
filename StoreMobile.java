package Exams;

import java.util.Scanner;

/*
 * 1-	Considering the following class:

class Store1 {
	public final double SALES_TAX_RATE = 0.06;  
	private String name;  
	public Store1(String name ){   
		setName( name );
		}
	public String getName(){
		return name;  
		} 
	public void setName(String name ){
		this.name = name;
		} 
	public String toString(){
		return("Name: " + name );		
}
}

Create a class encapsulating a Mobile store, which inherits from Store. 
A Mobile store has the following additional attributes: its annual sale 
and the number of hand-sets sold, on monthly basis. Code the constructor 
and the toString method of the new class; also code a method returning 
the average selling price for each hand-set, and another method to show 
the month in which the most hand-set sale has been experienced. You also 
need to include a client class to test your code.
 */

class Store1 {
	Scanner myScanner = new Scanner(System.in);
	public final double SALES_TAX_RATE = 0.06;  
	private String name;  
	public Store1(String name ){   
		setName( name );
	}
	public String getName(){
		return name;  
	} 
	public void setName(String name ){
		this.name = name;
	} 
	public String toString(){
		return("Name: " + name );		
	}
}

class MobileStore extends Store1 {
	double anualSale;
	double anualSaleTax;
	int numbSoldMonth;
	
	
	
	MobileStore(String name) {
		super(name);
	}

	public String toString() {
		return "Store Mobile " + super.toString();
	}	
} 

class Month {
	Scanner myScanner = new Scanner(System.in);
	int jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec;
	int soldTotal;
	double sellAnual;
	double average;
	int bestmonth;
	int position;
	String monthArray[] = {"January", "Febrary", "March", "April", "May",
			"June", "July", "August", "September", "October", "November", "Dicember"};	
	int[] numbArray = new int[monthArray.length];

	void MonthSales() {
		System.out.println("Enter the amount of hand-sets sold by month.");
		for (int i = 0; i < 12; i++) {
			System.out.print(this.monthArray[i] + ": ");

			if (i == 0) {
				this.jan = myScanner.nextInt();
				this.numbArray[i] = this.jan;
			}
			else if (i == 1) {
				this.feb = myScanner.nextInt();
				this.numbArray[i] = this.feb;
			}
			else if (i == 2) {
				this.mar = myScanner.nextInt();
				this.numbArray[i] = this.mar;
			}
			else if (i == 3) {
				this.apr = myScanner.nextInt();
				this.numbArray[i] = this.apr;
			}
			else if (i == 4) {
				this.may = myScanner.nextInt();
				this.numbArray[i] = this.mar;
			}
			else if (i == 5) {
				this.jun = myScanner.nextInt();
				this.numbArray[i] = this.jun;
			}
			else if (i == 6) {
				this.jul = myScanner.nextInt();
				this.numbArray[i] = this.jul;
			}
			else if (i == 7) {
				this.aug = myScanner.nextInt();
				this.numbArray[i] = this.aug;
			}
			else if (i == 8) {
				this.sep = myScanner.nextInt();
				this.numbArray[i] = this.sep;
			}
			else if (i == 9) {
				this.oct = myScanner.nextInt();
				this.numbArray[i] = this.oct;
			}
			else if (i == 10) {
				this.nov = myScanner.nextInt();
				this.numbArray[i] = this.nov;
			}
			else {
				this.dec = myScanner.nextInt();
				this.numbArray[i] = this.dec;
			}
		}

		for(int i = 1, j = 0; i < this.numbArray.length; i++) {

			if( this.numbArray[j] < this.numbArray[i] ) {
				this.bestmonth = this.numbArray[i];
				this.position = i;
			}
		}
		this.soldTotal = jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + dec;
		this.average = this.sellAnual / this.soldTotal;
		
	}
	public String toString() {
		return 	 String.format("Anual Sale: %.2f", this.sellAnual) +"$CAD"+ "\nTotal anual mobile sold: " + this.soldTotal
				+ String.format("\nAvarage price per hand-sets sold: %.2f", this.average) +"$CAD"+ "\nBest selling month : " + this.monthArray[position] 
						+ " with " + this.bestmonth + " units sold.";
	}
}
class show {	

	void menu1() {
		System.out.println("Welcome to the mobile store. \nEnter the name of the store:");
	}
	void menu2() {
		System.out.println("Now enter the store anual sale:");
	}
}

public class StoreMobile {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		show menuShow = new show();
		Month m = new Month();
		String storeName;		

		menuShow.menu1();
		MobileStore store = new MobileStore(storeName = myScanner.next());
		menuShow.menu2();
		store.anualSale = myScanner.nextDouble();
		m.sellAnual = store.anualSale;
		m.MonthSales();
		System.out.println(store.toString());
		System.out.println(m.toString());

		myScanner.close();
	}

}