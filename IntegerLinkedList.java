package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

class Node2 { 
	int data; 
	Node2 next; 
} 
class my_Linklist2 { 
	Node2 head; 

	public void insert2(int data, int count, int max) {
		Node2 n = new Node2(); 

		if (count < max - 1) {
			n.data = data;
			n.next = null; 

			if(head == null) 
				head = n; 

			else { 
				Node2 n1 = head;//start from beginning of list 			
				while(n1.next != null)
					n1 = n1.next; 

				n1.next = n; 
			} 
		}
		else {
			n.data = data;
			n.next = head;

			head = n; 
		}
	} 
	public void show2() { 

		Node2 n = new Node2(); 

		n = head;//start from beginning of the list 

		while(n.next != null){ 
			System.out.println(n.data); 

			n = n.next; 
		} 
		System.out.println(n.data); 
	} 
}

public class IntegerLinkedList {

	public static void main(String[] args) { 

		my_Linklist2 mll = new my_Linklist2(); 

		boolean loop1 = true;
		int t = 0;

		while(loop1) {
			boolean loop2 = true, loop3 = true;
			int count = 0;
			Scanner myScanner = new Scanner(System.in);

			System.out.println("please enter one option. \n1- Continue. \n2- Exit");
			System.out.print("Your option: ");

			try {
				int k = myScanner.nextInt();

				if (k == 1) {
					System.out.println("\nPlease enter how many numbers to add: ");
					int n = myScanner.nextInt();

					System.out.println("Enter the values:");
					for(int i = 0; i < n; i++) {

						System.out.print((i + 1) + "- ");
						mll.insert2(myScanner.nextInt(), count, n);
						count++;

					}

					System.out.println("\nLinked list");
					mll.show2(); 


					//System.out.println(count);
					System.out.println("\n");
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
