//Java Math Class
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Math.html


/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:

*/

class MathClass {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

    //Java Math Class
    // methods for mathematical tasks
    Math.max(1,5); //find the largest value

    Math.min(1,5); // find the smallest value

    Math.sqrt(144); //find the square root

    Math.abs(-6); // returns the absolute value

    Math.random(); // returns a random number

    //apply your math skills to do more with the random() method.
    
    int randomNum = (int)(Math.random() * 101); // random from 0 to 100

    int max = 100, min = 50;

    //(int)((Math.random() * ((max-min) + 1)+min)); //this is the correct method for random range with a --negative and a positive or two positives--
    randomNum = (int)((Math.random() * ((max-min) + 1)+min));

    max = 25; min = -25;
    randomNum = (int)((Math.random() * ((max-min) + 1)+min));


    //(int)((Math.random() * (max-min)+min)); //this is the correct method for random range with --two negatives--
    max = -10; min = -30;
    randomNum = (int)((Math.random() * (max-min)+min));

    //why are these two different formulas necessary?
    
    //check out RandomRange.java
  }
}

/*
Common Errors:

*/

/*
Practice:

*/