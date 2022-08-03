//Java If...Else statements
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
use the if keyword to begin and if statement
  syntax:
  if(condition){
    <code to be executed>

  } else if (condition){

    <code to be executed>

  } else {

    <code to be executed>
  }

  else if & else are not required but can be used.

  curly braces {} help us keep track of the code in our statements in some cases they are required
  in some they are not. It is good practice to always use curly braces whether they are required
  or not. It makes your code easier to read.
*/

class IfElseStatements {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

    //Java If...Else statements--------------------------------------------------------------------------------------------------------------

    int x = 5;
    int y = 1;

    if (x < y){
      //if statements execute a block of code if a condition is true
      System.out.println("The if condition is false so this will not print.");
    }
    //in this case the code skips the print statment because the if condition is false


    if (x > y){
      System.out.println("The if condition is true.");
    } else { 
      //else statements execute a block of code if the conditions above it are false
      System.out.println("The if condition is false.");
    }

    

    if (x > y){
        System.out.println("The if condition is true.");
    } else if (x == y) { 
      //else if statements specify a new condition to test, if the first is false
        System.out.println("The else if condition is true.");
    }else {
        System.out.println("The if and else if conditions are false.");
    }

    //Switch statements----------------------------------------------------------------------------------------------------------------------
    //you may find yourself writing a large number of else if statements. 
    //If so it may make more sense to use a switch statement

    int day = 5;
    switch (day){ //switch to specify many alternate blocks of code to execute
      case 1: System.out.println("Monday");
      case 2: System.out.println("Tuesday");
      case 3: System.out.println("Wednesday");
      case 4: System.out.println("Thursday");
      case 5: System.out.println("Friday");//after the code reaches a true case it executes everything after it unless you break.
      case 6: System.out.println("Saturday");
      case 7: System.out.println("Sunday");
        break;
      default: break;
    }
    /*
    Switch statements follow these rules:
    * switch is evaluated once, value is compared with each case, if there is a match code is executed.
    * break is used to break out of the switch block
    * default specifies some code to run is there is no case match.
    * switch (switch-expression) the switch expression must yeild a value of char,byte,short, int, or String
    * The value of each case must have the same type as the switch expression
    */

    
    // Java Ternary Operators------------------------------------------------------------------------------------------------------------------
    //DO NOT use these. They don't make you smart they make code hard to read.

    // This is a shorthand if else statement
    // variable = (condition) ? whenTrue : whenFalse;
    x = 6;
    y = 8;
    boolean result = (x > y) ? true : false;
    System.out.println(result);
  }
}

/*
Common Errors:

*/

/*
Practice:

*/