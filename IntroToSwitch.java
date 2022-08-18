import java.util.Scanner;

public class IntroToSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char romanNumeral;
		int decimalValue = 0;		
		
		System.out.println("Please input a roman numeral <= 100: ");
		romanNumeral = scanner.next().toUpperCase().charAt(0);
		
		switch(romanNumeral) {
		
		case 'I':
			decimalValue = 1;			
			break;
			
		case 'V':
			decimalValue = 5;
			break;
			
		case 'X':
			decimalValue = 10;
			break;
			
		case 'L':
			decimalValue = 50;
			break;
			
		case 'C':
			decimalValue = 100;
			break;
			
		default:
			System.out.println("Not a roman numeral <= 100.");
			break;
		}
		
		System.out.println(decimalValue);
	}

}
