package Tree.BinarySearchTree;

public class BinarySearchTree {

Node root=null;
	
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
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.add(120);
		binarySearchTree.add(100);
		binarySearchTree.add(140);
		binarySearchTree.add(90);
		binarySearchTree.add(130);
		binarySearchTree.add(125);
		binarySearchTree.add(125);
		binarySearchTree.add(95);
		
		System.out.println("Added Successfully");
	}
}
