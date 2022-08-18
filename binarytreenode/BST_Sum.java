package binarytreenode;

import java.util.Scanner;

class Node2 {
	int data;
	Node2 left, right;
}
class InmplementIntSum {
	int addAll = 0;

		Node2 insert(Node2 node, int data) {
			
			if (node == null) {
				Node2 n = new Node2();
				n.data = data;
				n.left = null;
				n.right = null;
				
				return n;
			}
			else if (data <= node.data) {
				node.left = insert(node.left, data);
			}
			else if (data > node.data) {
				node.right = insert(node.right, data);
			}
			return node;
		}
	void SumAll(Node2 root) {
		if(root == null)
			return;
		else {
			SumAll(root.left);			
			SumAll(root.right);
			addAll = addAll + root.data;
		}
	}
}
public class BST_Sum {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		InmplementIntSum sum = new InmplementIntSum();
		Node2 root = null;
		
		System.out.println("Welcome. \nPlease Enter 10 Numbers.");
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " - Enter a number: ");
			root = sum.insert(root, myScanner.nextInt());
		}
		sum.SumAll(root);
		System.out.println("\nSUM of all nodes: " + sum.addAll);
		myScanner.close();
	}
}
