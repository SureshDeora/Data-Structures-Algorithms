import java.util.ArrayList;

public class BeautifulAL {
    /*
     * Beautiful ArrayList (MEDIUM)
     * An Arraylist nums of size n is beautiful if:
     * nums is a permutation of the integers in the range [1, n].
     * For every 0 <= i < j < n, there is no index k with i < k < j where 2 *
     * nums.get(k) == nums.get(i) +
     * nums.get(j).
     * Given the integer n, return any beautiful arraylist nums of size n. There
     * will be at least one valid
     * answer for the given n.
     * Sample Input 1 : n = 4
     * Sample Output 1 : [2,1,4,3]
     * Sample Input 2 : n = 5
     * Sample Output 2 : [3,1,2,5,4]
     * Constraints :
     * ● 1 <= n <= 1000
     */
    public static void main(String[] args) {
        System.out.println(beautifulAl(6));
        // System.out.println(beautifulArray1(5));
        // int[] res = beautifulArray(5);
        // for(int i : res) {
        // System.out.print(i+" ");
        // }
    }

    /*
     * Approach 1 (Iterative)
     * We can see that if we separate odd and even numbers then there is no
     * possibility that even
     * numbers will violate the rule with odd numbers and vice versa. Now we have to
     * arrange even
     * and odd numbers in such a way that they do not violate rules with themselves.
     * For doing so
     * first let's say we have a beautiful arraylist of size n and we want to make
     * n+1 size of arraylist
     * so what we do is first put all odd numbers that lie within 1 to n+1 and then
     * even(WE can do
     * even then odd also) . Beautiful arraylist has the property that if we
     * multiply any number with
     * arraylist then it still remains beautiful or if we add or subtract any number
     * from arraylist then
     * it still remains beautiful. For only obtaining even number from n size
     * arraylist we do 2* num
     * and for obtaining odd size arraylist we do 2 * n-1 .
     */
    public static ArrayList<Integer> beautifulArray1(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1); // if AL is size of 1

        // Iterating for rest element to n
        
        // taking a temparory AL to store value of odd and even
        // iterating ans AL to find it's even num. Adding to temp
        // iterating ans AL to find odd nums and adding them to temp
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n)
                    temp.add(e * 2);
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n)
                    temp.add(e * 2 - 1);
            }
            // we will tranfer temp Al-->ans Al , ans values will be replaced with temp
            // values.
            ans = temp;
        }
        // At the end it'll return Beautiful AL ans.
        return ans;
    }

    /*
     * Approach 2 (Divide & Conquer)
     * Let's start from a simple 3 numbers case: (1, 2, 3) -> the only thing we need
     * to do is move 2
     * out of 1 and 3 -> (1, 3, 2).
     * Then what if the case is (1, 5, 9 ) which has increment = 4? It's the same
     * thing -> move 3 out
     * of 1 and 5 -> (1, 9, 5).
     * Now, what if the case is (1, 3, 5, 7, 9) ? With the odd + even or divide +
     * conquer idea in mind,
     * we can simply divide it to (1, 5, 9) and (3, 7). Since no change is needed
     * for the 2 numbers
     * case, after following the above steps, we can conquer them to (1, 9, 5, 3,
     * 7).
     */
    public static ArrayList<Integer> beautifulAl(int n) {
        ArrayList<Integer> res = new ArrayList<>();

        divideConque(1, 1, res, n);
        return res;
    }

    private static void divideConque(int start, int increment, ArrayList<Integer> res,
            int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }

        divideConque(start, 2 * increment, res, n);
        divideConque(start + increment, 2 * increment, res, n);

    }

    /*
     * if our AL or array has 1 or 2 elements then we know the answer
     * so this will be our Base cases
     * Then we will make call odds elements and store them to odds al.
     * Second call will be for even nums
     * now we will create an temp Array of size n so we can store both array
     * even and odd, But we will add them with following Conditions
     * for odd we will iterate whole odds array and store the elements
     * while condition for odd = odd[e]*2-1;
     * for even we will do same but with condition of = even[e]*2, and
     * store even's element to temp afterwards the odd's --> [odds.length+j]
     * 
     */

    public static int[] beautifulArray(int N) {

        if (N == 1)
            return new int[] { 1 };

        if (N == 2)
            return new int[] { 1, 2 };

        int[] odds = beautifulArray((N + 1) / 2);

        int[] even = beautifulArray(N / 2);

        int[] res = new int[N];

        for (int i = 0; i < odds.length; i++)

            res[i] = odds[i] * 2 - 1;

        for (int j = 0; j < even.length; j++)

            res[odds.length + j] = even[j] * 2;

        return res;

    }

}
