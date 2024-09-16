import java.util.ArrayList;
public class ContainerWithMostWater {
    /* Container with most water :- for given n lines on x-axis, use 2 lines 
    to form a container such that it hold maximum water 
    height = [1,8,6,2,5,4,8,3,7] */
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //System.out.println(mostWaterCont(height));
        System.out.println(mostWaterOpt(height));
    }
    // Brute Force approach O(n^2)
    public static int mostWaterCont(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // Optimal approach with Two Pointer O(n)
    public static int mostWaterOpt(ArrayList<Integer> height) {
        int maxWater = 0;
        int lP = 0; // Left Pointer 
        int rP = height.size()-1; // Right Pointer
        while(lP<rP) {
            // calculating water area
            int ht = Math.min(height.get(lP), height.get(rP));
            int width = rP-lP;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);

            // Updating pointer
            if(height.get(lP)<height.get(rP)) {
                lP++;
            } else {
                rP--;
            }
        }
        return maxWater;
    }
}
