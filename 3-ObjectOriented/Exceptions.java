//Java Exceptions
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
When executing java code errors will occur
When errors occur java will stop and generate and error code
This is java throwing an exception

Java Try and Catch
The try statement allows you to define a block of code to be tested for errors while it is being executed
The catch statement allows you to define a block of code to be execute if an error occurs in the try block
*/

public class Exceptions {
  static void checkNum (int num){//used at line 41
    if (num > 10){
      throw new ArithmeticException("The number is too big.");
    }else{
      System.out.println("The number meets the requirements");
    }
  }

  public static void main(String[] args){
    try{
      int[] someNums ={0,1,2,3};
      System.out.println(someNums[10]);//There is no index 10
    }
    catch(Exception e){
      System.out.println("Well you broke it, way to go.");f
    }finally{
      System.out.println("The try catch has finished");
    }
  //The throw statement allows for the creation of a custom error
  //it is used with an exception type
  /*
  Some of these exception types are:
  ArithmeticException
  FileNotFoundException
  ArrayIndexOutOfBoundsException
  SecurityException
  */
  checkNum(20);
  }
}

/*
Common Errors:

*/

/*
Practice:

*/