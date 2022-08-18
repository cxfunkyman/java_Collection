package treepackage;

class Queue_Node {
	int data; 
	Queue_Node right;
	Queue_Node left;
}
class Tree_Queue {

	Queue_Node insert(int data) {
		Queue_Node node = new Queue_Node();
		node.data = data;
		node.left = null;
		node.right = null; 		
		return node;
	}
}


public class TreePrintQueue {

	public static void Traversal(Queue_Node root) {
		int r=0,f=0;
		Queue_Node que[]=new Queue_Node[20];
		if(root==null)return;
		que[r++]=root;
		Queue_Node n;
		while(f<r) {
			n=que[f];
			System.out.print(que[f++].data + " ");
			if(n.left!=null) que[r++]=n.left;
			if(n.right!=null) que[r++]=n.right;
		}
	}

	public static void main(String[] args) {

		Queue_Node root;
		Tree_Queue a = new Tree_Queue();

		root = a.insert(1);
		root.left = a.insert(2);
		root.right = a.insert(3);
		root.left.left = a.insert(4);
		root.left.right = a.insert(5);
		root.right.left = a.insert(6);
		root.right.left.left = a.insert(7);
		root.right.left.right = a.insert(8);
		root.right.right = a.insert(9);	

		System.out.print("The level order traversal of the tree is: ");
		Traversal(root);
	}
}

/*
 * class Node {
int value;
Node left,right;
public Node(int key) {
    value=key;
    left=null;
    right=null;
    }
}
class A {
  public static void Traversal(Node root) {
    int r=0,f=0;
    Node que[]=new Node[20];
    if(root==null)return;
    que[r++]=root;
    Node n;
    while(f<r) {
        n=que[f];
        System.out.print(que[f++].value + " ");
        if(n.left!=null) que[r++]=n.left;
        if(n.right!=null) que[r++]=n.right;
    }
  }
  public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right = new Node(9);
        System.out.print("The level order traversal of the tree is: ");
        Traversal(root);
  }
}
 * 
 * */
