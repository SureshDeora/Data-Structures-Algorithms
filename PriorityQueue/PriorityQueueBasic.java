package PriorityQueue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueBasic {
    // Sorting Data of a class object using PriorityQueue
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;

        }
        // Now here we calling a function of Comparable interface which is used to sort objs in a class 
        // while calling fuction from an parent interface or class, it's called function overriding in OOPS
        
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // to sort in Ascending Order
            // return s2.rank - this.rank; // to sort in Descending Order
        }

        }
    public static void main(String[] afr) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); // we can reverse the sorting order either in constructor calling 
                                                                                   // or directly while using compareTo function
        pq.add(new Student("A", 12));
        pq.add(new Student("B", 4));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 13));
        pq.add(new Student("E", 8));
        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " --> " + pq.peek().rank);
            pq.remove();
        }
        
        
        
        
/*
    // PriorityQueue<Integer> pq = new PriorityQueue<>();
    // to add element in PQ  O(logn)
    pq.add(4);
    pq.add(32);
    pq.add(12);
    pq.add(5);
    pq.add(2);
    // to remove element from PQ
    pq.remove(); // O(logn)
    pq.peek() // O(1);
    while(!pq.isEmpty()) {
        System.out.println(pq.peek());
        pq.remove();
    }
     */
     
    }  
}
