import java.util.Scanner;

public class RadiusPerimeterCircle {

	public static void main(String[] args) {
		Scanner myKeayboard = new Scanner(System.in);
		
		/* Find the Area and Perimeter of the circle.
		 * P = 2 * π * r
		 * A = π * r²				
		*/
		
		System.out.println("To find the Area and Perimeter of the circle in cm:");
		System.out.println("For P = 2 * π * r");
		System.out.println("For A = π * r²");
		System.out.println();
		
		System.out.print("Enter the value for r : ");
		double r = myKeayboard.nextDouble();
			
		double P = (2 * Math.PI * r);
			   P = Math.round(P * 1000);
			   P = P / 1000;
			   
		double A = (Math.PI * Math.pow(r, 2));
			   A = Math.round(A * 1000);
			   A = A / 1000;
		
		System.out.println();
		System.out.println(P + " cm\u00B2");
		System.out.println(A + " cm\u00B2");
		
		}

}
