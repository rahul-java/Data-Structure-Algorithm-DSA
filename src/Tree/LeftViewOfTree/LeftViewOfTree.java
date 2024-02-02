package Tree.LeftViewOfTree;


import java.util.ArrayList;

public class LeftViewOfTree {
	
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
		
		printLeftView(root);
	}

	private static void printLeftView(Node root) {

		if(root==null)
			return;
		
		ArrayList<Object> leftViewList = new ArrayList<>();
		
		leftViewUtil(root,1,leftViewList);
		
		System.out.println("Left View Of Tree : "+leftViewList);  //Left View Of Tree : [1, 2, 4, 5, 10]
	}

	private static void leftViewUtil(Node root, int level, ArrayList<Object> leftViewList) {

		if(root==null)
			return ;
		
		if(leftViewList.size()<level)
		{
			leftViewList.add(root.data);
		}
		
		leftViewUtil(root.left, level+1, leftViewList);
		leftViewUtil(root.right, level+1, leftViewList);
	}
}
