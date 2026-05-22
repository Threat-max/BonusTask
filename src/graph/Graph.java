package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

    private int n; // количество вершин
    private ArrayList<ArrayList<Edge>> graph;

    public Graph(int n) {
        this.n = n;
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // добавление ребра
    public void addEdge(int from, int to, int weight) {
        graph.get(from).add(new Edge(to, weight));
        // если граф неориентированный:
        // graph.get(to).add(new Edge(from, weight));
    }

    // алгоритм Дейкстры
    public void dijkstra(int start) {
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < n; i++) {

            // ищем минимальную вершину
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }

            visited[u] = true;

            // обновляем соседей
            for (Edge edge : graph.get(u)) {
                int v = edge.to;
                int weight = edge.weight;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        // вывод
        System.out.println("Shortest distances from vertex " + start + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("to " + i + " = " + dist[i]);
        }
    }
}