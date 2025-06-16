package javapro;
import java.util.*;

public class GraphDFS {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    public GraphDFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    // DFS traversal starting from a given vertex
    public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal starting from vertex " + start + ":");
        DFSUtil(start, visited);
    }

    // Recursive helper function for DFS
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Main method to test the DFS
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        graph.DFS(0);
    }
}

