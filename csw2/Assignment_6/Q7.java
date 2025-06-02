package Assignment_6;
import java.util.*;

public class Q7 {
    int vertices;
    List<List<Integer>> adjList;

    Q7(int v) {
        vertices = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i : adjList.get(v)) {
            if (!visited[i]) {
                dfs(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Q7 g = new Q7(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        boolean[] visited = new boolean[5];
        g.dfs(0, visited);
    }
}
