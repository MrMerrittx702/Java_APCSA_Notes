package functional.processingarrays;

//> Determine min or max value
//> compute sum, average, or mode
//> Determine if at least one element has a particular property
//> Determine if all elements have a particular property
//> Access all consecutive pairs of elements
//> Determine the precence or abscence of particular elements
//> Determine the number of elements meeting a specific criteria
//> Shift or rotate elements left or right
//> Reverse the order of elements

public class CommonArrayAlgorithms {

//Find the Maximum from an Array or ArrayList///////////////////////////////
  public static int findMax(int array){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < array.length; i++){
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }

  public static int findMax(ArrayList<Integer> list){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < list.size(); i++){
      if(list.get(i) > max){
        max = list.get(i);
      }
    }
    return max;
  }

//////////////////////////////////////////////////////////////////////////////

//Compute Sum of Array or ArrayList///////////////////////////////////////////
  public static int computeSum(int array){
    int sum = 0;

    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return sum;
  }

  public static int computeSum(ArrayList<Integer> list){
    int sum = 0;

    for(int i = 0; i < list.size(); i++){
     sum += list.get(i);
    }
    return sum;
  }
/////////////////////////////////////////////////////////////////////////////////

//Compute Average////////////////////////////////////////////////////////////////
  public static int computeAvg(int array){
    int sum = 0;

    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return max/array.length;
  }

  public static int computeAvg(ArrayList<Integer> list){
    int sum = 0;

    for(int i = 0; i < list.size(); i++){
     sum += list.get(i);
    }
    return sum/list.size();
  }
///////////////////////////////////////////////////////////////////////////////////////

//Determine Mode///////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////
//Determine if at least one element has a particular property//////////////////////////
  public static boolean checkPropertyAtLeastOne(boolean array){
    boolean property = true;
    for(int i = 0; i < array.length; i++){
      if(array[i] == property){
        return true;
      }
    }
    return false;
  }

  public static int checkPropertyAtLeastOne(ArrayList<Boolean> list){
    boolean property = true;
    for(int i = 0; i < list.size(); i++){
     if(list.get(i) == property){
      return true;
     }
    }
    return false;
  }
////////////////////////////////////////////////////////////////////////////////////////////
//Check if all elements have a particular property//////////////////////////////////////////
  public static boolean checkPropertyAll(boolean array){
    boolean property = true;
    for(int i = 0; i < array.length; i++){
      if(array[i] != property){
        return false;
      }
    }
    return true;
  }

  public static int checkPropertyAll(ArrayList<Boolean> list){
    boolean property = true;
    for(int i = 0; i < list.size(); i++){
     if(list.get(i) != property){
      return false;
     }
    }
    return true;
  }
//////////////////////////////////////////////////////////////////////////////////////////////////
}
