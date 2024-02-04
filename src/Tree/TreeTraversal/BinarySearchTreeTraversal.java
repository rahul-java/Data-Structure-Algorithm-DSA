package Tree.TreeTraversal;

public class BinarySearchTreeTraversal {
	
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
		
		BinarySearchTreeTraversal binarySearchTree = new BinarySearchTreeTraversal();
		
		binarySearchTree.add(120);
		binarySearchTree.add(100);
		binarySearchTree.add(140);
		binarySearchTree.add(90);
		binarySearchTree.add(130);
		binarySearchTree.add(125);
		binarySearchTree.add(125);
		binarySearchTree.add(95);
		
		System.out.println("Added Successfully");
		
		System.out.println("=============L=root=R==================inOrder Traversal=========================");		
		binarySearchTree.inOrder(binarySearchTree.root);
		
		System.out.println("=============root=L=R==================preOrder Traversal=========================");		
		binarySearchTree.preOrder(binarySearchTree.root);
		
		System.out.println("=============L=R=root==================postOrder Traversal=========================");		
		binarySearchTree.postOrder(binarySearchTree.root);
		
	}
	
	private void postOrder(Node root) {
		if(root!=null)
		{
			inOrder(root.left);
			inOrder(root.right);
			System.out.println(root.data);
		}
	}

	private void preOrder(Node root) {
		if(root!=null)
		{
			System.out.println(root.data);
			inOrder(root.left);
			inOrder(root.right);
		}
	}

	private void inOrder(Node root) {

		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

}
