package Tree.Question.SumOfAllElementsOfTree;


public class SumOfAllElementsOfTree {

static Node root=null;
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
		}
			
	}
	
	public void add(int data)
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
		
		SumOfAllElementsOfTree binarySearchTree = new SumOfAllElementsOfTree();
		
		binarySearchTree.add(120);
		binarySearchTree.add(100);
		binarySearchTree.add(140);
		binarySearchTree.add(90);
		binarySearchTree.add(130);
		binarySearchTree.add(115);
		binarySearchTree.add(145);
		
		System.out.println("Added Successfully");
		
		int sumOfAllElementsOfTree = sumOfAllElementsOfTree(root);
		System.out.println("Sum of all elements : "+sumOfAllElementsOfTree);
	}

	private static int sumOfAllElementsOfTree(Node root) {

		if(root==null)
			return 0;
		return root.data + sumOfAllElementsOfTree(root.left) + sumOfAllElementsOfTree(root.right);
	}
}
