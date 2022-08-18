package Exams;

import java.util.Scanner;

public class Fibonacci {

	static long fibonacci(int n) {
		long fibonacci[] = new long[n + 2];
		int i;

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (i = 2; i <= n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci[n];
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int n = -1;

		while(true) {

			try {
				System.out.print("Input a number between 0 and 50 + \nYour option: ");
				n = myScanner.nextInt();
				System.out.println(fibonacci(n) + "\n");

			} 
			catch (NegativeArraySizeException e) {
				System.out.println(e);
				System.out.println("Only positive numbers allow.");

			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("Only positive numbers allow.");

			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("Only numbers allow.");

			}
		}		
	}
}
