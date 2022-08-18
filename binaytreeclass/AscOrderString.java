package binaytreeclass;

import java.util.Scanner;

/*
 * WAP to accept 10 numbers from the user and create 
 * the binary tree accordingly. 
 * (Ensure that creation is done correctly)
 */

class StringTree {
	String name;
	StringTree left, right;
}
class AscOrderTree {
	
	StringTree insert(StringTree node, String input) {
		
		if(node == null) {
			StringTree n = new StringTree();
			n.name = input;
			n.left = null;
			n.right = null;
			
			return n;
		}
		else if(input.compareToIgnoreCase(node.name) <= 0) {
			node.left = insert(node.left, input);
		}
		else if(input.compareToIgnoreCase(node.name) > 0) {
			node.right = insert(node.right, input);
		}
		return node;
	}
	void inOder(StringTree n) {
		if(n == null)
			return;
		inOder(n.left);
		System.out.print(n.name + " ");
		inOder(n.right);
	}
}
public class AscOrderString {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		StringTree node = null;
		AscOrderTree a = new AscOrderTree();
		
		System.out.println("Welcome.");
		System.out.println("please enter 10 strings\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " - name: ");
			node = a.insert(node, myScanner.next());
		}
		System.out.println();
		a.inOder(node);
		myScanner.close();
	}
}
