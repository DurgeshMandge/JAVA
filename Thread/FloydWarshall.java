// import java.util.Arrays;

public class FloydWarshall {
    static final int INF = 99999; // Represents infinity

    static void floydWarshall(int[][] graph, int V) {
        int[][] dist = new int[V][V];

        // Initialize dist with the given graph
        for (int i = 0; i < V; i++) {
            System.arraycopy(graph[i], 0, dist[i], 0, V);
        }

        // Run the Floyd-Warshall algorithm
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF &&
                        dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Print the shortest distances
        printSolution(dist, V);
    }

    static void printSolution(int[][] dist, int V) {
        System.out.println("Shortest distances between every pair of vertices:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] graph = {
            { 0,   8,  INF,  1},
            {INF,  0,   1,  INF},
            { 4,  INF, 0, INF},
            {INF,  2,   9,   0}
        };

        floydWarshall(graph, V);
    }
}