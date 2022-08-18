package Exams;

import java.util.Scanner;

//Seky Emil Perez Moya 219-5412

class Node { 
	int data;
	Node next; 
} 
class my_Linklist {
	Node head; 

	public void insert(int data) { 

		Node n = new Node();
		n.data = data; 
		n.next = null; 

		if(head == null) head = n; 

		else { 
			if(n.data <= head.data) {
				n.next = head;
				head = n;
			} 
			else { 
				Node n1 = head; 

				while(n1.next != null && n.data > n1.next.data)						
					n1 = n1.next; 

				if(n1.next == null)
					n1.next = n; 
				else { 
					n.next = n1.next; 

					n1.next = n; 
				} 
			} 
		} 
	}
	public void show() { 
		Node n = head; 

		while (n.next!=null) { 
			System.out.print(n.data + ", ");			
			n = n.next; 
		} 
		System.out.println(n.data + "."); 
	}
}
public class LinkedListInputSort {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		my_Linklist list = new my_Linklist();
		int count = 0;

		System.out.println("Welcome");

		while(true) {
			System.out.print("Enter the number: ");
			list.insert(myScanner.nextInt());

			System.out.print("Continue adding? y or n: ");

			if(myScanner.next().equalsIgnoreCase("n"))
				break;
		}
		list.show();
		myScanner.close();
	}
}

