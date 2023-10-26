package functional.processingarrays;
//Java Processing Arrays
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
  //> Processing Arrays
  //> Printing Arrays
  //> Traversing beginning to end
  //> Traversing end to beginning
  //> Traversing beginning to middle
  //> Traversing middle to beginning
  //> Traversing middle to end
  //> Traversing end to middle 
  //> Every nth element
  //> Copying arrays
  //> Example Algorithms
*/
import java.util.Scanner; import java.util.Random;
class ProcessingArrays{
//============================================================================================================================================================================//
//Processing Arrays
  //> Arrays are objects
  //> The JVM Stores the objects in an area of memory called the heap, which is used for dynamic memory allocation.
  
  /* IMPORTANT 
  Java uses pass by value to pass arguments to a method. 
    For primitive types the arguments value is passed.
    
  However for arrays the value passed is a reference to an array. (called pass-by-sharing)
    Therefore:
      Arrays are passed to methods by reference. 
      This means that if you change an array in a method the array will change outside of the method.
      When a method returns an array it returns a reference to the array. 

  A variable number of arguments of the same type can be passed to a method and treated as an array. 
    syntax--> typeName... parameterName

  For processing arrays with the API see java.util.Arrays class
  Also see 
    RandomShuffling.java
    ShiftingElements.java 
    
  */
//============================================================================================================================================================================//
//Printing Arrays
  //> Arrays can be printed in many ways, however looping from the beginning to the end is the most common method. 
  //> Common methods include
    //> For Loops
    //> For Each Loops
    //> While Loops
  
  //> For loop
  public static void printArrayForLoop(String[] array){
    
    for(int spot = 0; spot < array.length; spot++){
      System.out.print(array[spot] + " ");
    }
    
  }
  
  //> For Each Loop
  public static void printArrayForEachLoop(String[] array) {
    
    for(String elem : array) {
      System.out.print(elem + " ");
    }
    
  }
  
  //> While Loop
  public static void printArrayWhileLoop(String[] array) {
    int index = 0;
    
    while(index < array.length) {
      System.out.print(array[index] + " ");
      index ++;
    }
    
  }
  
  
//============================================================================================================================================================================//
//Traversing from beginning to end of the array
  //> start at index 0
  //> stop at array.length - 1
  //> step by +1 or more
  
  //For Loop
  public static void beginToEndForLoop(String[] array) {
    
    for(int spot = 0; spot < array.length; spot++){
      System.out.print(array[spot] + " ");
    }
    
    
  }
  
  //> For Each Loop
  public static void beginToEndForEachLoop(String[] array) {
    
    for(String elem : array) {
      System.out.print(elem + " ");
    }
    
  }
  
  //> While Loop
  public static void beginToEndWhileLoop(String[] array) {
    int index = 0;
    
    while(index < array.length) {
      System.out.print(array[index] + " ");
      index ++;
    }
    
  }

//============================================================================================================================================================================//
//Traversing from end to beginning of the array
  //> start at array.length - 1
  //> stop at index 0
  //> step by -1 or more
  //> For Each Loops cannot loop in this way
  
  //For Loop
  public static void endToBeginForLoop(String[] array) {
    
    for(int spot = array.length-1; spot >= 0; spot--){
      System.out.print(array[spot] + " ");
    }
    
    
  }
  
  //> While Loop
  public static void endToBeginWhileLoop(String[] array) {
    int index = array.length-1;
    
    while(index >= 0) {
      System.out.print(array[index] + " ");
      index --;
    }
    
  }
  
//============================================================================================================================================================================//
//Traversing from beginning to middle of the array
  //> start at index 0
  //> stop at array.length/2 -1
  //> step by +1 or more
  //> For Each Loops cannot loop in this way
  //> Keep in mind how the math works when doing integer division to ensure your loop does exactly what you intend
  
  //> Determining the middle index 
    //> For arrays of even length:   array.length/2
    //> For arrays of odd length:  array.length/2
    //>Examples
      //> length = 8, then length/2 is index 4, 0-4 is 5 elements
      //> length = 9, then length/2 is index 4, 0-4 is 5 elements
  
  
  //For Loop
  public static void beginToMidForLoop(String[] array) {
    
    for(int spot = 0; spot < array.length/2; spot++){
      System.out.print(array[spot] + " ");
    }
    //>if length is 8 this loops from 0 to 3 which is the first half (4 elements) of the array
    //>if length is 9 this loops from 0 to 3 which is the first 4 elements of the array, the second half is 5 elements. 
      //> use <= to have the first half include the additional element
    
  }
  

