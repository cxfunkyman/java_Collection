import java.util.Scanner;

public class Multiples {


	public static void main(String[] args) {

		final int PER_LINE = 5;
		int value, limit, mult,count = 0;

		Scanner myKeyboardScanner = new Scanner(System.in);

		System.out.print("Enter a positive value: ");
		value = myKeyboardScanner.nextInt();

		System.out.print("Enter an upper limit: ");
		limit = myKeyboardScanner.nextInt();
		
		System.out.println("Multiples of   " + value + "  between  " + value + "  &  " + limit);

		for(mult = value; mult <= limit; mult += value)

		{ 
			System.out.print(mult + "\t");
			count++;

		if (count % PER_LINE == 0)
			System.out.println();

		}
		
		myKeyboardScanner.close();
		
	}

}