package Exams;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSortTryCatch {

	public static void main(String[] args) {

		while(true) {
			boolean loop1 = false;
			Scanner myScanner = new Scanner(System.in);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");

			try {
				int k = myScanner.nextInt();

				if (k == 1) {
					System.out.println("\nPlease enter the size of the array: ");
					int n = myScanner.nextInt();
					int[] a = new int[n];

					System.out.println("Enter the values:");
					for(int i = 0; i < n; i++) {
						System.out.print((i + 1) + "- ");
						a[i] = myScanner.nextInt();
					}
					for (int i = 0; i < a.length; i++) {
						for (int j = i + 1; j < a.length; j++) {
							if(a[i] > a[j]) {
								int temp = a[i];
								a[i] = a[j];
								a[j] = temp;
							}
						}				
					}
					int root = (int)(Math.sqrt(n));

					System.out.print("\nEnter a value for search: ");
					int numb = myScanner.nextInt();

					if(numb > a[n - 1] || numb < a[0]) {
						System.out.println("Element doesn't exist\n");						
					}
					else {
					int i = 0;
					int j = root;
					while(a[j] < numb && j < n) {						
						i = j;
						j = j + root; 

						if(j > n - 1) {
							j = n - 1;
						}
					} 
					for(int m = i; m <= j; m++) {
						if(a[m] == numb) {
							System.out.println("Element found at position:"+(m + 1) + "\n");													
						}
					}
					}
				}
				else if (k == 2){
					myScanner.close();
					System.exit(0);
				}
				else {
					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("\nWrong Type of Input!!!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\nNot a Valid Array Index!!!");
			}			
			catch (Exception e) {
				System.out.println("\nAn Error Ocurred!!!");
			}
		}
	}
}




























































//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ArrayJumpSerch {
//
//	public static void main(String[] args) {
//
//		while(true) {
//			boolean loop1 = false;
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					int[] a = new int[n];
//
//					System.out.println("Enter the values:");
//					for(int i = 0; i < n; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.nextInt();
//					}
//					for (int i = 0; i < a.length; i++) {
//						for (int j = i + 1; j < a.length; j++) {
//							if(a[i] > a[j]) {
//								int temp = a[i];
//								a[i] = a[j];
//								a[j] = temp;
//							}
//						}				
//					}
//					int root = (int)(Math.sqrt(n));
//
//					System.out.print("\nEnter a value for search: ");
//					int numb = myScanner.nextInt();
//
//					if(numb > a[n - 1] || numb < a[0]) {
//						System.out.println("Element doesn't exist\n");						
//					}
//					else {
//					int i = 0;
//					int j = root;
//					while(a[j] < numb && j < n) {						
//						i = j;
//						j = j + root; 
//
//						if(j > n - 1) {
//							j = n - 1;
//						}
//					} 
//					for(int m = i; m <= j; m++) {
//						if(a[m] == numb) {
//							System.out.println("Element found at position:"+(m + 1) + "\n");													
//						}
//					}
//					}
//				}
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//	}
//}

//public class A {
//  public static void main(String args[]) {
//      int arr[] = {0,1,4,6,8,9,11,13,21,33,55,89,91,95,99,100};
//      
//      int x = 0,rep;
//      int n = arr.length, prev, step, f = 0, f1 = 0;
//      
//      step = (int)Math.sqrt(n);
//      
//      while(step < n) {
//          
//      	if(arr[step] >= x) {
//          	f = 1;
//          	break;
//          	}
//          
//      	if(step + (int) Math.sqrt(n < n)
//          	step += (int)Math.sqrt(n);
//          
//      	else {
//          	f = 2;
//          	break;
//          	}
//          }
//      
//      for(prev = step - (int)Math.sqrt(n); step >= prev && f == 1; step--)
//          
//      	if(arr[step] == x)
//              {System.out.println("Found on index " + step);
//              f1=1;
//              rep=step;
//              }
//
//      for(prev = step; prev < n && f == 2; prev++)
//          
//      	if(arr[prev] == x)
//              {System.out.println("Found on index " + prev);
//              f1=1;
//              rep = prev;}
//
//      if(f1 == 0)
//      	System.out.println("Not Found");
//   }
//}

//-------------------------------------------------------------------------------------------------


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/*
* Write a java program to create a Phone Book – based on insertion 
* sort approach. Accept the contact name and number from the user 
* one by one and insert it in the appropriate position. Use proper 
* validations: for example phone numbers must be of 10 digits, names 
* only alphabets, etc.
*/
//
//class PhoneBook {
//	String[] inputName;
//	String name;
//	long[] inputNumber;
//	long number;
//	
//	void UserString(String[] inputName) {
//		this.inputName = inputName;		
//	}
//	void UserNumber(long[] inputNumber) {
//		this.inputNumber = inputNumber;
//	}
//	boolean Valname(String name) {
//		this.name = name;
//		
//		if(name.matches("^(?=.*[0-9!@#$%&*_~]).+$"))
//			return false;
//		else { 
//			return true;
//		}		
//	}
//	boolean ValNumb(long number) {
//		this.number = number;
//		int count = 0;
//		
//		while(number != 0) {
//			number = number / 10;
//			count++;
//		}
//		if (count == 10)
//			return true;
//		else
//			return false;	
//	}
//}
//
//public class PhoneBookInsertSort {
//
//	public static void main(String[] args) {
//
//		boolean loop1 = true;
//		PhoneBook pb = new PhoneBook();
//		
//		System.out.println("Welcome");
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("\nplease enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					pb.inputName = new String[n];
//					pb.inputNumber = new long[n];
//				
//					System.out.println("Enter the values:");
//					for(int i = 0; i < n; i++) {						
//						while(true) {
//						System.out.print((i + 1) + "- Name: ");
//						pb.name = myScanner.next();
//						if (pb.Valname(pb.name))
//							break;
//						else
//							System.out.println("Names can't contain numbers or special characters.\n");
//						}
//						while(true) {
//						System.out.print((i + 1) + "- Number: ");
//						pb.number = myScanner.nextLong();
//						if (pb.ValNumb(pb.number))
//							break;
//						else
//							System.out.println("Phone number must have 10 numbers\n");
//						}
//						if(i == 0) {
//							pb.inputName[i] = pb.name;
//							pb.inputNumber[i] = pb.number;
//						}
//						else if (i == 1)  {
//							if (pb.inputName[i - 1].compareToIgnoreCase(pb.name) >= 0) {
//								pb.inputName[i] = pb.inputName[i -1];
//								pb.inputNumber[i] = pb.inputNumber[i -1];
//								pb.inputName[i -1] = pb.name;
//								pb.inputNumber[i -1] = pb.number;
//							}
//							else {
//								pb.inputName[i] = pb.name;
//								pb.inputNumber[i] = pb.number;
//							}
//						}
//						else if (i > 1) {
//							for(int j = 0; j < i; j++) {
//								if (pb.inputName[j].compareToIgnoreCase(pb.name) >= 0) {
//									for (int w = i; w > j; w--) {
//										pb.inputName[w] = pb.inputName[w - 1];
//										pb.inputNumber[w] = pb.inputNumber[w -1];
//									}
//									pb.inputName[j] = pb.name;
//									pb.inputNumber[j] = pb.number;
//									break;
//								}
//								else {
//									pb.inputName[i] = pb.name;
//									pb.inputNumber[i] = pb.number;
//								}
//							}						
//						}
//					}
//					System.out.println("\nPhone Book:");
//					for (int i = 0; i < n; i++) {
//						String nameString = String.format("%-10s", pb.inputName[i]);
//						System.out.println("Name: " + nameString + " Phone number: " + pb.inputNumber[i]);
//					}
//				} 	
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//				System.out.println(e + "\n");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//				System.out.println(e + "\n");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//				System.out.println(e + "\n");
//			}
//		}
//	}
//}


//import java.util.Scanner;
//public class A {
//  public static void main(String[] args) {
//      String a[]=new String[10],t[]=new String[10],n,m;
//      int i,j;
//      Scanner in=new Scanner(System.in);
//      for(i=0;i<10;i++) {
//          System.out.print("Enter the name: ");
//          n=in.nextLine();
//          if(n.matches("[a-zA-Z]+")==false) //for validation
//              {i--;System.out.print("Wrong entry. ");continue;}
//          System.out.print("Enter the number (10 digits): ");
//          m=in.nextLine();
//          if(m.matches("[0-9]+")==false||m.length()!=10)  //for validation
//              {i--;System.out.print("Wrong entry. ");continue;}
//          if(i==0) {
//                  a[i]=n;t[i]=m;
//              }
//          else if(n.compareTo(a[0])<=0){
//                  for(j=i;j>0;j--) {
//                      a[j]=a[j-1];t[j]=t[j-1];
//                      }
//                  a[j]=n;t[j]=m;
//              }
//          else if(n.compareTo(a[i-1])>=0) {
//                  a[i]=n;t[i]=m;
//              }
//          else{
//              for(j=0;j<i;j++){
//                 if(n.compareTo(a[j])>=0 && n.compareTo(a[j+1])<0)break;
//                  }
//                  for(int z=i;z>j;z--) {
//                      a[z]=a[z-1];t[z]=t[z-1];
//                      }
//                      a[j+1]=n;t[j+1]=m;
//                  }
//          }
//          for(int z=0;z<10;z++){
//              System.out.print(a[z]+ " ");System.out.print(t[z]+ "\n");
//          }
//  }
//}

//---------------------------------------------------------------------------------------------------------

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/*
* Using jump search concept, write a java program to find out 
* whether a particular word is existing in an array of strings 
* or not.
*/
//
//public class JumpSearchArray {
//
//	public static void main(String[] args) {
//		
//		String[] a = {"leo", "seky", "petar", "winston", "alex", "ray", "jean", "basil", "tyler", "emil"};
//		int n = a.length;
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if(a[i].compareToIgnoreCase(a[j]) >= 0) {
//					String temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}				
//		}
//
//		while(true) {
//
//			boolean loop1 = false;
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					int root = (int) Math.sqrt(n);
//					String[] a = new String[n];
//					
//					System.out.println("Enter the values:");
//					for(int i = 0; i < n; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.next();
//					}
//					for (int i = 0; i < a.length; i++) {
//						for (int j = i + 1; j < a.length; j++) {
//							if(a[i].compareToIgnoreCase(a[j]) >= 0) {
//								String temp = a[i];
//								a[i] = a[j];
//								a[j] = temp;
//							}
//						}				
//					}					
//					for(int i = 0; i < a.length; i++) {
//						if(i < a.length - 1)
//							System.out.print(a[i] + ", ");
//						else
//							System.out.print(a[i] + ".\n");
//					}
//					int root = (int)(Math.sqrt(n));
//					int forloop = 0, jump = root;
//
//					System.out.print("\nEnter a word for search: ");
//					String name = myScanner.next();
//
//					if(name.compareToIgnoreCase(a[n-1]) > 0 || name.compareToIgnoreCase(a[0]) < 0) {
//						System.out.println("Element doesn't exist\n");					
//					}
//					else {
//
//						while (a[jump].compareToIgnoreCase(name) < 0 && jump < n) {					
//							forloop = jump;
//							jump = jump + root; 
//
//							if (jump > n - 1) {
//								jump = n - 1;
//							}
//						} 
//						for(int m = forloop; m <= jump; m++) {
//							if(a[m].equalsIgnoreCase(name)) {
//								System.out.println("Element found at position:"+(m + 1) + "\n");
//								loop1 = true;
//							}
//						}
//						if (!loop1) {
//							System.out.println("Element doesn't exist\n");
//						}
//					}
//				} 
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//	}
//}

//--------------------------------------------------------------------------------------------------------------


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/*
* Using binary search approach, find out the number of 
* occurrences of an inputted word in an array of strings.
*/
//
//class Arrange {
//	
//	int count, pos[];
//	
//	void sortnumb (int[] a, int count) {
//		for (int i = 0; i < count; i++) {
//			for (int j = i + 1; j < count; j++) {
//				if(a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}				
//		}		
//	}
//	
//	void sortword (String[] a) {
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if(a[i].compareToIgnoreCase(a[j]) >= 0) {
//					String temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}				
//		}
//	}
//	void counter(String[] a, String name, int mid, int count, int[] pos) {
//		this.count = count;
//		this.pos = pos;
//		
//		this.pos[this.count] = mid + 1;
//		this.count++;
//		for (int left = mid -1 ; left >= 0 && a[left].equalsIgnoreCase(name) ; left-- ) {
//			this.pos[this.count] = left + 1;
//			this.count++;			
//		}								
//
//		for (int right = mid +1; right < a.length && a[right].equalsIgnoreCase(name) ; right++ ) {
//			this.pos[this.count] = right + 1;
//			this.count++;			
//		}								
//		sortnumb(this.pos, this.count);
//	}
//}
//
//public class Arr {
//	
//	public static void main(String[] args) {
//		Arrange c = new Arrange();
//
//		String[] a = {"leo", "seky", "wally", "alex", "petar", "seky", "wally", "alex", "seky", "ray", "jean", "alex", "basil", "tyler", "seky", "emil"};
//
//		c.sortword(a);
//		
//		while(true) {
//			boolean loop1 = true;
//			Scanner myScanner = new Scanner(System.in);
//
//			int n = a.length;
//			int low = 0, high = n;
//			int mid = low + ((low - high) / 2);
//			int count = 0;
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");					
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					String[] a = new String[n];
//
//					System.out.println("Enter the values:");
//					for(int i = 0; i < n; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.next();
//					}
//					c.sortword(a);
//
//					for (int i = 0; i < a.length; i++) {
//						if (i < a.length - 1)
//							System.out.print(a[i] + ", ");
//						else
//							System.out.print(a[i] + ".\n");
//					}
//					int[] pos = new int[a.length];
//					System.out.print("\nEnter a word for search: ");
//					String name = myScanner.next();
//
//					while (low <= high) {
//						if (low == n)
//							break;
//						mid = low + ((high - low) / 2);
//						
//						if (a[mid].compareToIgnoreCase(name) < 0) {
//							low = mid + 1;															
//						}
//						else if (a[mid].compareToIgnoreCase(name) > 0) {			
//							high = mid - 1;														
//						}
//						else {													
//							c.counter(a, name, mid, count, pos);							
//							System.out.println("Number of occurrence: " + c.count);
//							System.out.print("Number found at position: ");
//							for(int i = 0; i < c.count; i++)
//								System.out.print(c.pos[i] + " ");
//							loop1 = false;
//							System.out.println("\n");
//							break;
//						}
//					}
//					if(loop1) {
//						System.out.println("Number not found\n");
//					}
//				}
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!\n");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!\n");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!\n");
//			}
//		}
//	}
//}


//-------------------------------------------------------------------------------------------------------------


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/*
* Write a program to create an array of n integers 
* (selected by user). Then, accept another number 
* and try to find and delete its all occurrences. 
*/
//
//public class ArrayDelAllOcurrence {
//
//	public static void main(String[] args) {
//		
//		boolean loop1 = true;
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//			
//			try {
//			int k = myScanner.nextInt();
//
//			if (k == 1) {
//				System.out.println("\nPlease enter the size of the array: ");
//				int n = myScanner.nextInt();
//				int[] a = new int[n];
//				
//				System.out.println("Enter the values:");
//				for(int i = 0; i < a.length; i++) {
//					System.out.print((i + 1) + "- ");
//					a[i] = myScanner.nextInt();
//				}
//				System.out.println("Array before delete");
//				for (int i = 0; i < a.length; i++)
//					System.out.print(a[i] + " ");
//
//				System.out.println("\nPlease enter a number: ");
//				int m = myScanner.nextInt();
//				int count = 0;
//
//				for (int i = 0; i < a.length; i++) {
//					if (a[i] != m) {
//						a[count++] = a[i];						
//					}
//				}
//				System.out.println("\nArray after delete");
//				for (int i = 0; i < count; i++) {			
//					System.out.print(a[i] + " ");	
//				}
//				System.out.println();
//				} 			
//			
//			else if (k == 2){
//				myScanner.close();
//				System.exit(0);
//			}
//			else {
//				System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//			}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("Wrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Not a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("An Error Ocurred!!!");
//			}
//		}
//	}
//}

//import java.util.Scanner;
//public class A {
//public static void main(String[] args) {
//    Scanner h=new Scanner(System.in);
//    int a[]=new int[20],i;
//    System.out.println("How many numbers to enter? ");
//    int n=h.nextInt();
//    for(i=0;i<n;i++) {
//        System.out.print("Enter the " + (i+1) +" number");
//        a[i]=h.nextInt();
//        }
//    for(i=0;i<n;i++)System.out.print(a[i] + ",");
//    System.out.println("\nWhich number to delete? ");
//    int m=h.nextInt();
//    for(i=0;i<n;i++) {
//        if(a[i]==m) {
//            for(int j=i;j<n;j++) a[j]=a[j+1];
//            n--;//after deletion number of elements decrease by one
//            i--;//after deletion we have to check from same i again
//        }
//    }
//    for(i=0;i<n;i++)System.out.print(a[i] + ",");
//    }
//}


//-----------------------------------------------------------------------------


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/* Write a program to create an array of n integers (selected by user).
* Then, accept another number and try to find and delete its all 
* occurrences – except for the first one.
*/
//
//public class ArrayDelAllOcuNotFirst {
//
//	public static void main(String[] args) {
//		
//		boolean loop1 = true;
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//			
//			try {
//			int k = myScanner.nextInt();
//
//			if (k == 1) {
//				System.out.println("\nPlease enter the size of the array: ");
//				int n = myScanner.nextInt();
//				int[] a = new int[n];
//				
//				System.out.println("Enter the values:");
//				for(int i = 0; i < a.length; i++) {
//					System.out.print((i + 1) + "- ");
//					a[i] = myScanner.nextInt();
//				}
//				System.out.println("Array before delete");
//				for (int i = 0; i < a.length; i++)
//					System.out.print(a[i] + " ");
//
//				System.out.println("\nPlease enter a number: ");
//				int m = myScanner.nextInt();
//				int count = 0, counter = 0;
//
//				for (int i = 0; i < a.length; i++) {
//					
//					if(a[i] == m && counter <= 0) {
//						a[count++] = a[i];
//						counter++;
//					}
//					else if (a[i] != m) {
//						a[count++] = a[i];						
//					}
//				}
//				System.out.println("\nArray after delete");
//				for (int i = 0; i < count; i++) {			
//					System.out.print(a[i] + " ");	
//				}
//				System.out.println();
//				} 			
//			
//			else if (k == 2){
//				myScanner.close();
//				System.exit(0);
//			}
//			else {
//				System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//			}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("Wrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Not a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("An Error Ocurred!!!");
//			}
//		}
//	}
//}

//import java.util.Scanner;
//public class A {
//public static void main(String[] args) {
//    Scanner h=new Scanner(System.in);
//    int a[]=new int[20],i;
//    System.out.println("How many numbers to enter? ");
//    int n=h.nextInt();
//    for(i=0;i<n;i++) {
//        System.out.print("Enter the " + (i+1) +" number");
//        a[i]=h.nextInt();
//        }
//    for(i=0;i<n;i++)System.out.print(a[i] + ",");
//    System.out.println("\nWhich number to delete? ");
//    int m=h.nextInt(),r=0;
//    for(i=0;i<n;i++) {
//        if(a[i]==m) {
//            r++;
//            if(r>1){
//                for(int j=i;j<n;j++) a[j]=a[j+1];
//                n--;//after deletion number of elements decrease by one
//                i--;//after deletion we have to check from same i again
//            }
//        }
//    }
//    for(i=0;i<n;i++)System.out.print(a[i] + ",");
//    }
//}



//---------------------------------------------------------------------------------


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/* Write a program to create an array of n integers 
* (selected by user). Then, Delete all repeated 
* occurrences of each existing number in the array.
*/
//
//public class ArrayDelRepeated {
//
//	public static void main(String[] args) {
//
//		boolean loop1 = true;
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					int[] a = new int[n];
//
//					System.out.println("Enter the values:");
//					for(int i = 0; i < a.length; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.nextInt();
//					}
//					System.out.println("Array before delete");
//					for (int i = 0; i < a.length; i++)
//						System.out.print(a[i] + " ");
//
//					int count = 0;
//
//					for (int i = 0; i < a.length; i++) {
//						for (int j = i + 1; j < a.length; j++) {
//							if(a[i] != 0) { 
//								if (a[i] == a[j]) {
//									count++;
//									for (int p = j; p < a.length - 1; p++) {
//										a[p] = a[p + 1];
//									}
//									a[a.length - 1] = 0;
//									j--;
//								}
//							}
//						}
//					}
//					System.out.println("\nArray after delete");
//					for (int i = 0; i < a.length - count; i++) {			
//						System.out.print(a[i] + " ");	
//					}
//					//System.out.println(count);
//					System.out.println();
//				} 			
//
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//	}
//}

//import java.util.Scanner;
//public class A {
//public static void main(String[] args) {
//    Scanner h = new Scanner(System.in);
//    int a[] = new int[20],i;
//    System.out.println("How many numbers to enter? ");
//    int n = h.nextInt();
//    for(i = 0; i < n; i++) {
//        System.out.print("Enter the " + (i+1) +" number");
//        a[i] = h.nextInt();
//        }
//    for(i = 0; i < n; i++) System.out.print(a[i] + ",");
//    for(int v = 0; v < n; v++) {
//        int m = a[v], r = 0;
//        for(i = 0; i < n; i++) {
//            if(a[i] == m) {
//                r++;
//                if(r > 1){
//                    for(int j = i; j < n; j++) a[j] = a[j+1];
//                    n--;//after deletion number of elements decrease by one
//                    i--;//after deletion we have to check from same i again
//                }
//            }
//        }
//    }
//    System.out.println();
//    for(i = 0; i < n; i++)System.out.print(a[i] + ",");
//    }
//}

//--------------------------------------------------------------------------------------

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
/* Delete all repeated occurrences in a string array. 
* This means after program execution, the array would 
* include totally unique strings/words.
*/
//
//public class ArrayDelRepeatedStrings {
//
//	public static void main(String[] args) {
//
//		boolean loop1 = true;
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					String[] a = new String[n];
//
//					System.out.println("Enter the Strings:");
//					for(int i = 0; i < a.length; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.next();
//					}
//					System.out.println("Array before delete");
//					for (int i = 0; i < a.length; i++)
//						System.out.print(a[i] + " ");
//
//					int count = 0;
//
//					for (int i = 0; i < n; i++) {
//						for (int j = i + 1; j < n; j++) {
//								if (a[i].compareToIgnoreCase(a[j]) == 0) {
//									count++;
//									for (int p = j; p < n - 1; p++) {
//										a[p] = a[p + 1];
//									}
//									j--;
//									n--;
//								}
//						}
//					}
//					System.out.println("\nArray after delete");
//					for (int i = 0; i < a.length - count; i++) {			
//						System.out.print(a[i] + " ");	
//					}
//					System.out.println();
//				} 	
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//	}
//}

//------------------------------------------------------------------------------------------------------


/* 
* Write a program to accept 10 values (positive, negative, or zero)
* in an integer array. Then move all negative values to the left side 
* and all positive values to the right side of the array without sorting them.

Sample output:
Initial values inside the array:     -12,-42,2,0,67,-66,54,-20,55,-23,
Array values after their shifting:   -12,-42,-66,-20,-23,2,0,67,54,55,
*/
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ArrayMoveNegativePositive {
//
//	public static void main(String[] args) {
//
//		boolean loop1 = true;
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					int[] a = new int[n];
//
//					System.out.println("Enter the Values:");
//					for(int i = 0; i < a.length; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.nextInt();
//					}
//					System.out.println("Array before:");
//					for (int i = 0; i < a.length; i++) {
//					if (i != a.length - 1)
//						System.out.print(a[i] + ", ");
//					else
//						System.out.println(a[i] + ".");
//					}
//
//					for(int i = 0; i < a.length; i++) {
//						
//						if(a[i] < 0) {
//							
//							continue;
//						}
//						else { 
//							for(int j = i; j < a.length; j++) { 
//
//								if(a[j] < 0) {
//									
//									for(int t = j; t > i; t--){
//										
//										int temp = a[t]; 
//										a[t] = a[t - 1]; 
//										a[t - 1]=temp; 
//									} 
//									break; 
//								} 
//							} 
//						} 
//					} 
//					System.out.println("\nArray after:");
//					for (int i = 0; i < a.length; i++) {
//					if (i != a.length - 1)
//						System.out.print(a[i] + ", ");
//					else
//						System.out.println(a[i] + ".");
//					}
//					System.out.println();
//				} 	
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//
//	}
//
//}

//----------------------------------------------------------------------------------------------------

//import java.util.InputMismatchException;
//import java.util.Scanner;

/* 
* Write a program to accept n integer values in an array 
* (array size defined and inputted by the user). Then start 
* showing/printing the existing values in the following format.
*/
//
//public class ArrayCyclicPrint {
//
//	public static void main(String[] args) {
//
//		boolean loop1 = true;
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int t = myScanner.nextInt();
//
//				if (t == 1) {
//					System.out.println("\nHow many numbers do you want to enter? (array size): ");
//					int n = myScanner.nextInt();
//					int[] a = new int[n];
//
//					System.out.println("Enter the Values:");
//					for(int i = 0; i < a.length; i++) {
//						System.out.print("Enter the " + (i + 1) + " number: ");
//						a[i] = myScanner.nextInt();
//					}
//					System.out.println("\nCyclic print of existing values:");
//					
//					for (int i = 0; i < a.length; i++) {
//						
//						if (i > 0) {
//						for(int j = a.length - 1; j > 0; j--) {
//							int temp = a[j];
//							a[j] = a[j - 1];
//							a[j - 1] = temp;							
//						}						
//						}
//						
//					System.out.print(" - Cycle " + (i + 1) + ":  ");
//					for (int k = 0; k < a.length; k++) {
//					if (k != a.length - 1)
//						System.out.print(a[k] + ", ");
//					else
//						System.out.println(a[k] + ".");
//					}
//					}
//					System.out.println();
//				} 	
//				else if (t == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//	}
//}


//------------------------------------------------------------------------------------------------


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ArrayInsertFirst {
//
//	public static void main(String[] args) {
//
//		boolean loop1 = true;
//		int[] a = new int[20];
//
//		while(loop1) {
//			Scanner myScanner = new Scanner(System.in);
//
//			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
//			System.out.print("Your option: ");
//
//			try {
//				int k = myScanner.nextInt();
//
//				if (k == 1) {
//					System.out.println("\nPlease enter the size of the array: ");
//					int n = myScanner.nextInt();
//					
//					System.out.println("Enter the values:");
//					for(int i = 0; i < n; i++) {
//						System.out.print((i + 1) + "- ");
//						a[i] = myScanner.nextInt();
//					}
//					System.out.println("Array before insertion");
//					for (int i = 0; i < n; i++)
//						System.out.print(a[i] + " ");
//					
//					System.out.print("\nEnter another value (max " + (a.length - n) + "): ");
//					for (int i = n; i < a.length; i++) {
//						System.out.print("Value: ");						
//						n++;
//						
//						for(int j = n; j >= 0; j--) {
//							a[j + 1] = a[j];							
//						}						
//					
//					a[0] = myScanner.nextInt();
//					
//					System.out.println("1- Add another number (max " + (a.length - n) + ") - 2- Exit");
//					int t = myScanner.nextInt();
//					if (t == 2)
//						break;
//					}
//
//					System.out.println("\nArray after insertion");
//					for (int i = 0; i < n; i++)
//						System.out.print(a[i] + " ");
//
//					//System.out.println(count);
//					System.out.println("\n");
//				} 			
//
//				else if (k == 2){
//					myScanner.close();
//					System.exit(0);
//				}
//				else {
//					System.out.println("Wrong input. Select 1 or 2 as your options!!!");
//				}
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nWrong Type of Input!!!");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("\nNot a Valid Array Index!!!");
//			}			
//			catch (Exception e) {
//				System.out.println("\nAn Error Ocurred!!!");
//			}
//		}
//	}
//}

//import java.util.Scanner;
//public class A {//at the beginning
//public static void main(String[] args) {
//    Scanner h=new Scanner(System.in);
//    int a[]=new int[20],i;
//    System.out.println("How many numbers to enter? ");
//    int n=h.nextInt();
//    for(i=0;i<n;i++) {
//        System.out.print("Enter the " + (i+1) +" number");
//        a[i]=h.nextInt();
//        }
//    for(i=0;i<n;i++)System.out.print(a[i] + ",");
//    System.out.println("\nWhich number to insert? ");
//    int m=h.nextInt();
//    for(i=n;i>0;i--)a[i]=a[i-1]; //shifting the array to right
//    a[0]=m;
//    for(i=0;i<n+1;i++)System.out.print(a[i] + ",");
//    }
//}

//--------------------------------------------------------------------------------------------------