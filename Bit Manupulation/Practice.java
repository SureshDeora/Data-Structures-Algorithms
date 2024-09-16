import java.util.*;

public class Practice {

    /************Odd or Even*************/
    public static void  checkOddorEven(int m) {
        int n = 1;
        if((m & n)==1) {
           System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        
    }

/*********Get IthBit*********/
    public static int  getIthBit(int n, int m) {
        int BitMask = 1<<m;
        if((n & BitMask) == 0) {
            return 0;
        } else {
        return 1; }
    }
/***********Set ith Bit***********/    
    public static int setIthBit(int num, int i) {
        int BitMask = 1<<i;
        return num|BitMask;
    }

/***********Clear ith Bit***********/ 
    public static int clearIthBit(int num, int i) {
        int BitMask = ~(1<<i);
        return num & BitMask;
    }

/***********Update ith Bit***********/ 
    public static int updateBit(int num, int i, int update) {
        // if(update==0) {
        //    return clearIthBit(num, i);
        // } else {
        //     return setIthBit(num, i);
        // }
            /****Second Method****/
        num = clearIthBit(num, i);
        int BitMask = update<<i;
        return num | BitMask;
    }
/***********Clear i Bits***********/ 
    public static int clearIBits(int num, int i) {
        int BitMask = (~0)<<i;
        return num&BitMask;
    }

    /***********Clear Bits in Range***********/ 
    public static int clearBitsinRange(int num, int i, int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int BitMask = a|b;
        return num&BitMask;
    }

    /***********if a number is power of two***********/ 
    public static boolean isNumPowerofTwo(int num) {
        return (num & (num-1))==0;
    }


    /***********Sets in a Bit***********/ 
    public static void countSetsinBit(int num) {
        int count = 0;
        while(num > 0) {
            if((num&1) ==1) {
                count++;
            }
            num = num>>1;
        }
        System.out.print(count);
    }

    /***********Fast Exponantial**********/
    public static void rapidExpo(int num, int pow) {
        int ans = 1;
        while(pow>0) {
            if((pow&1) != 0) {
                ans = ans*num;
            }
            num = num*num;
            pow = pow>>1;
        }
        System.out.print(ans);
    }



    /*****************Question Practice*******************/

    //Swap two numbers without using extra variable 
    public static void swapTwoNum(int x, int y) {
        System.out.println("Value before swap " + x + " "+ y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.print("Value after swap " +x+" "+y);
    }

    // add 1 to an integer wothout using any oprator
    public static int addOne(int num) {
        return -~num;
    }
    public static void main(String args[]) {
        // checkOddorEven(5);
        // checkOddorEven(6);
        // checkOddorEven(9);
        //System.out.print(getIthBit(13, 0));
        // System.out.print(setIthBit(10, 2));
        //System.out.print(clearIthBit(10, 1));
    //    System.out.print(updateBit(10,1,0));
    // System.out.print(clearIBits(15,2));
    // System.out.print(clearBitsinRange(10,2,4));
    // System.out.print(isNumPowerofTwo(64));
    // countSetsinBit(16);
    //rapidExpo(7,4);
    // swapTwoNum(5,3);
    // System.out.print(addOne(11));
 

    //Converting Upparcase chars to lowercase using bits
    
    // for(char ch = 'A'; ch <= 'Z'; ch++) {
    //     System.out.print((char) (ch | ' '));
    // }
        

    }
    
}

