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
The fibonacci series is a sequence of numbers that begins with 0 and 1
Each subsequent number is the sum of the previous two numbers.

remember:
  longLow = -9223372036854775808L;  
  longHigh= 9223372036854775807L;
*/

class FibonacciSeries {
  private static long[] fibonacciCache;//declaration of fibinacciCache used to store the values of fibnacci calculations

  public static void main(String[] args){

   
    int n = 50; //length of the fibonacci series to be printed.
    int limit = 92;//the maximum length that returns a value that does not overflow the highest value of a long

     fibonacciCache = new long[n+1];//initialization of fibonacciCache to store values of length n+1

    if (n > limit){//check against limit
      System.out.println("N value too large. Series will return value greater than 9,223,372,036,854,775,807 ");

    } else {
      for (int i = 0; i<= n; i++){ //loop to print the fibonacci values from 0 to n 
        System.out.println(fibonacci(i) + ", ");
      }
    }
  }

  private static long fibonacci (int n){// recursive method to return the value of the nth fibonacci number
    if (n <= 1){//checks if n is zero in order to return. otherwise infinite recursion
      return n;
    }
    
    if (fibonacciCache[n] != 0){// checks if the value at the nth index is not zero
      return fibonacciCache[n]; //returns the cached fibonacci calculation 
    }
     long nthFibonacciNum = (fibonacci(n-1) + fibonacci(n-2));//calculates fibonacci values through recursive calls
     fibonacciCache[n] = nthFibonacciNum;//caches the calculated fibonacci value to reduce the number of calculations and therefor time complexity.

     return nthFibonacciNum; 
  }
}

/*
Common Errors:
infinite recursion

*/

/*
Practice:

*/
