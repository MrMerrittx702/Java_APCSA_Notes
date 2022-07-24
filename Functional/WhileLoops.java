/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

//Java While Loops

class WhileLoops {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

    //Java While loops--------------------------------------------------------------------------------------------------
    /*
    while loops are often used when the number of loops required is unknown.
    syntax:
    while (condition){
      <code to be executed>
    }

    LOOKOUT FOR INFINITE LOOPS!!!!
    */
    
    boolean keepLooping = true; //set to false to skip this loop.
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

  }
}