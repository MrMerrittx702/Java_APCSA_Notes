//Java Selection Sort
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/


/**
Notes:
  Steps
  Take the first value
  Check that value against each value in the array
  If the array value is smaller change the value you are checking to that value
  When you reach the end switch the value you have with the value at the beginning  

  Take the next value
  repeat above
*/

class SelectionSort {
  public static void main(String[] args){

    int[] array = makeRandomArray();
    System.out.println("Array before selection sort: "); printArray(array);

    System.out.println("\n");

    selectionSort(array);
    System.out.println("Array after selection sort: "); printArray(array);

  }

  //Selection Sort---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  private static void selectionSort (int[] array){
    
    for(int spot = 0; spot < array.length - 1; spot++){//loop through the array

      int minIndex = spot;
      for(int point = spot + 1; point < array.length; point++){//loop array.length times
        if(array[point] < array[minIndex]){//check each value in the array when a number is less than the value at minIndex set minIndex as that index . 
          minIndex = point;
        }
      }

      //swap the index with the smallest value with the value found at "spot"
      int temp = array[minIndex];
      array[minIndex] = array[spot];
      array[spot] = temp; 
    }
  }
  //End--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  private static void printArray(int[] array){ //method for printing an array
    for(int spot = 0; spot < array.length; spot++){
      System.out.print(array[spot]);
      System.out.print(", ");
    }
  }

  private static int[] makeRandomArray (){//method for generating a random array of length 10  with values between -100 and 100 to sort.
    int[] array = new int[10];
    int max = 100;
    int min = -100;
    int range = ((max-min) + 1) + min;

    for (int spot = 0; spot < array.length; spot++){
      array[spot] = (int)((Math.random() * range));
    }

    return array;
  }
}

/*
Common Errors:
Scope of variables and statements

*/

/*
Practice:

*/