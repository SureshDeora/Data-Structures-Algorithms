
import java.util.ArrayList;

public class GraphsImplementation {
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
    public static void main(String args[]) {
        /*         Adjacency List
         *                           (5)
         *                      0 -------- 1
         *                                / \
         *                            (1)/   \(3)
         *                              /     \
         *                             2 ----- 3
         *                             |  (1)
         *                          (2)|
         *                             |
         *                             4
         */

         // Length of the graph = number of vertices
         int V = 5;
         @SuppressWarnings("unchecked")
         ArrayList<Edge> graph[] = new ArrayList[5];
         //Initialize array with Linkedlist on every index
         for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
         }

         // Adding data to graph
         // 0 -> Vertex
         graph[0].add(new Edge(0, 1, 5));

         // 1 -> Vertex
         graph[1].add(new Edge(1, 0, 5));
         graph[1].add(new Edge(1, 2, 1));
         graph[1].add(new Edge(1, 3, 3));
         
         // 2 -> Vertex
         graph[2].add(new Edge(2, 1, 1));
         graph[2].add(new Edge(2, 3, 1));
         graph[2].add(new Edge(2, 4, 2));

         // 3 -> Vertex
         graph[3].add(new Edge(3, 1, 3));
         graph[3].add(new Edge(3, 2, 1));

         // 4 -> Vertex 
         graph[4].add(new Edge(4, 2, 2));

         //Print 2's neighbour
         System.out.println();
         for(int i=0; i<graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
         }





    }
}
