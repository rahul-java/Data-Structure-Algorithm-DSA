package Tree.Question.LeafNode;

import Tree.BinarySearchTree.BinarySearchTree;

public class LeafNode {
	
	//write a program to print the leaf nodes of the tree
	
static Node root=null;
	
	static class Node{
		
		Object data;
		Node left;
		Node right;
		
		Node(Object data){
			this.data=data;
		}
			
	}
	
	public void add(Object data)
	{
		Node node = new Node(data);
		
		//System.out.println("Added node : "+node.data);
		
		if(root==null)
		{
			root=node;
		}
		else
		{
			Node tempNode=root;
			
			while(true)
			{
				int rootValue=(Integer)tempNode.data;
				int givenNodeValue=(Integer)data;
				
				if(givenNodeValue<rootValue)
				{
					if(tempNode.left==null)
					{
						tempNode.left=node;
						return;
					}
					else
					{
						tempNode=tempNode.left;
					}
				}
				else
				{
					if(tempNode.right==null)
					{
						tempNode.right=node;
						return;
					}
					else
					{
						tempNode=tempNode.right;
					}
				}
			}
		}
		
		System.out.println("root : "+root.data);
		
	}

	public static void main(String[] args) {
		
		LeafNode binarySearchTree = new LeafNode();
		
		binarySearchTree.add(120);
		binarySearchTree.add(100);
		binarySearchTree.add(140);
		binarySearchTree.add(90);
		binarySearchTree.add(130);
		binarySearchTree.add(115);
		binarySearchTree.add(145);
		
		System.out.println("Added Successfully");
		
		System.out.println("=============Printing Leaf Nodes Only=============");		
		leafNode(root);
	}

	private static void leafNode(Node root) {

		if(root!=null)
		{
			if(root.left==null && root.right==null)
			{
				System.out.println(root.data);
			}
			else
			{
				leafNode(root.left);
				leafNode(root.right);
			}
		}
	}


}