  //> While Loop
  public static void beginToMidWhileLoop(String[] array) {
    
    int index = 0;
    
    while(index < array.length/2) {
      System.out.print(array[index] + " ");
      index ++;
    }
    //>if length is 8 this loops from 0 to 3 which is the first half (4 elements) of the array
    //>if length is 9 this loops from 0 to 3 which is the first 4 elements of the array, the second half is 5 elements.
      //> use <= to have the first half include the additional element
  }
  
//============================================================================================================================================================================//
//Traversing from middle to beginning of the array
  //> start at array.length/2-1 usually
  //> stop at index 0
  //> step by -1 or more
  //> For Each Loops cannot loop in this way
  
  //> Determining the middle index 
    //> For arrays of even length:  array.length/2
    //> For arrays of odd length: array.length/2
    //>Examples
      //> length = 8, then length/2 is index 4, 3-0 is 4 elements
      //> length = 9, then length/2 is index 4, 3-0 is 4 elements
  
  //For Loop
  public static void midToBeginForLoop(String[] array) {
    
    for(int spot = array.length/2-1; spot >= 0; spot--){
      System.out.print(array[spot] + " ");
    }
    //>if length is 8 this loops from 3 to 0 which is the first half (4 elements) of the array
    //>if length is 9 this loops from 3 to 0 which is the first 4 elements of the array, the second half is 5 elements.
      //> use array.length/2 to have the first half include the additional element
    
    
  }
  
  //> While Loop
  public static void midToBeginWhileLoop(String[] array) {
    int index = array.length/2-1;
    
    while(index >= 0) {
      System.out.print(array[index] + " ");
      index --;
    }
    //>if length is 8 this loops from 3 to 0 which is the first half (4 elements) of the array
    //>if length is 9 this loops from 3 to 0 which is the first 4 elements of the array, the second half is 5 elements.
      //> use array.length/2 to have the first half include the additional element
    
  }
  
  
//============================================================================================================================================================================//
//Traversing from middle to end of the array
  //> start at index array.length/2 usually
  //> stop at array.length - 1
  //> step by +1 or more
  //> For Each Loops cannot loop in this way
  //> Keep in mind how the math works when doing integer division to ensure your loop does exactly what you intend
  
  //> Determining the middle index 
    //> For arrays of even length: array.length/2
    //> For arrays of odd length: array.length/2
    //>Examples
      //> length = 8, then length/2 is index 4, 4-7 is 4 elements
      //> length = 9, then length/2 is index 4, 4-8 is 5 elements
  
  //For Loop
  public static void midToEndForLoop(String[] array) {
    
    for(int spot = array.length/2; spot < array.length; spot++){
      System.out.print(array[spot] + " ");
    }
    //>if length is 8 this loops from 4 to 7 which is the second half (4 elements) of the array
    //>if length is 9 this loops from 4 to 8 which is the next 5 elements of the array, the first half is 4 elements. 
      //> use array.length/2+1 to have the second half not include the additional element
    
    
  }
  
   
  //> While Loop
  public static void midToEndWhileLoop(String[] array) {
    int index = array.length/2;
    
    while(index < array.length) {
      System.out.print(array[index] + " ");
      index ++;
    }
    //>if length is 8 this loops from 4 to 7 which is the second half (4 elements) of the array
    //>if length is 9 this loops from 4 to 8 which is the next 5 elements of the array, the first half is 4 elements. 
      //> use array.length/2+1 to have the second half not include the additional element
    
  }
  
  
//============================================================================================================================================================================//
//Traversing from end to middle of the array
  //> start at array.length - 1
  //> stop at array.length/2
  //> step by -1 or more
  //> For Each Loops cannot loop in this way
  //> Keep in mind how the math works when doing integer division to ensure your loop does exactly what you intend
  
  //> Determining the middle index 
    //> For arrays of even length:   array.length/2
    //> For arrays of odd length:  array.length/2
    //>Examples
      //> length = 8, then length/2 is index 4, 7-4 is 4 elements
      //> length = 9, then length/2 is index 4, 8-4 is 5 elements
  
  //For Loop
  public static void endToMidForLoop(String[] array) {
    
    for(int spot = array.length-1; spot >= array.length/2; spot--){
      System.out.print(array[spot] + " ");
    }
    //>if length is 8 this loops from 7 to 4 which is the second half (4 elements) of the array
    //>if length is 9 this loops from 8 to 4 which is the next 5 elements of the array, the first half is 4 elements. 
      //> use array.length/2+1 to have the second half not include the additional element
    
    
  }
  
  //> While Loop
  public static void endToMidWhileLoop(String[] array) {
    int index = array.length-1;
    
    while(index >= array.length/2) {
      System.out.print(array[index] + " ");
      index --;
    }
    //>if length is 8 this loops from 7 to 4 which is the second half (4 elements) of the array
    //>if length is 9 this loops from 8 to 4 which is the next 5 elements of the array, the first half is 4 elements. 
      //> use array.length/2+1 to have the second half not include the additional element
    
  }
  
//============================================================================================================================================================================//
//Every nth elemen
  //> choose a start index
  //> choose a stop index
  //> step by +1 or more
  //> For Each Loops cannot loop in this way

