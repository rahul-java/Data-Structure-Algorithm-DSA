package Graph.ShortestPathAlgorithm;

import java.util.Arrays;

class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 4, 0, 0, 0},
                {0, 0, 1, 7, 0, 0},
                {0, 0, 0, 0, 3, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 2, 0, 5},
                {0, 0, 0, 0, 0, 0}
        };

        int startNode = 0;
        dijkstra(graph, startNode);
    }

    private static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static void printSolution(int[] dist) {
        System.out.println("Shortest distances from the start node:");

        for (int i = 0; i < dist.length; i++) {
            System.out.println("To Node " + i + ": " + dist[i]);
        }
    }
}