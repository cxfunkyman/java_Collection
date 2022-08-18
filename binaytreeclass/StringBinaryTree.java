package binaytreeclass;

/*
 * Write a program to create a tree based on the below image; 
 * and after creation, print the existing data following in-order, 
 * pre-order, and post-order approach.
 * 
 *                          judy
 *                         /    \
 *                     bill      mary
 *                    /    \         \
 *               alice      fred      tom
 *                         /    \
 *                     dave      jane
 *                                   \
 *                                   joe
 */
class BinaryNode {
	String name;
	BinaryNode left, right;
}
class insertTree {
	
	BinaryNode insert(BinaryNode node, String input) {
		
		if(node == null) {
			BinaryNode n = new BinaryNode();
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
	void inOrder (BinaryNode n) {
		if(n == null)
			return;
		inOrder(n.left);
		System.out.print(n.name + " ");
		inOrder(n.right);
	}
	void preOrder (BinaryNode n) {
		if(n == null)
			return;
		System.out.print(n.name + " ");
		preOrder(n.left);		
		preOrder(n.right);
	}
	void postOrder (BinaryNode n) {
		if(n == null)
			return;
		postOrder(n.left);		
		postOrder(n.right);
		System.out.print(n.name + " ");
	}
}
public class StringBinaryTree {

	public static void main(String[] args) {		
		
		BinaryNode root = null;
		insertTree a = new insertTree();

		root = a.insert(root, "judy");
		root = a.insert(root, "bill");
		root = a.insert(root, "mary");
		root = a.insert(root, "alice");
		root = a.insert(root, "fred");
		root = a.insert(root, "tom");
		root = a.insert(root, "dave");
		root = a.insert(root, "jane");
		root = a.insert(root, "joe");
		
		System.out.print("InOrder: ");
		a.inOrder(root);
		System.out.print("\nPreOrder: ");
		a.postOrder(root);
		System.out.print("\nPostOrder: ");
		a.postOrder(root);
	}
}
