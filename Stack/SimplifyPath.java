import java.util.Stack;
public class SimplifyPath {
    /* Simplify Path
We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
with ‘/’ ( root directory ), a dot in path represent current directory and double dot represents
parent directory.
Sample Input 1 : /apnacollege/
Sample Output 1 : /apnacollege
Sample Input 1 : /a/..
Sample Output 1 : /
 */
    public static String simplifyPath(String str) {
        Stack<String> st = new Stack<String>();
        String result = "";
        result += "/";
        int strLen = str.length();
        for(int i=0; i<strLen; i++) {
            String dir = "";
            while(i<strLen && str.charAt(i) == '/') {
                i++;
            }
            while(i<strLen && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            if(dir.equals("..") == true) {
                if(!st.empty()) {
                    st.pop();
                }
            } else if(dir.equals(".") == true)
                continue;
                
             else if(dir.length() != 0) 
                st.push(dir);
            
        }

        Stack<String> revSt = new Stack<String>();
        while(!st.empty()) {
            revSt.push(st.pop());
        }
        while(!revSt.empty()) {
            if(revSt.size() != 1) {
                result += revSt.pop()+"/";
            } else {
                result += revSt.pop();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // String str = new String("/a/./b/../../c/");
        // String str = new String("/apnacollege/");
        String str = new String("/a/..");
       String res = simplifyPath(str);
       System.out.println(res);
    }
}
