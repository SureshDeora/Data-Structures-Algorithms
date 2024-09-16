import java.util.*;

public class javaAdv{
    public static int linearSearch(int num[], int find)
    {
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] == find)
            {
                return i;
            }
        }
        return -1;
    }















// pass by reference 
/* 
    public static void arr(int arrs[])
    {
        for(int i = 0; i < arrs.length; i++)
        {
            arrs[i] = arrs[i] + 1; 
        }

    }*/
    public static void main(String args[]) 
    {
        int num[] = {13,34,32,56,53,64,21,11,77,84};
        int key = 593;
        int indax = linearSearch(num, key);
        if(indax == -1)
        {
            System.out.print("Not Found");
        }
        else 
        {
            System.out.print(indax);
        }











    // pass by reference
    /*
        int arrs[] = {98, 99, 100};
        arr(arrs);
        for(int i = 0; i < arrs.length; i++)
        {
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
 */
    }
}