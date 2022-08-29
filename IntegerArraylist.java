package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Create a class that accepts the numbers from the user 
 * (as long as he wants to enter), and then, when the user 
 * has finished with his data entry, multiplies even numbers 
 * by 2 and odd numbers by 3 and replaces them in the ArrayList. 
 * Print the result. 
 */

public class IntegerArraylist {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		ArrayList<Integer> arrInt = new ArrayList<>(10);
		boolean flag = true;
		
		while (flag) {
			System.out.println("Do you want to enter a value. 1- Yes, 2- No.");
			int input = myScanner.nextInt();
			
			if (input == 1) {
				System.out.print("Enter a number: ");
				int numb = myScanner.nextInt();
				arrInt.add(numb);
			}
			else {
				flag = false;
			}
		}

		System.out.println(arrInt);
		
		for(int i = 0; i < arrInt.size(); i++) {
			if(arrInt.get(i) % 2 == 0)
			arrInt.set(i, (arrInt.get(i) * 2));
			else
			arrInt.set(i, (arrInt.get(i) * 3));
		}
		System.out.println(arrInt);

	}

}
