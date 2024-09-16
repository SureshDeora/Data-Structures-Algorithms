import java.util.function.ToIntFunction;
import java.util.logging.LogRecord;
import java.util.*;

public class Problems {

    /* Printing netural number in decreasing order */
    public static void decereasing(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " "); // to print numbers in decreasing order
        decereasing(n - 1);
        // System.out.print(n+" "); //to print numbers in increasing order

    }

    /* Factorial of n numbers */
    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }
        return n * facto(n - 1);
    }

    /* Sum of N Numbers */
    public static int sumOfNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNum(n - 1);

    }

    // fibonassi series checking throgh recurrsion
    public static int fiboSeries(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        // int nm1 = fiboSeries(n-1);
        // int nm2 = fiboSeries(n-2);
        // int fib = nm1 + nm2;
        int fib = fiboSeries(n - 1) + fiboSeries(n - 2);
        return fib;
    }

    // Is an Array sorted or not, checking through recurrsion
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // Finding the index of first occurence of the key.
    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    // last occurence of the key
    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOcc(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    // Calculating X^N using recurrsion
    public static int power(int n, int x) {
        if (x == 0)
            return 1;
        return n * (power(n, x - 1));

    }

    // optimized solution for calculating X^N using recurrsion

    public static int optPower(int n, int x) {
        if (x == 0) {
            return 1;
        }

        // int halfpows = optPower(n,x/2) * optPower(n,x/2);

        int halfpow = optPower(n, x / 2);
        int halfpows = halfpow * halfpow;

        if (x % 2 != 0) {
            halfpows = n * halfpows;
        }
        return halfpows;
    }

    // Tiling Problems using recurssion;

    public static int tilingProb(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        // Vertical choice
        int fnm1 = tilingProb(n - 1);
        // Horizontal Choice 
        int fnm2 = tilingProb(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    // Gcd (greatest common diviser) using Euclids Algorithem
    public static int iGcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;

        }
        return y;

    }

    // Euclids Algorithem
    public static int Gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return Gcd(y, x % y);
    }

    //Remove duplicates in strings
    public static void remDup(String str,boolean map[], int idx, StringBuilder newStr) {


        if(idx == str.length()) {
            // Print The Whole String without any duplicates
            System.out.println(newStr);
            return;
        }
        //// Get the current charactor of the String using indax
        char curChar = str.charAt(idx);
        // here checking if our currunt character exist in string or not with auxilary bool array map 
        if(map[curChar - 'a']== true) {
        remDup(str, map, idx+1, newStr);
        }
        else {
            // here if the character occurs 1st time will be saved in bool arr map as true at the idx and added in the new string
            map[curChar - 'a'] = true; // Ex:- if current char 'a' then  a - a = 0 ,map's 0th index will be saved as true and so on for 
            remDup(str, map, idx+1, newStr.append(curChar));
        }
    }


    // Friends Pairing Problem
    public static int frindsPair(int n) {
        if(n == 1 || n == 2) return n;
        int fnm1 = frindsPair(n-1); // Choice of being Single
        int fnm2 = frindsPair(n-2);
        int totPair = (n-1) * fnm2; // choice of total being in pair 
        return fnm1 + totPair;  // Total Ways
    }


    // Print Binary String without consecutive ones......

    public static void binStr(String str, int last, int n) {
        if(n==0) {
            System.out.println(str);
            return;
        }
        binStr(str+"0", 0, n-1);
        if(last == 0) {
        binStr(str+"1", 1, n-1);
        }
    }



    /***********Practice problems **********/

    //Print all the occurance of the key
    public static void allOccr(int arr[], int key, int idx) {
        if(idx >= arr.length) return;
        if(arr[idx] == key) System.out.print(idx + " ");
        allOccr(arr,key,idx+1);
        
    }


    // Printing an Integer Value in String
    public static void printStr(int num) {
       if(num==0) return;
       String numb[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
       int mod = num%10;
       printStr(num/10);
       System.out.print(numb[mod]+ " ");

    }

    // Finding Length Of a String Using Recursion
    public static int lenOfStr(String str) {
        if(str.length() == 0) {
            
            return 0;
           
        }
        
        return lenOfStr(str.substring(1)) +1;
        
    }

    // Count all the substrings starting and ending with same letter.
    // String "abcab"
    public static int countSubstring(String str,int si,int ei,int len) {
        if(len<=0) return 0;
        if(len==1) return 1; // Because a single "a" str is a subString that start and end with same letter

        // A U B = A + B - (A intersaction B)
        int res = countSubstring(str, si, ei-1, len-1) + //counting from ending. abca  'b'
                  countSubstring(str, si+1, ei, len-1) - // counting from starting. 'a' bcab
                  countSubstring(str, si+1, ei-1, len-2); // counting from both sides. 'a' bca 'b'
                  
        if(str.charAt(si)==str.charAt(ei)) res++;     
        return res;     
    }

    //Tower of Honoi
    public static void tOh(int n, char a, char b, char c) {

        //if we want to move disk A(Source) to B(Destination) ,using C(helper)
        
        // Here Parameters Recieved as ~ Source 'a', Destination 'b', Helper 'c'
      /*  if(n==0) return;

        // 1st Case : first two disk move A to C tower
        tOh(n-1, a, c, b);

        // 2nd Case : Here the last 'C' or '3rd' disk move from 'A' to 'B' Tower
        System.out.println("shift "+ n+" disk from " + a + " to " + b );

        // 3rd Case : Two disk in C tower(1st case) move to Destination B
        tOh(n-1, c, b, a);
        
         */

        // if we want to move disk onto A(Source) to C(Destination) tower using B(Helper)

         // Here Paramrters Recieved as ~ Source 'a', Helper 'b', Destination 'c'
         if(n==0) return;

         // 1st Case : Move 2 disks onto 'A' to 'B' Tower
        tOh(n-1, a, c, b);

        // 2nd Case : Move the last Disk in 'A'or'1st' tower to destination 'C' Tower
        System.out.println("shift "+ n+" disk from " + a + " to " + c );

        // 3rd Case : Move the two disk left in Helper 'b'(1st Case) to the Destination 'C'
        tOh(n-1, b, a, c);
        
    }

    /***************Merge Sort************************/

    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = (si+ei)/2; // formula of mid
        mergeSort(arr, si, mid); // Calls for right part
        mergeSort(arr, mid+1, ei); // Calls for left part
        merge(arr, si, mid, ei); // merging two arr while sorting
    }

    // function for merging two arrs L&R while sorting 
    public static void merge(int arr[], int si, int mid, int ei) {
        int temparr[] = new int[ei-si+1]; //merging l&R in temp arr
        int i = si; //left part iterator
        int j = mid+1; // iterator for right part
        int k = 0; //iterator for store values in temparr

        // storing values in temparr while sorting from left & right part
        while(i<=mid && j<=ei) { 
            if(arr[i]<arr[j]) {
            temparr[k] = arr[i];
            i++;
            k++; 
            }
            else {
                temparr[k]=arr[j];
                j++;
                k++;
            }
        }
        // putting rest elements from L or R part to temparr
            while(i<=mid) {
                temparr[k] = arr[i];
                k++; i++;
            }
            while(j<=ei) {
                temparr[k] = arr[j];
                k++; j++;
            }
            // coping values from temparr to original arr
            for(k=0, i=si; k<temparr.length; k++, i++) {
                arr[i] = temparr[k];
            }

                
    }

    public static void printArr(int arr[]) {
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }

    
    /***************************Quick Sort*********************/

    public static void quickSort(int arr[], int si, int ei) {
        if(si>=ei) return;
        int pivIdx = getpivIdx(arr, si, ei); // getting pivot point index 
        // Pivot is on it's right place so not including, Actually here we are sorting pivot 
        quickSort(arr, si, pivIdx-1); 
        quickSort(arr, pivIdx+1, ei);

    }    

    /* i.e arr = {5, 3, 1, 6, 2, 4}  Pivot = 4 si = 0; ei = 5
     * Elements which are smaller than pivot, arranging them = {3, 5} -> {3, 1, 5} -> {3, 1, 2, 6, 5, 4}
     * Then at the end we will place our pivot on it's right place  =  {3, 1, 2, 4, 5, 6}, 
     *                                                                  {3, 1, 2} {4} {5, 6}
     *                                                                  {1, 2, 3} {4} {5, 6}
    *                                                                  {1} {2} {3} {4} {5} {6}
     */
    public static int getpivIdx(int arr[], int si, int ei) {
        int pivot = arr[ei]; // let's take ending element of arr as pivot point
        int i = si - 1; // iterator to make space in original arr
        int temp; // for swaping
        for (int j = si; j < arr.length; j++) {
            // elements which are smaller then pivot, swaping them
            if (arr[j] < pivot) {
                i++; // ith indax par smaller value
                // swaping
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Here placing pivot to it's right place so our all smaller elements come
        // before pivot and bigger afer pivot
        i++;
        temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // returning our pivot point's index

    }

    // Search in Sorted Rotated array {5,6,8,0,1,3,4}
    public static int search(int arr[],int target, int si, int ei) {
        if(si>ei) return -1;
        int mid = (si+ei)/2;
        if (arr[mid] == target) return mid;
        // Here when we are on left side , our si will always be <= mid or we can say mid >= ei
        if(arr[si]<=arr[mid]) {//here we have two cases if our kth element is either in leftSide of mid or rightSide
            if(target >= arr[si] && target <= arr[mid]) {
               return search(arr, target, si, mid);
            }
            else {
                return search(arr, target, mid+1, ei);
            }
        }
        // When our mid is on right side after the pivot point where the either si >= mid or mid <= ei
        
        else { //here also we have two cases if our kth element is either in leftSide of mid or rightSide 
            if(target<=arr[mid] && target>=arr[si]) {
               return search(arr, target, si, mid);
                
            }
            else {
                return search(arr, target, mid+1, ei);
            }
        }
        
    }
  
    /************ Problems from Practice set***************/
    // Sort an array of string using Merge Sort

    public static String[] mergeSortStr(String[] arr, int lo, int hi) {
        if(lo == hi) {
             String [] A = { arr[lo] } ;
            return A;
        }
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSortStr(arr, lo, mid);
        String[] arr2 = mergeSortStr(arr, mid+1, hi);

        String[] arr3 = mergeStr(arr1, arr2);
        return arr3;
    }

    static String[] mergeStr(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;

        int i = 0;
        int j = 0;

        while(i < m && j < n) {

            if(isAlphabeticallySmaller(arr1[i], arr2[j])) {

                arr3[idx] = arr1[i];
                i++;
                
            }
            else {

                arr3[idx] = arr2[j];
                j++;
                
            }

            idx++;

        }

        while (i < m) {

            arr3[idx++] = arr1[i++];

        }

        while (j < n) {

            arr3[idx++] = arr2[j++];

        }

        return arr3;

    }

    static boolean isAlphabeticallySmaller(String str1, String str2) {

        if (str1.compareTo(str2) < 0) {

            return true;

        }
        else {

            return false;

        }

    }

// Return the majority elements from an array

public static int majorityElement(int[] nums) {
    return majorityElementRac(nums, 0, nums.length-1);
}
private static int majorityElementRac(int[] nums, int lo, int hi) {
    //base case if size of array is 1.
    if (lo == hi) {
    return nums[lo];
    }

    //recurse on left and right halves of this slice
    
    int mid =  lo + (hi-lo)/2;  // It's same formula as we were using in MergeSort for Getting Mid (right + left) / 2;

    int left = majorityElementRac(nums, lo, mid); // calls for left half
    int right = majorityElementRac(nums, mid+1, hi); //calls for right half

    // if two halves agree on the majority element, return it

    if (left == right) {  // if both elements are same then return any of them.
        return left;
    }

    // otherwise , count each elements and return the winner.
    int leftCount = countInRange(nums, left, lo, hi);  // element left ki frequency count
    int rightCount = countInRange(nums, right, lo, hi); //right element ki frequecy count

    return leftCount > rightCount ? left : right;  // compare both's frquency and return
}

private static int countInRange(int[] nums, int num, int lo, int hi) {
    int count = 0;
    for (int i = lo; i<=hi; i++) {
        if (nums[i] == num) {
            count++;
        }
    }
    return count;
}

// ***********************Inversion count of an array *********************************************
/* i.e   arr = {2, 5, 3, 6, 4, 1} 
 * How many pair we will interchange to achieve this array in sorted manneer
 * for this arr = {2, 5} no,  {2, 3} no, {2, 6} no Basically we will interchange their position 
 * when left > right element for 2 will interchange its position with 1 = {2, 1} -> {1, 2} this is our 1st inversion 
 * We will repeat this for every and count our inversions 
 * for this Inversions are = {2, 1}, {5, 3}, {5, 4}, {5, 1}, {3, 1}, {6, 4}, {6, 1}, {4, 1};
 * 
 * 
 * We can solve this problem either by bruteforce with TC O(n^2), so will use Merge Sort techniq to solve this probelm
 * as above arr Merge sort first divide this arr into multiple part
 * i.e = Left {2, 3, 5}    Right {1, 6, 4}     ,Because whenever array are merged they will be sorted
 * inversion count when Left > Right = {2, 1} so here if two is greater then Right, then the Right element for every left 
 * will be greater because the Left is sorted is ascending order, Left[] > 1 so to get all the inversions for this 
 * the formula is Mid - i + 1; 
*/

public static int getInversion(int [] arr) {
    int n = arr.length; //length of the array
    return mergeSort1(arr, 0, n - 1);
}

private static int mergeSort1(int [] arr, int left, int right) {
    int invCount = 0;

    if (right > left) {  // base condition,
        int mid = (right + left) / 2;

        invCount += mergeSort1(arr, left, mid);  // left half part me inversion count
        invCount += mergeSort1(arr, mid+1, right); // right half part me inversion count
        invCount +=  merge1(arr, left, mid+1, right); // inversion count in left and right part while merging 
    }
    return invCount;
}

public static int merge1(int[] arr, int left, int mid, int right) {
    int i = left , j = mid, k = 0;
    int invCount = 0;
    int temp[] = new int[(right - left + 1)];

    while ((i < mid) && (j <= right)) {
        if (arr[i] <= arr[j]) {
            temp[k] = arr[i];
            k++; i++;
        }
        else { // Here we will count our inversion because this condition satisfy our inversion count when Left>Right
            temp[k] = arr[j];
            // whenever the inversion possible we will count++
            // here mid is not included so our formula will be Mid - i
            // i.e = if Left {2, 3, 5}    Right {1, 6, 4} inversion count for 
            // Pair{2, 1} Mid=3 and i=0 so 3-0 = 3 -> {2,1}, {3,1}, {5,1}
            // for {5, 4} = 3 - 2 = 1 -> {5, 4}
            invCount += (mid - i);  //here we are counting and updating inversion while sorting 
            k++; j++;
        }
    }
// Here we don't have to count any inversions because there are either 1  or more element left only in any one array
    while (i < mid) {
        temp[k++] = arr[i++];
    }

    while (j <= right) {
        temp[k++] = arr[j++];
    }

    for (i = left, k = 0; i <= right; i++, k++) {
        arr[i] = temp[k];
    }

    return invCount;
}










    public static void main(String args[]) {

        // int arr[] = {1, 20, 6, 4, 5};
        // System.out.println("Inversion Count = " + getInversion(arr));

        // int nums[] = {3, 3, 4, 2, 4, 4, 2, 4};
        // System.out.println(majorityElement(nums));

        // String [] arr = {"sun", "earth", "mars", "merdury"};
        // String [] a = mergeSortStr(arr, 0, arr.length-1);
        //  for(int i = 0; i<a.length; i++){
        //         System.out.print(a[i] + " ");
        //     }


        // int arr[] = {6,7,8,9,2,3,4,5};
        // int target = 6;
        // System.out.println(search(arr, target, 0, arr.length-1));

        //int arr[] = {2,7,4,9,1,5,8,-1};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);
      
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);
        // String str = "abc";
        // int ei =  str.length()-1;
        // int len = str.length();
        // System.out.print(countSubstring(str, 0, ei, len));

        // int n = 3;
        // tOh(3, 'A', 'B', 'C');


        //String str = "Suresh" ;
        //System.out.print(lenOfStr("seva"));
        //printStr(2002);
        //System.out.println(str.substring(1 +(2)));
        //int arr[] = {3,2,4,5,6,2,7,2,2};
       // int num = 6;
       // allOccr(arr, 2, 0);
        // decereasing(num);
        // System.out.print(facto(num));
        // System.out.print(sumOfNum(num));
        // System.out.print(fiboSeries(5));
        //int arr[] = { 1, 3, 5, 7, 9, 3, 9 };
        // System.out.print(isSorted(arr, 0));
        // System.out.print(firstOcc(arr,10,0));
        // System.out.print(power(2,5));
        // System.out.print(lastOcc(arr,0,0));
        // System.out.print(optPower(2,10));
        // System.out.print(tilingProb(4));
        // System.out.println(32 % 25);
        //System.out.println(iGcd(15, 24));
        //System.out.println(iGcd(10, 24));

        //System.out.println(Gcd(17, 29));

        //  String str = "appnaacollege";
        // remDup(str, new boolean[26], 0, new StringBuilder(""));

        //System.out.println(frindsPair(5));
        //binStr("", 0, 3);

    }

}
