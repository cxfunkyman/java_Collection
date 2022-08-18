package binarytreenode;

import java.util.Random;
import java.util.Scanner;

class Node3 {
	int data;
	Node3 left, right;
}
class InmplementIntMenu {
	static int flag;
	
	Node3 insert(Node3 node, int data) {

		if (node == null) {
			Node3 n = new Node3();
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
	void inOrder(Node3 node) {
		if(node == null) {			
			return;
		}
		else {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}		
	}
	public Node3 minElement(Node3 minNode) {
		if (minNode.left == null) 
			return minNode;
		else 
			return minElement(minNode.left);
	}
	public Node3 deleteNode(Node3 root, int value) {
		flag=0;

		if(root == null) {			
			return null;
		}
		if(value < root.data) 
			root.left = deleteNode(root.left, value);
		else if(value > root.data) 
			root.right = deleteNode(root.right, value);
		else {
			flag = 1;

			if(root.left != null && root.right != null) {
				Node3 temp = root;
				Node3 minNodeOfRight = minElement(temp.right);
				root.data = minNodeOfRight.data;
				root.right = deleteNode(root.right, minNodeOfRight.data);
			}
			else if(root.left != null) 
				root = root.left;
			else if(root.right != null) 
				root = root.right;
			else 
				root = null;
		}
		return root;
	}
}
public class BST_Menu {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		Node3 node = null;
		InmplementIntMenu m = new InmplementIntMenu();	
		Random r = new Random();

		System.out.println("Welcome.");

		while (true) {

			System.out.println("1-Insert 2-Show Tree 3-Delete Node 4-Exit.");
			System.out.print("What's your choice: ");

			switch (myScanner.nextInt()) {
			case 1:
				node = m.insert(node, r.nextInt(99));
				System.out.println("Number inserted.\n");
				break;
			case 2:
				if(node != null) {
					m.inOrder(node);
					System.out.println("\n");
				}
				else {
					System.err.println("Can't show, tree is empty.\n");
				}
				break;
			case 3:
				if(node != null) {					
					System.out.print("Which value to delete? ");
					node = m.deleteNode(node, myScanner.nextInt());

					if(InmplementIntMenu.flag == 0) {
						System.err.println("Number not found.\n");
					}
					else {
						System.out.println("Number deleted.\n");						
					}
				}
				else {
					System.err.println("Can't delete, tree is empty.\n");
				}
				break;
			case 4:
				myScanner.close();
				System.exit(0);
				break;

			default:
				System.err.println("Wrong option, only numbers from 1 to 4 are accepted!!!");
				break;
			}
		}
	}
}
