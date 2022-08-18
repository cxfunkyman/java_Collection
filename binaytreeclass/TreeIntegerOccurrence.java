package binaytreeclass;

import java.util.Scanner;

/*
 * WAP to accept 10 numbers from the user and create 
 * the binary tree. Then accept another number and 
 * find out its number of occurrences in tree.
 */

class IntegerTree {
	int data;
	IntegerTree left, right;
}
class BinaryInteger {

	IntegerTree insert(IntegerTree node, int data) {

		if(node == null) {
			IntegerTree n = new IntegerTree();
			n.data = data;
			n.left = null;
			n.right = null;

			return n;
		}
		else if(data <= node.data) {
			node.left = insert(node.left, data);
		}
		else if(data > node.data) {
			node.right = insert(node.right, data);
		}
		return node;
	}
	void inOder(IntegerTree n) {
		if(n == null)
			return;
		inOder(n.left);
		System.out.print(n.data + " ");
		inOder(n.right);
	}
}
class Occurrences {
	int data, count = 0;

	void repeated(IntegerTree n) {

		if(n == null)
			return;
		else {
			repeated(n.left);		
			repeated(n.right);
			if (n.data == this.data) {
				this.count++;			
			}
		}	
	}
	void printOccurrence(IntegerTree n, int data) {
		this.data = data;
		repeated(n);
		
		if(this.count == 0)
			System.out.println("The number " + this.data + " is not found");
		else
			System.out.println("The number " + this.data + " has " + this.count + " occurrences.");	
	}
}
public class TreeIntegerOccurrence {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		IntegerTree node = null;
		BinaryInteger a = new BinaryInteger();
		Occurrences o = new Occurrences();

		System.out.println("Welcome.");
		System.out.println("please enter 10 digits\n");

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " - number: ");
			node = a.insert(node, myScanner.nextInt());
		}
		System.out.println();
		a.inOder(node);

		System.out.print("\nEnter a number to search for occurrence : ");
		o.printOccurrence(node, myScanner.nextInt());
		myScanner.close();
	}
}
