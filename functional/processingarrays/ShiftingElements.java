//Java Shifting elements
package functional.processingarrays;

class ShiftingElements{
  public static void main(String[] args){
    int[] array = {0,1,2,3,4,5};

    array = shiftLeftOnce(array);
    printArray(array);

    int[] array1 = {0,1,2,3,4,5};
    array = shiftRightOnce(array1);
    printArray(array);

  }

  private static int[] shiftLeftOnce (int[] array){
    //add another for loop here to shift multiple times
    int temp = array[0];

    for (int spot = 1; spot < array.length; spot ++){
      array[spot - 1] = array [spot];
    }

    array[array.length -1] = temp;

    return array;
  }

  private static int[] shiftRightOnce (int[] array){
    //add another for loop here to shift multiple times
    int temp = array[array.length - 1];
    
    for (int spot = array.length - 2; spot >= 0; spot --){
      array[spot + 1] = array [spot];
    }
    
    array[0] = temp;
    return array;
  }

  private static void printArray (int[] array){
    for (int i = 0; i < array.length; i ++){
      
      if (i == array.length - 1){
        System.out.println(array[i]);
      }
      else {
        System.out.print(array[i] + ", ");
      }
      
    }
  }
  
}