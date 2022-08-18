package binarytreenode;

/*
 * Seky Emil Perez Moya 219-5412
 */

class Node0 {
	int data;
	Node0 left, right;
}
class InmplementInt {

	Node0 insert(int data) {
		Node0 n = new Node0();

		n.data = data;
		n.left = null;
		n.right = null;

		return n;
	}
	void Traversal(Node0 root) {
		int rear = 0, front = 0;		
		Node0 arrQueue[] = new Node0[32];

		if(root == null)
			return;
		
		arrQueue[rear++] = root;
		arrQueue[rear++] = null;
		Node0 n;

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
}
public class Tree_Level_Order_Int {

	public static void main(String[] args) {

		InmplementInt i = new InmplementInt();
		Node0 root;

		root = i.insert(7);
		root.left = i.insert(3);	    
		root.left.left = i.insert(1);
		root.left.right = i.insert(6);
		root.left.left.left = i.insert(0);
		root.left.left.right = i.insert(2);
		root.left.right.left = i.insert(4);
		root.left.right.left.right = i.insert(5);
		root.right = i.insert(12);
		root.right.left = i.insert(9);
		root.right.right = i.insert(13);
		root.right.left.left = i.insert(8);
		root.right.left.right = i.insert(11);
		root.right.left.right.left = i.insert(10);
		root.right.right.right = i.insert(15);
		root.right.right.right.left = i.insert(14);

		System.out.println("The level order traversal of the tree is: ");
		i.Traversal(root);
	}
}
