package Graph.CheckIfGraphIsTreeOrNot;

import java.awt.PrintGraphics;
import java.util.LinkedList;

public class CheckIfGraphIsTreeOrNot {

	static class Graph{
		int vertices;
		LinkedList<Integer>[] adjLists;
		
		public Graph(int vertices)
		{
			this.vertices=vertices;
			adjLists=new LinkedList[vertices];
			
			for(int i=0;i<vertices;i++)
				adjLists[i]=new LinkedList<Integer>();
		}
		
		public void addEdge(int source,int destination)
		{
			//add forward edge
			adjLists[source].add(destination);
			//add backward edge
			adjLists[destination].add(source);
		}
		
		public void checkIfTree()
		{
			printGraph();
			
			//if cycle is not present and graph is connected, its a tree
			boolean[] visited=new boolean[vertices];
			
			//DFS for original graph start from first vertex.
			boolean isCycle=isCycleUtil(0,visited,-1);
			
			if(isCycle)
			{
				//Graph is disconnected , its not tree.
				System.out.println("Given Graph is not Tree");
				return;
			}
			
			//check the vertex array to determine graph is connected or not.
			for(int i=0;i<vertices;i++)
			{
				if(!visited[i])
				{
					System.out.println("Given Graph is not Tree");
					return;
				}
			}
			//if here, means graph is tree.
			System.out.println("Given Graph is Tree");
		}

		private boolean isCycleUtil(int currVertex, boolean[] visited, int present) {
			
			//add this vertex to visited vertex.
			visited[currVertex]=true;
			
			//visit neighbors except its direct present 
			for(int i=0;i<adjLists[currVertex].size();i++)
			{
				int vertex=adjLists[currVertex].get(i);
				
				//check the adjacent vertex from current vertex 
				if(vertex!=present)
				{
					//if destination vertex is not its direct parent then
					if(visited[vertex])
					{
						//if here means this destination vertex is already visited.
						//means cycle has been detected
						return true;
					}
					else
					{
						//recursiom from destination node
						if(isCycleUtil(vertex, visited, currVertex))
						{
							return true;
						}
					}
				}
			}
			
			return false;
		}

		private void printGraph() {

			for(int i=0;i<vertices;i++)
			{
				LinkedList<Integer> nodeList=adjLists[i];
				System.out.print("Vertex Connected from vertex "+i);
				
				for(int j=0;j<nodeList.size();j++)
				{
					System.out.print("->"+nodeList.get(j));
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(5);
		graph.addEdge(1, 0);
		graph.addEdge(3, 1);
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		
		graph.checkIfTree();
		System.out.println("=======================================");
		
		Graph graph2 = new Graph(5);
		graph2.addEdge(1, 0);
		graph2.addEdge(3, 1);
		graph2.addEdge(3, 2);
		graph2.addEdge(3, 4);
		graph2.addEdge(4, 0);
		
		graph2.checkIfTree();
		System.out.println("============================================");
		
		Graph graph3 = new Graph(5);
		graph3.addEdge(1, 0);
		graph3.addEdge(1, 2);
		graph3.addEdge(3, 1);
		graph3.addEdge(3, 4);
		graph3.addEdge(4, 2);
		
		graph3.checkIfTree();
	}
}

/*
Vertex Connected from vertex 0->1
Vertex Connected from vertex 1->0->3
Vertex Connected from vertex 2->3
Vertex Connected from vertex 3->1->2->4
Vertex Connected from vertex 4->3
Given Graph is Tree
=======================================
Vertex Connected from vertex 0->1->4
Vertex Connected from vertex 1->0->3
Vertex Connected from vertex 2->3
Vertex Connected from vertex 3->1->2->4
Vertex Connected from vertex 4->3->0
Given Graph is not Tree
============================================
Vertex Connected from vertex 0->1
Vertex Connected from vertex 1->0->2->3
Vertex Connected from vertex 2->1->4
Vertex Connected from vertex 3->1->4
Vertex Connected from vertex 4->3->2
Given Graph is not Tree

 */
 