  //Using %
  //For Loop
  public static void everyNthForLoop(String[] array, int nth) {
    
    for(int spot = 0; spot < array.length; spot++){
     if(spot % nth == 0) {
      System.out.print(array[spot] + " ");
     }
    }
    // % nth determines if the current index is divisible by nth. If it is we print the value
    
    
  }
  
  //> While Loop
  public static void everyNthWhileLoop(String[] array, int nth) {
    int index = 0;
    
    while(index < array.length) {
      if(index % nth == 0) {
        System.out.print(array[index] + " ");
      }
      index ++;
    }
    // % nth determines if the current index is divisible by nth. If it is we print the value
    
    
  }
  
  //Using the increment value
  public static void everyNthIncrementForLoop(String[] array, int n) {
    
    for(int spot = 0; spot < array.length; spot += n){
       System.out.print(array[spot] + " ");
    }
    //spot += n increases spot by the value n for each iteration
    
    
  }
  
  //> While Loop
  public static void everyNthIncrementWhileLoop(String[] array, int n) {
    int index = 0;
    
    while(index < array.length) {
      System.out.print(array[index] + " ");
      index += n;
    }
    // index += n increase the index by the value n for each iteration
    
    
  }
  
//============================================================================================================================================================================//
//Copying Arrays
  //> copy the old array values to a new array location with a while/for loop
  //> Use the static arraycopy method in the System class
  //> Use the clone method to copy arrays
  
 //> For Loop
  public static String[] copyArrayForLoop (String[] array){
    String [] newArray = new String[array.length];

    for (int i = 0; i < array.length; i++){
      newArray[i] = array[i];
    }

    return newArray;
  }
  
  
  //> While Loop
  public static String[] copyArrayWhileLoop (String[] array){
    String [] newArray = new String[array.length];

    int i = 0;
    
    while(i < array.length) {
      newArray[i] = array[i];
      i++;
    }
    
    return newArray;
  }
  
  //Other Methods
  public static void additionalCopyArrayMethods(String[] array) {
    String [] newArray = new String[array.length];
    
    //System.arraycopy()
    System.arraycopy(array, 0, newArray, 0, array.length);
                  //(sourceArray, startPosistion, newArray, startPosistion, numberOfElements)
    
    
    //clone()
    String[] cloneArray = array.clone();
    
    
  }
  
//============================================================================================================================================================================//
//Example Algorithms
  
  //> Initializing arrays with integer input values
  public static int[] intArrayInput(){
    System.out.println("Please enter an array length: ");
    Scanner len = new Scanner(System.in);
    int[] array = new int[len.nextInt()];
    
    Scanner element = new Scanner(System.in);
    for ( int spot = 0; spot < array.length; spot++){
      System.out.println("Please enter another value: ");
      array[spot] = element.nextInt();
    }

    return array;
  }
  
  
  //> Initializing arrays with integer input values
  public static String[] stringArrayInput(){
    System.out.println("Please enter an array length: ");
    Scanner len = new Scanner(System.in);
    String[] array = new String[len.nextInt()];
    
    Scanner element = new Scanner(System.in);
    for ( int spot = 0; spot < array.length; spot++){
      System.out.println("Please enter another value: ");
      array[spot] = element.nextLine();
    }

    return array;
  }
  

  //> Initializing arrays with random int values
  public static int[] intArrayRandom (int length){
    if (length <= 0) {
      throw new IllegalArgumentException("Length must be greater than zero.");
    }
    
    int[] array = new int[length];

    for(int spot = 0; spot < array.length; spot++){
      array[spot] = (int) (Math.random() * 100);
    }
    return array;
  }
  
  
  // Initialize a random string array
  public static String[] stringArrayRandom(int length) {
    if (length <= 0) {
        throw new IllegalArgumentException("Length must be greater than zero.");
    }

    String[] randomStrings = new String[length];
    Random random = new Random();

    for (int i = 0; i < length; i++) {
        char randomChar = (char) (random.nextInt(26) + 'a'); // Generates a random lowercase letter
        randomStrings[i] = String.valueOf(randomChar);
    }

    return randomStrings;
  }

  

