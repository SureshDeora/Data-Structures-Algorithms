package Stack;
import java.util.Stack;
public class DuplicateParentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                // int count = 0;
                if(s.peek() == '(') {
                    return true;
                }
                while( s.peek() != '(') {
                    s.pop(); 
                    // count++;
                } s.pop();
                // if(count < 1) {
                //     return true;
                // } 
                // else {
                //     s.pop();
                // }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
 public static void main(String[] args) {
    String str = "((a+b) + (a-d))";
    System.out.println(isDuplicate(str));
 }   
}
