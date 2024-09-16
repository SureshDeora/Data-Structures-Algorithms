public class MinOfArr 
{
    public static int minArr(int num[])
    {
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++)
        {
            if(minimum > num[i])
            {
                minimum = num[i];
            }
        } return minimum;
    }
    public static void main(String args[])
    {
        int num [] = {12,24,64,43,63,66};
        System.out.print(minArr(num));
    }
    
}