  //> Summing the elements of an int array
  public static int sumElements(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i ++){
      sum += array[i];
    }
    return sum;
  }
  

  //Finding the largest element in an int array
  public static int largestElem (int[] array){
    int max = array[0];
    for(int i = 0; i < array.length; i ++){
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }

  //Finding the smallest index of the largest element
  public static int smallestIndexOfLargestValue(int[] array){
    int max = array[0];

    int indexOfMax = 0;
    for(int i = 1; i < array.length; i++){
      if(array[i] > max){
        max = array[i];
        indexOfMax = i;
      }
    }
    return indexOfMax;
  }
  
  public static void printIntArray(int[] array){
    
    for(int spot = 0; spot < array.length; spot++){
      System.out.print(array[spot] + " ");
    }
    
  }
  

  
  public static void main(String[] args){
    String[] alphabet = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };
    
  //Method Calls
    //> Printing Arrays
    
    System.out.print("printArrayForLoop(alphabet) : ");     printArrayForLoop(alphabet);               nl();
    System.out.print("printArrayForEachLoop(alphabet) : "); printArrayForEachLoop(alphabet);           nl();
    System.out.print("printArrayWhileLoop(alphabet) : ");   printArrayWhileLoop(alphabet);             nl();
    
    //> Traversing beginning to end
    System.out.print("beginToEndForLoop(alphabet) : ");     beginToEndForLoop(alphabet);               nl();
    System.out.print("beginToEndForEachLoop(alphabet) : "); beginToEndForEachLoop(alphabet);           nl();
    System.out.print("beginToEndWhileLoop(alphabet) : ");   beginToEndWhileLoop(alphabet);             nl();
    
    //> Traversing end to beginning
    System.out.print("endToBeginForLoop(alphabet) : ");     endToBeginForLoop(alphabet);               nl();
    System.out.print("endToBeginWhileLoop(alphabet) : ");   endToBeginWhileLoop(alphabet);             nl();
    
    //> Traversing beginning to middle
    System.out.print("beginToMidForLoop(alphabet) : ");     beginToMidForLoop(alphabet);               nl();
    System.out.print("beginToMidWhileLoop(alphabet) : ");   beginToMidWhileLoop(alphabet);             nl();
    
    //> Traversing middle to beginning
    System.out.print("midToBeginForLoop(alphabet) : ");     midToBeginForLoop(alphabet);               nl();
    System.out.print("midToBeginWhileLoop(alphabet) : ");   midToBeginWhileLoop(alphabet);             nl();
   
    //> Traversing middle to end
    System.out.print("midToEndForLoop(alphabet) : ");       midToEndForLoop(alphabet);                 nl();
    System.out.print("midToEndWhileLoop(alphabet) : ");     midToEndWhileLoop(alphabet);               nl();
    
    //> Traversing end to middle 
    System.out.print("endToMidForLoop(alphabet) : ");       endToMidForLoop(alphabet);                 nl();
    System.out.print("endToMidWhileLoop(alphabet) : ");     endToMidWhileLoop(alphabet);               nl();
    
    //> Every nth element
    System.out.print("everyNthForLoop(alphabet, 2) : ");                everyNthForLoop(alphabet, 2);               nl();
    System.out.print("everyNthWhileLoop(alphabet, 2) : ");              everyNthWhileLoop(alphabet, 2);             nl();
    System.out.print("everyNthIncrementForLoop(alphabet, 2) : ");       everyNthIncrementForLoop(alphabet, 2);      nl();
    System.out.print("everyNthIncrementWhileLoop(alphabet, 2) : ");     everyNthIncrementWhileLoop(alphabet, 2);    nl();
    
    //> Copying arrays
    System.out.print("copyArrayForLoop(alphabet) : ");             copyArrayForLoop(alphabet);                      nl();                                              
    System.out.print("copyArrayWhileLoop(alphabet) : ");           copyArrayWhileLoop(alphabet);                    nl(); 
    System.out.print("additionalCopyArrayMethods(alphabet) : ");   additionalCopyArrayMethods(alphabet);            nl();
    
    //> Example Algorithms
    int[] nums = intArrayRandom(5);
    String[] strs = stringArrayRandom(5);
    
    System.out.print("intArrayRandom(5) : ");      printIntArray( nums );             nl();
    System.out.print("stringArrayRandom(5) : ");   printArrayForLoop( strs );         nl();
    System.out.println("sumElements(nums) : " + sumElements(nums));    
    System.out.println("largestElem(nums) : " + largestElem(nums));
    System.out.println("smallestIndexOfLargestValue(nums) : " + smallestIndexOfLargestValue(nums));
    
    

   


  }
  
  public static void nl() {
    System.out.println();
  }
  
  



  

  


}

/*
Common Errors:
ArrayIndexOutOfBoundsException: This occurs when you attempt to access an index outside of the range
Off-by-one error: This often occurs when <= is used instead of < for example  (spot <= array.length) instead of (spot < array.length)

*/

/*
Practice:

*/

/*
Additional Notes:


*/
