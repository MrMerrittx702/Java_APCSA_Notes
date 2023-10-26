//Java Binary Search
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:\
  Binary Search utilizes the divide and conquer methodology.
  Binary Search requires a sorted list in order to be effective.
  big O notation O(log(N)) 

  binary search steps
    divide input into equal halves 
    compare goal element with the middle element
    if found loop ends
    else continue by dividing an selecting the appropriate partition of the array.
    search terminates when the the pointer moves past the last element.

  If an array is sorted binary search is more efficient than linear search for finding an element in an array.
  For larger arrays sorting the array then using binary search is more effiecient than using a linear search. 
*/




//There are two ways to implement the binary search algorithm

import java.util.Scanner;//import Scanner class to accept user input.

class BinarySearch {
  public static void main(String[] args){
    Scanner inputObj = new Scanner(System.in);
    System.out.println("Enter desired length of array: ");
    int arraySize = inputObj.nextInt();
    
    int[] array = makeArray(arraySize);

    System.out.println("Select a value to be searched for: ");
    int searchedElement = inputObj.nextInt();
    
    inputObj.close();

    iterBinSearch(array, searchedElement);
    recurBinSearch(array, 0, array.length - 1, searchedElement);

  }
//ITERATION-------------------------------------------------------------------------------------------------------------------------------------
  private static int iterBinSearch(int[] array, int searchedElement){//iterative binary search
    int pointer = 0;
    int lastIndex = array.length -1;

    while (pointer <= lastIndex){
      int middleIndex = (pointer + lastIndex) / 2;//divide array in half
      if(array[middleIndex] == searchedElement){//check if the middle value is the searched value
        System.out.println("Iterative Binary Search: \n" + searchedElement + " found at index: " + middleIndex);
        return middleIndex;
      }else if(array[middleIndex] < searchedElement){//check if value is larger than the middle value
        pointer = middleIndex + 1;
      }else if (array[middleIndex] > searchedElement){//check if value is smaller than the middle value
        lastIndex = middleIndex -1;
      }
    }
    System.out.println("Iterative Binary Search: \n" + searchedElement + "not found");
    return -1;//value not found
  }
//-----------------------------------------------ends here--------------------------------------------------------------------------------------
//RECURSION-------------------------------------------------------------------------------------------------------------------------------------
  private static int recurBinSearch(int[] array, int firstIndex, int lastIndex, int searchedElement){
    //end case (avoid infinite recursion!!!)
    if (lastIndex >= firstIndex){
      int middleIndex = firstIndex + (lastIndex - firstIndex)/2;//divide array in half

      if (array[middleIndex] == searchedElement){//check if middle value is the searched value
        System.out.println("Recursive Binary Search: \n" + searchedElement + " found at index: " + middleIndex);
        return middleIndex;
      }

      if (array[middleIndex] > searchedElement){//check if the middle value is larger than the searched element
        //recursive call of search from first index to the middle index - 1(first half) (original array)
        return recurBinSearch(array, firstIndex, middleIndex - 1, searchedElement);
      }
      //else recursive call of search from middle index + 1 to the last index (second half) (original array)
      return recurBinSearch(array, middleIndex + 1, lastIndex, searchedElement);
    }
    System.out.println("Recursive Binary Search: \n" +searchedElement + "not found");
    return -1; //value not found
  }
//-------------------------------------------ends here------------------------------------------------------------------------------------------
  private static int[] makeArray(int arraySize){//make an array of n length with values from 0 to n - 1 in numberical order
    int[] array = new int[arraySize];
    for (int spot = 0; spot < array.length; spot++){
      array[spot] = spot;
    }
    return array;
  }
}

/*
Common Errors:

*/

/*
Practice:

*/