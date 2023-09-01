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
Benefits of OOP
  faster and easier to execute
  provides a clear structure for programs
  prevents repetition of code DRY "Don't Repeat Yourself" 
  code is easier to maintain, modify, and debug.
  makes it possible to make full reuseable applications with less code and shorter development time. 

Everything in java is associated with classes and objects. 

Classes and Objects the two main aspects of OOP
  A class is a template for  objects
  objects are a instance of a class that inherit variables and methods from the class.

*/
import java.util.ArrayList;//importing the ArrayList class to create ArrayLists
import java.util.Arrays;// importing the Arrays class to use Arrays.asList

public class Objects{//Created the 'Objects' class
  //=============================================================================================================================================================================//
  //Declaring Class (Attributes)(Fields)(Properties)
  
  //See Modifiers for more on public, private, protected, and default

  //Declare Private Attributes
  
  private int num; // default 0
  private boolean bool; // default false
  private double duo; // default 0.0
  private String str; // default null
  private String[] strArray = new String[5]; // default null null null null null
  private ArrayList<String> strList = new ArrayList<>(); //default []

  
  //Declare and Initialize Private Attributes
  
  private int num = 0;
  private boolean bool = false;
  private double duo = 3.14158;
  private String str = "Hello World";
  private String[] strArray = {"a","b","c","d","e"};
  private ArrayList<String> strList = new ArrayList<>(Arrays.asList("v","w","x","y","z"));


  //Static Attributes (belong to the class and is shared between all objects of the class)
  private static int staticNum = 1;
  private static boolean staticBool = true;
  private static double staticDuo = 1.61803; 
  private static String staticStr = "I'm a Static String";
  private static String[] staticStrArray = {"s","t","a","t","i","c"};
  private static ArrayList<String> staticStrList = new ArrayList<>(Arrays.asList("c","i","t","a","t","s"));


  
  //The variables above are "attributes" of the class "Objects"
  //These variables can be called "attributes, fields, or properties"

  //=============================================================================================================================================================================//
  //Class Constructor
  //If not constructor is defined a default no argument constructor is used.

  public Objects(){//This is the no argument or no parameter constructor for the class
  //use the no args constructor to set default values for instantiated objects and call any default methods.
      int num = 0;
      boolean bool = false;
      double duo = 3.14158;
      String str = "Hello World";
      String[] strArray = {"a","b","c","d","e"};
      ArrayList<String> strList = new ArrayList<>(Arrays.asList("v","w","x","y","z"));
  }

  //Overloaded Constructor
  public Objects(int n, boolean b, double d, String s, String[] sA, ArrayList<String> sL){
  //This constructor overloads the previous constructor, and allows you to specify values when instantiating an object
      int num = n;
      boolean bool = b;
      double duo = d;
      String str = s;
      String[] strArray = sA;
      ArrayList<String> strList = sL;
      //The 'this' keyword is a reference to the object being created
  }

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
	
  // A constructor is a special method that is used to initialize objects.
  // A constructor is called when an object of a class is created. 
  // It can be used to set initial values for attributes

  //=============================================================================================================================================================================//
  //Non Static Class Methods (Methods that require an object)
  //non static indicates that the method may change depending on the object

  //Void Methods (no return)

  public void nonStaticVoidMethod(){ 
      //requires an object, does not return
      System.out.print(num + "\n" + bool + "\n" +  duo + "\n" + str + "\n" +  strArray + "\n" +  strList);
  }

  public void nonStaticVoidMethodWithParameters(int num, String str){
      //requires an object, does not return, accepts arguments
      this.num = num;
      this.str = str;
      System.out.println(this.num);
      System.out.println(this.str);
  }

  //Return Methods (have return type)
  public String nonStaticMethodWithReturn(){
      //requires an object, returns String type
      return(str);
  }

  public int nonStaticMethodWithReturnAndParameters(int x, int y){
      //requires and object, returns integer type, accepts arguments
      return(num + x + y);
  }

  //=============================================================================================================================================================================//
  //Static Class Methods (Methods that are shared across the class, ie do not require and object)
  // static indicates that the method does not change

  //Void Methods (no return)
  
  public static void staticVoidMethod(){
      staticNum++;
  }

  public static void staticVoidMethodWithParameters(String front, String back){
      System.out.println(front + back);

  }

  //Return Methods (have return type)
  public static ArrayList<String> staticMethodWithReturn(){
      return(staticStrList);
  }

  public static String staticMethodWithReturnAndParameters(String word){
      return(word);

  }

  //=============================================================================================================================================================================//
  //main method

  public static void main(String[] args){
      //Instantiation

      //type reference = new Constructor();

      Objects obj = new Objects();

      Objects defaultObj = new Objects();//No args constructor
      //constructor with args
      Objects valuesProvidedObj = new Objects( 5 ,true, 2.54, "Constructor", new String[]{"con","str","uct","or"},new ArrayList<>(Arrays.asList("ro","tcu","rts","noc"))); 
      
      //accessing static attributes
      staticNum;
      staticBool;
      staticDuo;
      staticStr;
      staticStrArray; //prints memory location
      staticStrList;
      //OR
      obj.staticNum;
      obj.staticBool;
      obj.staticDuo;
      obj.staticStr;
      obj.staticStrArray; //prints memory location
      obj.staticStrList;
      //OR
      Objects.staticNum;
      Objects.staticBool;
      Objects.staticDuo;
      Objects.staticStr;
      Objects.staticStrArray; //prints memory location
      Objects.staticStrList;

      
      //Accessing object attributes
      defaultObj.num;
      defaultObj.bool;
      defaultObj.duo;
      defaultObj.str;
      defaultObj.strArray; //prints memory location
      defaultObj.strList;
      
      valuesProvidedObj.num;
      valuesProvidedObj.bool;
      valuesProvidedObj.duo;
      valuesProvidedObj.str;
      valuesProvidedObj.strArray; //prints memory location
      valuesProvidedObj.strList;
      
      
      //Calling Non Static Methods
      defaultObj.nonStaticVoidMethod();
      defaultObj.nonStaticVoidMethodWithParameters(1,"default");
      defaultObj.nonStaticMethodWithReturn();
      defaultObj.nonStaticMethodWithReturnAndParameters(1,3);
      
      valuesProvidedObj.nonStaticVoidMethod();
      valuesProvidedObj.nonStaticVoidMethodWithParameters(2,"valuesProvided");
      valuesProvidedObj.nonStaticMethodWithReturn();
      valuesProvidedObj.nonStaticMethodWithReturnAndParameters(1,3);
      
      //Calling Static Methods
      //in the same class
      staticVoidMethod();
      staticVoidMethodWithParameters("Java", "Programming");
      staticMethodWithReturn();
      staticMethodWithReturnAndParameters("static and return");
      
      //in another class
      Objects.staticVoidMethod();
      Objects.staticVoidMethodWithParameters("Java", "Programming");
      Objects.staticMethodWithReturn();
      Objects.staticMethodWithReturnAndParameters("static and return");
      
  }
}