//Java While Loops
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  while loops are often used when the number of loops required is unknown.
    syntax:
    while (condition){
      <code to be executed>
    }

  LOOKOUT FOR INFINITE LOOPS!!!!
*/
import java.util.Scanner;

class WhileLoops {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

    //Java While loops--------------------------------------------------------------------------------------------------
  
    boolean keepLooping = false; //set to false to skip this loop.
    while (keepLooping){
      System.out.println("Looping...");
      //this loop will continue forever. Use Ctrl + C to exit an infinite loop in the terminal.
  
    }

    //typically you will see loops use the variables i and j, but that is not a rule just convention.
    int i = 0;
    while (i < 10){//while the condition is true the code block is executed
      System.out.println("Looping: " + i);
      i++;//remember to increment the variable or you may run into an infinite loop.
    }
    //when the condition becomes false the loop is exited and the program continues

    //to make things less confusing we will use loop instead of i
    int loop = 0;
    while (loop < 3){
      //adding to loop
      loop++;
    }

    //Do While Loops are special
    /*
    syntax:
    do {
      <code to be executed>
    }
    while(condition);
    */

    i = 0;
    do {// Executes once before checking the condition
      System.out.println("Executing once before checking.");
      i++;
    } 
    while(i < 5);


    //The break statement can also be used to break out of loops
    loop = 0;
    while (loop < 5){//break in a while loop
      System.out.println(loop);
      loop++;
      if (loop == 4) {
        break;
      }
    }

    //The continue statement breaks one iteration of the loop then returns to the loop
    while (loop < 5){//continue in a while loop
      System.out.println(loop);
      loop++;
      if (loop == 4) {
        System.out.println("Skipping.");
        continue;
      }
    }

    //sentinelControlled(); //try me

    //infiniteLoop(); // try me

    offByOne(); //try me

  }

  private static void sentinelControlled(){
    //Sentinel Controlled loops
    //sentinel controlled loops are loops with a special input value that signifies the end of the loop.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int data = input.nextInt();

    int sum = 0;
    while (data != 0){
      sum += data;
      System.out.println("The current sum: " + sum);

      System.out.println("Enter an integer(type 0 to end): ");
      data = input.nextInt();
    }

    System.out.println("Final sum: " + sum);
  }

  //Error examples
  private static void infiniteLoop (){
    int count = 0;
    while (count < 100){
      System.out.println("Stuck in an infinite loop");
      //The condition is never false so the loop continues forever
    }
  }

  private static void offByOne () {
    //we want to loop exaclty 100 times
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