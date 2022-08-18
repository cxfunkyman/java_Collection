import java.util.Scanner;

public class QuadFormula {

/** Lets solve 	ax^2 + bx + c = 0, a != 0,
 * use 
 *         -b ± √b^2-4ac
 *     x = --------------
 *              2a  
 *              
 * 
 */
	
	public static void main(String[] args) {

// Set variables for the formula.		
		
		double b, c, D, x1, x2;
		double a = 0;
// Activate Scanner.
		
		Scanner myKeyboard = new Scanner(System.in);
		
		System.out.println("Let's solve ax^2 + bx + c = 0, a != 0");
		System.out.println("Please enter de value for a, b ,c");
		
		System.out.println();

// Add value to the variables.  		
// As 'a' cannot be 0, check the variable value 
// and create a loop.
		
		while  (a == 0) {
		System.out.print("a= ");
		a = myKeyboard.nextDouble();

// If a=0 will not continue and repeat the operation.
		if (a == 0.0d) 
		System.out.println("a cannot be 0");

// If a is higher than 0 the loop is finished and continue.
		if (a > 0.0d) 	
			continue;		
	}

// Ask for the next two values B and C.
		System.out.print("b= ");
		b = myKeyboard.nextDouble();
		
		System.out.print("c= ");
		c = myKeyboard.nextDouble();
		
		System.out.println();
		
// First solve the determinant b^2 - 4ac.
// Second solve the operation to obtain x±.
		
		D = (Math.pow(b, 2) - (4 * a * c));
		
		x1 = ((-b) + Math.sqrt(D)) / (2 * a);
		
		x2 = ((-b) - Math.sqrt(D)) / (2 * a);
		
		System.out.println("RESULTS:");
		System.out.println();
		
		
		System.out.println("Determinat d= " + D);
		System.out.println("x1= " + x1);
		System.out.println("x2= " + x2);

		System.out.println();

// Rules from a quadratic formula for the results of the determinant.
// If b2 − 4ac > 0, there are two real solutions.
// If b2 − 4ac = 0, there is one real solution.
// If b2 − 4ac < 0, there are no real solutions.	

		if (D > 0)
			System.out.println("If b2 − 4ac > 0, there are two real solutions.");
		else if (D == 0)
			System.out.println("If b2 − 4ac = 0, there is one real solution.");
		else if (D < 0)
			System.out.println("If b2 − 4ac < 0, there are no real solutions.");
		
		
		myKeyboard.close();		
		
	
	}
}
