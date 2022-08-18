package Exams;
//
////
//////Java Program to find maximum in arr[] 
////class Test
////{
////  static int arr[] = {10, 324, 450, 90, 98};
////  static String arr2[] = {"cero", "uno", "dos", "tres", "cuatro"};
////  static String nameString;
////    
////  // Method to find maximum in arr[]
////  static int largest()
////  {
////      int i;
////        
////      // Initialize maximum element
////      int max = arr[0];
////     
////      // Traverse array elements from second and
////      // compare every element with current max  
////      for (i = 1; i < arr.length; i++)
////          if (arr[i] > max) {
////              max = arr[i];
////              nameString = arr2[i];
////          }
////     
////      return max;
////  }
////    
////  // Driver method
////  public static void main(String[] args) 
////  {
////      System.out.println("Largest in given array is " + largest() + " position " + nameString);
////     }
////}
//
///* WAP that convert this array 
//int[] someNumb{67, 97, 114, 111, 108, 105, 110, 97, 32, 121, 97, 32, 115, 97, 98, 101, 115, 32, 112, 114, 111, 103, 114, 97, 109, 97, 114, 46} 
//into string and print the correct info. 
//Tip (with a loop convert from int to char and concat every outcome in a string variable)*/
//
//
////public class Test {
////
////    public static void main(String[] args) {
////
////        int[] someNumb = {67, 97, 114, 111, 108, 105, 110, 97, 32, 121, 97, 32, 115, 97, 98, 101, 115, 32, 112, 114, 111, 103, 114, 97, 109, 97, 114, 46};
////
////        for (int i = 0; i < someNumb.length; i ++) {
////            char ch = (char) someNumb[i];
////            System.out.print(ch);
////        }
////    }
////
////}
//
////import java.util.Scanner;
////
/////* WAP that accepts a string for the user and you will print the ASCII value of each letter and the total sum of this value as well. 
//// */
////
////public class Test {
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Write a word: ");
////        String word = sc.next();
////        int sum = 0;
////
////        for (int i = 0; i < word.length(); i++) {
////            char ch = word.charAt(i); // Lee letra por letra de la palabra ingresada por el usuario.
////            System.out.println("ASCII value for " + ch + ": " + (int) ch);
////            sum = sum + (int) ch;
////
////        }
////
////        System.out.println("The total sum of all ASCII values is: " + sum);
////
////        sc.close();
////    }
////
////}
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
///* WAP that converts a char to int and an int to char, creates a menu for the user to choose the selection.
// */
//
//public class Test {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean out = false;
//
//        while (!out) {
//
//            try {
//
//                System.out.println("Choose your option... ");
//                System.out.println("1. Convert char to int. ");
//                System.out.println("2- Convert int to char. ");
//                System.out.println("3- Finish program. ");
//                int option = sc.nextInt();
//
//                switch (option) {
//
//                case 1:
//                    System.out.println("You selected 1.");
//                    System.out.print("Enter the character: ");
//                    
//                    char ch = (char) sc.next();
//                    int a;
//
//                    System.out.println("Conversion of char " + ch + " into int (using ASCII): " + (a = ch));
//                    System.out.println();
//                    break;
//
//                case 2:
//                    System.out.println("You selected 2.");
//                    System.out.print("Enter the integer: ");
//                    int c = sc.nextInt(); // ASCII A
//                    char charInt;
//
//                    System.out.println("Conversion of int " + c + " into char (using ASCII-Typecasting): " + (charInt = (char) c));
//
//                    break;
//
//                case 3:
//                    out = true;
//                    break;
//
//                default:
//                    System.out.println("Only numbers between 1 and 3. ");
//                }
//            }
//
//            catch (InputMismatchException e) {
//                System.out.println("Attention!!! You need to input a number.");
//                sc.next(); // evita que entre en un loop infinito
//            }
//
//        }
//        
//        sc.close();
//    }
//
//}

import java.util.InputMismatchException;
import java.util.Scanner;

/* Java program that accepts from the user 10 values in an array, 
 * then sort these values in ascending and descending order and print the values. 
 * This need a different approach, one for string, one for int, one for long, one for float, 
 * and one for double. It is recommended to use classes for a different approach, it should 
 * contain a menu asking the user what kind of values he wants to enter and sort. 
 * Remember to create personalized exceptions for the validation of the user input.

Tips: 

Use an interface, having constructors with each array parameter, this will return an array.
Use bubble sort for sorting the arrays.
You will need exceptions to make sure the user input is 1 to 5, and only accepting integer.
Remember, for each class you make the process to use try and catch.
 
The Output will look like:

Welcome!

Please select your option from the menu:

1- String

2- Integer

3- Long

4- Float

5- Double */

interface values {
	void StringValues(String stringvalues[]);
	void IntegerValues(int integervalues[]);
	void LongValues(long longvalues[]);
	void FloatValues(float floatvalues[]);
	void DoubleValues(double doublevalues[]);
}

