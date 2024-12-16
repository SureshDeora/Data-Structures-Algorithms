import java.util.ArrayList;

/*Question: For given src & dest, tell if a path exists from src to dest
 * src = 0, dest = 5;
 * 0--1--3--4--5
 * 0--1--3--5
 * 0--2--4--3--5
 * 0--2--4--5
 * There are 4 path exists to reach src to dest , So ans = True;
 */
public class HasPath {
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
    public static void createGraph(ArrayList<Edge>[] graph) {
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
    // T.C O(V+E)
    public static boolean hasPath(ArrayList<Edge>[] graph, boolean[] isVisited, int src, int dest) {
        //Visiting self and Checking for self if path exist
        if(src == dest) {
            return true;
        }
        isVisited[src] = true;
        
        //Now checking if neighbour has/knows the path
        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!isVisited[e.dest] && hasPath(graph, isVisited, e.dest, dest)) {
                return true;
            }
        }

        //If there no path exists from src to dest
        return false;

        
    }
    public static void main(String a[]) {
        /*
         *              1 ---- 3
         *             /       | \
         *            0        |  5 -- 6
         *             \       | /
         *              2 ---- 4
         * 
         * Output 
         */
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(hasPath(graph, new boolean[graph.length], 0, 5));
    }
}
