package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a program and create 2 ArrayLists of String type 
 * and integer type, with 10 elements added each one. After 
 * printing both ArrayList elements, write the code to remove 
 * even-indexed elements from the string list; and odd-indexed 
 * elements from integer list.
 */

public class StringIntArrayList {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		ArrayList<String> arrString = new ArrayList<>(10);	
		ArrayList<Integer> arrInt = new ArrayList<>(10);
		
		arrString.add("String1");
		arrString.add("String2");
		arrString.add("String3");
		arrString.add("String4");
		arrString.add("String5");
		arrString.add("String6");
		arrString.add("String7");
		arrString.add("String8");
		arrString.add("String9");
		arrString.add("String10");
		arrInt.add(1);
		arrInt.add(2);
		arrInt.add(3);
		arrInt.add(4);
		arrInt.add(5);
		arrInt.add(6);
		arrInt.add(7);
		arrInt.add(8);
		arrInt.add(9);
		arrInt.add(10);
		
		System.out.println(arrString);
		System.out.println(arrInt);
		
		for(int i = 0, j = 1; i < arrString.size(); i++, j++) {
			arrString.remove(i);
			arrInt.remove(j);
		}	
		
		System.out.println(arrString);
		System.out.println(arrInt);
	}
}
