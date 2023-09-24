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
  //> What are Arrays?
  //> Declaring Arrays
  //> Array Initializers
  //> Accessing and Changing Array Elements
  //> Array Length  
  //> Multidimensional Arrays
  //> Processing Arrays > See Processing_Arrays folder.
*/
public class Arrays {
//============================================================================================================================================================================//
// What are Arrays?
  //> a data structure that allows you to store a fixed-size collection of elements of the same data type
  //> are immutable (cannot be changed)
  //> are objects
  //> are of fixed size
  //> contain elements that are accessed by indexes. 
  //> can store primitive and reference types
 
  
  public static void main(String[] args) {
  //============================================================================================================================================================================//
  //Declaring and Initializing Arrays
    //> Arrays store multiple values of a single type
    //> Arrays consist of elements
    //> each element has an index value
    //> Java arrays start at index 0
    //> Once created the size of an array is fixed.
    
    //> Array syntax
      //> elementType[] identifier = [size];
    
    //Declaring an array of n size
    int[] intArray =  new int[5]; //creates an array [0, 0, 0, 0, 0]
   
    
  //============================================================================================================================================================================//
  // Array Intializers
    //> shorthand that combines declaration, creation, and initialization of an array.
    //> allow you to provide initial values for the array elements
    
    //> syntax
      //> elementType[] identifier = {value1,value2,...};
    String[] strArray = {"a","b","c","d","e"};
    
    //> arrays can be initialized over multiply lines
    String[] alphabetUpper = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };
  
    
  //============================================================================================================================================================================//
  // Printing Arrays
    //> System.out.print() will print the memory location of the array, not its values
    //> use a for or while loop to print out the values of an array
    //> see Processing_Arrays for more
    
    boolean[] booArray = new boolean[2]; 
    
    //> printing the memory location
    System.out.println( booArray ); //> prints the memory location of booArray not the elements
    
    
    //> printing array elements with a for loop
    for(int index = 0; index < booArray.length; index++) {
      System.out.print(booArray[index] + ", " );
    }
    
    //> printing array elements with a for each loop
    for(boolean elem : booArray) {
      System.out.print(elem + ", ");
    }
    
    
  //============================================================================================================================================================================//
  // Default Array values
    //> There are default values when an array is intialized
    
    int[] intArr = new int[3]; //> [ 0, 0, 0 ]
    double[] duoArr = new double[3]; //> [ 0.0, 0.0, 0.0 ]
    boolean[] boolArr = new boolean[3]; //> [ false, false, false ]
    String[] strArr = new String[3]; //> [ null, null, null ]
    
    //Any object array
    Object[] objArr = new Object[3]; //> [ null, null, null ]
    
    
  //============================================================================================================================================================================//
  // Accessing and Changing Array Elements
    //> to access and/or change an element you need it's index
    //> indexes start at 0 and increase to the right
    
    
    //                  {     elements      }
    String[] alphabet = {"a","b","c","d","e"};
    //          index     0   1   2   3   4
    //               indexes start at zero in java
    
    //Access Syntax: array[index]
    System.out.println( alphabet[0] ); //> a
    System.out.println( alphabet[1] ); //> b
    System.out.println( alphabet[2] ); //> c
    System.out.println( alphabet[3] ); //> d
    System.out.println( alphabet[4] ); //> e
    //      focus here(^^^^^^^^^^^^^)
    
    // Changing Array Elements Syntax: array[index] = <new value>
    alphabet[0] = "v";        System.out.println( alphabet[0] ); //> v
    alphabet[1] = "w";        System.out.println( alphabet[1] ); //> w
    alphabet[2] = "x";        System.out.println( alphabet[2] ); //> x
    alphabet[3] = "y";        System.out.println( alphabet[3] ); //> y
    alphabet[4] = "z";        System.out.println( alphabet[4] ); //> z
  
  //============================================================================================================================================================================//
  // Array Length 
    //> length : stores the number of elements in the array
    //> length is not a method for arrays
    //> not to be confused with the length() method for arrays 
    //> length is always 1 more than the last index
    //> length of an array cannot be changed without making a new array
    
    
    System.out.println( alphabet.length ); //> 5
  
  //============================================================================================================================================================================//
  // Multidimensional Arrays
    //> Arrays that contain Arrays
    //> include multiple indexes 
    
    //> Declaring of n size
    int[][] array2d = new int[2][3];
    //aray 2d is an array of length 2 that stores an array of length 3 in each element
   
    //> Using an array initializer
    //   strArray2d indexes        0             1     
    String[][] strArray2d = {{"a","b","c"},{"d","e","f"}};
    //strArrayd2d[n] indexes { 0   1   2 },{ 0   1   2 } 
    
    
    //> Access Multidimensional Arrays
    
    System.out.println( strArray2d[0] ); //> prints the memory location of the array at index 0
    System.out.println( strArray2d[1] ); //> prints the memory location of the array at index 1
    
    System.out.println( strArray2d[0][0] ); //> a
    System.out.println( strArray2d[0][1] ); //> b
    System.out.println( strArray2d[0][2] ); //> c
    
  
    System.out.println( strArray2d[1][0] ); //> d
    System.out.println( strArray2d[1][1] ); //> e
    System.out.println( strArray2d[1][2] ); //> f
  }

}
 
/*
    More Array Notes:
    Unlike declarations for primitive data type variables, the declaration of an array variable does not allocate any space in memory for the array.
    It creates a storage location for the reference to an array. 
    If a variable does not contain a reference to an array, the value of the variable is "null" (meaning nothing).

    Array variables only hold a reference to the actual array, but this can usually be ignored. 
      So for simplicity we can say that the Array variable is an "array".

    Arrays are typically processed using for loops.
/*
Common Errors:
  chars use single quotes '' not double quotes
  Integer Overflow Error
  ArrayIndexOutOfBoundsException: thrown when attempting to access an index outside of the range 


*/

/*
Practice:

*/
