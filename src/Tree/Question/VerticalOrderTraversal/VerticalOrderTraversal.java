package Tree.Question.VerticalOrderTraversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {

	static Node root=null;
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
			
	}
	

	public static void main(String[] args) {
		
		VerticalOrderTraversal binaryTree = new VerticalOrderTraversal();
		
		binaryTree.root=new Node(10);
		binaryTree.root.left=new Node(20);
		binaryTree.root.right=new Node(30);
		binaryTree.root.left.left=new Node(40);
		binaryTree.root.left.right=new Node(50);
		binaryTree.root.right.left=new Node(60);
		binaryTree.root.right.right=new Node(70);
		
		System.out.println("Added Successfully");
		
		Collection<List<Integer>> list=binaryTree.verticalOrderTraversal(binaryTree.root);
		
		System.out.println(list);
	}
	class Pair{
		Node node;
		int col;
		
		Pair(Node node,int col){
			this.node=node;
			this.col=col;
		}
	}


	private Collection<List<Integer>> verticalOrderTraversal(Node root) {

		List<List<Integer>> resultList=new ArrayList<>();
		Map<Integer, List<Integer>> levelMap=new HashMap<>();
		if(root==null)
			return levelMap.values();
		
		Map<Integer, List<Integer>> map=new TreeMap<>();
		
		Queue<Pair> queue=new LinkedList<>();
		queue.add(new Pair(root,0));
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			
			for(int i=0;i<size;i++)
			{
				Pair pair=queue.poll();
				Node node=pair.node;
				int position=pair.col;
				
				if(!levelMap.containsKey(position))
					levelMap.put(position, new ArrayList<>());
				
				levelMap.get(position).add(node.data);
				
				if(node.left!=null)
					queue.add(new Pair(node.left, position-1));
				if(node.right!=null)
					queue.add(new Pair(node.right, position+1));
				
			}
			 
		}
		//printing started
		for(List<Integer> list:levelMap.values())
		{
			for(int val :list)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		//printing ended
		return levelMap.values();
		
	}
}
