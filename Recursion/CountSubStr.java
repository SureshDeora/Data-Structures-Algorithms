public class CountSubStr {
    static int res = 0;
    public static int countSubstring(String str,int si,int ei,int len) {
        if(len<=0) return 0;
        if(len==1) {
            
            return 1; // Because a single "a" str is a subString that start and end with same letter
        }
        // A U B = A + B - (A intersaction B)
        res = countSubstring(str, si, ei-1, len-1) + //counting from ending. abca  'b'
                  countSubstring(str, si+1, ei, len-1) - // counting from starting. 'a' bcab
                  countSubstring(str, si+1, ei-1, len-2); // counting from both sides. 'a' bca 'b'
                  
        if(str.charAt(si)==str.charAt(ei)) res++;     
        return res;     
    }
    public static void main(String[] args) {
        String str = "abcab";
        countSubstring(str, 0, str.length()-1, str.length());
        System.out.println(res);

    }
    
}
