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
*/

import java.util.Random;

class QuickSortOptimized {
  public static void main(String[] args){
    int[] numbers = randArrayValues();
    System.out.print("Before: ");
    printArray(numbers); System.out.println("");

    quicksort(numbers);//calling the method quicksort on the array numbers

    System.out.print("\nAfter: ");
    printArray(numbers); System.out.println("");
    
  }

  private static void quicksort(int[] array){
    quicksort(array, 0, array.length - 1);//calls the other quicksort method.
    //used to call quicksort more naturally with just the array
  }

  //quicksort method coded out for integers
  //parameters are the array, low index and high index(needed because of recursion)
  private static void quicksort(int[] array, int lowIndex, int highIndex){

    //deals with the case of sorting an array with only one index.
    if (lowIndex >= highIndex){
      return;
    }

    //choose a pivot point randomly for best average performance
    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;//chooses pivot randomly
    int pivot = array[pivotIndex];
    swap(array, pivotIndex, highIndex);//sway pivot index with random index

    int leftPointer = partition(array,lowIndex,highIndex,pivot);

    quicksort(array, lowIndex, leftPointer -1);//recursive call for the left indeces
    quicksort(array,leftPointer + 1, highIndex);//recursive call for the right indeces
  }

  private static int partition(int[] array, int lowIndex,int highIndex,int pivot){
  
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

      swap(array, leftPointer, rightPointer);//calls the swap function to swap the left and right pointers

    }
    //done moving values left and right of the pivot

    swap(array, leftPointer, highIndex);//swap the left pointer and the pivot

    if(array[leftPointer] > array[highIndex]){//fixes issue where last value might be out of order.
      swap(array, leftPointer, highIndex);
    }else{
      leftPointer = highIndex;
    }

    return leftPointer;
  }

   private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
  
  private static void printArray(int[] numbers){//allows us to print the arrays
    for(int spot = 0; spot < numbers.length; spot++){
      System.out.print(numbers[spot]);
      System.out.print(" ");
    }
  }

  private static int[] randArrayValues(){//generates random array values in a random order for testing.
    Random rand = new Random();
    int[] numbers = new int[10];

    for(int spot = 0; spot < numbers.length; spot++){
      numbers[spot] = rand.nextInt(100);
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
