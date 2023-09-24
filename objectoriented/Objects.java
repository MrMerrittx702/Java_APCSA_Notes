//Java Object-Oriented Programming(OOP)
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
    Covered in this file:
    //> Access Modifiers
    //> Instance Variables, Attributes, Fields, and Properties
    //> Constructors
    //> 'this' keyword
    //> Static vs. Non Static Methods
    //> Object Instantiation
    //> Checking for 'Null'
    //> Accessing Instance Variables and Static Fields
    //> Accessing Methods
    //> See Objects2.java for more

Benefits of OOP
  faster and easier to execute
  provides a clear structure for programs
  prevents repetition of code DRY "Don't Repeat Yourself" 
  code is easier to maintain, modify, and debug.
  makes it possible to make full reuseable applications with less code and shorter development time. 

Everything in java is associated with classes and objects. 

Classes and Objects the two main aspects of OOP
  A class is a template for  objects
  objects are a instance of a class that inherit variables(attributes) and methods from the class.

An objects behavior refers to what the object can do(or what can be done to it) and is defined by methods

An objects default value is null
The memory associated with a variable of a reference type holds and object reference value or, if there is no object, null. This value is the memory address of the referenced object. 

*/
import java.util.ArrayList;//importing the ArrayList class to create ArrayLists
import java.util.Arrays;// importing the Arrays class to use Arrays.asList

public class Objects {//Created the 'Objects' class
    //============================================================================================================================================================================//
    //Access Modifiers (default, public, private, protected)
    //>See Modifiers for more on public, private, protected, and default
    int var1;
    public int var2;
    private int var3;
    protected int var4;

    //============================================================================================================================================================================//
    //Keyword Modifiers(final, static, etc.)
    //>See Modifiers for more on final and static
    final int var5; // should be private static final int var5 = 0;
    static int var6;

    //============================================================================================================================================================================//
    //Instance Variables, Attributes, Fields, and Properties
        //> These are typically private
        //> Instance Variables: declared outside of any method and associated with objects (non static)
        //> Attributes: any piece of data that characterizes an object or entity
        //> Fields: describes data members within a class, includes instance variable and static variables
        //> Properties: describes the characteristics or attributes of an object that can be accessed or modified through methods (getters and setters)
        
        //> These terms overlap and are often confusing to apply so you may hear them used interchangeably. 

    //Declare Instance Variables
        //> instance variables have the same name but different values for each instance of the class (object)
        //> instance variables are typically declared in the class definition, but initialized with a constructor.
    private int num; // default 0
    private boolean bool; // default false
    private double duo; // default 0.0
    private String str; // default null
    private String[] strArray = new String[5]; // default null null null null null
    private ArrayList<String> strList = new ArrayList<>(); //default []


    //Declare and Initialize Static Fields 
        //> static fields belong to the class and are shared between all objects of the class
        //> static fields can be declared and initialized under the class header.
    private static int staticNum = 1;
    private static boolean staticBool = true;
    private static double staticDuo = 1.61803; 
    private static String staticStr = "I'm a Static String";
    private static String[] staticStrArray = {"s","t","a","t","i","c"};
    private static ArrayList<String> staticStrList = new ArrayList<>(Arrays.asList("c","i","t","a","t","s"));

    public static Objects testObject = new Objects();// see Objects2.java for the use of this object. 

    
    

    //=============================================================================================================================================================================//
    //Constructors (A special method)
        //> a constructor is a special method used to instantiate object instance variables
        //> a constructor has the same name as the class
        //> constructors have no return type
        //> if a constructor is not a defined there is a default constructor for the class
        //> constructors are often overloaded 
        //> a 0 parameter/arguments constructor initializes default values
        //> a constructor is called when an object of a class is created. 
        //> What is the purpose of a constructor? Answer: constructors initialize instance variables
    
