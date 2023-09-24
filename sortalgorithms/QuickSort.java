//Java Quick Sort
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  RECURSION INVOLVED

  QuickSort Steps
  1. Choose a pivot
  2. Partition values > pivot to the right and < pivot to the left.
  3. Recursively quicksort the values left and right of the pivot.

  big O notation O(log n)
*/



class QuickSort {
  public static void main(String[] args){
    int[] numbers = {7,4,3,8,6,9,1,2,8};
    System.out.print("Before: ");
    printArray(numbers); System.out.println("");

    quicksort(numbers,0 , numbers.length - 1);//calling the method quicksort on the array numbers
    System.out.print("\nAfter: ");
    printArray(numbers); System.out.println("");
    
  }
  //quicksort method coded out for integers
  //parameters are the array, low index and high index(needed because of recursion)
  private static void quicksort(int[] array, int lowIndex, int highIndex){

    //deals with the case of sorting an array with only one index.
    if (lowIndex >= highIndex){
      return;
    }

    //choose a pivot point(in this case we are using the last element of the array ie highIndex)
    int pivot = array[highIndex];

    //move values less than the pivot to the left and values greater than the pivot to the right(called partioning)
    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while(leftPointer < rightPointer){//stop when the left and right pointer are at the same index

      while (array[leftPointer] <= pivot && leftPointer < rightPointer){
        leftPointer ++;//increase the index of the left pointer until it is greater than the pivot
      }
      //stop moving left pointer

      while (array[rightPointer] >= pivot && leftPointer < rightPointer){
        rightPointer --;//decrease the index of the right pointer until it is greater than the pivot
      }
      //stopped moving right pointer

      swap(array, leftPointer, rightPointer);//calls the swap function to swap the left and right pointer.
    }
    //done moving values left and right of the pivot

    swap(array, leftPointer, highIndex);//swap the left pointer and the pivot

    if(array[leftPointer] > array[highIndex]){
      swap(array, leftPointer, highIndex);
    }else{
      leftPointer = highIndex;
    }

    quicksort(array, lowIndex, leftPointer -1);//recursive call for the left indeces
    quicksort(array,leftPointer + 1, highIndex);//recursive call for the right indeces
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  private static void printArray(int[] numbers){
    for(int spot = 0; spot < numbers.length; spot++){
      System.out.print(numbers[spot]);
      System.out.print(" ");
    }
  }
}

/*
Common Errors:

*/

/*
Practice:

*/