import java.util.ArrayList;

public class TraversalDFS {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        } 
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
         
        graph[6].add(new Edge(6, 5, 1));
    }
    public static void dfs(ArrayList<Edge>[] graph, boolean[] isVisited, int curr) {
        // Self Visiting
        System.out.print(curr + " ");
        isVisited[curr] = true;

        // Find it's neighbours and visit only which aren't visited yet
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVisited[e.dest]) {
                dfs(graph, isVisited, e.dest);
            }
        }
    }
    public static void main(String a[]) {
        /*
         *              1 ---- 3
         *             /       | \
         *            0        |  5 -- 6
         *             \       | /
         *              2 ---- 4
         * 
         * Output in DFS = 0, 1, 3, 4, 2, 5, 6
         */
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph, new boolean[V], 0);
    }
}
