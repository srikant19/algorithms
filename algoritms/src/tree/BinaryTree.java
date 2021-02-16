package tree;

public class BinaryTree {
	
	 Node root;
	 
	 public BinaryTree(int data) {
		 root = new Node(data);
	}
	 
	 public BinaryTree() {
		 root = null;
	}
	 
	 public static void main() {
		 
		 BinaryTree tree =  new BinaryTree();
		 
		 tree.root = new Node(1);
		 
		 tree.root.left = new Node(2);
		 tree.root.right = new Node(3);
		 tree.root.left.left = new Node(4);
		 
	 }
}
