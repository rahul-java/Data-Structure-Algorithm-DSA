package Tree.Question.MirrorImageOfTree;

public class MirrorImageOfTree {
	
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
		
		MirrorImageOfTree binarySearchTree = new MirrorImageOfTree();
		
		binarySearchTree.add(120);
		binarySearchTree.add(100);
		binarySearchTree.add(140);
		binarySearchTree.add(90);
		binarySearchTree.add(130);
		binarySearchTree.add(115);
		binarySearchTree.add(145);
		
		
		System.out.println("Added Successfully");
		
		System.out.println("============Before=================");
		
		inOrder(root);
		
		convertToMirrorImage(root);
		
		System.out.println("=============After==================");
		
		inOrder(root);
		
	}

	private static void inOrder(Node root) {

		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

	private static void convertToMirrorImage(Node root) {

		if(root==null)
			return;
		
		convertToMirrorImage(root.left);
		convertToMirrorImage(root.right);
		
		swap(root);
	}

	//convert left->right and right->left
	private static void swap(Node root) {

		if(root==null)
			return;
		
		Node tempNode=root.left;
		root.left=root.right;
		root.right=tempNode;
	}


}
