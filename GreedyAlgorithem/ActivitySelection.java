import java.util.*;
public class ActivitySelection {
    /* You're given n activities with their start and end times. Select the maximum number of
     * activities that can be performed by a single person, assuming that a person can only work
     * can only work on a single activities at a time. 
     * Activities are sorted according to end time
     *      */
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};
        // int[] start = {0, 8, 1, 5, 3, 5};
        //  int[] end =  {6, 9, 2, 9, 4, 7};

        // // Activity Coutner
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // // First Activity 
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];
        // for(int i=1; i<end.length; i++) {
        //     if(start[i] >= lastEnd) {
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     } 
        // }

        // System.out.println("Max Activities " +maxAct);
        // for(int i : ans) {
        //     System.out.print("A" + i+" ");
        // }




        // what if the activities aren't sorted .
        // first put them in a single 2d sorted arr or al
        int[][] activites = new int[start.length][3]; //three coloumns because every activities contains three type of data first their idx, start and end time.
        // Now fill this arr with activities accordingly
        for(int i=0; i<start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }
        // now sorting comes in
        // sort it according to intuition or logic
        // here in case we sort activites by their end times
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));
        for (int[] is : activites) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
            
        }

        //first activity 
        int max = 1;
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(activites[0][0]);
        int lastEnd = activites[0][2];

        // now getting our rest activies 
        for(int i=1; i<activites.length; i++) {
            if(activites[i][1] >= lastEnd) {
                max++;
                answer.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }
        System.out.println("max activites = " + max);
        
        System.out.println(answer);
    }
}
