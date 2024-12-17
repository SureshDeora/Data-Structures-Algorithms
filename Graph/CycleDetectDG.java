import java.util.ArrayList;

public class CycleDetectDG {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //Cyclic Graph
        // graph[0].add(new Edge(0, 2));
        // graph[1].add(new Edge(1, 0));
        // graph[2].add(new Edge(2, 3));
        // graph[3].add(new Edge(3, 0));
        
        //Non Cyclic Graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));

    }
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] isVisited = new boolean[graph.length]; // for all the components it's used as common tracking , no modification
        boolean[] stack = new boolean[graph.length]; // Because of components, it will be used by every component individually for tracks,
        for(int i=0; i<graph.length; i++) {
            if(!isVisited[i]) {
                if(detectCycleUtil(graph, isVisited, stack, i)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] isVisited, boolean[] stack, int curr) {
        isVisited[curr] = true;
        stack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) { //Cycle
                return true;
            } else if(!isVisited[e.dest]) {
                if(detectCycleUtil(graph, isVisited, stack, e.dest)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
    
}
