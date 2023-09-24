package functional;
//Java For loops
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
Covered in this file:
  //> What is Iteration?
  //> For Loop Syntax
  //> Counting with For Loops
  //> For Each/Enhanced For Loops
  //> Break and Continue
  //> Nested for loops
  //> String Processing
  //> Array Processing
  //> 2dArray Processing
  
   
For loops are used when the number of loops is known
    They are great for looping through arrays and ArrayLists

*/
import java.util.ArrayList;import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap; import java.util.Map;
class ForLoops {
//============================================================================================================================================================================//
//Iteration
 //> iteration is the process of repeating a specific process
 //> commonly called looping
 //> There are 2 types of loops in java
   //> While Loops (typically used when the number of loops is unknown)
   //> For Loops (typically used when the number of loops is known)
  
//============================================================================================================================================================================//
// For Loop Syntax
  //> typically used when the number of loops is known
  //> often used for processing arrays (see Processing_Arrays)
/*
    for (statement1; statement2; statement3){
      <code to be executed>
    }
    
    
    Statement1 executes once for the code block
    Statement2 defines the condition for for executing the code block
    Statement3 is executed every time after the code block has been executed
     
    Think of it like this:
      for (start,end,step){}
      
    
    When using i as a loop control variable think "i for index"
     
 */
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
  //============================================================================================================================================================================//
  // Counting with For Loops
    //> typically you will see loops use the variables i and j, but that is not a rule just convention.
    //> the variable used to control the number of loops is called the control variable.
    
    //counting up
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    
    //counting up by multiples
    for (int i = 0; i <= 20; i += 5) {
      System.out.println(i);
    }
    
    //counting down
    for (int i = 10; i >= 1; i--) {
      System.out.println(i);
    }
    
    //counting down by multiples
    for (int i = 20; i >= 0; i -= 5) {
      System.out.println(i);
    }
    
    
    for(int i = 0; i < 10; i++){
        System.out.println("For Loop printing i: " + i); 
        //why does it stop at 9?
    }
    
    //to make things a little less confusing substitute 'spot' for i
    for(int spot = 0; spot < 3; spot++){
        System.out.println("Used spot this time: " + spot);
    }
    
  //============================================================================================================================================================================//
  // For Each/Enhanced For Loops
    //for each/enhanced for loops are a shorthand version of for loops
    // these loops are used with iterables or objects that can be accessed in a sequential manner
    //> Iterable Examples:
      //> Strings
      //> Arrays
      //> Lists, ArrayLists
      //> Sets, HashSets
      //> Maps, HashMaps
    
  /*
   
   for (elementType element : iterable){
     <code block to execute>
   }
   
   */
    
    //> Strings have to be converted to a character array
    String str = "Hello World";
    for(char elem : str.toCharArray()) {
      System.out.println(elem);
      
    }
    
    //> Arrays
    int[] array = {0,1,2,3,4,5,6,7};
    for(int num : array) {
      System.out.println(num);
    }
    
    //> ArrayLists
    //> must import java.util.ArrayList
    //> must import java.util.Arrays
    ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
    for(String elem : list) {
      System.out.println(elem);
    }
    
    //>HashSets
    //> must import java.util.HashSet
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    
    for (int number : numbers) {
      System.out.println(number);
    }
    
    //> HashMap
    //> must import java.util.HashMap
    //> must import java.util.Map
    HashMap<String, Integer> studentScores = new HashMap<>();
    studentScores.put("Alice", 95);
    studentScores.put("Bob", 88);
    studentScores.put("Charlie", 92);
    
    // Iterate through the entries (key-value pairs)
    for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
        String studentName = entry.getKey();
        int score = entry.getValue();
        System.out.println(studentName + ": " + score);
    }
    
    
  //============================================================================================================================================================================//
  //Break and Continue
    //> the break keyword breaks out of a loop (ends the loop)
    //> the continue keyword breaks one iteration of the loop (continues to the next loop)
    
    
      //break
      for(int i = 0; i < 10; i++) {
        break; //exits the loop
      }
      
      //continue
      for(int i = 0; i < 10; i++) {
        continue; //skips one iteration
      }
      
   //============================================================================================================================================================================//
   // Nested For Loops
      //> When for loops are inside of for loops
      //> The inner loop completes all iterations each time the outer loop iterates once
      
      for (int i = 1; i <= 5; i++) {//===================================//
                                                                         //
        for (int j = 1; j <= i; j++) {//===========//                    //
            System.out.print("* ");                //                    //
        }//========================================//                    //
                                                                         //
        System.out.println(); // Move to the next line after each row    //
    }//==================================================================//
    
    
    //============================================================================================================================================================================//
    // String Processing
      
      String strang = "abcdefghijklmnopqrstuvwxyz";
      
      for(int i = 0; i < strang.length(); i++) {
        System.out.println(strang.substring(i, i+1));
      }
      
    //============================================================================================================================================================================//
    // Array Processing
      double[] duoArray = {0.0, 1.0, 2.0, 3.0};
      
      for(int i = 0; i < duoArray.length; i++) {
        System.out.println(duoArray[i]);
      }
      
      for(double duo : duoArray) {
        System.out.println(duo);
      }
      
    //============================================================================================================================================================================//
      // 2d Array Processing
      String[][] array2d = new String[5][5];
      
      //for
      for(int row = 0; row < array2d.length; row++) {
        for(int col = 0; col < array2d[row].length; col++) {
          System.out.println(array2d[row][col]);
        }
        
      }
      
      //for each
      for(String[] row : array2d) {
        for(String elem : row) {
          System.out.println(elem);
        }
      }   
  }
}

/*
Common Errors:
ArrayIndexOutOfBoundsException: This occurs when you attempt to access an index outside of the array.length-1
Off-by-one error: This often occurs when <= is used instead of < for example  (spot <= array.length) instead of (spot < array.length)

*/

/*
Practice:

*/