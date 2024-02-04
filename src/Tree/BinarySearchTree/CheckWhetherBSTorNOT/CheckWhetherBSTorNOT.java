package Tree.BinarySearchTree.CheckWhetherBSTorNOT;

import java.util.ArrayList;
import java.util.List;

public class CheckWhetherBSTorNOT {
	
	static List<Integer> list=new ArrayList<Integer>();
Node root=null;
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
		}
			
	}
	
	public static void main(String[] args) {
		
		CheckWhetherBSTorNOT binaryTree = new CheckWhetherBSTorNOT();
		
		binaryTree.root=new Node(10);
		binaryTree.root.left=new Node(7);
		binaryTree.root.right=new Node(15);
		binaryTree.root.left.left=new Node(5);
		binaryTree.root.left.right=new Node(9);
		binaryTree.root.right.left=new Node(13);
		binaryTree.root.right.right=new Node(18);
		
		System.out.println("Added Successfully");
		List<Integer> inOrderList = binaryTree.inOrder(binaryTree.root);
		
		String checkBST = binaryTree.checkBST(inOrderList);
		System.out.println("Result : "+checkBST);
		
	}
	
	private String checkBST(List<Integer> list) {
		
		for(int i=0;i<list.size()-1;i++)
		{
			if(!(list.get(i)<list.get(i+1)))
				return "NOT BST";
		}
		return "BST";

	}

	private List<Integer> inOrder(Node root) {

		if(root!=null)
		{
			inOrder(root.left);
			//System.out.println(root.data);
			list.add(root.data);
			inOrder(root.right);
		}
		return list;
	}


}
