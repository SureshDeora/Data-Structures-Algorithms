import java.util.*;

public class MaxOfArr 
{
    public static int findMax(int num[])
    {
        int large = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++)
        {
            if(large < num[i])
            {
                large = num[i];
            }
            
        }return large;
    }
    public static void main(String arg[]) 
    {
        int num[] = {1,3,5,6,8,0,198,33,433,7,22,45,64};
        System.out.print(findMax(num));
    }
    
}
