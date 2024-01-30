package Tree.BinaryTree;

public class BinaryTree {

	Node root=null;
	
	static class Node{
		
		Object data;
		Node left;
		Node right;
		
		Node(Object data){
			this.data=data;
		}
			
	}
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.root=new Node(10);
		binaryTree.root.left=new Node(8);
		binaryTree.root.right=new Node(7);
		binaryTree.root.left.left=new Node(5);
		binaryTree.root.left.right=new Node(4);
		binaryTree.root.right.left=new Node(3);
		binaryTree.root.right.right=new Node(2);
		
		System.out.println(binaryTree.root.data);
		System.out.println(binaryTree.root.left.left.data);
		
	}
}
