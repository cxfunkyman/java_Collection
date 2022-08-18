import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/*
  Java program to calculate compound
interest
Given the principle, rate and time, and using java
program we have to find compound interest.
Example:
Enter Principal : 5000
Enter Rate : 5
Enter Time : 3
Amount : 5788.125000000001
Compound Interest : 788.1250000000009
 
User Input:

Initial Principle - Amount of money that you have available to invest initially.

Regular Deposit / Withdrawal - Amount that you plan to add to the principal every month, 
or a negative number for the amount that you plan to withdraw.

Deposit / Withdrawal Frequency - How often you plan to add to your deposit or make a withdraw.
This ranges from daily to yearly.

Rate (%) - Your estimated annual interest rate.

Years - Length of time, in years, that you plan to save.

Compound frequency - Times per period that interest will be compounded. The compound interest 
calculator includes a variety of compounding periods available for you to experiment with:

1- daily compounding
2- weekly compounding (& bi-weekly)
3- monthly compounding ( + bi-monthly & semi-monthly)
4- quarterly compounding
5- yearly compounding (& semi-annually)

Tax (%) (optional) - Amount of tax in % that is paid on a yearly basis at the end of the year on interest earnings, and thus subtracted from the end of year total earnings. On / Off button allows you to calculate future gains with or without tax.

Inflation (%) (optional) - Inflation-adjusted return reveals the return on an investment after removing the effects of inflation. Removing the effects of inflation from the return of an investment allows the investor to see the true earning potential of the security without external economic forces. On / Off button allows you to display future gains that are inflation adjusted.

 */


public class CompoundInterest {

	public static void main(String[] args) {
		
	Scanner myScanner = new Scanner(System.in);
	
	CompInteFormulas calculate = new CompInteFormulas();
	
	double initialDeposit, nominalInterest, timeOverall, timeFrequency;
	
	System.out.println("Welcome to the Compound Interest Calculator. \nPlease enter the following values to proceed with the calculations:");
	
	System.out.println("Enter the principal investment amount (initial deposit): ");
	initialDeposit = myScanner.nextDouble();
	
	System.out.println("Enter the nominal annual interest rate (as a decimal): ");
	nominalInterest = myScanner.nextDouble();
	
	System.out.println("Enter the overall length of time the money is invested for and interest applied for: ");
	timeOverall = myScanner.nextDouble();
	
	System.out.println("Enter the compounding frequency per unit of time of the overall length of time: ");
	timeFrequency = myScanner.nextDouble();
	
	calculate.SimpleCompound(initialDeposit, nominalInterest, timeOverall, timeFrequency);
	
	calculate.PrintsimpleCompound();
	

	}

}
