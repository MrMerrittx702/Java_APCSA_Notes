//Java Linear Search
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  Linear /Sequential Search Algorithm
  big O notation O(n) the program will iterate at most N times before finding the element.

  In a Linear Search iterate over the list from the first index to the last index until the value is found.

  If an array is sorted binary search is more efficient than linear search for finding an element in an array.
  For larger arrays sorting the array then using binary search is more effiecient than using a linear search. 
*/

import java.util.Scanner;//for taking user input

class LinearSearch {
  public static void main(String[] args){

    Scanner inputObj = new Scanner(System.in);
    System.out.println("Enter desired length of array: ");
    int arraySize = inputObj.nextInt();

    int[] numbers = makeArray(arraySize);

    System.out.println("Select a value to be searched for: ");
    int searchedElement = inputObj.nextInt();
    
    inputObj.close();

    //printing return of linear Search------------------------------
    System.out.println(linearSearch(numbers, searchedElement));
  }

//--------------------------Linear Search algorithm here------------------------------------------------------------------------------------------------------------ 
  private static int linearSearch(int[] numbers, int searchedElement){
    for (int spot = 0; spot < numbers.length; spot++){
      if(numbers[spot] == searchedElement){
        System.out.print(searchedElement + " found at index: ");
        return spot;
      }
    }
    System.out.print(searchedElement + " not found: returned ");
    return -1; //returning -1 is a convention in search algorithms.
  }
//------------------------------------Ends here---------------------------------------------------------------------------------------------------------------------
  private static int[] makeArray(int arraySize){//make an array of n length with values from 0 to n - 1
    int[] numbers = new int[arraySize];
    for (int spot = 0; spot < numbers.length; spot++){
      numbers[spot] = spot;
    }
    return numbers;
    
    
  }
}
/*
Common Errors:

*/

/*
Practice:

*/


