package Exams;

import java.util.Scanner;

//Seky Emil Perez Moya 219-5412

class Nodes { 
	String data;
	Nodes next; 
} 
class my_Linkedlist {
	Nodes head; 

	public void insert(String data) {//adding to the end of list 

		Nodes node = new Nodes(); 
		node.data = data;
		node.next = null; 

		if(head == null) 
			head = node; 

		else { 
			Nodes n = head; 

			while(n.next != null) 
				n = n.next; 

			n.next = node; 
		} 
	} 
	public void show() { 
		Nodes n = head; 

		while (n.next!=null) { 
			System.out.print(n.data + ", ");			
			n = n.next; 
		} 
		System.out.println(n.data + "."); 
	}
	
	public void occurrences(String data) {
		Nodes n = head;
		int counter = 0, count = 0;
		int pos[] = new int[20];
		
		if (data.equalsIgnoreCase(n.data)) {
			pos[count] = counter + 1;
			count++;			
		}
		n = n.next;
			while (n.next!=null) { 
				counter++;
				if (data.equalsIgnoreCase(n.data)) {					
					pos[count] = counter + 1;
					count++;
					
				}
				n = n.next;
				}
			counter++;
			if (data.equalsIgnoreCase(n.data)) {
				pos[count] = counter + 1;
				count++;
			}
		System.out.print("\nFound in position: ");
		for(int i = 0; i < count; i++) {
			if(i < count - 1)
			System.out.print(pos[i] + ", ");
			else
				System.out.print(pos[i] + ".\n");
		}
		System.out.println("\nTotally found for " + count + " times");			
	}	
}
public class LinkedListOccurrence {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		my_Linkedlist list = new my_Linkedlist();

		System.out.println("Welcome");

		while(true) {
			System.out.print("Enter the word: ");
			list.insert(myScanner.next());
			
			System.out.print("Continue adding? y or n: ");
			
			if(myScanner.next().equalsIgnoreCase("n"))
				break;			
		}
		System.out.print("\nEnter the value to search for: ");
		list.occurrences(myScanner.next());
		myScanner.close();
	}
}
