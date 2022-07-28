//Java Wrapper Class
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  Wrapper class provide a way to use primitive data types as objects

  Wrapper classes:
    Byte
    Short
    Integer
    Long
    FLoat
    Double
    Boolean
    Character
*/


class Wrappers {
  public static void main(String[] args){
    //creating a wrapper class
    Integer numObj = 8;
    Double duoObj = 3.1415926535;
    Character charObj = 'A';
    System.out.print(numObj); System.out.print(" "); System.out.print(numObj.getClass().getName());
    System.out.print(duoObj); System.out.print(" "); System.out.print(duoObj.getClass().getName()); 
    System.out.print(charObj); System.out.print(" "); System.out.print(charObj.getClass().getName()); 

    //to get the values associated with the wrapper object
    // intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
    int num = numObj.intValue();
    double duo = duoObj.doubleValue();
    char character = charObj.charValue();

    System.out.print(num); System.out.println(": primitive int");
    System.out.print(duo); System.out.println(": primitive double");
    System.out.print(character); System.out.println(": primitive character");


  }
}

/*
Common Errors:

*/

/*
Practice:

*/