import java.util.*;

public class stringBuilder {

    public static void main(String args[]) {

        StringBuilder sb  = new StringBuilder(""); // it is not type of string 
        for(char ch = 'a'; ch<='z'; ch++) {

            /*********.append() used to add element at the end of string*****in Hindi ek ke baad ek jodna*******/
            sb.append(ch);
            
        }
        System.out.println(sb);
        System.out.print(sb.length());
        /**********.toString();*************/

        //sb.toString() used to convrt any data type to string, but it is important to data to be an object 
        // ex  int a = 10; 
        // a.toString();    wrong
        // Integer a = 10 can be converted to string using .toString();
        //char a = 's' can't be converted to string
        // Character a = 's' can be converted to using "












    }
    
}
