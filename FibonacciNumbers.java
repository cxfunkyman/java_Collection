package algorithm;

import java.util.Scanner;

public class FibonacciNumbers {
	
	 static int numb1 = 0, numb2 = 1, numb3 = 0;    
	
	 static void printFibonacci(int counter){    
	    if(counter > 1){
	    	
	         numb3 = numb1 + numb2;    
	         numb1 = numb2;    
	         numb2 = numb3;    
	        
	         System.out.print(" " + numb3);   
	         
	         printFibonacci(counter - 1);    
	     }    
	 }   

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int counter = 0;

		System.out.println("Welcome\n");
		System.out.print("Please enter a number: ");
		counter = myScanner.nextInt();
		
		printFibonacci(counter);		

		myScanner.close();
	}
}
