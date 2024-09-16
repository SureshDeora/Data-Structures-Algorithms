import java.util.Stack;
public class DecodeString {

    /* Decode a string
    We have an encoded string s and the task is to decode it. The pattern in which the strings are
    encoded is as follows.
    Sample Input 1 : 2[cv]
    Sample Output 1 : cvcv
    Sample Input 2 : 3[b2[v]]L
    Sample Output 2 : bvvbvvbvv */

    public static String decodeString(String str) {
        Stack<Integer> intSt = new Stack<>();
        Stack<Character> charSt = new Stack<>();
        String temp = "", result = "";
        int len = str.length();

        // iterate whole string
        for(int i=0; i<len; i++) {
            //we are calculating/converting number from a string
            int count = 0;
            if(Character.isDigit(str.charAt(i))) {
              while(Character.isDigit(str.charAt(i))) { 
                 count = count*10 + str.charAt(i) - '0';
                 i++;
              }
              i--; // here we decreasing our i because after this block of code excuted, it'll increase through for loop
              //putting that int number to integer stack
              intSt.push(count);
            } else if(str.charAt(i) == ']') { //if we have closing bracket
                temp = "";
                count = 0;
                // saving the top of intstack in  count and removing
                if(!intSt.isEmpty()) {
                    count = intSt.peek();
                    intSt.pop();
                }
                // removing all the elements between'[' ']' getting our string to decode
                while(!charSt.isEmpty() && charSt.peek() != '[') {
                    // saving our chars before removing
                    temp = charSt.peek() + temp;
                    charSt.pop();
                }
                //removing '[' because we are decoding this string between[] 
                if(!charSt.empty() && charSt.peek() == '[') {
                    charSt.pop();
                }
                // now we are decoding str between []
                for(int j=0; j<count; j++) {
                    // we are saving our  decoded string to result;
                    result = result + temp;
                }
                // Now pushing our decoded string back to our charStack
                for(int j=0; j<result.length(); j++) {
                    charSt.push(result.charAt(j));
                }
                result = "";
            } else if(str.charAt(i) == '[') { //here we are pushing our elements to charStack
                if(Character.isDigit(str.charAt(i-1))) { //if before curr element is s digit then push the current
                    charSt.push(str.charAt(i));
                } else { // if any of encoded string has no digit before[], we assume it as 1;
                    charSt.push(str.charAt(i));
                    intSt.push(1);
                }
            }
            else // if we have already decoded string.
                charSt.push(str.charAt(i));
            
        }

        //Now we have decoded our string but it is in char Stack
            // we will save it to our result;
            while(!charSt.isEmpty()) {
                result = charSt.peek() + result;
                charSt.pop();
            }
        return result;
    }
 public static void main(String[] args) {
    String str = "2[a2[bc]]";
    System.out.println(decodeString(str));
 }   
}
