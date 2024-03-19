import java.util.ArrayList;
import java.util.List;

public class BellmanFord {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static void bellmanFord(List<Edge> edges, int V, int src) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i = 1; i < V; i++) {
            for (Edge edge : edges) {
                if (dist[edge.src] != Integer.MAX_VALUE &&
                    dist[edge.src] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = dist[edge.src] + edge.weight;
                }
            }
        }

        for (Edge edge : edges) {
            if (dist[edge.src] != Integer.MAX_VALUE &&
                dist[edge.src] + edge.weight < dist[edge.dest]) {
                System.out.println("Negative cycle detected");
                return;
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.println("Distance from " + src + " to " + i + " is " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 8;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(1, 2, 6));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(1, 4, 5));
        edges.add(new Edge(2, 5, -1));
        edges.add(new Edge(3, 2, -2));
        edges.add(new Edge(3, 5, 1));
        edges.add(new Edge(4, 3, -2));
        edges.add(new Edge(4, 6, -1));
        edges.add(new Edge(5, 7, 3));
        edges.add(new Edge(6, 7, 3));

        bellmanFord(edges, V, 1);
    }
}