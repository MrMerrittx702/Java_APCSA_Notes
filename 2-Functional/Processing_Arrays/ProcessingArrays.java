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
Processing arrays is an important skill that will be used quite often

Arrays are objects in Java. The JVM Stores the objects in an area of memory called the heap, which is used for dynamic memory allocation.

Java uses pass by value to pass arguments to a method. 
  For primitive types the arguments value is passed. 

However for arrays the value passed is a reference to an array. (called pass-by-sharing)
Therefore:
  Arrays are passed to methods by reference. This means that if you change an array in a method the array will change outside of the method. 

When a method returns an array it returns a reference to the array. 

A variable number of arguments of the same type can be passed to a method and treated as an array. 
  syntax--> typeName... parameterName

Also see 
  RandomShuffling.java
  ShiftingElements.java

*/
// for processing arrays with the API see java.util.Arrays class


import java.util.Scanner;

class ProcessingArrays{
  public static void main(String[] args){

    int[] array1 = arrayInitInput();
    printArray(array1);

    System.out.println(" ");

    int[] array2 = arrayInitRandom();
    printArray(array2);

    System.out.println(" ");

    System.out.println(sumElements(array2));
    System.out.println(largestElem(array2));
    System.out.println(smallestIndexOfLargestValue(array2));


  }

  //Initializing arrays with input values
  private static int[] arrayInitInput(){
    int[] array = new int[5];
    Scanner element = new Scanner(System.in);
    for ( int spot = 0; spot < array.length; spot++){
      System.out.println("Please enter another value: ");
      array[spot] = element.nextInt();
    }

    return array;
  }

  //Initializing arrays with random values
  private static int[] arrayInitRandom (){
    int[] array = new int[5];

    for(int spot = 0; spot < array.length; spot++){
      array[spot] = (int) (Math.random() * 100);
    }
    return array;
  }

  //Printing Arrays
  private static void printArray(int[] array){
    for(int spot = 0; spot < array.length; spot++){
      System.out.print(array[spot] + " ");
    }
  }

  //Summing the elements of an array
  private static int sumElements(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i ++){
      sum += array[i];
    }
    return sum;
  }

  //Finding the largest element in an array
  private static int largestElem (int[] array){
    int max = array[0];
    for(int i = 0; i < array.length; i ++){
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }

  //Finding the smallest index of the largest element
  private static int smallestIndexOfLargestValue(int[] array){
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

  //Copying Arrays
  private static int copyArrays (int[] array){
    //There are 3 ways to copy an array. 
    // Use a loop to copy each individual element (written here)
    int [] newArray = new int[array.length];

    for (int i = 0; i < array.length; i++){
      newArray[i] = array[i];
    }

    // Use the static arraycopy method in the System class
    // Use the clone method to copy arrays
  }

  


}

/*
Common Errors:
ArrayIndexOutOfBoundsException: This occurs when you attempt to access an index outside of the array.length-1
Off-by-one error: This often occurs when <= is used instead of < for example  (spot <= array.length) instead of (spot < array.length)

*/

/*
Practice:

*/

/*
Additional Notes:


*/
