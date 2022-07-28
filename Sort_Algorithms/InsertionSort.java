//Java Insertion Sort
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/


/**
Notes:
//only makes sense for arrays of < 100,000
//big O notation O(n^2) Quadratic growth rate

/*
Insertion sort steps
1. Copy element to a temp variable
2. Compare temp to if greater shift value to the right if lesser insert the temp value.
3. Insert the value into its correct spot

*/



import java.util.Random;


class InsertionSort{
  public static void main(String[] args){
    //This is the main method it calls functions and prints out values. Insertion sort method starts at line 30.
    int[] numbers = randArrayValues();
    System.out.print("Before: ");
    printArray(numbers); System.out.println("");

    insertionSort(numbers);//calling the method insertionSort on the array numbers

    System.out.print("\nAfter: ");
    printArray(numbers); System.out.println("");
    
  }

  private static void insertionSort(int[] inputArray){//implements insertion sort
    for (int spot = 1; spot < inputArray.length; spot++){//spot = 1 because the first value is already sorted with itself
      int currentValue = inputArray[spot];//takes the value at index "spot" and assigns it to the temporary variable "currentValue"
      
      int otherSpot = spot - 1; //assigns otherSpot to the index before spot (to work backwards through the array)
      while( otherSpot >= 0 && inputArray[otherSpot] > currentValue){ //loops until reaching index 0 or the number to be sorted is less than the value its comparing to. 
        inputArray[otherSpot + 1] = inputArray[otherSpot]; // shifts the current index right in the array
        otherSpot--; //moves to the next index left
      }
      inputArray[otherSpot + 1] = currentValue; //inserts the number to be sorted into the index just right of the current one.
    }

  }

  private static void printArray(int[] numbers){ //method for printing an array
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