import java.util.*;
public class OOPS {
    public static void main(String args[]) {
        // System.out.print("Jai Shree Ram");

        
/***************Creating a class object in main function**************************************************************************************************************** */
        //to call a class using cunstructor
/*        Pen p1 = new Pen(); //constructor and created a pen object name p1.
        p1.setColor("Red"); //calling method and passing value to the class's attributes
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        //direct calling to attributes and assigning values, if it is public.
        p1.color = "Yellow";
        System.out.println(p1.color);
        p1.tip = 6;
        System.out.println(p1.tip); */

/******************************************************************************************************************* */        
/*        BankAccount myBank = new BankAccount();
        myBank.username = "Suresh";

        // We can't call password because it is private
        //myBank.password = "saini";

        //Passing value in password through function
        myBank.setPass("Deora");
        

        System.out.print("Username = "+ myBank.username); */


/***Gettera and Setters and this. Keyword*********************************************************************************************************** */        

 /*       Set_Get sG = new Set_Get();
        sG.setColor("Red");
        System.out.println(sG.getColor());
        sG.setTip(3);
        System.out.println(sG.getTip());    */

/***********Constructor***************************************************************************************************** */
        //it autometically called every  suitable construtor acocrdingly. 
        //it is called construtor overloading and an example of polymorphism.
        // Student s1 = new Student("Suresh Deora"); //Student() this function calls the constructors //Called 2nd constructor
        // s1.rollNum = 34;
        // s1.password = "djsiodr343";
        // s1.marks[0] = 3;
        // s1.marks[1] = 6;
        // s1.marks[2] = 9;  
        // Student s2 = new Student();    //Calling 1st constructor
        // Student s3 = new Student(45);  //Calling 3rd constructor
        
        // Student s4 = new Student(s1); // Copy Constructor
        // s1.marks[2] = 0;
        // for(int i=0; i<3; i++) {
          
        //     System.out.print(s4.marks[i]);
        // }

        
/**********Inheritance**********************************************************************************************************/        
    
    // Whale w1 = new Whale();
    // w1.name = "Whale";
    // w1.eat();
    // w1.breath();
    // w1.swim();

/**********Polimorphism********************************************************************************************/


/*Function Overloading */
// Poly cal = new Poly();
// cal.calc(2.3f, 3.2f);
// cal.calc(2,5);
// cal.calc(3,4,3);

//Function Overriding

// Poli pa = new Poli();
// pa.calculator(2,4);



/**********Abstraction********************************************************************************************/

//Animals any = new Animals(); // we cannot create object (intance) of abstracted class.
// Cat c = new Cat(); // it will call the parents class constructor first then it self.it is used when we need to create any similar type variable or any method for all subclasses.
// c.walk();


/**********Interfaces********************************************************************************************/
// Queen q = new Queen();
// q.moves();
// Rook r = new Rook();
// r.moves();
// King k = new King();
// k.moves();


/*******Static Keyword********/

// Static s = new Static();
// s.schoolName = "AVMB";
// Static.schoolName = "AVMB"; // we can declair it by class name too.

// Static s1 = new Static();
// s1.schoolName = "adarsh vidya mandir"; // variables value will be changed to this for if we create any new obj after it.

// Static ss = new Static();
// // //System.out.println(Static.schoolName); // we can call it by class name too.

// // checking change
// System.out.println(s1.schoolName);
// System.out.println(s.schoolName); //here we are calling s obj variable but value is not same as defined in s object, it is 
//                                     //because we change the variables value in object s1, so it changed for all.


/********Super keyword************/                                    
Nsup sp = new Nsup(); //called both class constructer 
System.out.println(sp.colour);

    }
}

/********Super keyword************/                                    
class Sup {
    String colour;
    Sup(){
        System.out.println("sup called");
    }
}
class Nsup extends Sup {
    
    Nsup() {
         
        // super(); //calling Sup class Constructer.

        super.colour = "Brown";
    System.out.println("nsup is called"); }
}


/*******Static Keyword********/
class Static {
    static String schoolName;
    String schoolname;
}

/**********Interfaces********************************************************************************************/
//total Abstraction
interface Chess {
    
