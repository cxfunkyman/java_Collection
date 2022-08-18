import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		
		System.out.println("Average of five numbers");
		
		System.out.println("Enter five number:");
		
		System.out.print("A = ");
		double A = myKeyboard.nextDouble();
		
		System.out.print("B = ");
		double B = myKeyboard.nextDouble();
		
		System.out.print("C = ");
		double C = myKeyboard.nextDouble();
		
		System.out.print("D = ");
		double D = myKeyboard.nextDouble();
		
		System.out.print("E = ");
		double E = myKeyboard.nextDouble();
		
		System.out.println("Average = " + (A + B + C + D + E) / 5);
		
	}

}
