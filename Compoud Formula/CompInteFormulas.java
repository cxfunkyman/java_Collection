/*
 Compound Interest Formulas:
  
1. Compound Interest Formula (simple)
This is the simple compound interest formula including initial deposit:

A = P * (1 + r/n)n*t

To calculate the total compound interest generated we need to subtract the initial principal:

I = P * (1 + r/n)n*t - P

2. Compound Interest Formula (with regular deposits)
Compound interest for principal equation

A = P * (1 + r/n)n*t

Future value of a series formula - end of period

A = PMT * (((1 + r/n)n*t -1) / (r/n))
Note: the formula above assumes deposits are made at the end of the period (end of month, year, etc.)

Future value of a series formula - beginning of period

A = PMT * (((1 + r/n)n*t -1) / (r/n)) * (1 + r/n)
Note: the formula above assumes deposits are made at the beginning of the period (end of month, year, etc.)

3. Compound Interest Formula (with different periodic payments)
Compound interest for principal equation

A = P * (1 + r/n)n*t

Future value of a series formula - end of period

A = PMT * pf * (((1 + r/n)n*t -1) / (r/n))

Legend:

A = future value of investment including interest (amount)
P = principal investment amount (initial deposit)
r = nominal annual interest rate (as a decimal)
t = the overall length of time the money is invested for and interest applied for
n = compounding frequency per unit of time t
I = total compound interest
PMT = the monthly payment / deposit
pf = the payment frequency in the compounding period

A = futureInvest
P = principalInvest
r = interestRate
t = overallTime
n = frequencyTime
I = totalCompInterest
PMT = thePMT
pf = paymentFrequency

 */

public class CompInteFormulas {
	
	double futureInvest;
	double principalInvest;
	double interestRate;
	double overallTime;
	double frequencyTime;
	double totalCompInterest;
	double thePMT;
	double paymentFrequency;
	
	void SimpleCompound (double principalInvest, double interestRate, double frequencyTime, double overallTime) {
		
		this.principalInvest = principalInvest;
		this.interestRate = interestRate;
		this.frequencyTime = frequencyTime;
		this.overallTime = overallTime;
		
		this.futureInvest = principalInvest * Math.pow((1 + (interestRate / frequencyTime)), (frequencyTime * overallTime));
		this.totalCompInterest = (principalInvest * Math.pow((1 + (interestRate / frequencyTime)), (frequencyTime * overallTime))) - principalInvest;
	}
	
	void PrintsimpleCompound() {
		
		System.out.println("The Compound Interest for future investment " + futureInvest);
		System.out.println("The Compound Interest generated future investment " + totalCompInterest);
		
	}

}
