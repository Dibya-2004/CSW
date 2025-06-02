package Assignment_6;
import java.util.*;

public class Q6 {
    int vtx;
    int[][] adjMat;
    List<List<Integer>> adjList;

    Q6(int v) {
        vtx = v;
        adjMat = new int[v][vtx];
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
    	adjMat[src][dest] = 1;
    	adjMat[dest][src] = 1;
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    void displayAdjMatrix() {
        for (int[] row : adjMat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    void displayAdjList() {
        for (int i = 0; i < vtx; i++) {
            System.out.print(i + ": ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q6 g = new Q6(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.displayAdjMatrix();
        System.out.println();
        g.displayAdjList();
    }
}
