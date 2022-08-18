package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a program that accepts names in an ArrayList of 
 * Strings and replaces a string of four asterisks "****" 
 * in place of every string of length 4. For example, suppose 
 * that a list contains the following values: 
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}; 
 * and now your code changes it to  
 * {"****", "is", "****" , "of", "fun", "for", "every", "****",  "programmer"}.
 */

public class AsterikString {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		ArrayList<String> arrString = new ArrayList<>(10);
		
		arrString.add("This");
		arrString.add("is");
		arrString.add("lots");
		arrString.add("of");
		arrString.add("fun");
		arrString.add("for");
		arrString.add("every");
		arrString.add("java");
		arrString.add("programmer");
		arrString.add("these");
		arrString.add("days");
		arrString.add("at");
		arrString.add("vanier");
		
		System.out.println(arrString);
		
		for (int i = 0; i < arrString.size(); i++) {
			
			if(arrString.get(i).length() == 4) {
				arrString.set(i, "****");
			}			
		}
		System.out.println(arrString);
	}
}
