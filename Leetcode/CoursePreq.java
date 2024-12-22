package Leetcode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    static class Edge {
        int preqCourse;
        int course;
        public Edge(int p, int c) {
            this.preqCourse = p;
            this.course = c;
        }
    }
    private static void createGraph(ArrayList<Edge>[] graph, int[][] prs) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<prs.length; i++) {
            graph[prs[i][1]].add(new Edge(prs[i][1], prs[i][0]));
        }
    }
    private static void calcInDeg(ArrayList<Edge>[] graph, int[] inDeg) {
        for(int i=0; i<graph.length; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                inDeg[e.course]++;
            }
        }
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {


        int[] ans = new int[numCourses];
        int idx = 0;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[numCourses];
        createGraph(graph, prerequisites);

        int[] inDeg = new int[graph.length];
        calcInDeg(graph, inDeg);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<inDeg.length; i++) {
            if(inDeg[i]== 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int curr = q.remove();
            ans[idx++] = curr;
            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDeg[e.course]--;
                if(inDeg[e.course] == 0) {
                    q.add(e.course);
                }
            }
        }
        if(idx == numCourses) return ans;
        int [] arr = {};
        return arr;
    }
    public static int[] findOrder2(int numCourses, int[][] prerequisites) {

        int[] ans = new int[numCourses];
        int idx = 0;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[numCourses];
        createGraph(graph, prerequisites);

        boolean[] isVisited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<graph.length; i++) {
            if(!isVisited[i]) {
                courseOrder(graph, isVisited, s, i);
            }
        }
        while(!s.isEmpty()) {
            ans[idx++] = s.pop();
        }
        return ans;
    }
    private static void courseOrder(ArrayList<Edge>[] graph, boolean[] isVisited, Stack<Integer> s, int curr) {
        isVisited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!isVisited[e.course]) {
                courseOrder(graph, isVisited, s, e.course);
            }
        }
        s.push(curr);
    }
    public static void main(String a[]) {
        int numCourses = 1;
        // int[][] prerequisitesn = {  {1, 0},
        //                             {2, 0},
        //                             {3, 1},
        //                             {3, 2}    };
        // int[][] prerequisitesn = {{1, 0}, {0, 1}}; // cycle 
        int[][] prerequisitesn = {}; // cycle 

        // System.out.print(prerequisitesn.length);
        System.out.println();
        // int[] ans = findOrder(numCourses, prerequisitesn);
        int[] ans = findOrder2(numCourses, prerequisitesn);





        // for(int i=0; i<prerequisitesn.length; i++) {
        //     System.out.println(prerequisitesn[i][1]+"  "+prerequisitesn[i][0] );
        // }
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    
}