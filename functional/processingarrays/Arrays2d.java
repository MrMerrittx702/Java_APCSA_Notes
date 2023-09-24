package functional.processingarrays;

/*
Notes:
Covered in this file:
  //> What are Multidimensional Arrays?
  //> Declaring 2d Array 
  //> Array Initializer
  //> 2d Array Access and Changing Elements
  //> Array of Arrays using rows and columns
  //> Row Major vs Column Major Order
  //> Traversing 2d Arrays (For /For Each/ While)
 */

public class Arrays2d {
//============================================================================================================================================================================//
// What are Multidimensional Arrays?
  //> Arrays that contain Arrays
  //> include multiple indexes 
  
  public static void main(String[] args) {
  //============================================================================================================================================================================//
  // Declaring a 2d Array
    //> type[][] identifier = new type[<size>][<size>];
    
    //> Declaring of n size
    int[][] array2d = new int[2][3];
    //aray 2d is an array of length 2 that stores an array of length 3 in each element
   
  //============================================================================================================================================================================//
  // Using an array initializer
    //> type[][] identifier = new type[<size>][<size>];
    
    //   strArray2d indexes        0             1     
    String[][] strArray2d = {{"a","b","c"},{"d","e","f"}};
    //strArrayd2d[n] indexes { 0   1   2 },{ 0   1   2 } 
    
  //============================================================================================================================================================================//     
  //> 2d Array Access and Changing Elements
   //>access:  array[firstIndex][secondIndex]
   //>change:  array[firstIndex][secondIndex] = newElement; 
    
    //accessing elements
    System.out.println( strArray2d[0] ); //> prints the memory location of the array at index 0
    System.out.println( strArray2d[1] ); //> prints the memory location of the array at index 1
    
    
    System.out.println( strArray2d[0][0] ); //> a
    System.out.println( strArray2d[0][1] ); //> b
    System.out.println( strArray2d[0][2] ); //> c
    
  
    System.out.println( strArray2d[1][0] ); //> d
    System.out.println( strArray2d[1][1] ); //> e
    System.out.println( strArray2d[1][2] ); //> f
    
    //changing elements
    strArray2d[0][0] = "u";   System.out.println( strArray2d[0][0] ); //> u
    strArray2d[0][1] = "v";   System.out.println( strArray2d[0][1] ); //> v
    strArray2d[0][2] = "w";   System.out.println( strArray2d[0][2] ); //> w
    strArray2d[1][0] = "x";   System.out.println( strArray2d[1][0] ); //> x
    strArray2d[1][1] = "y";   System.out.println( strArray2d[1][1] ); //> y
    strArray2d[1][2] = "z";   System.out.println( strArray2d[1][2] ); //> z
  
  //============================================================================================================================================================================//     
  //Array of Arrays using rows and columns
    //> a 2d array is an array that stores arrays
    //> it is often easier to think of as rows and colums
    
    // 5 x 5 2d Array
    //This array stores elements that represent the index pair they are stored in. 
    String[][] arrayOfArrays = {
        {"[0][0]", "[0][1]", "[0][2]", "[0][3]", "[0][4]"}, //> 0
        {"[1][0]", "[1][1]", "[1][2]", "[1][3]", "[1][4]"}, //> 1
        {"[2][0]", "[2][1]", "[2][2]", "[2][3]", "[2][4]"}, //> 2 row indexes
        {"[3][0]", "[3][1]", "[3][2]", "[3][3]", "[3][4]"}, //> 3
        {"[4][0]", "[4][1]", "[4][2]", "[4][3]", "[4][4]"}, //> 4
   //         0         1         2         3         4
   //>                       column indexes
    }; 
    printArray2dFor(arrayOfArrays); printArray2dForEach(arrayOfArrays); printArray2dWhile(arrayOfArrays);
    
    //Example array
    String[][] alphabetArray = {
      {"A", "B", "C", "D", "E"},
      {"F", "G", "H", "I", "J"},
      {"K", "L", "M", "N", "O"},
      {"P", "Q", "R", "S", "T"},
      {"U", "V", "W", "X", "Y"}
    };
    printArray2dFor(alphabetArray); printArray2dForEach(alphabetArray); printArray2dWhile(alphabetArray);
  //============================================================================================================================================================================//     
  //Row Major vs Column Major Order
    //> two different storage orders used in computer memory and data structures
    //> row-major order, elements of a multi-dimensional array are stored row by row in memory.
    //> column-major order, elements of a multi-dimensional array are stored column by column in memory.
    //> Often refers to different ways of traversing the 2d Array
    //> In Java 2d Arrays are stored in row-major order
    
    //Loop through rows first with for loop
    for(int row = 0; row < array2d.length; row++) {//> rows
      
      for(int col = 0; col < array2d[row].length; col++) {//> cols
        continue;
      }
      
    }
    
    //Loop through cols first with for loop (only works for equally sized arrays)
    for(int col = 0; col < array2d[0].length; col++) {//> cols
      
      for(int row = 0; row < array2d.length; row++) {//> rows
        continue;
      }
      
    }
  }
//============================================================================================================================================================================//     
//Traversing 2d Arrays
  
  //printing forward with a For loop
  public static void printArray2dFor(String[][] array2d) {
    System.out.println("Printing 2d Array Elements in Matrix Format (For Loop)");
    
    for(int row = 0; row < array2d.length; row++) {
      
      for(int col = 0; col < array2d[row].length; col++) {
        System.out.print(array2d[row][col] + " ");
      }
      System.out.println();
    }
  }
  
  //printing forward with a For Each Loop
  public static void printArray2dForEach(String[][] array2d) {
    System.out.println("Printing 2d Array Elements in Matrix Format (For Each Loop)");
    
    for(String[] row : array2d) {
      
      for(String elem : row) {
        System.out.print(elem + " ");
      }
      
      System.out.println();
    }
  }
  
  //printing forward with a While Loop
  public static void printArray2dWhile(String[][] array2d) {
    System.out.println("Printing 2d Array Elements in Matrix Format (While Loop)");
    
    int row = 0;
    while(row < array2d.length) {
      
      int col = 0;
      while(col < array2d[row].length) {
        System.out.print(array2d[row][col] + " ");
        
        col++;
      }
      
      System.out.println();
      row++;
    }
    
  }
  
  //Traverse begin to end row major order
  public static void traverseBeginToEnd(String[][] array2d) {
    for(int row = 0; row < array2d.length; row++) {
      
      for(int col = 0; col < array2d[row].length; col++) {
        System.out.print(array2d[row][col] + " ");
      }
      System.out.println();
    }
  }
  
  //Traverse end to begin row major order
  public static void traverseEndToBegin(String[][] array2d) {
    for(int row = array2d.length-1; row >= 0; row--) {
      
      for(int col = array2d[row].length-1; col >= 0 ; col--) {
        System.out.print(array2d[row][col] + " ");
      }
      System.out.println();
    }
    
  }
  
  //Traverse zig zag
  public static void traverseZigZag(String[][] array2d) {
    for(int row = 0; row < array2d.length; row++) {
      if(row % 2 == 0) {
        
        for(int col = 0; col < array2d[row].length; col++) {
          System.out.print(array2d[row][col] + " ");
        }
      
      }
      else {
        
        for(int col = array2d[row].length-1; col >= 0 ; col--) {
          System.out.print(array2d[row][col] + " ");
        }
        
      }
      System.out.println();
    }
  }
  
 
    
    
}
