//Java Merge sort
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/


/**
Notes:
  big O (n*log n)
  RECURSION


  Merge Sort steps
  1. Split array in 2

*/

import java.util.Random;

class MergeSort{
  public static void main(String[] args){
    //This is the main method it calls functions and prints out values. Merge sort method starts at line 29.
    int[] numbers = randArrayValues();
    System.out.print("Before: ");
    printArray(numbers); System.out.println("");

    mergeSort(numbers);//calling the method insertionSort on the array numbers

    System.out.print("\nAfter: ");
    printArray(numbers); System.out.println("");
  }
//-------------------------------------------------Merge Sort Code starts here----------------------------------------------------------------------------------------------------------------
  private static void mergeSort(int[] inputArray){
    int inputLength = inputArray.length;

    if(inputLength < 2){
      return;
    }

    int midIndex = inputLength / 2;
    int[] leftHalf = new int[midIndex];
    int[] rightHalf = new int[inputLength - midIndex];

    for (int spot = 0; spot < midIndex; spot++) {
      leftHalf[spot] = inputArray[spot];
    }

    for (int spot = midIndex; spot < inputLength; spot++) {
      rightHalf[spot - midIndex] = inputArray[spot];
    }

    mergeSort(leftHalf);
    mergeSort(rightHalf);

    //merge code implemented at line 56
    merge(inputArray, leftHalf, rightHalf);
  }

  private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){ //method for merging the arrays
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;

    int leftSpot = 0, rightSpot = 0, spot = 0;
    while (leftSpot < leftSize && rightSpot < rightSize){
      if (leftHalf[leftSpot] <= rightHalf[rightSpot]){
        inputArray[spot] = leftHalf[leftSpot];
        leftSpot++;
      }else{
        inputArray[spot] = rightHalf[rightSpot];
        rightSpot++;
      }
      spot++;
    }

    while(leftSpot < leftSize){
      inputArray[spot] = leftHalf[leftSpot];
      leftSpot++;
      spot++;
    }

    while(rightSpot < rightSize){
      inputArray[spot] = rightHalf[rightSpot];
      rightSpot++;
      spot++;
    }
  }
//---------------------------------------------------------------------------Ends Here-----------------------------------------------------------------------------------------------------------------
   private static void printArray(int[] numbers){ //method for printing an array
    for(int spot = 0; spot < numbers.length; spot++){
      System.out.print(numbers[spot]);
      System.out.print(" ");
    }
  }

  private static int[] randArrayValues(){//generates random array values in a random order for testing.
    Random rand = new Random();
    int[] numbers = new int[10]; //chage this value to increase the number of sorted values

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