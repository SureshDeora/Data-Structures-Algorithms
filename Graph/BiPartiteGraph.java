import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BiPartiteGraph {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
    }

    // T.C O(V+E);
    public static boolean biPartiteGraph(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length];
        for(int i=0; i<color.length; i++) {
            color[i] = -1;
        }
        for(int i=0; i<graph.length; i++) {
            if(color[i] == -1) {
                if(!biPartiteGraphUtil(graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean biPartiteGraphUtil(ArrayList<Edge>[] graph, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;
        
        while(!q.isEmpty()) {
            int curr = q.remove();
            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if(color[e.dest] == color[curr]) {
                    return false;
                } else if(color[e.dest] == -1) {
                    int nextColor = color[curr] == 0 ? 1 : 0;
                    color[e.dest] = nextColor;
                    q.add(e.dest);
                }
            }
        } 
        return true;
    }
    public static void main(String a[]) {
        /* If A graph doesn't have any cycle then it is bipartite graph
         * if a graph has a cycle and even number of Nodes/vertices then it's bipartite graph
         * if a graph has a cycle and odd number of vertices/nodes then it's not a bipartite graph
         *      0 ------ 2
         *     /        /
         *    /        /
         *   1        4
         *    \      /
         *     \    /
         *       3
         * Output : False 
         */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(biPartiteGraph(graph));
    }
    
}
