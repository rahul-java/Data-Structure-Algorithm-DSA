package Tree.BinarySearchTree.DistanceBtwnTwoNodes;

import java.util.ArrayList;
import java.util.List;

public class MinDistanceBtwnTwoNodes2 {

	Node root=null;
	static List<Integer> list=new ArrayList<Integer>();
	private static Integer prev;
	private static Integer minDiff;
		
		static class Node{
			
			int data;
			Node left;
			Node right;
			
			Node(int data){
				this.data=data;
			}
				
		}
		
		public static void main(String[] args) {
			
			MinDistanceBtwnTwoNodes2 binaryTree = new MinDistanceBtwnTwoNodes2();
			
			binaryTree.root=new Node(10);
			binaryTree.root.left=new Node(7);
			binaryTree.root.right=new Node(15);
			binaryTree.root.left.left=new Node(5);
			binaryTree.root.left.right=new Node(9);
			binaryTree.root.right.left=new Node(13);
			binaryTree.root.right.right=new Node(18);
			
			System.out.println("Added Successfully");
			
			minDiffInBST(binaryTree.root);
			
			System.out.println("Min Distance : "+minDiff);
		}

		private static int minDiffInBST(Node root) {

			prev=null;
			minDiff=Integer.MAX_VALUE;
			inOrderTraversal(root);
			
			return minDiff;
			
		}
		private static void inOrderTraversal(Node root) {

			if(root==null)
				return;
			
			inOrderTraversal(root.left);
			if(prev!=null)
				minDiff=Math.min(minDiff, Math.abs(root.data-prev));
			prev=root.data;
			inOrderTraversal(root.right);
		}
}
