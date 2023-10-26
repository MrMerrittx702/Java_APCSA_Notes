package functional;
//Java Data Types
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.htmls 

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
Covered in this file:
	//> Literals
	//> Data Types
	//> Primitive Data Types
	//> Reference Data Types (Non-Primitives)
	//> Changing Data Type (Casting)
	//> Wrapper Classes for Primitive Types
*/
import java.util.ArrayList; import java.util.HashMap;
class DataTypes{
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
    
  //============================================================================================================================================================================//
  // Literals
    //> A literal is the source code representation of a fixed value.
    //> (an actual value, does not represent something else.)
    
  //============================================================================================================================================================================//
  // Types
    //> A type is a set of values(a domain) and a set of operations on them. 
    //> A class in java is a type
    //> objects are instances of a class type
      

    // Data Types are divided into two groups
      //> Primitive Types
      //> Reference Types (Non Primitive)
    
  //============================================================================================================================================================================//
  // Primitive data types in Java
  	//> primitive types are predefined by Java
  	//> they always have a value
  	//> named with a lower case letter
  	//> size of primitive types depend on the data
    
    //Types that store numbers are split into two groups
      //> Integer types 
      //> Floating point types

    
    // Integer Types //
    
    //byte : size 1 byte : Stores whole numbers from -128 to 127
    byte byteLow = -128;
    byte byteHigh = 127;

    //short : size 2 bytes :  Stores whole numbers from -32,768 to 32,767
    short shortLow = -32768;
    short shortHigh = 32767;

    //int : size 4 bytes : Stores whole numbers from -2,147,483,648 to 2,147,483,647
    int intLow = -2147483648;
    int intHigh = 2147483647;

    //long : size 8 bytes : Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long longLow = -9223372036854775808L;
    long longHigh= 9223372036854775807L;
    // ! remember that long values end with an "L"
    
    // Float Point Types //
    
    //float : size 4 bytes : Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    float floatValue = 3.141592f;//what special number am I?
    // ! remember the precision of a float is only 6 or 7 decimal digits
    // ! remember that float values end with an "f"

    //double : size 8 bytes : Stores fractional numbers. Sufficient for storing 15 decimal digits
    double doubleValue = 2.718281828459045d;///what special number am I?
    // ! remember the precision of double is about 15 digits
    // ! remember that double values end with a "d"

    //Scientific numbers can be indicated using an E to indicate power of 10.
    double scientificNumber = 6.022E23d;//what special number am I?
    
    
    //Other primitive types //
    
    // Booleans are variables with only two possible values.
    // boolean : size 1 bit : Stores true (1) or false (0) values
    boolean boolZero = false;
    boolean boolOne = true; 

    //character : size 2 bytes : Stores a single character/letter or ASCII values 
    char charValue = 'C';
    //ascii values can also be used in this case. (Search terms: "ASCII table")
    //ascii table values to memorize
    // 0 = 48
    // A = 65
    // a = 97
   
  //============================================================================================================================================================================//
  // Reference data types in Java (Non-primitives)
  	//> can be used to call methods to perform certain operations
  	//> default to 'null' (this will be important later!)
    //> These are Classes, Interfaces, Enums, etc. in java
    //> Objects are an instance of a class. 
    
    // Common Reference Types in Java
      //> Strings
      //> Arrays
      //> Multi Dimensional Arrays
      //> ArrayLists
      //> HashMap 
      //> Any custom class
    
    //strings : syntax String identifier = "<text>";
    String str = "This is a string.";

    //arrays : syntax type[] identifier = new type[<size>]; or type[] identifier = {0,1,2,3.....};
    int[] array = new int[5];//create a new empty array of length 5.
    int[] initArray = {0,1,2,3,4,5};
    
    //Multidimensional Arrays
    //2d arrays : syntax type[][] identifier = new type[<size>][<size>] or type[] identifier = {{0,1,2,3.....},{0,1,2,3.....}};
    int[][] array2d = new int[5][5];
    int[][] initArray2d = {{1,2,3,4,5},{6,7,8,9,0}};
    
    //ArrayLists : syntax ArrayList<type> identifier = new ArrayList<>();
      //> must import java.util.ArrayList
      //> can only store objects (no primitives) see Wrapper Classes for primitives
    ArrayList<Integer> list = new ArrayList<>();
    
    //HashMap : syntax HashMap<keyType, valueType> identifier = new HashMap<>();
      //> must import java.util.HashMap
      //> can only store objects (no primitives) see Wrapper Classes for primitives
      //> AKA dictionaries in other languages
    HashMap<String, String> map = new HashMap<>();
    
    
  //============================================================================================================================================================================//
  // Changing Data Type (Casting)
    //> casting is used to change type of data
    //> Implicit (widening) casting occurs automatically 
    //> Explicit (narrowing) casting must be done manually 
    //> Upcasting is implicit casting from a subclass to a parent class
    //> Downcasting is explicit casting from a parent class to a subclass
    
    
    //widening casting
    int anInteger = 9;
    double aDouble = anInteger; //> 9.0
    // automatically cast to a double
    
   
    // narrowing casting : syntax (newType) data
    double aDoubleToo = 1.618033988749d; //>what special number am I?
    int anIntegerToo = (int) aDoubleToo;//> outputs 1 ... but why?

    //> Truncating
      //> When narrowing casting a double value it is truncated, not rounded.
      //> for example 3.14 becomes 3 and 1.61 becomes 1 
      //> the values after the floating point are simply removed
    
    //Upcasting 
      //> All java classes are implicit subclasses of the Object class
      //> Here a DataTypes object is upcast to and Object reference
    Object parent = new DataTypes();
    
    //Downcasting 
      //> All java classes are implicit subclasses of the Object class
      //> Here the parent object we created is downcast to the subclass DataTypes
    DataTypes child = (DataTypes) parent;
    
  //============================================================================================================================================================================//
  //Wrapper Classes
    //> primitive data types have limitations
    //> sometimes we need a way to interact with primitives like objects
    //> wrapper classes allow use to reference primitive data in an object
    
    //Wrapper classes in Java
    Integer intWrapper;
    Double duoWrapper;
    Boolean boolWrapper;

    Byte byteWrapper;
    Short shortWrapper;
    Long longWrapper;
    Float floatWrapper;
    Character charWrapper;
    
    //Boxing (explicit casting to wrapper class)
    Integer box = Integer.valueOf(10);
    
    //Autoboxing (implicit casting to a wrapper class)
    Integer object = 10; 
    
    //Unboxing (explict casting to primitive data)
    int primitive = object.intValue();
    
    //Auto unboxing (implicit casting to primitive data)
    int unbox = object;


  }
}

/*
Common Errors:
  chars use single quotes '' not double quotes
  Integer Overflow Error


*/

/*
Practice:

*/