package algorithm;

import java.util.Scanner;

public class ArrayPrinttwo {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int n = 0, j, k;	

		System.out.println("Pleasae enter the size of the array: ");
		n = myScanner.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "- ");
			a[i] = myScanner.nextInt();
		}			
		if (n % 2 == 0) {
			System.out.println(a[(n/2) - 1] + ", " + a[n/2]);
			j = (a.length / 2)-2;
			k = (a.length / 2)+1;

		}
		else {
			System.out.println(a[n/2]);
			j = (a.length / 2)-1;
			k = (a.length / 2)+1;			
		}
		for (; j >= 0; j--, k++) {
			System.out.println(a[j] + ", " + a[k]);
		}
		myScanner.close();
	}	
}
