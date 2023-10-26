package functional.processingarrays;

class RandomShuffling {
  public static void main(String[] args){
    int[] array = {0,1,2,3,4,5};
    printArray(array); System.out.println("");

    randomShuffle(array);
    printArray(randomShuffle(array));


  }

  private static int[] randomShuffle (int[] array){

    for (int spot = array.length - 1; spot > 0; spot --){
      //generate an index place randomly with 0 <= place <= spot 
      int place = (int)(Math.random() * (spot + 1));
  
      int temp = array[spot];
      array[spot] = array[place];
      array[place] = temp;
    }

    return array;
    
  }

  private static void printArray (int[] array){
    for (int i = 0; i < array.length; i ++){
      
      System.out.print(array[i] + ", ");
    }
  }

  
}