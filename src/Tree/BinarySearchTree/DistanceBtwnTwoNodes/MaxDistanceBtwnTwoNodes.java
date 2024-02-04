package Tree.BinarySearchTree.DistanceBtwnTwoNodes;

import java.util.ArrayList;
import java.util.List;

public class MaxDistanceBtwnTwoNodes {
	
Node root=null;
static List<Integer> list=new ArrayList<Integer>();
private static Integer prev;
private static Integer maxDiff;
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
		}
			
	}
	
	public static void main(String[] args) {
		
		MaxDistanceBtwnTwoNodes binaryTree = new MaxDistanceBtwnTwoNodes();
		
		binaryTree.root=new Node(10);
		binaryTree.root.left=new Node(7);
		binaryTree.root.right=new Node(15);
		binaryTree.root.left.left=new Node(5);
		binaryTree.root.left.right=new Node(9);
		binaryTree.root.right.left=new Node(13);
		binaryTree.root.right.right=new Node(18);
		
		System.out.println("Added Successfully");
		
		List<Integer> inOrderList = binaryTree.inOrder(binaryTree.root);
		
		if(checkBST(inOrderList)=="BST")
		{
			maxDiff=inOrderList.get(1)-inOrderList.get(0);
			for(int i=1;i<inOrderList.size()-1;i++)
			{
				if(maxDiff<(inOrderList.get(i+1)-inOrderList.get(i)))  //change sign > to < to get maxDistance/minDistance
					maxDiff=inOrderList.get(i+1)-inOrderList.get(i);
			}
			
		}
		System.out.println("Max Distance : "+maxDiff);
		
	}
	
private static String checkBST(List<Integer> list) {
		
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
