import java.util.*;
public class Practice {
    public static float shortestPath(String dir) {
        int x = 0,  y = 0;
        for(int i=0; i<dir.length(); i++) {
            int d = dir.charAt(i); // storing ascii value of the char
            // here these all comparigon done using ascii values
            // or we can do it through char too
            if(d == 'N') {
                y++;
            }
            else if(d == 'S') {
                y--;
            }
            else if(d == 'E') {
                x++;
            }
            else {
                x--;
            }
        } //formula of shortest path of two points root (x2-x1)^2+(y2-y1)^2
        // but our x1 and y1 are 0, 0 so directly appling
        return (float)Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
    }



    public static void toUpparCase(String str) {
        StringBuilder stb = new StringBuilder();
        char a = Character.toUpperCase(str.charAt(0));
        stb.append(a);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' /*&& i < str.length()-1*/) {
                stb.append(str.charAt(i)); // placing space as it is
                i++;
                // after space we make our char to upparCase
                //Character.toUpperCase(str.charAt(i));
                stb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                // stb.charAt(i) = str.charAt(i);
                stb.append(str.charAt(i));
            }
        }
        System.out.print(stb);
    }



    public static void compress(String str) {
        StringBuilder stb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            stb.append(str.charAt(i));
            if(count > 1)
            stb.append(count.toString());
        }
        System.out.print(stb);
    }


    public static void checkLowVol(String str) {
        Integer count = 0;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)== 'u') {
                count++;
            }
        } System.out.print(count);
    }



    // public static void checkAnagram() {
      
    // }
    
    public static void main(String args[]) {
        // String dir = "WNEENESENNN";
        // System.out.print(shortestPath(dir));
        String str = "hi my name is suresh DEORA";
        toUpparCase(str);
        // String str = "abcd";
        // compress(str);
        // String str = "ShradhaDidi";
        // String str2 = "ApnaCollege";
        // String str3 = "ShradhaDidi";
        // System.out.print(str.equals(str2)+ " " + str.equals(str3));

        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);
        //String str= "Hello World";
        //checkLowVol(str);


        /**********Check Two String Anagram or not***********/
/* A word or phrase formed by reordering the letters of another word or phrase, such as satin to stain. */

        // String str = "earoh";
        // String str1 = "heart";
        // To LowerCase
        // str = str.toLowerCase();
        // str1 = str1.toLowerCase();
        //checking if length arr equal or not
        // if(str.length()==str1.length()) {
            //Coverting string to character array
            // char strArr[] = str.toCharArray();
            // char str1Arr[] = str1.toCharArray();
            //Sorting array
            // Arrays.sort(strArr);
            // Arrays.sort(str1Arr);
            //boolean result = Arrays.equals(str1Arr, strArr);
        //     if(result) {
        //     System.out.print(str+" "+str1+ " are anagram of each other");
        //     } else {
        //         System.out.print(str+" "+str1 +" are not anagram of each other");
        //     }
        // } else {
        //     System.out.print(str +" " + str1+ " are not anagram of each other");
        // }
        

    }
    
}
