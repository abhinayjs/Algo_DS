package practice.trees;
//This is a tree
public class BST {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BST() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	Node deleteRec(Node root, int key) {
		if (root == null) {
			return root;
		}
		
		if (key < root.key) {
			root.left = deleteRec(root.left, key);
		}else if (key > root.key){
			root.right = deleteRec(root.right, key);
		}else {
			if (root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}	
			root.key = minValue(root.right);
			
			root.right = deleteRec(root.right, root.key);
		}
		
		return root;
	}
	
	int maxDepth(Node root) {
		if (root == null)
			return 0;
		else {
			int lDepth = maxDepth(root.left);
			int rDepth = maxDepth(root.right);
			
			if (lDepth > rDepth)
				return lDepth + 1;
			else
				return rDepth + 1;
		}
	}
	
	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		
		return minv;
	}
	void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST binarySearchTree = new BST();
		binarySearchTree.insert(50);
		binarySearchTree.insert(30);
		binarySearchTree.insert(20);
		binarySearchTree.insert(40);
		binarySearchTree.insert(70);
		binarySearchTree.insert(60);
		binarySearchTree.insert(80);
		
		binarySearchTree.inorder();
		
		binarySearchTree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        binarySearchTree.inorder();
        
        System.out.println("Height of tree is : " + binarySearchTree.maxDepth(binarySearchTree.root));

	}

}
