package practice;

import java.util.Random;
import java.util.Scanner;

class Node {
	int data;
	Node left, right;
}
class InmplementIntMenu {
	static int flag;
	int addAll = 0;
	
	Node insert(Node node, int data) {

		if (node == null) {
			Node n = new Node();
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
	void inOrder(Node node) {
		if(node == null) {			
			return;
		}
		else {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}		
	}
	void preOrder (Node node) {
		if(node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);		
		preOrder(node.right);
	}
	void postOrder (Node node) {
		if(node == null)
			return;
		postOrder(node.left);		
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	void SumAll(Node root) {
		if(root == null)
			return;
		else {
			SumAll(root.left);			
			SumAll(root.right);
			addAll = addAll + root.data;
		}
	}
	public Node minElement(Node minNode) {
		if (minNode.left == null) 
			return minNode;
		else 
			return minElement(minNode.left);
	}
	public Node deleteNode(Node root, int value) {
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
				Node temp = root;
				Node minNodeOfRight = minElement(temp.right);
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
	void Traversal(Node root) {
		int rear = 0, front = 0;		
		Node arrQueue[] = new Node[32];

		if(root == null)
			return;
		
		arrQueue[rear++] = root;
		arrQueue[rear++] = null;
		Node n;

		while(front < rear) {	    	

			n = arrQueue[front];
			if(n == null) {
				System.out.println();
				front++;
				if(arrQueue[front] != null)
					arrQueue[rear++] = null;
			}
			else {	    			
				System.out.print(arrQueue[front++].data + " ");

				if(n.left != null) {
					arrQueue[rear++] = n.left;
					
				}
				if(n.right != null) {
					arrQueue[rear++] = n.right;
					
				}
			}
		}
	}
	void printOddNodes(Node root, boolean isOdd) {

		if (root == null)
			return;

		if (isOdd == true)
			System.out.print(root.data + " ");

		printOddNodes(root.left, !isOdd);
		printOddNodes(root.right, !isOdd);
	}
}
class Occurrences {
	int data, count = 0;

	void repeated(Node n) {

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
	void printOccurrence(Node n, int data) {
		this.data = data;
		repeated(n);
		
		if(this.count == 0)
			System.out.println("The number " + this.data + " is not found");
		else
			System.out.println("The number " + this.data + " has " + this.count + " occurrences.");	
	}
}
public class LinkedList {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		Node node = null;
		InmplementIntMenu m = new InmplementIntMenu();	
		Occurrences o = new Occurrences();
		Random r = new Random();
		
		System.out.println("Welcome.");

		while (true) {

			System.out.println("1-Insert 2-Inorder 3-Preorder 4-Postorder 5-Print odd");
			System.out.println("6-Print Even 7-Print per level 8-Delete Node 9-Occurrences 10-Sum 11-Exit.");
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
					System.err.println("Can't print, tree is empty.\n");
				}
				break;
			case 3:
				if(node != null) {
					m.preOrder(node);
					System.out.println("\n");
				}
				else {
					System.err.println("Can't print, tree is empty.\n");
				}
				break;
			case 4:
				if(node != null) {
					m.postOrder(node);
					System.out.println("\n");
				}
				else {
					System.err.println("Can't print, tree is empty.\n");
				}
				break;
			case 5:
				if(node != null) {
					m.printOddNodes(node, true);
					System.out.println("\n");
				}
				else {
					System.err.println("Can't print, tree is empty.\n");
				}				
				break;
			case 6:
				if(node != null) {
					m.printOddNodes(node, false);
					System.out.println("\n");
				}
				else {
					System.err.println("Can't print, tree is empty.\n");
				}	
				break;
			case 7:
				if(node != null) {
					m.Traversal(node);
					System.out.println("\n");
				}
				else {
					System.err.println("Can't print, tree is empty.\n");
				}
				break;
			case 8:
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
			case 9:
				if(node != null) {
					System.out.print("\nWhich value to find: ");
					o.printOccurrence(node, myScanner.nextInt());
					System.out.println("\n");
				}
				else {
					System.err.println("Tree is empty.\n");
				}
				break;
			case 10:
				if(node != null) {
					m.SumAll(node);
					System.out.println("\nSUM of all nodes: " + m.addAll);
					System.out.println();
				}
				else {
					System.err.println("Can't print, tree is empty.\n");
				}	
				break;
			case 11:
				myScanner.close();
				System.exit(0);
				break;
			default:
				System.err.println("Wrong option, only numbers from 1 to 11 are accepted!!!");
				break;
			}
		}
	}
}

