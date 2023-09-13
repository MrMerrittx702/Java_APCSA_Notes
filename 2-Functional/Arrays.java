
public class Arrays {
  
  public static void main(String[] args) {
  //> length is an instance variable that returns the length of an array
    //> the length variable is only used for arrays
  }
  //Array Initializers
    //This is a shorthand that combines declaration, creation, and initialization of an array. 
    //syntax
      // elementType[] identifier = {value1,value2,...};
    int[] intArray = {1,2,3,4,5};//what is the length of this array?
    
    String[] stringArray = {"Index 0", "Index 1", "Index 2"};//what is the length of this array?

    //to print an element you must access the index of the element
    //arrays start at index 0 and increase from there
    System.out.println(intArray[4]); //why does this print out 5?
    System.out.println(stringArray[0]);

    //to change the value in an array access the value's index. syntax arrayIdentifier[<index>] = <new value>;
    intArray[0] = 5; 
    
    // Once created the size of an array is fixed.
    //! remember the length of an array cannot be changed without making a new array

    //to check the length of an array use .length : syntax arrayIdentifier.length
    System.out.println("The length of intArray is " + intArray.length);
    System.out.println("The length of stringArray is " + stringArray.length);

    /*
    More Array Notes:
    Unlike declarations for primitive data type variables, the declaration of an array variable does not allocate any space in memory for the array.
    It creates a storage location for the reference to an array. 
    If a variable does not contain a reference to an array, the value of the variable is "null" (meaning nothing).

    Array variables only hold a reference to the actual array, but this can usually be ignored. 
      So for simplicity we can say that the Array variable is an "array".

    Arrays are typically processed using for loops.
    
    
  }

}