class data implements values {
	String stringvalues[];
	int integervalues[];
	long longvalues[];
	float floatvalues[];
	double doublevalues[];
	
	public data() {
		
	}

	public void StringValues(String[] stringvalues) {
		this.stringvalues = stringvalues;

		try {
			System.out.println("\nOriginal String Array: ");
			for (int i = 0; i < this.stringvalues.length; i++) {
				System.out.print(this.stringvalues[i] + " ");
			}
			boolean secretProperty = false;
			boolean secretProperty2 = false;

			while (!secretProperty) {

				secretProperty = true;

				for (int i = 0; i < (stringvalues.length - 1); i++) {

					if (this.stringvalues[i].compareToIgnoreCase(this.stringvalues[i + 1]) > 0) {
						String temp = this.stringvalues[i];
						this.stringvalues[i] = this.stringvalues[i + 1];
						this.stringvalues[i+ 1] = temp;
						secretProperty = false;
					}
				}
			}
			System.out.println("\nAscending String Array: ");
			for (int i = 0; i < this.stringvalues.length; i++) {
				System.out.print(this.stringvalues[i] + " ");
			}
			while (!secretProperty2) {

				secretProperty2 = true;

				for (int i = 0; i < (stringvalues.length - 1); i++) {

					if (this.stringvalues[i].compareToIgnoreCase(this.stringvalues[i + 1]) < 0) {
						String temp = this.stringvalues[i];
						this.stringvalues[i] = this.stringvalues[i + 1];
						this.stringvalues[i+ 1] = temp;
						secretProperty2 = false;
					}
				}
			}
			System.out.println("\nDescending String Array: ");
			for (int i = 0; i < this.stringvalues.length; i++) {
				System.out.print(this.stringvalues[i] + " ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void IntegerValues(int[] integervalues) {
		this.integervalues = integervalues;
	
		try {
			System.out.println("\nOriginal Integer Array: ");
			for (int i = 0; i < this.integervalues.length; i++) {
				System.out.print(this.integervalues[i] + " ");
			}
			boolean secretProperty = false;	
			boolean secretProperty2 = false;

			while (!secretProperty) {

				secretProperty = true;

				for (int i = 0; i < (this.integervalues.length - 1); i++) {

					if (this.integervalues[i] > this.integervalues[i + 1]) {
						int temp = this.integervalues[i];
						this.integervalues[i] = this.integervalues[i + 1];
						this.integervalues[i+ 1] = temp;
						secretProperty = false;
					}
				}
			}
			System.out.println("\nAscending Integer Array: ");
			for (int i = 0; i < this.integervalues.length; i++) {
				System.out.print(this.integervalues[i] + " ");
			}
			while (!secretProperty2) {

				secretProperty2 = true;

				for (int i = 0; i < (this.integervalues.length - 1); i++) {

					if (this.integervalues[i] < this.integervalues[i + 1]) {
						int temp = this.integervalues[i];
						this.integervalues[i] = this.integervalues[i + 1];
						this.integervalues[i+ 1] = temp;
						secretProperty2 = false;
					}
				}
			}
			System.out.println("\nDescending Integer Array: ");
			for (int i = 0; i < this.integervalues.length; i++) {
				System.out.print(this.integervalues[i] + " ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void LongValues(long[] longvalues) {
		this.longvalues = longvalues;

		try {
			System.out.println("\nOriginal Long Array: ");
			for (int i = 0; i < this.longvalues.length; i++) {
				System.out.print(this.longvalues[i] + " ");
			}
			boolean secretProperty = false;
			boolean secretProperty2 = false;

			while (!secretProperty) {

				secretProperty = true;

				for (int i = 0; i < (this.longvalues.length - 1); i++) {

					if (this.longvalues[i] > this.longvalues[i + 1]) {
						long temp = this.longvalues[i];
						this.longvalues[i] = this.longvalues[i + 1];
						this.longvalues[i+ 1] = temp;
						secretProperty = false;
					}
				}
			}
			System.out.println("\nAscending Long Array: ");
			for (int i = 0; i < this.longvalues.length; i++) {
				System.out.print(this.longvalues[i] + " ");
			}
			while (!secretProperty2) {

				secretProperty2 = true;

				for (int i = 0; i < (this.longvalues.length - 1); i++) {

					if (this.longvalues[i] < this.longvalues[i + 1]) {
						long temp = this.longvalues[i];
						this.longvalues[i] = this.longvalues[i + 1];
						this.longvalues[i+ 1] = temp;
						secretProperty2 = false;
					}
				}
			}
			System.out.println("\nDescending Long Array: ");
			for (int i = 0; i < this.longvalues.length; i++) {
				System.out.print(this.longvalues[i] + " ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void FloatValues(float[] floatvalues) {
		this.floatvalues = floatvalues;

		try {
			System.out.println("\nOriginal Float Array: ");
			for (int i = 0; i < this.floatvalues.length; i++) {
				System.out.print(this.floatvalues[i] + " ");
			}
			boolean secretProperty = false;	
			boolean secretProperty2 = false;

			while (!secretProperty) {

				secretProperty = true;

				for (int i = 0; i < (this.floatvalues.length - 1); i++) {

					if (this.floatvalues[i] > this.floatvalues[i + 1]) {
						float temp = this.floatvalues[i];
						this.floatvalues[i] = this.floatvalues[i + 1];
						this.floatvalues[i+ 1] = temp;
						secretProperty = false;
					}
				}
			}
			System.out.println("\nAscending Float Array: ");
			for (int i = 0; i < this.floatvalues.length; i++) {
				System.out.print(this.floatvalues[i] + " ");
			}
			while (!secretProperty2) {

				secretProperty2 = true;

				for (int i = 0; i < (this.floatvalues.length - 1); i++) {

					if (this.floatvalues[i] < this.floatvalues[i + 1]) {
						float temp = this.floatvalues[i];
						this.floatvalues[i] = this.floatvalues[i + 1];
						this.floatvalues[i+ 1] = temp;
						secretProperty2 = false;
					}
				}
			}
			System.out.println("\nDescending Float Array: ");
			for (int i = 0; i < this.floatvalues.length; i++) {
				System.out.print(this.floatvalues[i] + " ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void DoubleValues(double[] doublevalues) {
		this.doublevalues = doublevalues;

		try {
			System.out.println("\nOriginal Double Array: ");
			for (int i = 0; i < this.doublevalues.length; i++) {
				System.out.print(this.doublevalues[i] + " ");
			}
			boolean secretProperty = false;	
			boolean secretProperty2 = false;

			while (!secretProperty) {

				secretProperty = true;

				for (int i = 0; i < (this.doublevalues.length - 1); i++) {

					if (this.doublevalues[i] > this.doublevalues[i + 1]) {
						double temp = this.doublevalues[i];
						this.doublevalues[i] = this.doublevalues[i + 1];
						this.doublevalues[i+ 1] = temp;
						secretProperty = false;
					}
				}
			}
			System.out.println("\nAscending Double Array: ");
			for (int i = 0; i < this.doublevalues.length; i++) {
				System.out.print(this.doublevalues[i] + " ");
			}
			while (!secretProperty2) {

				secretProperty2 = true;

				for (int i = 0; i < (this.doublevalues.length - 1); i++) {

					if (this.doublevalues[i] < this.doublevalues[i + 1]) {
						double temp = this.doublevalues[i];
						this.doublevalues[i] = this.doublevalues[i + 1];
						this.doublevalues[i+ 1] = temp;
						secretProperty2 = false;
					}
				}
			}
			System.out.println("\nDescending Double Array: ");
			for (int i = 0; i < this.doublevalues.length; i++) {
				System.out.print(this.doublevalues[i] + " ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

	@SuppressWarnings("serial")
	class WrongInputException extends Exception { 

		public String toString() {
			return ("\nThere's an error!!!\n");
		} 
	}	

	public class InterfaceArray {

		public static void main(String[] args) throws WrongInputException{
			Scanner myScanner = new Scanner(System.in);
			
			String stringvalues[] = new String[10];
			int integervalues[] = new int[10];
			long longvalues[] = new long[10];
			float floatvalues[] = new float[10];
			double doublevalues[] = new double[10];
			data d = new data();

			try {
				while (true) {
					System.out.println("\nWelcome. \nPlease select your option from the menu:");
					System.out.println("1- String \n2- Integer \n3- Long \n4- Float \n5- Double \n6- Exit\n");
					System.out.print("your option: ");
					int input = myScanner.nextInt();

					if (input == 1) {
						for (int i = 0; i < stringvalues.length; i++) {
							System.out.print((i + 1) + "- ");
							stringvalues[i] = myScanner.next();
						}
						d.StringValues(stringvalues);
						System.out.println();
					}
					else if (input == 2) {
						for (int i = 0; i < integervalues.length; i++) {
							System.out.print((i + 1) + "- ");
							integervalues[i] = myScanner.nextInt();
						}
						d.IntegerValues(integervalues);
						System.out.println();
					}
					else if (input == 3) {
						for (int i = 0; i < longvalues.length; i++) {
							System.out.print((i + 1) + "- ");
							longvalues[i] = myScanner.nextLong();
						}
						d.LongValues(longvalues);
						System.out.println();
					}
					else if (input == 4) {
						for (int i = 0; i < floatvalues.length; i++) {
							System.out.print((i + 1) + "- ");
							floatvalues[i] = myScanner.nextFloat();
						}
						d.FloatValues(floatvalues);
						System.out.println();
					}
					else if (input == 5) {
						for (int i = 0; i < doublevalues.length; i++) {
							System.out.print((i + 1) + "- ");
							doublevalues[i] = myScanner.nextDouble();
						}
						d.DoubleValues(doublevalues);
						System.out.println();
					}
					else {
						myScanner.close();
						System.exit(0);

					}			
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
