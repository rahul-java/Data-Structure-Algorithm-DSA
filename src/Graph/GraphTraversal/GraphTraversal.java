package Graph.GraphTraversal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/*
BFS : 1. Visit the vertex
      2. Explore the vertex
           find out all the adjacent vertex
           
DFS : 1. Visit the vertex
      2. Start Exploring and visit
        
*/
public class GraphTraversal {

LinkedList[] adjList=null;
	
	public GraphTraversal(int noOfVertex) {

		adjList=new LinkedList[noOfVertex];
		
		for(int i=0;i<noOfVertex;i++)
		{
			adjList[i]=new LinkedList<>();
		}
	}
	
	public void add(int vertex, int adjVertex)
	{
		adjList[vertex].add(adjVertex);
	}

	public static void main(String[] args) {
		
		GraphTraversal graph = new GraphTraversal(5);
		graph.add(0, 1);
		graph.add(0, 2);
		graph.add(1, 0);
		graph.add(1, 3);
		graph.add(2, 0);
		graph.add(2, 4);
		graph.add(2, 3);
		graph.add(3, 1);
		graph.add(3, 2);
		graph.add(3, 4);
		graph.add(4, 2);
		graph.add(4, 3);
		System.out.println(Arrays.toString(graph.adjList));
		
		System.out.println("====================Breadth First Search==================");
		graph.BFS(0); //we use Queue
		
		System.out.println("==================Depth First Search=======================");
		graph.DFS(0);  //we use Stack
	}

	private void DFS(int vertex) {

		Stack<Integer> stack=new Stack<Integer>();
		stack.add(vertex);
		
		Set<Integer> set=new HashSet<Integer>();
		
		while(!stack.isEmpty())
		{
			//visit the vertex
			Integer vrtx=stack.pop();
			set.add(vrtx);
			System.out.println(vrtx+" ");
			
			//now explore the vertex means find out all the adjacent vertex of zero(0)
			LinkedList list = adjList[vrtx];
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Integer i = (Integer) iterator.next();
				if(!set.contains(i))
				{
					stack.add(i);
					set.add(i);
				}
				
			}
		}
	}

	private void BFS(int vertex) {

		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(vertex);
		
		Set<Integer> set=new HashSet<Integer>();
		
		while(!queue.isEmpty())
		{
			//visit the vertex
			Integer vrtx=queue.poll();
			set.add(vrtx);
			System.out.println(vrtx+" ");
			
			//now explore the vertex means find out all the adjacent vertex of zero(0)
			LinkedList list = adjList[vrtx];
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Integer i = (Integer) iterator.next();
				if(!set.contains(i))
				{
					queue.add(i);
					set.add(i);
				}
				
			}
		}
	}
	
}
