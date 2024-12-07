import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class HashSetBasics {
    public static void main(String args[]) {
      HashSet<Integer> set = new HashSet<>();
      set.add(1);
      set.add(3);
      set.add(6);
      set.add(4);
      set.add(3);//can't be added, only unique value no duplicates

      // Iteration on HashSet
      //using Iterator Interface
      Iterator itr = set.iterator();
      while(itr.hasNext()) {
        System.out.println(itr.next());
      }

      //using enhanced for loop
      for (Integer s : set) {
        System.out.println(s);
      }


    //   System.out.println(set);
      System.out.println(set.contains(3));
      System.out.println(set.remove(3));
      set.clear(); // to empty the set
      System.out.println(set.size());
      System.out.println(set.isEmpty());



      // LinkedHashSet
      LinkedHashSet<String> lhs = new LinkedHashSet<>();
      lhs.add("apple");
      lhs.add("boy");
      lhs.add("cat");
      lhs.add("dog");
      lhs.add("eye");
      System.out.println(lhs); // output in same order as we put


      // TreeSet O(logn)
      TreeSet<String> ts = new TreeSet<>();
      ts.add("boy");
      ts.add("apple");
      ts.add("eye");
      ts.add("cat");
      ts.add("dog");
      System.out.println(ts); // Output in sorted ascending order
    }
    
}
