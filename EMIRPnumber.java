/*
* A prime number whose reversal is also a prime is called Emirp. 
* For example: 101, 131, 1933 are Emirps. Write a program that 
* outputs the first 100 Emirps starting from number 100. Your 
* program must contain a method to find the prime number and 
* another method for reversing a number.
* Sample output:
* 101 is an EMIRP.
* 107 is an EMIRP.
* 113 is an EMIRP.
* 131 is an EMIRP.
* 149 is an EMIRP.
* 151 is an EMIRP.
* 157 is an EMIRP.
* 167 is an EMIRP.
* 179 is an EMIRP.
* 181 is an EMIRP.
* 191 is an EMIRP.
* 199 is an EMIRP.
* 311 is an EMIRP.
* .
* .
* .
* 1847 is an EMIRP.
* 1867 is an EMIRP.
* 1879 is an EMIRP.
* 1901 is an EMIRP.
* 1913 is an EMIRP.
* 1933 is an EMIRP
*/

class Conversion {
	
	public boolean Prime(int numb1) {
		
		for(int i = 2; i < numb1; i++) {			
			if(numb1 % i == 0)
				return false;
		}
		return true;		
	}
	public int Emirp(int numb1) {
		
		int temp = 0;
		
		while (numb1 != 0)
		{
			temp = temp * 10 + numb1 % 10;
			numb1 = numb1 / 10;
		}
		return temp;
	}	
}

public class EMIRPnumber {

	public static void main(String[] args) {
		
		int counter = 0, reverse = 0;
		boolean prime = true;
		Conversion primer = new Conversion();
				
		for(int i = 100; counter <= 100; i++) {
			prime = primer.Prime(i);
			
			if(prime) {
				reverse = primer.Emirp(i);
				prime = primer.Prime(reverse);
				
				if(prime) {
				System.out.println(i + " is an EMIRP.");
				counter++;
				}
			}
		}
	}
}
