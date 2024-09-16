import java.util.*;
public class ChocPieces {
    /* We are given a bar of chocolet composed of m*n square piece.
     * One  should break the chocolet into single square.
     * Each break of a part of the the chocolet is charged a cost expressed 
     * by a positive integer. This cost does not depend on the size of the part that is
     * being broken but only depends on the line the break goes along .
     * Let us demote the cost of breaking along consecutive vertical lines with x1, x2
     * xm-1 and along horizontal lines with y1, y2...yn-1
     * compute the minimal cost of breaking the whole chocolet into single square.
     */
    public static void main(String[] args) {
    
        Integer[] vertCost = {1, 4, 2}; // cost of vertical choping 
        Integer[] horCost = {4, 3, 2, 1, 1}; // cost of horizontal choping
        // both arrays are being sorted in descending order because highest cost should be first
        Arrays.sort(vertCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());
        int v = 0, h = 0; // pointer for both arrays, v vertical and h for horizontal
        int hp = 1, vp = 1; // every time we cut , it increases chocos, hp for horizontal part, vp fo vertical part
        int totalCost = 0; // adding our total cost
        // we will iterate on both array , the maximum cost cut will be done first
        while(v < vertCost.length && h<horCost.length) {
            if(vertCost[v]<=horCost[h]) { 
                totalCost += horCost[h]*vp; // total cost will be equals to cost of the bar and vertical parts
                hp++;
                h++;
            } else {
                totalCost += vertCost[v]*hp;
                vp++;
                v++;
            }
        }
        // when any vertical or horizontal cut left to be evaluated
        while(h<horCost.length) {
            totalCost += horCost[h]*vp;
            hp++;
            h++;
        }
        while(v<vertCost.length) {
            totalCost += vertCost[v] * hp;
            vp++;
            v++;
        }
        System.out.println(totalCost);
    }
    
}
