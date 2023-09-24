package functional;
//Java While Loops
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> What is Iteration
  //> While Loop Syntax
  //> While Loops with Control Variables
  //> Do While Loops
  //> Break and Continue Keywords
  //> Sentinel Controlled Loops
  //> Nested While Loops
    

  LOOKOUT FOR INFINITE LOOPS!!!! Use Ctrl + C to keyboard interrupt infinite loops
*/
import java.util.Scanner;
class WhileLoops {
//============================================================================================================================================================================//
// Iteration
  //> iteration is the process of repeating a specific process
  //> commonly called looping
  //> There are 2 types of loops in java
    //> While Loops (typically used when the number of loops is unknown)
    //> For Loops (typically used when the number of loops is known)

//============================================================================================================================================================================//
//While Loop Syntax
  //> while loops are controlled by a condition
  //> this condition is typically some form of boolean expression
  //> if the condition is true the loop block runs again
  //> if the condition is false the loop stops. 
/*
 
  while (condition){
      <code to be executed>
  }
  
 */
  
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
    
  //============================================================================================================================================================================//
  //While loops with control variables
    //> a variable is used to determine when the loop ends
    
    // the 'condition' variable determines when the loop ends.
    // this however is an infinite loop because the condition never changes
    boolean condition = true;
    while(condition == true) {
      continue;
    }
    
    //the 'control' variable determines when the loops ends
    int control = 0; //> start
    while (control < 5) { //> stop
      System.out.print(control);
      control ++; //> step
      //'control' must be incremented or an infinite loop will result
    }//output: 01234
    
    //typically you will see loops use the variables i and j, but that is not a rule just convention.
    int i = 0;
    while (i < 10){//while the condition is true the code block is executed
      System.out.println("Looping: " + i);
      i++;//remember to increment the variable or you may run into an infinite loop.
    }
    //when the condition becomes false the loop is exited and the program continues
    
    
    //examples
    
    //infinite loop
    boolean keepLooping = false; //set to false to skip this loop.
    while (keepLooping){
      System.out.println("Looping...");
      //this loop will continue forever. Use Ctrl + C to exit an infinite loop in the terminal.
  
    }
    
    //counting up
    int countUp = 1;
    while (countUp <= 10) {
        System.out.println(countUp);
        countUp++;
    }
    
    //counting up by multiples
    int countUpByMultiples = 3;
    while (countUpByMultiples <= 30) {
        System.out.println(countUpByMultiples);
        countUpByMultiples += 3;
    }
    
    //counting down
    int countDown = 10;
    while (countDown >= 1) {
        System.out.println(countDown);
        countDown--;
    }
    
    //counting down by multiples
    int countDownByMultiples = 50;
    while (countDownByMultiples >= 5) {
        System.out.println(countDownByMultiples);
        countDownByMultiples -= 5;
    }
    
    //Quitting a loop with command line argument
    String command = args[0];
    boolean isTrue = true;
    while (isTrue) {
        if (command.equalsIgnoreCase("quit")) {
            System.out.println("Exiting the loop.");
            isTrue = false; // Terminate the loop when the command is 'quit'
        } else {
            System.out.println("Unknown command: " + command);
            // You can add more logic here based on the command
            // For simplicity, we'll just exit the loop for any non-'quit' command.
            isTrue = false;
        }
    }
    
  //============================================================================================================================================================================//
  // Do while loops
    //> execute once before checking the condition
    
  /* syntax:
   
    do {
      <code to be executed>
    }
    while(condition);
    
  */
    
    //example
    i = 0;
    do {// Executes once before checking the condition
      System.out.println("Executing once before checking.");
      i++;
    } 
    while(i > 5);
    
  //============================================================================================================================================================================//
  //Break and Continue
    //> the break keyword breaks out of a loop (ends the loop)
    //> the continue keyword breaks one iteration of the loop (continues to the next loop)

    // using break
    int loop = 0;
    while (loop < 5){//break in a while loop
      System.out.println(loop);
      loop++;
      if (loop == 4) {
        break;
      }
    }
    
    //using continue
    while (loop < 5){//continue in a while loop
      System.out.println(loop);
      loop++;
      if (loop == 4) {
        System.out.println("Skipping.");
        continue;
      }
    }
  
    //See the methods below for more
    //sentinelControlled(); //try me
    //infiniteLoop(); // try me
    //offByOne(); //try me

  }
//============================================================================================================================================================================//
//Sentinel Controlled Loops
  //> sentinel controlled loops are loops with a special input value that signifies the end of the loop.
  private static void sentinelControlled(){
    
    Scanner input = new Scanner(System.in);//> constructs Scanner object to accept system input 
    System.out.print("Enter an integer: ");//> prompt for the user
    int data = input.nextInt();//> variable storing the integer user input capture with input.nextInt()

    int sum = 0;
    while (data != 0){//> checking to see if data is not 0. Looping until data is 0. 
      sum += data;
      System.out.println("The current sum: " + sum);

      System.out.println("Enter an integer(type 0 to end): ");
      data = input.nextInt();
    }

    System.out.println("Final sum: " + sum);
  }
  
//============================================================================================================================================================================//
//Nested While Loops
  //> When while loops are inside of while loops
  //> The inner loop completes all iterations each time the outer loop iterates once
  public static void nestedWhile() {
    
    int outerCounter = 1;
    // Outer while loop
    while (outerCounter <= 3) {
        System.out.println("Outer loop iteration: " + outerCounter);
        
        int innerCounter = 1;
        // Inner while loop
        while (innerCounter <= 2) {
            System.out.println("  Inner loop iteration: " + innerCounter);
            innerCounter++;
        }
        outerCounter++;
    }
    
  }
  

 
//============================================================================================================================================================================//
// Common Error Examples
  //> infinite loops never exit the loop
  //> off by one errors occur when your code is off by 1
  
  private static void infiniteLoop (){
    int count = 0;
    while (count < 100){
      System.out.println("Stuck in an infinite loop");
      //The condition is never false so the loop continues forever
    }
  }

  private static void offByOne () {
    //we want to loop exactly 100 times
    int loopCount = 0;
    int condition = 0;
    while (condition <= 100){
      System.out.println(condition);
      condition++;
      loopCount++;
      //because we used <= we will loop 101 times
      //we should use < here
    }
    System.out.println("Number of loops: " + loopCount);
  }
}

/*
Common Errors:
Infinite loops
Off by one errors

*/

/*
Practice:

*/