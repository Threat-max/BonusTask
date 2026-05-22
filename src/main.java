import graph.Graph;

public class main {
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 3);
        g.addEdge(1, 2, 1);
        g.addEdge(2, 1, 4);
        g.addEdge(2, 3, 2);
        g.addEdge(1, 3, 2);
        g.addEdge(3, 4, 7);
        g.addEdge(2, 4, 8);

        g.dijkstra(0);
    }
}