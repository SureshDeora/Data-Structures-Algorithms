import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDfs {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1)); 

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean[] isVisited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<graph.length; i++) {
            if(!isVisited[i]) {
                topSortUtil(graph, isVisited, s, i);
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop()+ " ");
        }
    }
    private static void topSortUtil(ArrayList<Edge>[] graph, boolean[] isVisited, Stack<Integer> s, int curr) {
        isVisited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVisited[e.dest]) {
                topSortUtil(graph, isVisited, s, e.dest);
            }
        }
        s.push(curr);
    }
    public static void main(String a[]) {
        /*
         *          5         4            5 ----> 0
         *          | \     / |            5 ----> 2
         *          |  \   /  |            4 ----> 0
         *          |    0    |            4 ----> 1
         *          |         |            2 ----> 3
         *          2         1            3 ----> 1
         *            \     /
         *             \   /
         *               3
         * Topological Order = 5, 4, 2, 3, 1, 0
         */
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
