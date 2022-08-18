import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please put in degree in Farenheit: ");
		final double fahr = keyboard.nextDouble();
		
		double inCelsius = ((5.0 / 9) * (fahr - 32));
		
		System.out.println("The degree in Celsius is: " + inCelsius);

	}

}