    void moves (); // can't implement .
}

class Queen implements Chess {
    Queen() {
        System.out.println("Queen");
    }
    public void moves() { //function should be public
        System.out.println("up down");
    }
}

class Rook implements Chess{
    Rook() {
        System.out.println("Rook");
    }
    public void moves() {
        System.out.println("left right");
    }
}

class King implements Chess{
    King() {
        System.out.println("King");
    }
    public void moves() {
        System.out.println("diagonal");

    }
}

/**********Abstraction********************************************************************************************/
abstract class Animals {
    abstract void walk(); //Cannot define

     Animals() {
        System.out.println("Animal class constructer called");
    }
}


class Cat extends Animals{
void walk() {
    System.out.println("Cat walks on four lags");
}

 Cat() {
    System.out.println("Cat class constructer called");
}

}




/**********Polimorphism********************************************************************************************/
class Poly {
    int num; 
    String name;


    //Polimorphism Function Overloading
    //  void calc(int a, int b) {
    //     System.out.println(a+b);
    //  }
    //  void calc(float a, float b) {
    //     System.out.println(a+b);
    //  }
    //  void calc(int a , int b, int c) {
    //     System.out.println(a+b+c);
    //  }

//Function Overriding
    // void calculator(int a, int b) {
    //     System.out.println(a+b);
    // }


}

class Poli extends Poly{
    int name;
    String str;


    //Function Overriding
    // void calculator(int a , int b) {
    //     System.out.println(a+b+a);
    // }
}







/**********Inheritance**********************************************************************************************************/        
//Base or Parent Class
class Animal {
    int numofAnimals;
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }

    void breath() {
        System.out.println(name + " is breathing");
    }
}

//Derived or Child or Sub class
class Whale extends Animal {
    int num;
    String fish;

    void swim() {
        System.out.println(name +" is swimming");
    }
}



/***********Constructor************************************************************************************************** */
class Student{
    String name;
    int rollNum;
    String password;
    int marks[];


    //Creating a constructor
    //Name shoul be same as class or structures.
    //We can create multiple construtors according need.


    //Non Parameterzed Constructor
    Student() {

    }

    //We can use this construtor as same as fuction like passing parameters etc.
    //Parameterized Construtor
    Student(String name) {
      this.name = name;
      this.rollNum = 3;
      this.password = "343h3hf3";
      marks = new int[3];
      


    }

    Student(int roll) {
        marks = new int[3];
        this.rollNum = roll;
    }
 
    //Copy constructor and copy by reference(point to same address), This is called shalow copy.
    // Shalow Copy Example
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.marks = s1.marks;
    //     this.name = s1.name;
    //     this.name = s1.name;
    //     // System.out.println(name);
    // }



    //Deep Copy , point to new array and can't make changes to s1 array.(Pass By Value)
    Student(Student s1) {
        marks = new int[3];
        // this.marks = s1.marks;
        this.name = s1.name;
        this.name = s1.name;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
        
   }


}

/*******Setters and Getters *****and this. Keyword******************************************************************************* */
class Set_Get {
private String color; 
private int tip;


//getters methods to get any private value of object's attribute(property) to the main function.
// this. keyword is used to refer a property of current object.
// this. is useful when we have same name variables, properties or attributes.
// it is matter of choice ethir we use this. keyword or not.
String getColor() { 
    return this.color;
}

int getTip() {
    return this.tip;
}

//setters method to set value from main function to any private object attributes 
void setColor(String newColor) {
    this.color = newColor;
}
void setTip(int newTip) {
    this.tip = newTip;
}

}


/*************************Simple class blueprint*********************************************************************************** */
/*Classes name first latter should be uppacase */
class Pen {

    //attributes or properties
String color; 
int tip;

//function or Methods
void setColor(String newColor) {
    color = newColor;
}
void setTip(int newTip) {
    tip = newTip;
}
}

/************************Access Modifiers*********************************************************************** */
class BankAccount{
    public String username;
    private String password;

    //creating a Method (function) for password to access it in main function
    void setPass(String pwd) {
        password = pwd;
    }
}