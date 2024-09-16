import java.rmi.Remote;
import java.util.*;

import javax.print.event.PrintEvent;


public class JavaBasics {
/* 

    public static void butterfly(int line) 
    {
        for(int i =1; i<=line; i++) {
            for(int j = 1; j<=i; j++) 
            {
                System.out.print("*");
            }
            for(int j = 1; j<=2*(line-i); j++) 
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i = line; i >= 1; i--) 
        {
            
            for(int j = 1; j<=i; j++) 
                {
                    System.out.print("*");
                }
            for(int j = 1; j<=2*(line-i); j++) 
                {
                    System.out.print(" ");
                }
            for(int j = 1; j <= i; j++)
                {
                    System.out.print("*");
    
                }
            System.out.println();
        
        }
    }    
*/


/*
public static void hallowRect(int line, int col) 
{
    for(int i=1; i<=line; i++)
    {
        for(int j = 1; j<=col; j++)
        {
            if(i==1 || line==i || j==1 || col==j)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }System.out.println();
    }
}

 */

/*
 public static void invStar(int line)
 {
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= line-i; j++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
 }
  */

/*
  public static void countInvTri(int line)
  {
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= line-i+1; j++)
        {
            System.out.print(j+ " ");
        }
        System.out.println();
    }
  }
 */

/*
 public static void countTri(int line)
 
{
    int count = 1;
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print(count+ " ");
            count++;
        }
        System.out.println();
    }

}

 */
/*
public static void zerOne(int line)
{
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            if((i+j) % 2 == 0)
            {
                System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}
 */


/*
 public static void bFly(int line)
 {
    for(int i = 1; i <= line; i++)
    {
          for(int s = 1; s <= i; s++)
            {
                System.out.print("*");
            }
            for(int sp = 1; sp <= 2*(line-i); sp++)
            {
                System.out.print(" ");
            }
            for(int s = 1; s <= i; s++)
            {
                System.out.print("*");
            }
        
        System.out.println();
    }
    
    for(int i = line; i >= 1; i--)
    {
        
            for(int s = 1; s <= i; s++)
            {
                System.out.print("*");
            }
            for(int sp = 1; sp <= 2*(line-i); sp++)
            {
                System.out.print(" ");
            }
            for(int s = 1; s <= i; s++)
            {
                System.out.print("*");
            }
        
             System.out.println();
    }
}
 */

 /*
 public static void solidHallowRact(int line)
 {
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= line-i; j++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= line; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
 }
 */

 /*
 public static void countTri(int line)
 {
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= line-i; j++)
        {
            System.out.print(" ");
        }
        for(int c = 1; c <= i; c++)
        {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
 }
 */


 /*
public static void revTring(int line)
{
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= (line-i); j++)
        {
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--)
        {
            System.out.print(j);
        }
        for(int j = 2; j <= i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
 */


 //rivision palindrome triangle
 /*
public static void palindTri(int line)
{
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= line-i; j++)
        {
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--)
        {
            System.out.print(j);
        }
        for(int j = 2; j <= i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
 */


