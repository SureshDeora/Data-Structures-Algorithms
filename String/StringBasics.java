import java.util.*;
public class StringBasics {





public static void main(String args[]) {
    // Strings are IMMUTABLE  
    //   char arr[] = {'a','b','c','d'};
    //     String str = "abcd";
    //     String str3 = new String("suresh deora");
        
        
        
    // Input and Output

    Scanner scr = new Scanner(System.in);
    //String name = scr.next();
    // String name2 = scr.nextLine();
    //System.out.print(name);
    
    // System.out.println(name2);

// Length of a String  .length() function 

// String name = "Suresh Deora";
// System.out.print(name.length());


// Concatanation = add two string

// String name = "Suresh";
// String last =  "Deora";
// String fullName = name+" "+last;
// System.out.print(fullName);


// function .charAt()

// String name = "Suresh";
// String last =  "Deora";
// String fullName = name+" "+last;
// //System.out.print(fullName.charAt(5));
// for(int i=0; i<fullName.length(); i++) {
//     System.out.print(fullName.charAt(i) + " ");
// }


// Palindrome in String
// String str = "abcba";
// for(int i=0; i<str.length()/2; i++) {
//     if(str.charAt(i) != str.charAt(str.length()-1-i)) {
//         System.out.print("not a palindrom" +" ");
//         break;
//     } else {
//         System.out.print("String is Palindrom ");
//     }
// }



// Comparision Between Two Strings

// String str = "Suresh";
// String str2 = "Suresh";
// String str3 = new String("Suresh");
// if(str==str2)  {
//     System.out.println("String are same");
// }
// else {
//     System.out.println("Strings aren't same");
// }

// if(str==str3) {
//     System.out.println("String are same");
// } else {
//     System.out.println("Strings aren't same");
// }

// In String to check values are equal or not, .equals() function is used. It's return type is boolean.
// if(str.equals(str3)) {
//     System.out.println("Both are equal");
// } else {
//     System.out.print("not equal");
// }


/*********Sub String***********/

// Either
// .substring(si, ei) used to print substring of a String.
// si = starting indax and ei = ending indax.
// String str = "suresh";
// System.out.println(str.substring(3,6));

// Or

// int si = 3,  ei = 6;
// for(int i=si; i<ei; i++) {
//     System.out.print(str.charAt(i));
// }



// Largest string 
// .compareTo()
// if compareTo(str[i]) < 0 then string is less than str[i]
// if compareTo(str[i]) = 0 then both are same
// if compareTo(str[i]) > 0 then str[i] is less.

//Ignore Case Sansitivity ComparetoIgnorCase() here 'A' and 'a' cosidred same.

String str[] = {"apple", "mango", "banana"};
String largest = str[0];
for(int i=1; i<str.length; i++) {
    if(largest.compareTo(str[i]) < 0) {
        largest = str[i];
    }
}
System.out.print(largest);

        }
    
}
