package functional.recursion;
//Java Fibonacci series
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/


/**
Notes:

*/

class Factorial {

  /** returns the factorial of n */
  private static int recursion(int n){
    if (0 == n){
      return 1;
    }
    //          recursion here
    return n * recursion(n - 1);//calling the method inside of the method. 

  }

  /** Provides a visualization of the recursion */
  private static int visual1(int n){
    if (0 == n){
      System.out.println("n = " + n + "\n" + "returning 1" + "\n");
      return 1;
    }
    System.out.println("n = " + n);
    System.out.println("n - 1 = " + (n - 1) + "\n");
    return n * visual1(n - 1);//calling the method inside of the method. 

  }

  private static int visual2(int n){
    if (0 == n){
      System.out.print(1);
      return 1;
    }
    System.out.print(n + "*");
    return visual2(n - 1);
  }



  /** main method to test recursion method. */
  public static void main(String[] args){
    
    int n = 10;
    System.out.println("Factorial of " + n + " is " + recursion(n));
    visual1(n);
    System.out.println("Multiplication:");
    visual2(n);

  }

}



/*
Common Errors:
infinite recursion

*/

/*
Practice:

*/
