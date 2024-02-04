package Graph.GraphRepresentation;

import java.util.Arrays;
import java.util.LinkedList;

public class GraphRepresentation {
	
	LinkedList[] adjList=null;
	
	public GraphRepresentation(int noOfVertex) {

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
		
		GraphRepresentation graph = new GraphRepresentation(5);
		graph.add(0, 1);
		graph.add(0, 2);
		graph.add(1, 0);
		graph.add(1, 3);
		graph.add(2, 0);
		graph.add(2, 3);
		graph.add(2, 4);
		graph.add(3, 1);
		graph.add(3, 2);
		graph.add(3, 4);
		graph.add(4, 2);
		graph.add(4, 3);
		
		System.out.println(Arrays.toString(graph.adjList));  //[[1, 2], [0, 3], [0, 3, 4], [1, 2, 4], [2, 3]]
		
		//[0->[1, 2], 1->[0, 3], 2->[0, 3, 4], 3->[1, 2, 4], 4->[2, 3]]
		//0,1,2,3,4 -> vertex
		//[],[],[],[] -> adjacent Vertex
	}

}
