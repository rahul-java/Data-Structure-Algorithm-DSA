package Tree.RightViewOfTree;

import java.util.ArrayList;

public class RightViewOfTree {

static class Node{
		
		Object data;
		
		Node left;
		Node right;
		
		Node(Object data){
			this.data=data;
		}
			
	}

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.left.left=new Node(5);
		root.left.right=new Node(6);
		root.right.right=new Node(7);
		root.right.left=new Node(8);
		root.left.right.left=new Node(9);
		root.left.right.left.left=new Node(10);
		root.left.right.right=new Node(11);
		root.left.right.right.right=new Node(12);
		root.left.right.right.left=new Node(13);
		
		System.out.println("Added Successfully");
		
		printRightView(root);
	}

	private static void printRightView(Node root) {

		if(root==null)
			return;
		
		ArrayList<Object> rightViewList = new ArrayList<>();
		
		rightViewUtil(root,1,rightViewList);
		
		System.out.println("Right View Of Tree : "+rightViewList);  //Right View Of Tree : [1, 3, 7, 11, 12]
	}

	private static void rightViewUtil(Node root, int level, ArrayList<Object> rightViewList) {

		if(root==null)
			return ;
		
		if(rightViewList.size()<level)
		{
			rightViewList.add(root.data);
		}
		
		rightViewUtil(root.right, level+1, rightViewList);
		rightViewUtil(root.left, level+1, rightViewList);
	}
}
