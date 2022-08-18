package binaytreeclass;

import java.util.Random;
import java.util.Scanner;

class DeleteNodeTree {
	int data;
	DeleteNodeTree left, right;
}
class BinaryDelete {
	static int flag;

	DeleteNodeTree insert(DeleteNodeTree node, int data) {

		if(node == null) {
			DeleteNodeTree n = new DeleteNodeTree();
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
	void inOder(DeleteNodeTree n) {
		if(n == null)
			return;
		inOder(n.left);
		System.out.print(n.data + " ");
		inOder(n.right);
	}
	public DeleteNodeTree minElement(DeleteNodeTree minNode) {//get min element in BST
		if (minNode.left == null) 
			return minNode;
		else 
			return minElement(minNode.left);
	}
	public DeleteNodeTree deleteNode(DeleteNodeTree root, int value) {
		flag=0;
		if(root == null) 
			return null;
		if(value < root.data) 
			root.left = deleteNode(root.left, value);
		else if(value > root.data) 
			root.right = deleteNode(root.right, value);
		else if(value == root.data) {
			flag = 1;

			if(root.left != null && root.right != null) {//node be deleted has 2 children
				DeleteNodeTree temp = root;
				DeleteNodeTree minNodeOfRight = minElement(temp.right);//find min value from right
				root.data = minNodeOfRight.data;//replace current node with min node from right subtree
				root.right = deleteNode(root.right, minNodeOfRight.data);//delete min node from right
			}
			else if(root.left != null) 
				root = root.left;//node be deleted has 1 left-child
			else if(root.right != null) 
				root = root.right;//node be deleted has 1 right-child
			else 
				root = null;//node be deleted has no child
		}
		return root;
	}	
}
public class DeleteNode {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		DeleteNodeTree node = null;
		BinaryDelete a = new BinaryDelete();
		Random numb = new Random();		

		System.out.println("Welcome.");
//		System.out.println("please enter 10 digits\n");
//		for (int i = 0; i < 10; i++) {
//		System.out.print((i + 1) + " - number: ");
//		node = a.insert(node, myScanner.nextInt());
//	}
		for(int i = 0; i < 10; i++) 
			node = a.insert(node, numb.nextInt(99));
		a.inOder(node);

        System.out.print("\nWhich value to delete? ");
        a.inOder(a.deleteNode(node, myScanner.nextInt()));
        if(BinaryDelete.flag == 0)
        	System.out.println("\nValue not found.");
        else 
        	System.out.println("\nValue deleted.");


//		System.out.println();
//		a.inOder(node);
	}
}
