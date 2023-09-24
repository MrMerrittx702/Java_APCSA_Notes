package functional;
//Java Floating Point Errors
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
*Notes:
  Covered in this file:
  //> Floating Point (FLOP) Errors
  //> The Problem
  //> Decimal vs. Binary 
  //> Dealing with FLOP Errors
*/

import java.lang.Math;
import java.math.BigDecimal;
import java.math.MathContext;

class FLOPErrors{
//============================================================================================================================================================================//
//Floating Point (FLOP) Errors 
  //> Floating point errors result from the way that computers do math and store values. 
  //> Because binary is base 2 there are errors that can occur when performing floating point operations.
  
  public static void main(String[] args){
  //============================================================================================================================================================================//
  //The Problem
    //> some calculations result in unexpected values
    
    //> For Example
    double notPointThree = 0.2 + 0.1;
    System.out.println(notPointThree == 0.3);//false ?...
    System.out.println("0.2 + 0.1 = " + notPointThree);

    //If you use a comparison operator with floating point numbers you may end up with an unintended error.
    
  //============================================================================================================================================================================//
  // Decimal vs Binary values
    //>Lets look at how values are represented in decimal and in binary.
  
    System.out.println("decimal ...|1000000|10000|10000|1000|100|10|1|.|1/10|1/100|1/1000|1/10000|1/100000|1/1000000|...");
    System.out.println("binary  ...|   64  | 32  | 16  | 8  | 4 | 2|1|.|1/2 | 1/4 |  1/8 |  1/16 |  1/32  |   1/64  |...");
    
    /*
      0.2 (1/5) in decimal is simple: place a 2 in the 1/10 place
      0.2 (1/5) in binary is more difficult: how do you get to two by placing 1s in the binary places?

      For a similiar example how do we represent 1/3 in decimal 0.33333333333... but why?
      The same issue exists in binary 1/5 is a infinitely repeating decimal number. 0.0011001100110011...
    */
    
    System.out.println("0.4 + 0.1 = " + (0.4 + 0.1));
    System.out.println("0.4 - 0.1 = " + (0.4 - 0.1));
    
    
    //other examples
    System.out.println("0.7 + 0.1 = " + (0.7 + 0.1));
    System.out.println("0.7 - 0.1 = " + (0.7 - 0.1));
    //0.7 --> 0.101100110011001100...
    //0.1 --> 0.000110011001100110...

    System.out.println("0.9 - 0.1 = " + (0.9 - 0.1) );
    System.out.println("0.9 + 0.1 = " + (0.9 + 0.1) );
    //0.9 --> 0.11100110011001100...
    //0.1 --> 0.00011001100110011...

    addLoop(5);//try me 
    nl();
    subLoop(5);//try me
    
    //These errors are cause by a rounding error when the java compiler compiles the program. 
    //This is not a java bug or any other programming language bug. It is an inherent problem in representing infinitly repreating numbers in a finite area.
    // It is ultimately a problem inherit to math try it what is 0.33333333... + 0.3333333... + 0.3333333... = ?  
    //What is the answer? Can you prove it?

    /* 
    Dealing with FLOP errors:
    Review the use of significant figures (sig figs)
    Rounding 
    Integer Math(converting the values to integers completing the calculation then converting back.)

    For more on how floating point numbers are represented and used in computers look at the IEEE 754 standard
    Also check out these links on what every computer scientist should know about floating point math
    https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html
    https://www.h-schmidt.net/FloatConverter/IEEE754.html

    This calculator can help you understand how these values are represented using the IEEE 754 standard.
    Keep in mind that the answers it generates are rounded automatically so you may not get the same result you do in java.
    http://weitz.de/ieee/
    */

    //Rounding
    //Use the Math.round() method to round a floating point to integer
    double pi = 3.1415926535;
    System.out.println(Math.round(pi));

    //Use the BigDecimal class round() method
    //the syntax of the method: public BigDecimal round(MathContext m)

    BigDecimal roundMe = new BigDecimal("3.1415926535");//create a new object of the BigDecimal Class and assign the value of pi

    MathContext m = new MathContext(2);//create a new object of the MathContext class and assign the value of 2(this is our level of precision or significant figures)

    BigDecimal rounded = roundMe.round(m);

    System.out.println(rounded);

    /*
    Cheat Sheet for the BigDecimal Class
    https://floating-point-gui.de/languages/java/
    */
  }
  
  private static void addLoop(double num){
    for (double i = 0.0; i <= num; i+=0.1){
      System.out.print(i + " ");
    }
  }

  private static void subLoop (double num) {
    for (double i = num; i >= 0; i-=0.1){
      System.out.print(i + " ");
    }
  }
  
  public static void nl() {
    System.out.println();
  }
}

/*
Common Errors:

*/

/*
Practice:

*/