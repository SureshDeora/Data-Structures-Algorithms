
import java.util.ArrayList;
import java.util.Arrays;

public class BellMan_Ford {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void createGraph2(ArrayList<Edge> graph) {
        // storing the edges randomly, no track of idxs
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        // Total T.C O(V*E)
        // algo O(V)
        for (int i = 1; i < V; i++) {
            // edges - O(E)
            for (int j = 0; j < V; j++) {
                // Edge e = graph.get(j);    //when graph is simply 
                // int u = e.src;       // created without [], not need the next loop
                // int v = e.dest;          //
                // int wt = e.wt;

                // // relaxation and cycle in negative weighted graph
                // if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                //     dist[v] = dist[u] + wt;
                // }
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation and cycle in negative weighted graph
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String a[]) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        // ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
