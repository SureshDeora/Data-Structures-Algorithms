import java.util.ArrayList;

public class CycleDetectionUG {
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
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        
        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] isVisited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!isVisited[i]) {
                if(detectCycleUtil(graph, isVisited, i, -1)) { //-1 as parent of root(curr)
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] isVisited, int curr, int parent) {
        //Self
        isVisited[curr] = true;
        //neighbours
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // 2 cases
            //1: when curr neighbour is not visited and checking if neighbour has any cycle
            //2: when curr neighbour is visited and it's not his immediate parent then it does cycle
            if(!isVisited[e.dest]) {
                if(detectCycleUtil(graph, isVisited, e.dest, curr)) {
                    return true;
                }
            } else if(isVisited[e.dest] && e.dest != parent) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        /* 
         *              0 --------- 3
         *             /|           |
         *            / |           |
         *           /  |           4
         *          1   |
         *           \  |
         *            \ |
         *              2
         */
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        for(int i=0; i<graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println();
        System.out.println(detectCycle(graph));
    }
}
