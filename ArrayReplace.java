package algorithm;

/*
 * Write a program to create an array of 10 integers. 
 * Accept values from the user. Replace the content 
 * of even and odd indexes two by two (block zero with 
 * block 1, block 2 with 3 and so on).
 */

import java.util.Scanner;

public class ArrayReplace {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int n = 0;
		int[] a = new int[10];
		
		System.out.println("Pleasae enter 10 values: ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "- ");
			a[i] = myScanner.nextInt();
			
			if (i % 2 != 0) { 
				n = a[i - 1];
				a[i - 1] = a[i];
				a[i] = n;
			}
		}
		System.out.println("Organized array.");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}

	}

}
