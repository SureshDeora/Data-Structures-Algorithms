package Queue;
import java.util.*;
import java.util.LinkedList;
public class ConnectNRopes {


    public static int connectNRopeMinCost(int[] arr, int n) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(arr); // 2, 3, 4, 6
        q.add(arr[0]);   
        int minCost = 0; 
        for(int i=1; i<n; i++) { 
            int cost = q.remove() + arr[i];
             q.add(cost);
             minCost += cost;
        }
        return minCost;
    }  
    
    
    // Using Priority Queue
    public static int minCost(int[] arr, int n) {
        // first of all put the all the elements to priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++) {
            pq.add(arr[i]);
        }
        // now from priority queue we will pick two element , add them 
        // and then remove from pq and sum of will be added to pq
        // we will do this util we have left only 1 element in pq
        int totalCost = 0;
        while(pq.size() > 1) {
            int first = pq.poll();  // getting our first element from pq
            int second = pq.poll();  // getting second element from pq
            totalCost += first + second;  // calculating our total cost
            pq.add(first + second);  // adding both ropes calculated cost to pq
        }
        return totalCost;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6};
        int len = arr.length;
        // int minCost = connectNRopeMinCost(arr, 3);
        int minCost = minCost(arr, len);
        
        System.out.println(minCost);
    }
}
