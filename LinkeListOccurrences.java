package LinkedMerge;

import java.util.Scanner;

/*
 * Suppose we have an ascending-sorted linked list. 
 * WAP to accept a number from the user, and find out 
 * its first and last occurrences in the linked list.
 */

class Nodet { 
	int data; 
	Nodet next; 
} 

class Mylist {
    Nodet head;
    public void insert(int data) {//adding to the end of list
        Nodet nodes = new Nodet();
        nodes.data = data;
        nodes.next = null;
        if(head == null) 
        	head=nodes;
        else {
            Nodet n = head;
            while(n.next != null) 
            	n = n.next;
            n.next = nodes;
        }
    }
    public void occurrences(int number) {
    	Nodet n = new Nodet();
    	n.data = number;
    	n.next = null;
    	int counter = 0, count = 1, first = 0, last = 0;
    	
    	if(head == null)
    		return;
    	else {
    		count++;
    		Nodet z = head;
    		if (n.data == head.data) {    			
    			counter++; 
    			first = 1;
    			last = 1;
    		}
    		while(z.next != null) {
    			z = z.next;
    		if (z.data == n.data && counter < 1) {
    			counter++;
    			first = count;
    			last = count;
			}
    		else if (z.data == n.data && counter >= 1){
    			counter++;	
    			last = count;
			}
    		count++;
    		}
		}
    	count++;
    	if(counter == 0) {
    		System.out.println("Number not found");
    	}
    	else if (counter == 1) {
    		System.out.println("Only one accurrence at position " + first);
    	}
    	else {
		System.out.println("First occurrence at index " + first);
		System.out.println("Last occurrence at index " + last);
		System.out.println("Number of occurrence found " + counter);
    	}
    }
    public void show() {
        Nodet n = head;
        while(n.next != null){
            System.out.print(n.data + ", ");
            n = n.next;
        }
        System.out.print(n.data + ".\n");
    }
}
public class LinkeListOccurrences {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int[] arr = {1, 5, 5, 5, 15, 25, 38, 38, 47, 53, 53, 53, 53, 68, 71, 83, 83, 83, 83, 83, 90, 100};
		Mylist list = new Mylist();
		int input;
		
		for(int i = 0; i < arr.length; i++) {
			list.insert(arr[i]);
		}
		System.out.println("LinkedList data");
		list.show();
		
		System.out.print("\nEnter a number to search for accurrences: ");
		input = myScanner.nextInt();
		list.occurrences(input);
	}	
}
