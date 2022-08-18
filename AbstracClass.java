import java.util.Scanner;

/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. 
 * $100, $150 and $200 are deposited in banks A, B and C respectively. 
 * 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each 
 * having a method named 'getBalance'. Call this method by creating an 
 * object of each of the three classes.
 */

abstract class Bank {
	
	abstract void getBalance();
}

class BankA extends Bank{
	
	int A = 0;

	public void setA(int a) {
		A = a;
	}	
	void getBalance() {
		
		System.out.println("You have deposited $" + A + " at BankA.");
	}	
}
class BankB extends Bank{
	
	int B = 0;	

	public void setC(int b) {
		B = b;
	}	
	void getBalance() {
		
		System.out.println("You have deposited $" + B + " at BankB.");
	}	
}
class BankC extends Bank{
	int C = 0;
	
	public void setC(int c) {
		C = c;
	}	
	void getBalance() {
		
		System.out.println("You have deposited $" + C + " at BankC.");
	}
	
}
public class AbstracClass {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		BankA bA = new BankA();
		BankB bB = new BankB();
		BankC bC = new BankC();
		
		System.out.print("Enter the amount for Bank A: CAD$");
		bA.A = myScanner.nextInt();
//		bA.A = 100;
		System.out.print("Enter the amount for Bank B: CAD$");
		bB.B = myScanner.nextInt();
//		bB.B = 150;
		System.out.print("Enter the amount for Bank C: CAD$");
		bC.C = myScanner.nextInt();
//		bC.C = 200;

		bA.getBalance();
		bB.getBalance();
		bC.getBalance();

		myScanner.close();
	}

}