 public static void fly(int line)
 {
    for(int i = 1; i <= line; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        for(int j = 1; j <= 2*(line-i); j++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

     for(int i = line; i >= 1; i--)
    {
        for(int j = 1; j <= i; j++)
        {
         System.out.print("*");
        }
        for(int j = 1; j <= 2*(line-i); j++)
        {
         System.out.print(" ");
        }
        for(int j = 1; j <= i; j++)
        {
         System.out.print("*");
        }

         System.out.println();
    }
 }


// // function Questions 
// Avarage of three numbers

// public static float avgOfNums(float num1, float num2, float num3) {
   
//    return (num1+num2+num3)/3;

// }


/*
// isEven Number Programm

public static boolean isEven(int x) {
    if(x % 2 == 0) {
        return true;
    } else{
        return false;
    }
}
 */

/*
public static boolean palindrom(int x) {
    int palind = x;

int rev = 0;
//int pow = 0;


while(palind!=0) {
    int remain = palind % 10;
    rev = rev * 10 + remain;
    // rev = rev + (remain * (int)Math.pow(10, pow));
    // pow++;
    
    palind = palind/10;

}  



// while(rev)

if(rev == x) {
    return true;
}
else {
return false; 
}
}
*/

    /*
public static boolean isPrime(int num) {
   
    //boolean isPrime = true;
    for(int i = 2; i<=Math.sqrt(num); i++) {
        if( num % i == 0) {
            return false;
            
        }
    } return true;

}

public static void priminRange(int n) {
    for(int a = 2; a <= n; a++) {
        if(isPrime(a)) {
        System.out.print(a + " ");
    } }
    
}

 */


/*

// find factorial of a number thorugh a func

public static int Facto(int number) {
    int factorial = 1;
    for(int i = 1; i <= number; i++) {
        factorial = factorial * i;

    }
    return factorial;
}


public static int binCof(int num, int r) {
    int numFacto = Facto(num);
    int rFacto = Facto(r);
    int nmr = Facto(num-r);
    int binCoffans = (numFacto)/(rFacto*(nmr));
    return binCoffans;
}
 */






    /*public static int facto(int x) {
    int fact = 1;
    for(int a =1; a<=x; a++) {
        fact = fact * a;
       
    }
    return fact;

}
 */








    /* 
 public static void swap(int a, int b) {
    int temp = a;
     a = b;
     b = temp;
    System.out.println(a);
System.out.println(b);


 }
*/




/* 
    public static int Multi(int a, int b) {
        int sum = a*b;
        return sum;
    }
    
*/



    // public static void printJsr(){
    //     System.out.println("Jai Shree Ram");
    //     System.out.print("Jai Shree Ram");
    // }



    
    public static void main(String args[]) {
        //hallowRect(14,16);
        //invStar(11);
        //countInvTri(8);
        //countTri(7);
        //zerOne(9);
        //bFly(4);
        //solidHallowRact(6);
        //countTri(4);
        //revTring(5);
        //palindTri(9);
        //fly(9);
        
        
        
        
        
        
        
        
        
        
        
        //butterfly(5);
        
        
        
        
        
        
        
        //System.out.print(avgOfNums(12, 18, 56));
       

/* 
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        isEven(x);
       
     if(isEven(x)) {
        System.out.print("Number is Even");
     }else{
        System.out.print("Number is Odd");
     }
            */


/*

            int x = 212;

        // palindrom(x);
     if(palindrom(x)) {
        System.out.print(x + " is Palindrom");
        }else {
            System.out.print(x + " in not Palindrom");
        }
        
     */





    // priminRange(100);






    // System.out.print(isPrime(6));
    //    int num = 22;
    //    boolean isPrime = true;
    // for(int i = 2; i<=num-1; i++) {
    //     if( num % i == 0) {
    //         isPrime = false;
    //     }
    // } if(isPrime == true) {
    //     System.out.print(num + " is prime");
    // } else {
    //     System.out.print(num + " is not prime");
    // }

//         int num = 8;
//     boolean isPrime = true;
//  for (int i = 2; i<=num-1; i++)  {
//     if (num % i == 0) {
//     isPrime = false;

//  } }
// if (isPrime == true) {
//     System.out.print(num + " is prime");
// } else {
//     System.out.print(num  + " is not prime");
// }










     
     //   System.out.print(binCof(5, 2));
      
      
      
      
        /* Scanner scr = new Scanner(System.in); 
        int num = scr.nextInt();

       System.out.print(Facto(num));

 */









        // Scanner scr = new Scanner(System.in);
        // Scanner scr = new Scanner(System.in);
        // float Pan = scr.nextFloat();
        // float Pancil = scr.nextFloat();
        // float Eraser = scr.nextFloat();
        // float Total = Pan + Pancil + Eraser;
    
        // System.out.println("The Cost Of The Products =" + ((Total*.18) + Total));



        /*  Data Types */
        // byte b = -128; // range -128 to 127 // 1 byte
        // char c = 'a'; // 2 bytes 
        // short s = 32767; // range -32,768 to 32,767 // 2 bytes
        // int i = 1000; // 4 bytes
        // float f = 123.12345678f; // 6 to 7 decimal //4 bytes
        // double d = 99.9954; // 8 bytes
        // long l = 123456789l; // 8 bytes
        // boolean o = true; //1 bit
        // double all = (f * b) + (i % c) - (d * s);
        // System.out.println(l);

        // int $ = 24;
        // System.out.println($);
        // Scanner scr = new Scanner(System.in);
        // int number = scr.nextInt();

        // if (number % 2 == 0){
        //     System.out.print("Even");
        // }
        // else {
        //     System.out.print("Odd");
        // }


    //     Scanner scr = new Scanner(System.in);
    //     int age = scr.nextInt();

    //     if(age >= 18)
    // {
    //     System.out.print("Adult");

    // }
    // else if(age >= 13 && age <= 18) {
    //     System.out.print("teenager");

    // }
    // else {
    //     System.out.print("Not Adult");
    // }


//income tax Calculator
// Scanner scr = new Scanner(System.in);
// int Income = scr.nextInt();
// int Tax;

// if (Income < 500000) {
//     Tax = 0;
// }
// else if (Income >= 500000 && Income <= 1000000) {
//     Tax = (int)  (Income * 0.2);

// }
// else {
//     Tax = (int)  (Income * 0.3);
// }
// System.out.print("Your Tax Is " + Tax);

        //Largest Of Three Number
        // Scanner scr = new Scanner(System.in);
        // int a = scr.nextInt();
        // int b = scr.nextInt();
        // int c = scr.nextInt();

        // if ( (a >= b) && (a >= c) ) {
        //     System.out.print(a);

        // }
        // else if(b >= c) {
        //     System.out.print(b);

        // }
        // else {
        //     System.out.print(c);
        // }

        //ternary operator
        // Scanner scr = new Scanner(System.in);
        // int number = scr.nextInt();

        // String type = (number % 2 == 0 )? "even" : "odd" ;
        // System.out.print(number+ " is "+ type);




        // Switch Statement

        // Scanner scr = new Scanner(System.in);
        // int number = scr.nextInt();
        // switch(number) {
        //     case 1 : System.out.print("burger");
        //                 break;
        //     case 2 : System.out.print("pasta");
        //                 break;
        //     case 3 : System.out.print("pizza");
        //                 break;
        //     default : System.out.print("Don't Daydreaming");                                              


        // }

        // Switch Case 

        // Scanner scr = new Scanner(System.in);
        // System.out.print("Input a Character ");
        // char chr = scr.next().charAt(0);
        //     System.out.print("Character is " +chr);
        // switch(chr) {
        //     case 'a' : System.out.print("apple");
        //     break;
        //     case 'b' : System.out.print("boy");
        //     break;
        //     default : System.out.print("not matched");
        // }



        //Calculator Using Switch Statement.

        // Scanner scr = new Scanner(System.in);
        // System.out.print("Enter Value Of A :\n");
        // int a = scr.nextInt();
        // System.out.print("Input Value Of B :\n");
        // int b = scr.nextInt();
        // System.out.print("Enter Operator :\n");
        // char operator = scr.next().charAt(0);
        // switch (operator) {
        //     case '+' : System.out.println(a+b);
        //     break;
        //     case '-' : System.out.println(a-b);
        //     break;
        //     case '*' : System.out.println(a*b);
        //     break;
        //     case '/' : System.out.println(a/b);
        //     break;
        //     default : System.out.println("Not Valid");
        // }


                // ternary Rivivsion
        // int a = 222;
        // int b = 2322;
        // int grater = (a>b)? a : b ;
        // System.out.print(grater);

        
        
        //Type Promotion In Expression

        // Java automatically promote each char, byte and short operand to int when evaluating and Expression.
         
        // char a = 'a';
        // short b = 'b';
        // byte c = 'c'; 
        // System.out.println(b);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(a + b + c) ; 


        // if one operand is long, float or double the whole expression is promoted to long, float or double respectively.
        // char ch = 'b';    
        // long a = 8;
        // float b = 456.67f;
        // int d = ch;
        // double c = 12.332334;
        //  float e = (a+b+c+d);
        // System.out.println(e);


        // Loops
        // while loop

        //     int n = 1;
        // while (n <= 10) {

        //     System.out.println("Jai Shree Ram");
        //     n++;
        // }


        //printing 1 to n number

        // Scanner scr = new Scanner(System.in);
        // int num = scr.nextInt();
        // int i = 1;
        // while(i <= num) {
        //     System.out.print(i + "  ");
        //     i++;
        // }


        //for Loop

        // for(int i =1; i <=10; i++) {
        //     System.out.print(i + "Jai Shree Ram  \n");
        // }

        // Suare Patter PrintEvent

        // for(int lines = 1; lines<=4; lines++) {
        //         System.out.println("****");


        // }

        // Sum of first n numbers

        // Scanner scr = new Scanner(System.in);
        // int num = scr.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i<=num) {

        //     sum += i;
        //     i++;
        // }
        //     System.out.println(sum);

        // Print Reverse of a number 
        // n=10998 to 89901

        // int i = 87383;

        // while(i > 0) {
        //     int lastdigit = i%10;
        //     System.out.print(lastdigit);
        //     i=i/10;
        // }


        //continue statement

        // for(int i = 1; i<=5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.print(i);
        // }


        // int num = 264749;
        // while(num > 0) {
        //     int i = num % 10;
        //     System.out.print(i);
        //     num = num/10;
        // }



        // Display all the  numbers entered by user except multiple of 10
        

        // do {
        //     int num = scr.nextInt();
        //     if(num % 10 == 0) {
        //         continue;
        //     }
        //     System.out.print("your num is :" + num );
        //     System.out.println();

        // } while(true);

        // while(true) {
        //     int num = scr.nextInt();
        //     if(num % 10 == 0) {
        //         continue;
        //     }
        //     System.out.print("your num is :" + num );
        //     System.out.println();

        // }
        

        // Keep entering numbers till user enters a multiple of 10

        // while(true) {
        //     System.out.print("Enter Your Number : ");
        
        //     int num = scr.nextInt();

        //     if (num % 10 == 0) {
        //         break;
        //     }
        // System.out.println("Your Number Is : " + num);
        
        // }


        // do {
        //     System.out.print("Enter Your Number : ");
        
        //     int num = scr.nextInt();

        //     if (num % 10 == 0) {
        //         break;
                
        //     }
        // } while(true);

        // System.out.print("Break");

        // int counter = 0;
        // while(counter<100) {
        //     System.out.println("JaiShreeRam");
        //     counter++;
        // }

        // System.out.println("JSR Printed 100*");




    //     // printing any num to reverse order
    //     Scanner scr = new Scanner(System.in);
    //    System.out.println("Put Your Number");
    //     int num = scr.nextInt();
    //     // int num = 2838439;
    //     while(num>0) {
    //         int mod = num % 10;
    //         System.out.print(mod);
    //         num = num / 10;
            
    //     }

 // checking if a number is prime or not

//  Scanner scr = new Scanner(System.in);
//  int num = scr.nextInt();

//  if(num==2) {
//     System.out.println(num + " Is Prime Number");
    

//  }
//  else {
//     boolean isPrime = true;
//     for(int i = 2; i <= num-1; i++) {
//         if(num % i == 0) {
//             isPrime = false;
//         }
//         } if(isPrime==true) {
//             System.out.print(num + " Is Prime");

//         } else {
//             System.out.print(num + " Is Not Prime");
            
//         }
    
//  }

/* to write root of any number = Math.sqrt(number) from java.util.* */

// Scanner scr = new Scanner(System.in);
// int num = scr.nextInt();

// if(num == 2) {
//     System.out.print(num + " is Prime");
// }
// else {
//     boolean isPrime = true;
//     for(int i = 2; i <= Math.sqrt(num); i++) {
//         if(num % i == 0) {
//             isPrime = false;
//         } } if(isPrime == true) {
//             System.out.print(num + " is Prime");

//         } else {
//             System.out.print(num + " is not Prime");
//         }
    
        
    
// }

// Question

// for(int i=0; i<5; i++) {
//     System.out.println("Hello");
//     i+=2;
// }





// sum of even and odd numbers

// Scanner scr = new Scanner(System.in);

// int c = 0;
// int d = 0;
// int choice;
// do {
//     int a = scr.nextInt();
//     if(a % 2 ==0) {
//          c = a+c;
//     } else {
//          d = a+d;

//     }
//     System.out.print("Do You Wnat To Continue Press 1 for Yes and 0 for No");
//     choice = scr.nextInt();
// } while(choice == 1);
// System.out.println("Addition Of Even is " + c);
// System.out.print("Addition Of odd is " + d);



// factorial num
// Scanner scr = new Scanner(System.in);
// System.out.print("Enter any Number ");
// int num = scr.nextInt();
// int facto = 1;

// for(int i = 1; i <= num; i++) {
//     facto *= i;
// }
// System.out.print(facto);


// multiplaxtion table of n number
// Scanner scr = new Scanner(System.in);
// int n = scr.nextInt();
// int num;
// for(int i = 1; i <= 10; i++) {
//     num = n*i;
//     System.out.print(num \n);
// }


// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number:");
// int n = sc.nextInt();
// for(int i=1; i<=10; i++) {
// System.out.println(n + " * " + i + " = " + n*i);
// }

// find the error in this Program
// for(int i = 0; i <= 5; i++ ) {
//     System.out.println("i = " + i );
//     }
//     System.out.println("i after the loop = " + i );


/* Revision prime number 

Scanner scr = new Scanner(System.in);
int num = scr.nextInt();
boolean isPrime = true;
if(num == 2) {
    System.out.print(num + " is Prime");

}
else {

for(int i = 2; i <= Math.sqrt(num); i++) {
    if(num%i==0) {
        isPrime = false;
    }
} 
if(isPrime==true) {
    System.out.println(num + " is Prime");
} else{
    System.out.print(num + " is not Prime");
}
}

*/






   /*Print pattern  Nasted loops 


   // Star Pattern 

   Scanner scr = new Scanner(System.in);
   System.out.print("Enter How many Time You Want To Print * \n");
   int kitne = scr.nextInt();
for(int line = 1; line<=kitne; line++) {
    for(int star = 1; star<=line; star++) {
        System.out.print("*");
    }
    System.out.println();
}


*/

/* 
// Inverted Star pattern

Scanner scr = new Scanner(System.in);

int  num = scr.nextInt();

for(int line = 1; line<=num; line++) {
    for(int star = 1; star<=num-line+1; star++) {
        System.out.print("*");
    }
    System.out.println();
}
*/



// advance character patterns

// int count = 1;
// int num = 5;
// for(int i = 1; i<=num; i++) {
//     for(int j = 1; j <=num-i+1; j++) {
        
//         System.out.print("*");
//         // count++;
        
//     }
//     System.out.println();
//     if(i==5) {
//         for(int y =1; y<=5; y++) {
//         for(int x = 1; x<=y; x++) {
            
//             System.out.print("*");
//         } 
//         System.out.println();
//     }
//     }
// }



// Characyter Pattern

/* 
int num = 5;
char ch = 'A';
for(int line = 1; line<=num; line++) {
    for(int chars = 1; chars <= line; chars++) {
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}

*/

// functions 

// printJsr();





/* 
int a = 5;
int b = 10;

int prod = Multi(a,b);
System.out.print(prod);

*/
/* 
// int a = 5;
// int b = 10;
swap(10, 5);
// System.out.println(a);
// System.out.print(b);


*/

/* 
Scanner scr = new Scanner(System.in);
int x = scr.nextInt();
System.out.print(facto(x));

*/



/*Scanner scr = new Scanner(System.in);
int num = scr.nextInt();


 boolean isPrime = true;
 for (int i = 2; i<=num-1; i++)  {
    if (num % i == 0) {
    isPrime = false;

 } }
if (isPrime == true) {
    System.out.print(num + " is prime");
} else {
    System.out.print(num  + " is not prime");
}

 */


// Scanner scr = new Scanner(System.in);
//  int num = scr.nextInt();

//  if(num==2) {
//     System.out.println(num + " Is Prime Number");
    

//  }
//  else {
//     boolean isPrime = true;
//     for(int i = 2; i <= num-1; i++) {
//         if(num % i == 0) {
//             isPrime = false;
//         }
//         } if(isPrime==true) {
//             System.out.print(num + " Is Prime");

//         } else {
//             System.out.print(num + " Is Not Prime");
            
//         }
    
//  }


/*
// Binary to decimal

int binNum = 110;
int power = 0;
int deciNum = 0;
while(binNum > 0) {
    int remainder = binNum % 10;
    deciNum = deciNum + (remainder * (int)Math.pow(2, power));
    
    binNum = binNum/10;
    power++;


} System.out.print(deciNum);
 
*/




 // Decimal to Binary 
/* 
int deciNum = 10;
int binNum = 0;
int power = 0;
while(deciNum>0) {
    
    int remainder = deciNum%2;
    deciNum = deciNum/2;
   binNum = binNum + (remainder * (int)Math.pow(10, power));
   power++;
   

}System.out.print(binNum);
*/





// System.out.println(remainder);
// System.out.println(div);






/*



polindrom of any number 

Scanner scr = new Scanner(System.in);
int num = scr.nextInt();
int rev = num;
int polin = 0;
while(num != 0) {
    int remaid = num%10;
     polin = remaid  + (polin * 10);
num = num/10;
}

if(rev == polin) {
    System.out.print("polindrome");

}
else{
    System.out.print("not polindrom");
}
 */






// Palindrom Rivision


//  int num = 121;
//  int n = num;
//  int palindrom = 0;
//  while(num != 0) {
//     int rmd = num % 10;
//      palindrom = rmd + (palindrom * 10);
//      num = num / 10;
//  }
// if(n == palindrom) {
//     System.out.print(n + " is Palindrom");

// }else{
//     System.out.print(n + " is not Palindrom");
// }




// Decimal to Binary Rivision

// int des = 11111000;
// int bin = 0;
// int pow = 0;

// while(des > 0) {
//     int rem = des % 10;
//     bin = bin + (rem * (int)Math.pow(2, pow));
//     pow++;
//     des = des/10;
// }
// System.out.print(bin);




// int num = 390458;
// int total = 0;
// int rev;
// while(num > 0) {
//     rev = num % 10;
//     total = total + rev;
//     num = num/10;
// }
// System.out.print(total);






//   double x = 5;
//   double y = 3;
//  System.out.print(Math.sqrt(y));
//System.out.print(Math.pow(x, y));
// System.out.print(Math.log(x));u
// System.out.print(Math.avg(x + y));
// System.out.print(Math.abs(x));

    }
    
}