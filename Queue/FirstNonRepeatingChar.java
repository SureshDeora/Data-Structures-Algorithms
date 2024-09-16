package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeatingChar {
    /* find the first non repeating character from the string
     * input = str = a  a  b c c x b;
     * output =      a -1  b b b b x
     */
    public static void NonRepeatChar(String str) {
        // using queue to track non reaping chars
        Queue<Character> q = new LinkedList<>();
        // auxilary array to count frequency of every chars of string
        int[] freqCount = new int[26];
        // Now we will iterate whole string count frequecy of every char and add it to queue
        // the char which has more than 1 frequency, we will remove it from queue, because it's repeating char
        // at front of queue always have non repeating char, we will print
        // when our queue gets empty, there is no such char available which non repeating then we will print -1;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freqCount[ch-'a']++;
            while(!q.isEmpty() && freqCount[q.peek()-'a'] > 1) {
                q.remove();
            }
            if(q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }

        }
    }
    public static void main(String[] args) {
        String str = "ababcc";
        NonRepeatChar(str);
    }
}
