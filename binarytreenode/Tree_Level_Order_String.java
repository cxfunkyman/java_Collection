package binarytreenode;

class Node1 {
	String data;
	Node1 left, right;
}
class InmplementString {

	Node1 insert(String  data) {
		Node1 n = new Node1();

		n.data = data;
		n.left = null;
		n.right = null;

		return n;
	}
	void Traversal(Node1 root) {
		int rear = 0, front = 0;		
		Node1 arrQueue[] = new Node1[32];

		if(root == null)
			return;
		
		arrQueue[rear++] = root;
		arrQueue[rear++] = null;
		Node1 n;

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

public class Tree_Level_Order_String {

	public static void main(String[] args) {

		InmplementString i = new InmplementString();
		Node1 root;

		root = i.insert("mm");
		root.left = i.insert("dd");	    
		root.left.left = i.insert("ss");
		root.left.right = i.insert("bb");
		root.left.left.left = i.insert("gg");
		root.left.left.right = i.insert("aa");
		root.left.right.left = i.insert("ll");
		root.left.right.left.right = i.insert("cc");
		root.right = i.insert("hh");
		root.right.left = i.insert("kk");
		root.right.right = i.insert("qq");
		root.right.left.left = i.insert("yy");
		root.right.left.right = i.insert("pp");
		root.right.left.right.left = i.insert("ee");
		root.right.right.right = i.insert("nn");
		root.right.right.right.left = i.insert("xx");

		System.out.println("The level order traversal of the tree is: ");
		i.Traversal(root);	

	}

}
