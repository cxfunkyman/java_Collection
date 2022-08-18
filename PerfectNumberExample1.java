import java.util.Scanner;  
public class PerfectNumberExample1  
{  
	public static void main(String args[]) {  
		
		int rem = 17, num = 13, high = 79;
		int rem1 = 17, num1 = 13, high1 = 79;
		int temp = 0, remainder = 0;

		
	    while (rem != 0)
        {
            
            remainder = rem % 10;
            temp = temp * 10 + remainder;
            rem = rem / 10;
        }
	    System.out.println(rem1 + " is a PRIME number and " + temp + " is a EMIRP number");
	    temp = 0;
	    
	    while (num != 0)
        {
            
            remainder = num % 10;
            temp = temp * 10 + remainder;
            num = num / 10;
        }
	    System.out.println(num1 + " is a PRIME number and " + temp + " is a EMIRP number");
	    temp = 0;
	    
	    while (high != 0)
        {
            
            remainder = high % 10;
            temp = temp * 10 + remainder;
            high = high / 10;
        }
	    System.out.println(high1 + " is a PRIME number and " + temp + " is a EMIRP number");
	    temp = 0;
 
	}  
}  