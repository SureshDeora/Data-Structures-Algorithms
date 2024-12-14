package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {
    static class HashMap<K, V> {
        //intialise linkedlist
        private class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node> buckets[];
        private int n; // size of nodes ll.size()
        private int N; // size of buckets buckets.length;

        @SuppressWarnings("unchecked") // to suppress warnings for Linkedlist in compile time
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            // Initialise linkedlist on every index of array buckets to make it look like HashMap
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }



        //Auxilary functions

        private int hashFunction(K key) {
            int bi = key.hashCode(); // it'll return hash value (can be - or +) for the provided key 
            return Math.abs(bi) % N; // if got value is negative then make it positive using Math's absolute function
                                    // to make sure got value should be within the range of 0 - array size-1 (buckets.length) we use modulo
        }


        private int searchInLL(K key, int bi) {
            int di = 0; // data index
            LinkedList<Node> ll = buckets[bi]; // getting linkedlist of bucket index to search the key
            for (int i = 0; i < ll.size(); i++) { //iterating whole linkedlist if our key is already exist or not
                // Node node = ll.get(i); in if check node.key == key
                if(ll.get(i).key == key) {
                    return di; // if key is already present then return the index
                }
                di++;
            }
            return -1; // if key is not present
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            // coping whole buckets to prevent from loosing
            LinkedList<Node> oldBuckets[] = buckets;
            // Initializing buckets to new size by 2*
            buckets = new LinkedList[N*2];
            // Updating size variable 
            N *= 2;
            // Intializing empty linkedlist on every index of original bucket
            for(int i=0; i<buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // coping whole data from oldBuckets --> Buckets(original) while removing
            for(int i=0; i<oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove(j);
                    put(node.key, node.value);
                }
            }
        }


        // Put function
        public void put(K key, V value) {
        // first we have to get bucket index for the key using Hash function "HashCode"
        int bi = hashFunction(key);
        // then we have to check if our key is already present or not 
        int di = searchInLL(key, bi);

        //if key is present then update the value otherwise put the whole pair as new node
        if(di != -1) {
            // buckets[bi].get(di).value = value;
            Node node = buckets[bi].get(di);
            node.value = value;
        } else {
            buckets[bi].add(new Node(key, value));
            n++;
        }

        // Rehashing
        double lambda = (double)n/N;
        if(lambda > 2.0) {
            rehash();
        }
        }


        // containsKey function
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1) {
                return true;
            }
            return false;
        }


        // Get function
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1) {
                return buckets[bi].get(di).value;
            } 
            return null;
        }


        // Remove function
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }


        // isEmpty function
        public boolean isEmpty(K key) {
            return n == 0;
        }


        // keySet function
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                // for (Node node : ll) {
                //     keys.add(node.key);
                // }
                for(int j=0; j<ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }

    }


    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Us", 50);
        hm.put("China", 80);
        hm.put("Russia", 60);
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("Us"));
        System.out.println(hm.containsKey("Us"));
        System.out.println(hm.get("Russia"));
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
