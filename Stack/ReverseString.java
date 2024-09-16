package Stack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(Stack<Character> s, String str) {
        
        for(int i=0; i<str.length(); i++) {
            char ch  = str.charAt(i);
            s.push(ch);
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();

    }
    public static void main(String[] args) {
          Stack<Character> s = new Stack<>();
       System.out.println(reverseString(s, "abc"));
        
        
    }
}
