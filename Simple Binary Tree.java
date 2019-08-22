import java.util.*;

class Test{
	public static void main(String args[]) {
		BinarySearchTree b = new BinarySearchTree();
		b.CreatTree("61,23,40,71,88,32,47,56,62,38");
		
		b.printTree();								/*	preOrder:	61 23 40 32 38 47 56 71 62 88 
														inOrder:	23 32 38 40 47 56 61 62 71 88 
		  												postOrder:	38 32 56 47 40 23 62 88 71 61 */
		System.out.println(b.getHeight());// Height:5
	}
}
class BinarySearchTree{
	class TreeNode{
		int data;
		TreeNode right;
		TreeNode left;
		
		TreeNode(int data){
			this.data = data;
		}
	}
	
	private TreeNode root;
	
	public void CreatTree(String s) {
		Scanner scn = new Scanner(s).useDelimiter(",");
		while(scn.hasNext()) {
			try {
				int number = Integer.parseInt(scn.next());
				TreeNode node = new TreeNode(number);
				
				if(root == null) root = node;
				else {
					TreeNode first = root;
					while(true) {
						if(number > first.data) {
							if(first.right == null) {
								first.right = node;
								break;
							}
							else first = first.right;
						}
						else {
							if(first.left == null) {
								first.left = node;
								break;
							}
							else first = first.left;
						}
					}
				}
			}catch(Exception e) {
				e.toString();
			}
		}
	}
	public void add(String data) {
		CreatTree(data);
	}
	public int getHeight() {
		TreeNode first = root;
		
		if(first == null) return 0;
		else return max(first);
	}
	public int max(TreeNode node) {
		if(node == null) {
			return 0;
		}
		int left = max(node.left);
	    int right = max(node.right);
	    return Math.max(left, right) + 1;
	}
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}

	}
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}

	}
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}

	}
	public void printTree() {
		TreeNode first_1,first_2,first_3;
		first_1 = first_2 = first_3 = root;
		
		preOrder(first_1);
		System.out.println();
		
		inOrder(first_2);
		System.out.println();
		
		postOrder(first_3);
		System.out.println();
	}
}