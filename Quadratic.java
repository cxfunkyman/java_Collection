import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input a: ");
		double a = keyboard.nextDouble();

		System.out.println("Input b: ");
		double b = keyboard.nextDouble();

		System.out.println("Input c: ");
		double c = keyboard.nextDouble();

		double result = Math.pow(b, 2) - 4.0 * a * c;

		if(a != 0) {
			if(result > 0.0) {
				//double r1 = (-b + Math.sqrt(result)) / (2 * a);
				double r1 = (-b + Math.pow(result, 0.5)) / (2 * a);
				double r2 = (-b - Math.sqrt(result)) / (2 * a);

				System.out.println("The roots are " + r1 + " and " + r2);
			}

			if(result == 0.0) {
				double r1 = -b / (2.0 * a);
				System.out.println("The root is " + r1);
			}

			if(result < 0.0) {
				System.out.println("The equation has no real roots.");
			}
		}
		
		if(a == 0) {
			System.out.println("a cannot be zero!");
		}

	}

}
