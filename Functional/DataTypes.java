//Java Data Types
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.htmls 

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:

Data Types are divided into two groups
  Primitive data
  Non-Primitive data

  Primitive data types in Java
    > primitive types are predefined by Java
    > they always have a value
    > named with a lower case letter (use camelCase)
    > size of primitive types depend on the data

  Non-Primitive data types in Java
    > are created by a programmer and are not defined by Java (except for String)
    > can be used to call methods to perform certain operations
    > can be null (this will be important later!)
    > start with an uppercase letter (except Strings and Arrays --> use camelCase)
    > all have the same size
*/

class DataTypes{
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.


    //Primitive data types in Java------------------------------------------------------------------------------------------------------------------
  
    //Types that store numbers are split into two groups
      //Integer types and Floating point types

    //Integer types----------------------------------------------

    //byte : size 1 byte : Stores whole numbers from -128 to 127
    byte byteLow = -128;
    byte byteHigh = 127;

    //short : size 2 bytes :	Stores whole numbers from -32,768 to 32,767
    short shortLow = -32768;
    short shortHigh = 32767;

    //int : size 4 bytes : Stores whole numbers from -2,147,483,648 to 2,147,483,647
    int intLow = -2147483648;
    int intHigh = 2147483647;

    //long : size 8 bytes : Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long longLow = -9223372036854775808L;
    long longHigh= 9223372036854775807L;
    // ! remember that long values end with an "L"

    //----------------------------------------------------------
    //Floating point types--------------------------------------

    //float : size 4 bytes : Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    float floatValue = 3.141592f;//what special number am I?
    // ! remember the percision of a float is only 6 or 7 decimal digits
    // ! remember that float values end with an "f"

    //double : size 8 bytes : Stores fractional numbers. Sufficient for storing 15 decimal digits
    double doubleValue = 2.718281828459045d;///what special number am I?
    // ! remember the percision of double is about 15 digits
    // ! remember that double values end with a "d"

    //Scientific numbers can be indicated using an E to indicate power of 10.
    double scientificNumber = 6.022E23d;//what special number am I?

    //----------------------------------------------------------
    //Other types-----------------------------------------------

    //boolean : size 1 bit : Stores true (1) or false (0) values
    // Booleans are variables with only two possible values.
    boolean boolZero = false;
    boolean boolOne = true; 

    //character : size 2 bytes : Stores a single character/letter or ASCII values 
    char charValue = 'C';
    //ascii values can also be used in this case. (Search terms: "ASCII table")
    //ascii table values to memorize
    // 0 = 48
    // A = 65
    // a = 97

    //---------------------------------------------------------


    /*
    Casting
      > converts one primative type to another type is 
      > widening casting: converting  a smaller type to a larger type
      > narrowing casting: converting a larger type to a smaller type
    */

    //widening casting is automatic
    int anInteger = 9;
    double aDouble = anInteger;
    //the int was automatically cast to a double

    //narrowing casting must be done manually
    double aDoubleToo = 1.618033988749d; //what special number am I?
    int anIntergerToo = (int) aDoubleToo;// outputs 1 ... but why?

    //-------------------------------------------------------------------------------------------------------------------------------------------
    //Non-Primitive data types-------------------------------------------------------------------------------------------------------------------
    
    //strings : syntax String identifier = "<text>";
    String aString = "This is a string.";

    //arrays : syntax type[] identifier = new type[<size>]; or type[] identifier = {0,1,2,3.....};
    int[] declareSize = new int[5];//create a new empty array of length 5.

    int[] intArray = {1,2,3,4,5};//what is the length of this array?
    
    String[] stringArray = {"Index 0", "Index 1", "Index 2"};//what is the length of this array?

    //to print an array you must access the index of the value
    //arrays start at index 0 and increase from there
    System.out.println(intArray[4]); //why does this print out 5?
    System.out.println(stringArray[0]);

    //to change the value in an array access the value's index. syntax arrayIndentifier[<index>] = <new value>;
    intArray[0] = 5; 
    
    //! remember the length of an array cannot be changed without making a new array

    //to check the length of an array use .length : syntax arrayIndentifier.length
    System.out.println("The length of intArray is " + intArray.length);
    System.out.println("The length of stringArray is " + stringArray.length);

    /*
    Context that will make sense later
      > Strings and Arrays are both Objects in java
      > length is an instance variable that returns the length of an array
      > the length variable is only used for arrays 
    */

    //Multi Dimensional arrays
    //2D arrays : syntax type[] identifier = new type[<size>][<size>]; or type[] identifier = {{0,1,2,3.....},{0,1,2,3.....}};
    int[][] multiArray = {{1,2,3,4,5},{6,7,8,9,0}};
    System.out.println(multiArray[1][4]);//this selects array index 1 and the 4th index to print the number 0
    //much more on 2d arrays later.

    /* 
    Some Non-Primitive data types are not covered here because they are very complex and 
    require thier own lessons.
    > Classes, Methods, Objects, Interfaces, ... etc.
    */
  }
}

/*
Common Errors:
  chars use single quotes '' not doublee quotes


*/

/*
Practice:

*/