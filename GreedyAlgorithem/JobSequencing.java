import java.util.*;
public class JobSequencing {
    /* Given an array of jobs where every job has a deadline and profit
     * if the job is finished before the deadline, It is also given that every jobs take a single unit of time,
     * so that minimum possible deadline for any job is 1. Maximize the total profit if only can be schedules at a time.
     */

     static class Job {
        int deadline;
        int profit;
        int id;
        public Job(int i, int p, int d) {
            deadline = d;
            profit = p;
            id = i;
        }
     }
    public static void main(String[] args) {

        int[][] jobInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        // Array ko objects me convert krenge
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0; i<jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
        }
        // Objects ko descending order me sort krenge by profit.
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
        // time var to track if any job has already done
        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>(); // to store job id of max profit jobs
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(time < curr.deadline) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println(seq.size() +""+seq);
        
    }
    
}
