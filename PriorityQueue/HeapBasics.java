package PriorityQueue;
import java.util.*;
public class HeapBasics {
    static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        public void insert(int data) {
            // 1st step = add element to the Al
            al.add(data);
            // getting it's (child) node index
            int x = al.size()-1;
            // 2nd step = getting parents node idx
            int parent = (x-1)/2;
            // 3rd step = place it(child) on its right place
            while(al.get(x) < al.get(parent)) {
                // swap their values 
                int temp = al.get(x);
                al.set(x, al.get(parent));
                al.set(parent, temp);
                x = parent;
                parent = (x-1)/2;
            }

        }
        public int remove() {
            int data = al.get(0);
            int temp = al.get(0);
            al.set(0, al.get(al.size()-1));
            al.set(al.size()-1, temp);

            al.remove(al.size()-1);

            heapify(0);
            return data;


        }
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            if(left < al.size() && al.get(minIdx) > al.get(left)) {
                minIdx = left;
            }
            if(right < al.size() && al.get(minIdx) > al.get(right)) {
                minIdx = right;
            }
            if(minIdx != i) {
                int temp = al.get(i);
                al.set(i, al.get(minIdx));
                al.set(minIdx, temp);

                heapify(minIdx);
            }
        }
    }
    
    public static void main(String[] args) {

        Heap heap = new Heap();
        heap.insert(3);
        heap.insert(5);
        heap.insert(1);
        heap.insert(7);
        heap.insert(2);
        System.out.print(heap.al);
        heap.remove();
        System.out.print(heap.al);
        }
}
