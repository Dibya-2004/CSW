package Assignment_6;
import java.util.*;

public class Q8 {
    int vertices;
    List<List<Integer>> adjList;

    Q8(int v) {
        vertices = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int i : adjList.get(v)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Q8 g = new Q8(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.bfs(0);
    }
}