    // 0 parameters/arguments constructor
    public Objects(){//This is the no argument or no parameter constructor for the class
    //use the no args constructor to set default values for instance variables and call any default methods.
        int num = 0;
        boolean bool = false;
        double duo = 3.14158;
        String str = "Hello World";
        String[] strArray = {"a","b","c","d","e"};
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("v","w","x","y","z"));
    }

    //Overloaded Constructor (A method/constructor is overloaded when there are multiple methods/constructors with the same name, but different signatures)
    //The parameter list, lists the types of values that are passed and their variable names. (formal parameters)
    public Objects(int n, boolean b, double d, String s, String[] sA, ArrayList<String> sL){
    //This constructor overloads the previous constructor, and allows you to specify values when instantiating an object
        int num = n;
        boolean bool = b;
        double duo = d;
        String str = s;
        String[] strArray = sA;
        ArrayList<String> strList = sL;
        
    }
    
    //=============================================================================================================================================================================//
    // 'this' keyword
        //> 'this' is a reference to the object used to call the method
        //> in the context of a constructor 'this' refers to the object being created.
        //> 'this' is not necessary to use in most cases, however if you have parameters with the same name as the instance variables it is required
        //> using 'this' is a good idea to make code more clear, and easy to understand.


    //Overloaded Constructor with 'this'

    public Objects(int num, boolean bool, double duo, String str, String[] strArray, ArrayList<String> strList){
    //This constructor overloads the previous constructor, and allows you to specify values when instantiating an object
        this.num = num;
        this.bool = bool;
        this.duo = duo;
        this.str = str;
        this.strArray = strArray;
        this.strList = strList;
        //The 'this' keyword is a reference to the object being created
        //If you use the same variable names, there must be a way to distinguish between the attribute and the parameter
    }

    //Method with 'this'

    public void printInstanceVariables(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(this.num); 
        list.add(this.bool); 
        list.add(this.duo); 
        list.add(this.str);
        
        for(int i = 0;i < list.size(); i++ ){
            System.out.println(list.get(i));
        }
    }

    //============================================================================================================================================================================//
    //Static vs Non Static Methods
        //> 'static' can be defined as unchanging
        //> In this context static indicates that the method is the same for all instances of the class
        

    //Static Method
    public static void staticMethod(){
        return;
    }
    //> static methods do not require an object to call
    //> static methods are called with the class name in other classes


    //Non Static Method
    public void nonStaticMethod(){
        return;
    }
    //> non static methods require an object
    //> non static methods have access to an object's instance variables 
    
    //=============================================================================================================================================================================//
    public static void main(String[] args){
        //=============================================================================================================================================================================//
        // Object Instantiation
            //> Every class implicitly inherits from the 'Object' class
            //> type reference = new Constructor();
            //> the name of the class you are creating an instance of is the type. 
            //> default object value is null

        //Declare an reference variable name
        Object myObject; // value is null

        //Declare a reference variable name and Instantiate an object
            //> Objects is the reference variable type
            //> obj is the reference variable that points to the location in memory of the object
            //> 'new' serves as an operator that allocates memory and initializes an object of the specified class
            //> Objects() is the constructor of the object
        Objects obj = new Objects();

        //Zero parameter/argument constructor
        Objects defaultObj = new Objects();//No args constructor
        
        //Constructor with parameters/arguments
        //Values passed to a method/constructor are actual parameters (arguments), and must occur in the same order and type as the signature. 
        Objects valuesProvidedObj = new Objects( 5 ,true, 2.54, "Constructor", new String[]{"con","str","uct","or"},new ArrayList<>(Arrays.asList("ro","tcu","rts","noc"))); 
        
        //=============================================================================================================================================================================//
        // Checking for 'Null'
            //> == or != can be used to check if a reference value actually refers to an object
            //> classes often have their own equals() method to compare if two objects of the class are equivalent
            //> the equals method is inherited from the 'Object' class and can be overridden for a specific class
        
        Objects nullObj;
        nullObj == null; //> true
        
        Objects notNullObj = new Objects();

        notNullObj.equals(nullObj);


        //=============================================================================================================================================================================//
        //Accessing Instance Variables and Static Fields
            //> There are multiple ways to access Class Fields each with different times they can be used

        //> Accessing Instance Variables
        defaultObj.num;
        defaultObj.bool;
        defaultObj.duo;
        defaultObj.str;
        defaultObj.strArray; //prints memory location
        defaultObj.strList;
        //> accesses the values for defaultObj
        
        valuesProvidedObj.num;
        valuesProvidedObj.bool;
        valuesProvidedObj.duo;
        valuesProvidedObj.str;
        valuesProvidedObj.strArray; //prints memory location
        valuesProvidedObj.strList;
        //> accesses the values for valuesProvidedObj
        

        
        //> Accessing static attributes
        staticNum;
        staticBool;
        staticDuo;
        staticStr;
        staticStrArray; //prints memory location
        staticStrList;
        //> This access method only works in the class the fields were declared

        //> OR
        obj.staticNum;
        obj.staticBool;
        obj.staticDuo;
        obj.staticStr;
        obj.staticStrArray; //prints memory location
        obj.staticStrList;
        //> This access method works only were the object has been instantiated and has access to the field

        //> OR
        Objects.staticNum;
        Objects.staticBool;
        Objects.staticDuo;
        Objects.staticStr;
        Objects.staticStrArray; //prints memory location
        Objects.staticStrList;
        //> This access method works anywhere that the class can be accessed. 

        //=============================================================================================================================================================================//
        // Accessing Methods
            //> Methods are accessed in a similiar way to fields
        
        //> Calling Non Static Methods
        defaultObj.nonStaticVoidMethod();
        defaultObj.nonStaticVoidMethodWithParameters(1,"default");
        defaultObj.nonStaticMethodWithReturn();
        defaultObj.nonStaticMethodWithReturnAndParameters(1,3);
        
        valuesProvidedObj.nonStaticVoidMethod();
        valuesProvidedObj.nonStaticVoidMethodWithParameters(2,"valuesProvided");
        valuesProvidedObj.nonStaticMethodWithReturn();
        valuesProvidedObj.nonStaticMethodWithReturnAndParameters(1,3);

        
        //> Calling Static Methods

        //in the same class
        staticVoidMethod();
        staticVoidMethodWithParameters("Java", "Programming");
        staticMethodWithReturn();
        staticMethodWithReturnAndParameters("static and return");
        //> This access method only works in the class the methods were defined

        //Using an object (BAD PRACTICE)
        obj.staticVoidMethod();
        obj.staticVoidMethodWithParameters("Java", "Programming");
        obj.staticMethodWithReturn();
        obj.staticMethodWithReturnAndParameters("static and return");
        
        //in another class
        Objects.staticVoidMethod();
        Objects.staticVoidMethodWithParameters("Java", "Programming");
        Objects.staticMethodWithReturn();
        Objects.staticMethodWithReturnAndParameters("static and return");
        //> This access method works anywhere that the class can be accessed. 
        
    }
}

/*
Common Errors:
  NullPointerExceptions
  Accessing non static in a static way


*/

/*
Practice:

*/