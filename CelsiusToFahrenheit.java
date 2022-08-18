import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please put in degree in Celsius: ");
		final double celsius = keyboard.nextDouble();

		double inFahr = (celsius * (9 / 5.0)) + 32;

		System.out.println("The degree in Fahrenheit is: " + inFahr);


	}

}
