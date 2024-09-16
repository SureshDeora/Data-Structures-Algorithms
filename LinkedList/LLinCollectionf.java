package LinkedList;
import java.util.LinkedList;
import java.util.*;


public class LLinCollectionf {
    
    public static void main(String[] args) {
        // declaring a LinkedList 
        LinkedList<Integer> ll = new LinkedList<>();
        // adding element/data functions in linkedList 
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        // printing a LinkedList
        System.out.println(ll);
        // removing elements/data in a LinkedList
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
